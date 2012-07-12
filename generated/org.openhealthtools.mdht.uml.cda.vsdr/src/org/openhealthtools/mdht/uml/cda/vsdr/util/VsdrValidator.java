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
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Template Id' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID = 1;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Class Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE = 2;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Code P' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P = 3;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE = 4;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Confidentiality Code P' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P = 5;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Confidentiality Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE = 6;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Id' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID = 7;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Language Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE = 8;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Mood Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE = 9;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Realm Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE = 10;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Title' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE = 11;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Effective Time' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME = 12;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN = 13;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Death Report Document Body' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_DEATH_REPORT_DOCUMENT_BODY = 14;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR = 15;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET = 16;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian Custodian Organization Name' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME = 17;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian Custodian Organization Id' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID = 18;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN = 19;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Class Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_CLASS_CODE = 20;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Determiner Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_DETERMINER_CODE = 21;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Name' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_NAME = 22;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Class Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_CLASS_CODE = 23;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Id' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_ID = 24;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON = 25;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Type Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TYPE_CODE = 26;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Time' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TIME = 27;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR = 28;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Administrative Gender Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE = 29;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Administrative Gender Code P' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE_P = 30;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Birth Time' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_BIRTH_TIME = 31;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Class Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_CLASS_CODE = 32;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Determiner Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_DETERMINER_CODE = 33;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Name' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_NAME = 34;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Class Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_CLASS_CODE = 35;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Id' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ID = 36;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Addr' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ADDR = 37;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON = 38;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Type Code' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_TYPE_CODE = 39;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient' of 'Reportingdeathinformationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT = 40;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Template Id' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID = 41;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Code P' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CODE_P = 42;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Code' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CODE = 43;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Timeof Death' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH = 44;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Locationof Death' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_LOCATIONOF_DEATH = 45;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Death Certification' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_DEATH_CERTIFICATION = 46;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Mannerof Death' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_MANNEROF_DEATH = 47;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Pregnancy Status' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS = 48;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Tobacco Use' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE = 49;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Injury' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_INJURY = 50;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Causeof Death' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CAUSEOF_DEATH = 51;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Autopsy Performance' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE = 52;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Autopsy Results' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS = 53;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Coroner Referral' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL = 54;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Coroner Case Transfer' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER = 55;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Death Location Type' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE = 56;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Timeof Death Template Id' of 'Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TIMEOF_DEATH__TIMEOF_DEATH_TEMPLATE_ID = 57;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Timeof Death Class Code' of 'Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TIMEOF_DEATH__TIMEOF_DEATH_CLASS_CODE = 58;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Timeof Death Code P' of 'Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TIMEOF_DEATH__TIMEOF_DEATH_CODE_P = 59;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Timeof Death Code' of 'Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TIMEOF_DEATH__TIMEOF_DEATH_CODE = 60;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Timeof Death Effective Time' of 'Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TIMEOF_DEATH__TIMEOF_DEATH_EFFECTIVE_TIME = 61;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Timeof Death Mood Code' of 'Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TIMEOF_DEATH__TIMEOF_DEATH_MOOD_CODE = 62;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Timeof Death Text' of 'Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TIMEOF_DEATH__TIMEOF_DEATH_TEXT = 63;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Template Id' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_TEMPLATE_ID = 64;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Class Code' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_CLASS_CODE = 65;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Code P' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_CODE_P = 66;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Code' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_CODE = 67;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Mood Code' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_MOOD_CODE = 68;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Text' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_TEXT = 69;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Value' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_VALUE = 70;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Template Id' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_TEMPLATE_ID = 71;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Class Code' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CLASS_CODE = 72;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Code' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CODE = 73;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Effective Time' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_EFFECTIVE_TIME = 74;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Mood Code' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_MOOD_CODE = 75;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Certification Performer' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER = 76;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Certification Performer Certifier Role Certifying Party Class Code' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_CLASS_CODE = 77;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Certification Performer Certifier Role Certifying Party Determiner Code' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_DETERMINER_CODE = 78;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Certification Performer Certifier Role Certifying Party Name' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_NAME = 79;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Certification Performer Certifier Role Addr' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ADDR = 80;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Certification Performer Certifier Role Class Code' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CLASS_CODE = 81;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Certification Performer Certifier Role Code' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE = 82;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Certification Performer Certifier Role Code P' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE_P = 83;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Certification Performer Certifier Role Id' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ID = 84;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Certification Performer Certifier Role Certifying Party' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY = 85;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Certification Performer Type Code' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_TYPE_CODE = 86;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Certification Certification Performer Certifier Role' of 'Death Certification'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE = 87;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Template Id' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_TEMPLATE_ID = 88;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Class Code' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_CLASS_CODE = 89;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Code P' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_CODE_P = 90;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Code' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_CODE = 91;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Mood Code' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_MOOD_CODE = 92;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Value' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_VALUE = 93;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Value P' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_VALUE_P = 94;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Template Id' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_TEMPLATE_ID = 95;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Class Code' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_CLASS_CODE = 96;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Code P' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_CODE_P = 97;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Code' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_CODE = 98;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Mood Code' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_MOOD_CODE = 99;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Value' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_VALUE = 100;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Value P' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_VALUE_P = 101;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tobacco Use Template Id' of 'Tobacco Use'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TOBACCO_USE__TOBACCO_USE_TEMPLATE_ID = 102;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tobacco Use Class Code' of 'Tobacco Use'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TOBACCO_USE__TOBACCO_USE_CLASS_CODE = 103;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tobacco Use Code' of 'Tobacco Use'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TOBACCO_USE__TOBACCO_USE_CODE = 104;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tobacco Use Mood Code' of 'Tobacco Use'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TOBACCO_USE__TOBACCO_USE_MOOD_CODE = 105;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tobacco Use Value' of 'Tobacco Use'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TOBACCO_USE__TOBACCO_USE_VALUE = 106;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tobacco Use Value P' of 'Tobacco Use'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TOBACCO_USE__TOBACCO_USE_VALUE_P = 107;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Template Id' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_TEMPLATE_ID = 108;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_CLASS_CODE = 109;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_CODE = 110;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Code P' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_CODE_P = 111;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Mood Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_MOOD_CODE = 112;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Status Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_STATUS_CODE = 113;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION = 114;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION = 115;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION = 116;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP = 117;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_CLASS_CODE = 118;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Desc' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DESC = 119;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Addr' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_ADDR = 120;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_CLASS_CODE = 121;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY = 122;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Type Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_TYPE_CODE = 123;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CLASS_CODE = 124;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Code P' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE_P = 125;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE = 126;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Mood Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_MOOD_CODE = 127;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Text' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_TEXT = 128;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Value' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_VALUE = 129;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Effective Time' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_EFFECTIVE_TIME = 130;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION = 131;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Type Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_TYPE_CODE = 132;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Work Association Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CLASS_CODE = 133;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Work Association Code P' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE_P = 134;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Work Association Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE = 135;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Work Association Mood Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_MOOD_CODE = 136;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Work Association Value' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_VALUE = 137;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Type Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_TYPE_CODE = 138;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Work Association' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION = 139;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Transportation Association Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CLASS_CODE = 140;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Transportation Association Code P' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE_P = 141;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Transportation Association Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE = 142;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Transportation Association Mood Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_MOOD_CODE = 143;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Transportation Association Value' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_VALUE = 144;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Type Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TYPE_CODE = 145;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CLASS_CODE = 146;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship Code P' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE_P = 147;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE = 148;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship Mood Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_MOOD_CODE = 149;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship Value' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE = 150;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Type Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TYPE_CODE = 151;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP = 152;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Template Id' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_TEMPLATE_ID = 153;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Class Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_CLASS_CODE = 154;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_CODE = 155;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Mood Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_MOOD_CODE = 156;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Status Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_STATUS_CODE = 157;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE = 158;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION = 159;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Death Cause Interval' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_DEATH_CAUSE_INTERVAL = 160;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Class Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CLASS_CODE = 161;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Code P' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE_P = 162;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE = 163;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Mood Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_MOOD_CODE = 164;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Value' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_VALUE = 165;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Sequence Number' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_SEQUENCE_NUMBER = 166;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Type Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_TYPE_CODE = 167;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE = 168;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Class Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CLASS_CODE = 169;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code P' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_P = 170;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE = 171;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Mood Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_MOOD_CODE = 172;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Value' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_VALUE = 173;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Type Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_TYPE_CODE = 174;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION = 175;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Class Code Death Causal Information Component Other Significant Condition Other Significant Condition Class Code1' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CLASS_CODE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CLASS_CODE1 = 176;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code PDeath Causal Information Component Other Significant Condition Other Significant Condition Code P1' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_PDEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_P1 = 177;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code Death Causal Information Component Other Significant Condition Other Significant Condition Code1' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE1 = 178;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Mood Code Death Causal Information Component Other Significant Condition Other Significant Condition Mood Code1' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_MOOD_CODE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_MOOD_CODE1 = 179;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Value Death Causal Information Component Other Significant Condition Other Significant Condition Value1' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_VALUE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_VALUE1 = 180;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Death Cause Interval Death Cause Interval Class Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CLASS_CODE = 181;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Death Cause Interval Death Cause Interval Code P' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE_P = 182;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Death Cause Interval Death Cause Interval Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE = 183;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Death Cause Interval Death Cause Interval Mood Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_MOOD_CODE = 184;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Death Cause Interval Death Cause Interval Value' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_VALUE = 185;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Death Cause Interval Sequence Number' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_DEATH_CAUSE_INTERVAL_SEQUENCE_NUMBER = 186;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Death Cause Interval Type Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_DEATH_CAUSE_INTERVAL_TYPE_CODE = 187;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Death Cause Interval Death Cause Interval' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL = 188;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Template Id' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_TEMPLATE_ID = 189;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Class Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CLASS_CODE = 190;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Code P' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CODE_P = 191;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CODE = 192;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Effective Time' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_EFFECTIVE_TIME = 193;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Value' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_VALUE = 194;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Mood Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_MOOD_CODE = 195;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER = 196;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Class Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_CLASS_CODE = 197;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Determiner Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_DETERMINER_CODE = 198;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Name' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_NAME = 199;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Class Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_CLASS_CODE = 200;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Type Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_TYPE_CODE = 201;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Autopsy Performer Role' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE = 202;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Template Id' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_TEMPLATE_ID = 203;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Class Code' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_CLASS_CODE = 204;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Code P' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_CODE_P = 205;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Code' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_CODE = 206;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Mood Code' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_MOOD_CODE = 207;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Value' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_VALUE = 208;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Referral Template Id' of 'Coroner Referral'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_REFERRAL__CORONER_REFERRAL_TEMPLATE_ID = 209;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Referral Class Code' of 'Coroner Referral'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_REFERRAL__CORONER_REFERRAL_CLASS_CODE = 210;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Referral Code P' of 'Coroner Referral'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_REFERRAL__CORONER_REFERRAL_CODE_P = 211;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Referral Code' of 'Coroner Referral'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_REFERRAL__CORONER_REFERRAL_CODE = 212;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Referral Mood Code' of 'Coroner Referral'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_REFERRAL__CORONER_REFERRAL_MOOD_CODE = 213;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Referral Value' of 'Coroner Referral'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_REFERRAL__CORONER_REFERRAL_VALUE = 214;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Template Id' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_TEMPLATE_ID = 215;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Class Code' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_CLASS_CODE = 216;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Code P' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_CODE_P = 217;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Code' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_CODE = 218;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Id' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_ID = 219;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Mood Code' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_MOOD_CODE = 220;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Value' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_VALUE = 221;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Template Id' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_TEMPLATE_ID = 222;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Class Code' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_CLASS_CODE = 223;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Code P' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_CODE_P = 224;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Code' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_CODE = 225;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Mood Code' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_MOOD_CODE = 226;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Value' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_VALUE = 227;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Value P' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_VALUE_P = 228;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 228;

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
      case VsdrPackage.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS:
        return validateReportingdeathinformationfromaclinicalsettingtovitalrecords((Reportingdeathinformationfromaclinicalsettingtovitalrecords)value, diagnostics, context);
      case VsdrPackage.DEATH_REPORT_DOCUMENT_BODY:
        return validateDeathReportDocumentBody((DeathReportDocumentBody)value, diagnostics, context);
      case VsdrPackage.TIMEOF_DEATH:
        return validateTimeofDeath((TimeofDeath)value, diagnostics, context);
      case VsdrPackage.LOCATIONOF_DEATH:
        return validateLocationofDeath((LocationofDeath)value, diagnostics, context);
      case VsdrPackage.DEATH_CERTIFICATION:
        return validateDeathCertification((DeathCertification)value, diagnostics, context);
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
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient(reportingdeathinformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient constraint of '<em>Reportingdeathinformationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecords_validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecords.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient(diagnostics, context);
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
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyCodeP(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyCode(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyTimeofDeath(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyLocationofDeath(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyDeathCertification(deathReportDocumentBody, diagnostics, context);
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
   * Validates the validateDeathReportDocumentBodyDeathCertification constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyDeathCertification(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyDeathCertification(diagnostics, context);
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeath(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(timeofDeath, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateTimeofDeath_validateTimeofDeathTemplateId(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateTimeofDeath_validateTimeofDeathClassCode(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateTimeofDeath_validateTimeofDeathCodeP(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateTimeofDeath_validateTimeofDeathCode(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateTimeofDeath_validateTimeofDeathEffectiveTime(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateTimeofDeath_validateTimeofDeathMoodCode(timeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateTimeofDeath_validateTimeofDeathText(timeofDeath, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateTimeofDeathTemplateId constraint of '<em>Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeath_validateTimeofDeathTemplateId(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return timeofDeath.validateTimeofDeathTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateTimeofDeathClassCode constraint of '<em>Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeath_validateTimeofDeathClassCode(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return timeofDeath.validateTimeofDeathClassCode(diagnostics, context);
  }

  /**
   * Validates the validateTimeofDeathCodeP constraint of '<em>Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeath_validateTimeofDeathCodeP(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return timeofDeath.validateTimeofDeathCodeP(diagnostics, context);
  }

  /**
   * Validates the validateTimeofDeathCode constraint of '<em>Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeath_validateTimeofDeathCode(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return timeofDeath.validateTimeofDeathCode(diagnostics, context);
  }

  /**
   * Validates the validateTimeofDeathEffectiveTime constraint of '<em>Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeath_validateTimeofDeathEffectiveTime(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return timeofDeath.validateTimeofDeathEffectiveTime(diagnostics, context);
  }

  /**
   * Validates the validateTimeofDeathMoodCode constraint of '<em>Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeath_validateTimeofDeathMoodCode(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return timeofDeath.validateTimeofDeathMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateTimeofDeathText constraint of '<em>Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeath_validateTimeofDeathText(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return timeofDeath.validateTimeofDeathText(diagnostics, context);
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
    if (result || diagnostics != null) result &= validateLocationofDeath_validateLocationofDeathCodeP(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateLocationofDeath_validateLocationofDeathCode(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateLocationofDeath_validateLocationofDeathMoodCode(locationofDeath, diagnostics, context);
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
  public boolean validateDeathCertification(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(deathCertification, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationTemplateId(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationClassCode(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCode(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationEffectiveTime(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationMoodCode(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCertificationPerformer(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleAddr(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleClassCode(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleCode(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleCodeP(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleId(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCertificationPerformerTypeCode(deathCertification, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRole(deathCertification, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateDeathCertificationTemplateId constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationTemplateId(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationClassCode constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationClassCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationClassCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCode constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationEffectiveTime constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationEffectiveTime(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationEffectiveTime(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationMoodCode constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationMoodCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCertificationPerformer constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCertificationPerformer(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCertificationPerformer(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCertificationPerformerCertifierRoleAddr constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleAddr(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCertificationPerformerCertifierRoleAddr(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCertificationPerformerCertifierRoleClassCode constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleClassCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCertificationPerformerCertifierRoleClassCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCertificationPerformerCertifierRoleCode constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCertificationPerformerCertifierRoleCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCertificationPerformerCertifierRoleCodeP constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleCodeP(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCertificationPerformerCertifierRoleCodeP(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCertificationPerformerCertifierRoleId constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleId(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCertificationPerformerCertifierRoleId(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCertificationPerformerTypeCode constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCertificationPerformerTypeCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCertificationPerformerTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCertificationCertificationPerformerCertifierRole constraint of '<em>Death Certification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertification_validateDeathCertificationCertificationPerformerCertifierRole(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCertification.validateDeathCertificationCertificationPerformerCertifierRole(diagnostics, context);
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
    if (result || diagnostics != null) result &= validateMannerofDeath_validateMannerofDeathCodeP(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateMannerofDeath_validateMannerofDeathCode(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateMannerofDeath_validateMannerofDeathMoodCode(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateMannerofDeath_validateMannerofDeathValue(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateMannerofDeath_validateMannerofDeathValueP(mannerofDeath, diagnostics, context);
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
   * Validates the validateMannerofDeathValueP constraint of '<em>Mannerof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeath_validateMannerofDeathValueP(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return mannerofDeath.validateMannerofDeathValueP(diagnostics, context);
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
    if (result || diagnostics != null) result &= validatePregnancyStatus_validatePregnancyStatusCodeP(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyStatus_validatePregnancyStatusCode(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyStatus_validatePregnancyStatusMoodCode(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyStatus_validatePregnancyStatusValue(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyStatus_validatePregnancyStatusValueP(pregnancyStatus, diagnostics, context);
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
   * Validates the validatePregnancyStatusValueP constraint of '<em>Pregnancy Status</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatus_validatePregnancyStatusValueP(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pregnancyStatus.validatePregnancyStatusValueP(diagnostics, context);
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
    if (result || diagnostics != null) result &= validateTobaccoUse_validateTobaccoUseCode(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validateTobaccoUse_validateTobaccoUseMoodCode(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validateTobaccoUse_validateTobaccoUseValue(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validateTobaccoUse_validateTobaccoUseValueP(tobaccoUse, diagnostics, context);
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
   * Validates the validateTobaccoUseValueP constraint of '<em>Tobacco Use</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTobaccoUse_validateTobaccoUseValueP(TobaccoUse tobaccoUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tobaccoUse.validateTobaccoUseValueP(diagnostics, context);
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
    if (result || diagnostics != null) result &= validateInjury_validateInjuryCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryCodeP(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryMoodCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryStatusCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformation(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociation(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociation(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationship(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationCodeP(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationMoodCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationText(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationValue(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationTypeCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationWorkAssociationClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationWorkAssociationCodeP(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationWorkAssociationCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationWorkAssociationMoodCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationWorkAssociationValue(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationTypeCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationWorkAssociation(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationValue(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTypeCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(injury, diagnostics, context);
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
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationMoodCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationStatusCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCause(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantCondition(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseInterval(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseClassCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseCodeP(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseMoodCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseValue(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseSequenceNumber(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseTypeCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCause(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode1(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodePDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP1(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode1(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode1(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValueDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue1(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalClassCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCodeP(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalMoodCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalValue(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalSequenceNumber(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalTypeCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseInterval(deathCausalInformation, diagnostics, context);
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
   * Validates the validateDeathCausalInformationComponentDeathCauseInterval constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseInterval(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentDeathCauseInterval(diagnostics, context);
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
   * Validates the validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode1 constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode1(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode1(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodePDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP1 constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodePDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP1(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodePDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP1(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode1 constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode1(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode1(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode1 constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode1(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode1(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValueDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue1 constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValueDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue1(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValueDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue1(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalClassCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalClassCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalClassCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCodeP constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCodeP(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCodeP(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalMoodCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalMoodCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalValue constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalValue(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalValue(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentDeathCauseIntervalSequenceNumber constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalSequenceNumber(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentDeathCauseIntervalSequenceNumber(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentDeathCauseIntervalTypeCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalTypeCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentDeathCauseIntervalTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseInterval constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseInterval(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseInterval(diagnostics, context);
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
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceCodeP(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceCode(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceEffectiveTime(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceValue(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceMoodCode(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformer(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(autopsyPerformance, diagnostics, context);
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
    if (result || diagnostics != null) result &= validateAutopsyResults_validateAutopsyResultsCodeP(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyResults_validateAutopsyResultsCode(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyResults_validateAutopsyResultsMoodCode(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyResults_validateAutopsyResultsValue(autopsyResults, diagnostics, context);
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
    if (result || diagnostics != null) result &= validateCoronerReferral_validateCoronerReferralCodeP(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerReferral_validateCoronerReferralCode(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerReferral_validateCoronerReferralMoodCode(coronerReferral, diagnostics, context);
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
    if (result || diagnostics != null) result &= validateCoronerCaseTransfer_validateCoronerCaseTransferCodeP(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerCaseTransfer_validateCoronerCaseTransferCode(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerCaseTransfer_validateCoronerCaseTransferId(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerCaseTransfer_validateCoronerCaseTransferMoodCode(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerCaseTransfer_validateCoronerCaseTransferValue(coronerCaseTransfer, diagnostics, context);
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
   * Validates the validateCoronerCaseTransferId constraint of '<em>Coroner Case Transfer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransfer_validateCoronerCaseTransferId(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerCaseTransfer.validateCoronerCaseTransferId(diagnostics, context);
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
    if (result || diagnostics != null) result &= validateDeathLocationType_validateDeathLocationTypeCodeP(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathLocationType_validateDeathLocationTypeCode(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathLocationType_validateDeathLocationTypeMoodCode(deathLocationType, diagnostics, context);
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
