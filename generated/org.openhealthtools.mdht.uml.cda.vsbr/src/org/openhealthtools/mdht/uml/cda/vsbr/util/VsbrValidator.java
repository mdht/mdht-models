/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

import org.openhealthtools.mdht.uml.cda.vsbr.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage
 * @generated
 */
public class VsbrValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final VsbrValidator INSTANCE = new VsbrValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.vsbr";

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Template Id' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID = 1;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Code P' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P = 2;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Code' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE = 3;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Confidentiality Code P' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P = 4;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Confidentiality Code' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE = 5;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Mood Code' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE = 6;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Effective Time' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME = 7;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Id' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID = 8;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Language Code' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE = 9;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Realm Code' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE = 10;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Realm Code P' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P = 11;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Title' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE = 12;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Author' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR = 13;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Custodian' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN = 14;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Record Target' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET = 15;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Birth Reporting Prenatal Experience Section' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION = 16;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Laborand Delivery Section' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABORAND_DELIVERY_SECTION = 17;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Newborn Section' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_NEWBORN_SECTION = 18;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Template Id' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID = 19;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Class Code' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE = 20;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Code' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE = 21;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Mood Code' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE = 22;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Text' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT = 23;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Pre Natal Care' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE = 24;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Height' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT = 25;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Dateof Last Live Birth' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH = 26;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Last Menstrual Period Date' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_LAST_MENSTRUAL_PERIOD_DATE = 27;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Numberof Births Still Living' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING = 28;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Numberof Live Birthsnow Dead' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD = 29;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Other Preganancy Outcomes' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES = 30;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Risk Factor' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR = 31;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Prenatal Experience Section Birth Reporting Infections Present' of 'Birth Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_BIRTH_REPORTING_INFECTIONS_PRESENT = 32;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pre Natal Care Template Id' of 'Pre Natal Care'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRE_NATAL_CARE__PRE_NATAL_CARE_TEMPLATE_ID = 33;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pre Natal Care Class Code' of 'Pre Natal Care'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRE_NATAL_CARE__PRE_NATAL_CARE_CLASS_CODE = 34;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pre Natal Care Code' of 'Pre Natal Care'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRE_NATAL_CARE__PRE_NATAL_CARE_CODE = 35;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pre Natal Care Effective Time' of 'Pre Natal Care'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRE_NATAL_CARE__PRE_NATAL_CARE_EFFECTIVE_TIME = 36;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pre Natal Care Mood Code' of 'Pre Natal Care'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRE_NATAL_CARE__PRE_NATAL_CARE_MOOD_CODE = 37;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pre Natal Care Negation Ind' of 'Pre Natal Care'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRE_NATAL_CARE__PRE_NATAL_CARE_NEGATION_IND = 38;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pre Natal Care Entry Relationship' of 'Pre Natal Care'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRE_NATAL_CARE__PRE_NATAL_CARE_ENTRY_RELATIONSHIP = 39;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Height Template Id' of 'Height'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HEIGHT__HEIGHT_TEMPLATE_ID = 40;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Template Id' of 'Laborand Delivery Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_TEMPLATE_ID = 75;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Class Code' of 'Laborand Delivery Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_CLASS_CODE = 76;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Code' of 'Laborand Delivery Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_CODE = 77;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Mood Code' of 'Laborand Delivery Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_MOOD_CODE = 78;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Text' of 'Laborand Delivery Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_TEXT = 79;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Laborand Delivery Information' of 'Laborand Delivery Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_LABORAND_DELIVERY_INFORMATION = 80;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Body Weightat Delivery' of 'Laborand Delivery Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_BODY_WEIGHTAT_DELIVERY = 81;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Template Id' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID = 82;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Class Code' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_CLASS_CODE = 83;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Code' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_CODE = 84;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Mood Code' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_MOOD_CODE = 85;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Participant' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_PARTICIPANT = 86;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Performer' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_PERFORMER = 87;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Attendant Participation' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION = 88;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Home Birth Plan Association' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN_ASSOCIATION = 89;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Transfer Association' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_TRANSFER_ASSOCIATION = 90;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Entry Relationship' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP = 91;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Maternal Morbidities' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES = 92;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Characteristicsof Laborand Delivery' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY = 93;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Labor Onsets' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_LABOR_ONSETS = 94;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Obstetric Procedures' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_OBSTETRIC_PROCEDURES = 95;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Attempted Forceps Delivery' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_ATTEMPTED_FORCEPS_DELIVERY = 96;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Attempted Vacuum Extraction' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_ATTEMPTED_VACUUM_EXTRACTION = 97;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Fetal Presentation' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_FETAL_PRESENTATION = 98;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Routeand Methodof Delivery' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_ROUTEAND_METHODOF_DELIVERY = 99;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Body Weightat Delivery' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_BODY_WEIGHTAT_DELIVERY = 100;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Information Hysterotomy Hysterectomy Association' of 'Laborand Delivery Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION = 101;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidities Template Id' of 'Maternal Morbidities'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MATERNAL_MORBIDITIES__MATERNAL_MORBIDITIES_TEMPLATE_ID = 102;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Template Id' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_TEMPLATE_ID = 147;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Class Code' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_CLASS_CODE = 148;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Code' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_CODE = 149;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Mood Code' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_MOOD_CODE = 150;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Text' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_TEXT = 151;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Subject' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_SUBJECT = 152;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Estimateof Gestation' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_ESTIMATEOF_GESTATION = 153;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Apgar Score' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_APGAR_SCORE = 154;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Plurality' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_PLURALITY = 155;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Birth Order' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_BIRTH_ORDER = 156;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Numberof Infants Born Alive' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_NUMBEROF_INFANTS_BORN_ALIVE = 157;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Congenital Anomaliesofthe Newborn' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN = 158;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Section Weight' of 'Newborn Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NEWBORN_SECTION__NEWBORN_SECTION_WEIGHT = 159;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimateof Gestation Template Id' of 'Estimateof Gestation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_TEMPLATE_ID = 160;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Template Id' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID = 196;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Class Code' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE = 197;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Code' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE = 198;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Mood Code' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE = 199;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Text' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT = 200;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Pre Natal Care' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE = 201;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Height' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT = 202;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Dateof Last Live Birth' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH = 203;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Numberof Births Still Living' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING = 204;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Numberof Live Birthsnow Dead' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD = 205;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Other Preganancy Outcomes' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES = 206;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Risk Factor' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR = 207;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Prenatal Experience Section Fetal Death Reporting Infections Present' of 'Fetal Death Reporting Prenatal Experience Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT = 208;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Infections Present Template Id' of 'Fetal Death Reporting Infections Present'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID = 209;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetus Section Template Id' of 'Fetus Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETUS_SECTION__FETUS_SECTION_TEMPLATE_ID = 214;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetus Section Class Code' of 'Fetus Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETUS_SECTION__FETUS_SECTION_CLASS_CODE = 215;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetus Section Code' of 'Fetus Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETUS_SECTION__FETUS_SECTION_CODE = 216;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetus Section Mood Code' of 'Fetus Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETUS_SECTION__FETUS_SECTION_MOOD_CODE = 217;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetus Section Text' of 'Fetus Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETUS_SECTION__FETUS_SECTION_TEXT = 218;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetus Section Subject' of 'Fetus Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETUS_SECTION__FETUS_SECTION_SUBJECT = 219;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetus Section Abnormal Conditionsofthe Newborn' of 'Fetus Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETUS_SECTION__FETUS_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN = 220;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetus Section Birth Order' of 'Fetus Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETUS_SECTION__FETUS_SECTION_BIRTH_ORDER = 221;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetus Section Numberof Infants Born Alive' of 'Fetus Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETUS_SECTION__FETUS_SECTION_NUMBEROF_INFANTS_BORN_ALIVE = 222;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetus Section Congenital Anomaliesofthe Newborn2' of 'Fetus Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETUS_SECTION__FETUS_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN2 = 223;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetus Section Weight' of 'Fetus Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETUS_SECTION__FETUS_SECTION_WEIGHT = 224;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionsofthe Newborn Template Id' of 'Abnormal Conditionsofthe Newborn'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ABNORMAL_CONDITIONSOFTHE_NEWBORN__ABNORMAL_CONDITIONSOFTHE_NEWBORN_TEMPLATE_ID = 225;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Template Id' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID = 230;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Code P' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P = 231;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Code' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE = 232;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Confidentiality Code P' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P = 233;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Confidentiality Code' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE = 234;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Effective Time' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME = 235;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Id' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID = 236;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Language Code' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE = 237;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Mood Code' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE = 238;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Realm Code' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE = 239;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Realm Code P' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P = 240;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Title' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE = 241;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Author' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR = 242;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Custodian' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN = 243;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Record Target' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET = 244;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Fetal Death Reporting Prenatal Experience Section' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION = 245;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Laborand Delivery Section' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABORAND_DELIVERY_SECTION = 246;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Fetus Section' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_FETUS_SECTION = 247;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prepregnancy Body Weight Template Id' of 'Prepregnancy Body Weight'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREPREGNANCY_BODY_WEIGHT__PREPREGNANCY_BODY_WEIGHT_TEMPLATE_ID = 248;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Height Class Code' of 'Height'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HEIGHT__HEIGHT_CLASS_CODE = 41;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Height Code' of 'Height'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HEIGHT__HEIGHT_CODE = 42;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Height Mood Code' of 'Height'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HEIGHT__HEIGHT_MOOD_CODE = 43;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Height Value' of 'Height'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HEIGHT__HEIGHT_VALUE = 44;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateof Last Live Birth Template Id' of 'Dateof Last Live Birth'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_TEMPLATE_ID = 45;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Weightat Delivery Class Code' of 'Body Weightat Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BODY_WEIGHTAT_DELIVERY__BODY_WEIGHTAT_DELIVERY_CLASS_CODE = 144;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Weightat Delivery Code' of 'Body Weightat Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BODY_WEIGHTAT_DELIVERY__BODY_WEIGHTAT_DELIVERY_CODE = 145;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Weightat Delivery Value' of 'Body Weightat Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BODY_WEIGHTAT_DELIVERY__BODY_WEIGHTAT_DELIVERY_VALUE = 146;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prepregnancy Body Weight Class Code' of 'Prepregnancy Body Weight'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREPREGNANCY_BODY_WEIGHT__PREPREGNANCY_BODY_WEIGHT_CLASS_CODE = 249;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prepregnancy Body Weight Code' of 'Prepregnancy Body Weight'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREPREGNANCY_BODY_WEIGHT__PREPREGNANCY_BODY_WEIGHT_CODE = 250;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prepregnancy Body Weight Mood Code' of 'Prepregnancy Body Weight'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREPREGNANCY_BODY_WEIGHT__PREPREGNANCY_BODY_WEIGHT_MOOD_CODE = 251;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prepregnancy Body Weight Value' of 'Prepregnancy Body Weight'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREPREGNANCY_BODY_WEIGHT__PREPREGNANCY_BODY_WEIGHT_VALUE = 252;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Factors Template Id' of 'Risk Factors'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int RISK_FACTORS__RISK_FACTORS_TEMPLATE_ID = 253;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Births Still Living Class Code' of 'Numberof Births Still Living'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_BIRTHS_STILL_LIVING__NUMBEROF_BIRTHS_STILL_LIVING_CLASS_CODE = 55;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Births Still Living Code' of 'Numberof Births Still Living'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_BIRTHS_STILL_LIVING__NUMBEROF_BIRTHS_STILL_LIVING_CODE = 56;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Births Still Living Mood Code' of 'Numberof Births Still Living'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_BIRTHS_STILL_LIVING__NUMBEROF_BIRTHS_STILL_LIVING_MOOD_CODE = 57;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Births Still Living Value' of 'Numberof Births Still Living'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_BIRTHS_STILL_LIVING__NUMBEROF_BIRTHS_STILL_LIVING_VALUE = 58;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Live Birthsnow Dead Template Id' of 'Numberof Live Birthsnow Dead'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_LIVE_BIRTHSNOW_DEAD__NUMBEROF_LIVE_BIRTHSNOW_DEAD_TEMPLATE_ID = 59;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateof Last Live Birth Code' of 'Dateof Last Live Birth'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_CODE = 46;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateof Last Live Birth Mood Code' of 'Dateof Last Live Birth'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_MOOD_CODE = 47;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateof Last Live Birth Value' of 'Dateof Last Live Birth'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_VALUE = 48;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Date Template Id' of 'Last Menstrual Period Date'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_TEMPLATE_ID = 49;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Live Birthsnow Dead Class Code' of 'Numberof Live Birthsnow Dead'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_LIVE_BIRTHSNOW_DEAD__NUMBEROF_LIVE_BIRTHSNOW_DEAD_CLASS_CODE = 60;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Live Birthsnow Dead Code' of 'Numberof Live Birthsnow Dead'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_LIVE_BIRTHSNOW_DEAD__NUMBEROF_LIVE_BIRTHSNOW_DEAD_CODE = 61;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Live Birthsnow Dead Mood Code' of 'Numberof Live Birthsnow Dead'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_LIVE_BIRTHSNOW_DEAD__NUMBEROF_LIVE_BIRTHSNOW_DEAD_MOOD_CODE = 62;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Live Birthsnow Dead Value' of 'Numberof Live Birthsnow Dead'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_LIVE_BIRTHSNOW_DEAD__NUMBEROF_LIVE_BIRTHSNOW_DEAD_VALUE = 63;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcomes Template Id' of 'Other Pregnancy Outcomes'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int OTHER_PREGNANCY_OUTCOMES__OTHER_PREGNANCY_OUTCOMES_TEMPLATE_ID = 64;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcomes Class Code' of 'Other Pregnancy Outcomes'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int OTHER_PREGNANCY_OUTCOMES__OTHER_PREGNANCY_OUTCOMES_CLASS_CODE = 65;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcomes Code' of 'Other Pregnancy Outcomes'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int OTHER_PREGNANCY_OUTCOMES__OTHER_PREGNANCY_OUTCOMES_CODE = 66;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcomes Mood Code' of 'Other Pregnancy Outcomes'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int OTHER_PREGNANCY_OUTCOMES__OTHER_PREGNANCY_OUTCOMES_MOOD_CODE = 67;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcomes Value' of 'Other Pregnancy Outcomes'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int OTHER_PREGNANCY_OUTCOMES__OTHER_PREGNANCY_OUTCOMES_VALUE = 68;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcomes Effective Time' of 'Other Pregnancy Outcomes'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int OTHER_PREGNANCY_OUTCOMES__OTHER_PREGNANCY_OUTCOMES_EFFECTIVE_TIME = 69;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Infections Present Template Id' of 'Birth Reporting Infections Present'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_INFECTIONS_PRESENT__BIRTH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID = 70;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Date Class Code' of 'Last Menstrual Period Date'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_CLASS_CODE = 50;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Date Code' of 'Last Menstrual Period Date'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_CODE = 51;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Date Mood Code' of 'Last Menstrual Period Date'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_MOOD_CODE = 52;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Date Value' of 'Last Menstrual Period Date'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_VALUE = 53;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Births Still Living Template Id' of 'Numberof Births Still Living'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_BIRTHS_STILL_LIVING__NUMBEROF_BIRTHS_STILL_LIVING_TEMPLATE_ID = 54;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Infections Present Class Code' of 'Birth Reporting Infections Present'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_INFECTIONS_PRESENT__BIRTH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE = 71;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Infections Present Code' of 'Birth Reporting Infections Present'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_INFECTIONS_PRESENT__BIRTH_REPORTING_INFECTIONS_PRESENT_CODE = 72;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Infections Present Mood Code' of 'Birth Reporting Infections Present'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_INFECTIONS_PRESENT__BIRTH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE = 73;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Reporting Infections Present Value' of 'Birth Reporting Infections Present'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_REPORTING_INFECTIONS_PRESENT__BIRTH_REPORTING_INFECTIONS_PRESENT_VALUE = 74;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Labor Onsets Class Code' of 'Labor Onsets'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABOR_ONSETS__LABOR_ONSETS_CLASS_CODE = 113;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Labor Onsets Code' of 'Labor Onsets'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABOR_ONSETS__LABOR_ONSETS_CODE = 114;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Labor Onsets Mood Code' of 'Labor Onsets'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABOR_ONSETS__LABOR_ONSETS_MOOD_CODE = 115;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Labor Onsets Value' of 'Labor Onsets'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABOR_ONSETS__LABOR_ONSETS_VALUE = 116;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obstetric Procedures Template Id' of 'Obstetric Procedures'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int OBSTETRIC_PROCEDURES__OBSTETRIC_PROCEDURES_TEMPLATE_ID = 117;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Infections Present Class Code' of 'Fetal Death Reporting Infections Present'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE = 210;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Infections Present Code' of 'Fetal Death Reporting Infections Present'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CODE = 211;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Infections Present Mood Code' of 'Fetal Death Reporting Infections Present'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE = 212;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Reporting Infections Present Value' of 'Fetal Death Reporting Infections Present'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_VALUE = 213;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obstetric Procedures Class Code' of 'Obstetric Procedures'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int OBSTETRIC_PROCEDURES__OBSTETRIC_PROCEDURES_CLASS_CODE = 118;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obstetric Procedures Code' of 'Obstetric Procedures'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int OBSTETRIC_PROCEDURES__OBSTETRIC_PROCEDURES_CODE = 119;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obstetric Procedures Mood Code' of 'Obstetric Procedures'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int OBSTETRIC_PROCEDURES__OBSTETRIC_PROCEDURES_MOOD_CODE = 120;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obstetric Procedures Value' of 'Obstetric Procedures'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int OBSTETRIC_PROCEDURES__OBSTETRIC_PROCEDURES_VALUE = 121;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Attempted Forceps Delivery Template Id' of 'Attempted Forceps Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ATTEMPTED_FORCEPS_DELIVERY__ATTEMPTED_FORCEPS_DELIVERY_TEMPLATE_ID = 122;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Factors Class Code' of 'Risk Factors'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int RISK_FACTORS__RISK_FACTORS_CLASS_CODE = 254;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Factors Code' of 'Risk Factors'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int RISK_FACTORS__RISK_FACTORS_CODE = 255;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Factors Mood Code' of 'Risk Factors'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int RISK_FACTORS__RISK_FACTORS_MOOD_CODE = 256;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Factors Value' of 'Risk Factors'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int RISK_FACTORS__RISK_FACTORS_VALUE = 257;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Factors Entry Relationship' of 'Risk Factors'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int RISK_FACTORS__RISK_FACTORS_ENTRY_RELATIONSHIP = 258;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicsof Laborand Delivery Class Code' of 'Characteristicsof Laborand Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHARACTERISTICSOF_LABORAND_DELIVERY__CHARACTERISTICSOF_LABORAND_DELIVERY_CLASS_CODE = 108;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicsof Laborand Delivery Code' of 'Characteristicsof Laborand Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHARACTERISTICSOF_LABORAND_DELIVERY__CHARACTERISTICSOF_LABORAND_DELIVERY_CODE = 109;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicsof Laborand Delivery Mood Code' of 'Characteristicsof Laborand Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHARACTERISTICSOF_LABORAND_DELIVERY__CHARACTERISTICSOF_LABORAND_DELIVERY_MOOD_CODE = 110;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicsof Laborand Delivery Value' of 'Characteristicsof Laborand Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHARACTERISTICSOF_LABORAND_DELIVERY__CHARACTERISTICSOF_LABORAND_DELIVERY_VALUE = 111;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Labor Onsets Template Id' of 'Labor Onsets'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LABOR_ONSETS__LABOR_ONSETS_TEMPLATE_ID = 112;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidities Class Code' of 'Maternal Morbidities'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MATERNAL_MORBIDITIES__MATERNAL_MORBIDITIES_CLASS_CODE = 103;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidities Code' of 'Maternal Morbidities'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MATERNAL_MORBIDITIES__MATERNAL_MORBIDITIES_CODE = 104;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidities Mood Code' of 'Maternal Morbidities'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MATERNAL_MORBIDITIES__MATERNAL_MORBIDITIES_MOOD_CODE = 105;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidities Value' of 'Maternal Morbidities'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MATERNAL_MORBIDITIES__MATERNAL_MORBIDITIES_VALUE = 106;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicsof Laborand Delivery Template Id' of 'Characteristicsof Laborand Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHARACTERISTICSOF_LABORAND_DELIVERY__CHARACTERISTICSOF_LABORAND_DELIVERY_TEMPLATE_ID = 107;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionsofthe Newborn Class Code' of 'Abnormal Conditionsofthe Newborn'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ABNORMAL_CONDITIONSOFTHE_NEWBORN__ABNORMAL_CONDITIONSOFTHE_NEWBORN_CLASS_CODE = 226;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionsofthe Newborn Code' of 'Abnormal Conditionsofthe Newborn'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ABNORMAL_CONDITIONSOFTHE_NEWBORN__ABNORMAL_CONDITIONSOFTHE_NEWBORN_CODE = 227;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionsofthe Newborn Mood Code' of 'Abnormal Conditionsofthe Newborn'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ABNORMAL_CONDITIONSOFTHE_NEWBORN__ABNORMAL_CONDITIONSOFTHE_NEWBORN_MOOD_CODE = 228;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionsofthe Newborn Value' of 'Abnormal Conditionsofthe Newborn'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ABNORMAL_CONDITIONSOFTHE_NEWBORN__ABNORMAL_CONDITIONSOFTHE_NEWBORN_VALUE = 229;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaliesofthe Newborn Class Code' of 'Congenital Anomaliesofthe Newborn'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CONGENITAL_ANOMALIESOFTHE_NEWBORN__CONGENITAL_ANOMALIESOFTHE_NEWBORN_CLASS_CODE = 187;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaliesofthe Newborn Code' of 'Congenital Anomaliesofthe Newborn'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CONGENITAL_ANOMALIESOFTHE_NEWBORN__CONGENITAL_ANOMALIESOFTHE_NEWBORN_CODE = 188;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaliesofthe Newborn Mood Code' of 'Congenital Anomaliesofthe Newborn'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CONGENITAL_ANOMALIESOFTHE_NEWBORN__CONGENITAL_ANOMALIESOFTHE_NEWBORN_MOOD_CODE = 189;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaliesofthe Newborn Value' of 'Congenital Anomaliesofthe Newborn'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CONGENITAL_ANOMALIESOFTHE_NEWBORN__CONGENITAL_ANOMALIESOFTHE_NEWBORN_VALUE = 190;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Weight Template Id' of 'Weight'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int WEIGHT__WEIGHT_TEMPLATE_ID = 191;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Attempted Forceps Delivery Class Code' of 'Attempted Forceps Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ATTEMPTED_FORCEPS_DELIVERY__ATTEMPTED_FORCEPS_DELIVERY_CLASS_CODE = 123;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Attempted Forceps Delivery Code' of 'Attempted Forceps Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ATTEMPTED_FORCEPS_DELIVERY__ATTEMPTED_FORCEPS_DELIVERY_CODE = 124;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Attempted Forceps Delivery Mood Code' of 'Attempted Forceps Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ATTEMPTED_FORCEPS_DELIVERY__ATTEMPTED_FORCEPS_DELIVERY_MOOD_CODE = 125;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Attempted Forceps Delivery Value' of 'Attempted Forceps Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ATTEMPTED_FORCEPS_DELIVERY__ATTEMPTED_FORCEPS_DELIVERY_VALUE = 126;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Attempted Vacuum Extraction Template Id' of 'Attempted Vacuum Extraction'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ATTEMPTED_VACUUM_EXTRACTION__ATTEMPTED_VACUUM_EXTRACTION_TEMPLATE_ID = 127;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Attempted Vacuum Extraction Class Code' of 'Attempted Vacuum Extraction'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ATTEMPTED_VACUUM_EXTRACTION__ATTEMPTED_VACUUM_EXTRACTION_CLASS_CODE = 128;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Attempted Vacuum Extraction Code' of 'Attempted Vacuum Extraction'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ATTEMPTED_VACUUM_EXTRACTION__ATTEMPTED_VACUUM_EXTRACTION_CODE = 129;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Attempted Vacuum Extraction Mood Code' of 'Attempted Vacuum Extraction'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ATTEMPTED_VACUUM_EXTRACTION__ATTEMPTED_VACUUM_EXTRACTION_MOOD_CODE = 130;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Attempted Vacuum Extraction Value' of 'Attempted Vacuum Extraction'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ATTEMPTED_VACUUM_EXTRACTION__ATTEMPTED_VACUUM_EXTRACTION_VALUE = 131;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Presentation Template Id' of 'Fetal Presentation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_PRESENTATION__FETAL_PRESENTATION_TEMPLATE_ID = 132;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Presentation Class Code' of 'Fetal Presentation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_PRESENTATION__FETAL_PRESENTATION_CLASS_CODE = 133;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Presentation Code' of 'Fetal Presentation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_PRESENTATION__FETAL_PRESENTATION_CODE = 134;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Presentation Mood Code' of 'Fetal Presentation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_PRESENTATION__FETAL_PRESENTATION_MOOD_CODE = 135;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Presentation Value' of 'Fetal Presentation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int FETAL_PRESENTATION__FETAL_PRESENTATION_VALUE = 136;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Routeand Methodof Delivery Template Id' of 'Routeand Methodof Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ROUTEAND_METHODOF_DELIVERY__ROUTEAND_METHODOF_DELIVERY_TEMPLATE_ID = 137;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Routeand Methodof Delivery Class Code' of 'Routeand Methodof Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ROUTEAND_METHODOF_DELIVERY__ROUTEAND_METHODOF_DELIVERY_CLASS_CODE = 138;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Routeand Methodof Delivery Code' of 'Routeand Methodof Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ROUTEAND_METHODOF_DELIVERY__ROUTEAND_METHODOF_DELIVERY_CODE = 139;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Routeand Methodof Delivery Mood Code' of 'Routeand Methodof Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ROUTEAND_METHODOF_DELIVERY__ROUTEAND_METHODOF_DELIVERY_MOOD_CODE = 140;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Routeand Methodof Delivery Value' of 'Routeand Methodof Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ROUTEAND_METHODOF_DELIVERY__ROUTEAND_METHODOF_DELIVERY_VALUE = 141;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Routeand Methodof Delivery Entry Relationship' of 'Routeand Methodof Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ROUTEAND_METHODOF_DELIVERY__ROUTEAND_METHODOF_DELIVERY_ENTRY_RELATIONSHIP = 142;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Weightat Delivery Template Id' of 'Body Weightat Delivery'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BODY_WEIGHTAT_DELIVERY__BODY_WEIGHTAT_DELIVERY_TEMPLATE_ID = 143;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Weight Class Code' of 'Weight'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int WEIGHT__WEIGHT_CLASS_CODE = 192;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Weight Code' of 'Weight'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int WEIGHT__WEIGHT_CODE = 193;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Weight Mood Code' of 'Weight'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int WEIGHT__WEIGHT_MOOD_CODE = 194;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Weight Value' of 'Weight'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int WEIGHT__WEIGHT_VALUE = 195;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimateof Gestation Class Code' of 'Estimateof Gestation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_CLASS_CODE = 161;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimateof Gestation Code' of 'Estimateof Gestation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_CODE = 162;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimateof Gestation Mood Code' of 'Estimateof Gestation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_MOOD_CODE = 163;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimateof Gestation Value' of 'Estimateof Gestation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_VALUE = 164;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Apgar Score Template Id' of 'Apgar Score'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int APGAR_SCORE__APGAR_SCORE_TEMPLATE_ID = 165;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Apgar Score Class Code' of 'Apgar Score'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int APGAR_SCORE__APGAR_SCORE_CLASS_CODE = 166;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Apgar Score Code' of 'Apgar Score'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int APGAR_SCORE__APGAR_SCORE_CODE = 167;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Apgar Score Mood Code' of 'Apgar Score'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int APGAR_SCORE__APGAR_SCORE_MOOD_CODE = 168;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Apgar Score Value' of 'Apgar Score'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int APGAR_SCORE__APGAR_SCORE_VALUE = 169;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plurality Template Id' of 'Plurality'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PLURALITY__PLURALITY_TEMPLATE_ID = 170;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plurality Class Code' of 'Plurality'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PLURALITY__PLURALITY_CLASS_CODE = 171;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plurality Code' of 'Plurality'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PLURALITY__PLURALITY_CODE = 172;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plurality Mood Code' of 'Plurality'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PLURALITY__PLURALITY_MOOD_CODE = 173;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plurality Value' of 'Plurality'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PLURALITY__PLURALITY_VALUE = 174;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Order Template Id' of 'Birth Order'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_ORDER__BIRTH_ORDER_TEMPLATE_ID = 175;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Infants Born Alive Class Code' of 'Numberof Infants Born Alive'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_CLASS_CODE = 182;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Infants Born Alive Code' of 'Numberof Infants Born Alive'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_CODE = 183;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Infants Born Alive Mood Code' of 'Numberof Infants Born Alive'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_MOOD_CODE = 184;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Infants Born Alive Value' of 'Numberof Infants Born Alive'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_VALUE = 185;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaliesofthe Newborn Template Id' of 'Congenital Anomaliesofthe Newborn'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CONGENITAL_ANOMALIESOFTHE_NEWBORN__CONGENITAL_ANOMALIESOFTHE_NEWBORN_TEMPLATE_ID = 186;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Order Class Code' of 'Birth Order'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_ORDER__BIRTH_ORDER_CLASS_CODE = 176;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Order Code P' of 'Birth Order'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_ORDER__BIRTH_ORDER_CODE_P = 177;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Order Code' of 'Birth Order'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_ORDER__BIRTH_ORDER_CODE = 178;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Order Mood Code' of 'Birth Order'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_ORDER__BIRTH_ORDER_MOOD_CODE = 179;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Order Value' of 'Birth Order'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BIRTH_ORDER__BIRTH_ORDER_VALUE = 180;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Infants Born Alive Template Id' of 'Numberof Infants Born Alive'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_TEMPLATE_ID = 181;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 258;

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
  public VsbrValidator()
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
    return VsbrPackage.eINSTANCE;
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
      case VsbrPackage.REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS:
        return validateReportingBirthInformationfromaclinicalsettingtovitalrecords((ReportingBirthInformationfromaclinicalsettingtovitalrecords)value, diagnostics, context);
      case VsbrPackage.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION:
        return validateBirthReportingPrenatalExperienceSection((BirthReportingPrenatalExperienceSection)value, diagnostics, context);
      case VsbrPackage.PRE_NATAL_CARE:
        return validatePreNatalCare((PreNatalCare)value, diagnostics, context);
      case VsbrPackage.HEIGHT:
        return validateHeight((Height)value, diagnostics, context);
      case VsbrPackage.DATEOF_LAST_LIVE_BIRTH:
        return validateDateofLastLiveBirth((DateofLastLiveBirth)value, diagnostics, context);
      case VsbrPackage.LAST_MENSTRUAL_PERIOD_DATE:
        return validateLastMenstrualPeriodDate((LastMenstrualPeriodDate)value, diagnostics, context);
      case VsbrPackage.NUMBEROF_BIRTHS_STILL_LIVING:
        return validateNumberofBirthsStillLiving((NumberofBirthsStillLiving)value, diagnostics, context);
      case VsbrPackage.NUMBEROF_LIVE_BIRTHSNOW_DEAD:
        return validateNumberofLiveBirthsnowDead((NumberofLiveBirthsnowDead)value, diagnostics, context);
      case VsbrPackage.OTHER_PREGNANCY_OUTCOMES:
        return validateOtherPregnancyOutcomes((OtherPregnancyOutcomes)value, diagnostics, context);
      case VsbrPackage.BIRTH_REPORTING_INFECTIONS_PRESENT:
        return validateBirthReportingInfectionsPresent((BirthReportingInfectionsPresent)value, diagnostics, context);
      case VsbrPackage.LABORAND_DELIVERY_SECTION:
        return validateLaborandDeliverySection((LaborandDeliverySection)value, diagnostics, context);
      case VsbrPackage.LABORAND_DELIVERY_INFORMATION:
        return validateLaborandDeliveryInformation((LaborandDeliveryInformation)value, diagnostics, context);
      case VsbrPackage.MATERNAL_MORBIDITIES:
        return validateMaternalMorbidities((MaternalMorbidities)value, diagnostics, context);
      case VsbrPackage.CHARACTERISTICSOF_LABORAND_DELIVERY:
        return validateCharacteristicsofLaborandDelivery((CharacteristicsofLaborandDelivery)value, diagnostics, context);
      case VsbrPackage.LABOR_ONSETS:
        return validateLaborOnsets((LaborOnsets)value, diagnostics, context);
      case VsbrPackage.OBSTETRIC_PROCEDURES:
        return validateObstetricProcedures((ObstetricProcedures)value, diagnostics, context);
      case VsbrPackage.ATTEMPTED_FORCEPS_DELIVERY:
        return validateAttemptedForcepsDelivery((AttemptedForcepsDelivery)value, diagnostics, context);
      case VsbrPackage.ATTEMPTED_VACUUM_EXTRACTION:
        return validateAttemptedVacuumExtraction((AttemptedVacuumExtraction)value, diagnostics, context);
      case VsbrPackage.FETAL_PRESENTATION:
        return validateFetalPresentation((FetalPresentation)value, diagnostics, context);
      case VsbrPackage.ROUTEAND_METHODOF_DELIVERY:
        return validateRouteandMethodofDelivery((RouteandMethodofDelivery)value, diagnostics, context);
      case VsbrPackage.BODY_WEIGHTAT_DELIVERY:
        return validateBodyWeightatDelivery((BodyWeightatDelivery)value, diagnostics, context);
      case VsbrPackage.NEWBORN_SECTION:
        return validateNewbornSection((NewbornSection)value, diagnostics, context);
      case VsbrPackage.ESTIMATEOF_GESTATION:
        return validateEstimateofGestation((EstimateofGestation)value, diagnostics, context);
      case VsbrPackage.APGAR_SCORE:
        return validateApgarScore((ApgarScore)value, diagnostics, context);
      case VsbrPackage.PLURALITY:
        return validatePlurality((Plurality)value, diagnostics, context);
      case VsbrPackage.BIRTH_ORDER:
        return validateBirthOrder((BirthOrder)value, diagnostics, context);
      case VsbrPackage.NUMBEROF_INFANTS_BORN_ALIVE:
        return validateNumberofInfantsBornAlive((NumberofInfantsBornAlive)value, diagnostics, context);
      case VsbrPackage.CONGENITAL_ANOMALIESOFTHE_NEWBORN:
        return validateCongenitalAnomaliesoftheNewborn((CongenitalAnomaliesoftheNewborn)value, diagnostics, context);
      case VsbrPackage.WEIGHT:
        return validateWeight((Weight)value, diagnostics, context);
      case VsbrPackage.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION:
        return validateFetalDeathReportingPrenatalExperienceSection((FetalDeathReportingPrenatalExperienceSection)value, diagnostics, context);
      case VsbrPackage.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT:
        return validateFetalDeathReportingInfectionsPresent((FetalDeathReportingInfectionsPresent)value, diagnostics, context);
      case VsbrPackage.FETUS_SECTION:
        return validateFetusSection((FetusSection)value, diagnostics, context);
      case VsbrPackage.ABNORMAL_CONDITIONSOFTHE_NEWBORN:
        return validateAbnormalConditionsoftheNewborn((AbnormalConditionsoftheNewborn)value, diagnostics, context);
      case VsbrPackage.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS:
        return validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords((ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords)value, diagnostics, context);
      case VsbrPackage.PREPREGNANCY_BODY_WEIGHT:
        return validatePrepregnancyBodyWeight((PrepregnancyBodyWeight)value, diagnostics, context);
      case VsbrPackage.RISK_FACTORS:
        return validateRiskFactors((RiskFactors)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsBirthReportingPrenatalExperienceSection(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornSection(reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsBirthReportingPrenatalExperienceSection constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsBirthReportingPrenatalExperienceSection(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsBirthReportingPrenatalExperienceSection(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(diagnostics, context);
  }

  /**
   * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornSection constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornSection(ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornSection(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(birthReportingPrenatalExperienceSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionTemplateId(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionClassCode(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionCode(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionMoodCode(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionText(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionPreNatalCare(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionHeight(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionRiskFactor(birthReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(birthReportingPrenatalExperienceSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionTemplateId constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionTemplateId(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionClassCode constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionClassCode(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionClassCode(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionCode constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionCode(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionMoodCode constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionMoodCode(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionText constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionText(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionText(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionPreNatalCare constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionPreNatalCare(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionPreNatalCare(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionHeight constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionHeight(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionHeight(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionRiskFactor constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionRiskFactor(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionRiskFactor(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent constraint of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSection_validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingPrenatalExperienceSection.validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCare(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(preNatalCare, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validatePreNatalCare_validatePreNatalCareTemplateId(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validatePreNatalCare_validatePreNatalCareClassCode(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validatePreNatalCare_validatePreNatalCareCode(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validatePreNatalCare_validatePreNatalCareEffectiveTime(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validatePreNatalCare_validatePreNatalCareMoodCode(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validatePreNatalCare_validatePreNatalCareNegationInd(preNatalCare, diagnostics, context);
    if (result || diagnostics != null) result &= validatePreNatalCare_validatePreNatalCareEntryRelationship(preNatalCare, diagnostics, context);
    return result;
  }

  /**
   * Validates the validatePreNatalCareTemplateId constraint of '<em>Pre Natal Care</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCare_validatePreNatalCareTemplateId(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return preNatalCare.validatePreNatalCareTemplateId(diagnostics, context);
  }

  /**
   * Validates the validatePreNatalCareClassCode constraint of '<em>Pre Natal Care</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCare_validatePreNatalCareClassCode(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return preNatalCare.validatePreNatalCareClassCode(diagnostics, context);
  }

  /**
   * Validates the validatePreNatalCareCode constraint of '<em>Pre Natal Care</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCare_validatePreNatalCareCode(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return preNatalCare.validatePreNatalCareCode(diagnostics, context);
  }

  /**
   * Validates the validatePreNatalCareEffectiveTime constraint of '<em>Pre Natal Care</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCare_validatePreNatalCareEffectiveTime(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return preNatalCare.validatePreNatalCareEffectiveTime(diagnostics, context);
  }

  /**
   * Validates the validatePreNatalCareMoodCode constraint of '<em>Pre Natal Care</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCare_validatePreNatalCareMoodCode(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return preNatalCare.validatePreNatalCareMoodCode(diagnostics, context);
  }

  /**
   * Validates the validatePreNatalCareNegationInd constraint of '<em>Pre Natal Care</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCare_validatePreNatalCareNegationInd(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return preNatalCare.validatePreNatalCareNegationInd(diagnostics, context);
  }

  /**
   * Validates the validatePreNatalCareEntryRelationship constraint of '<em>Pre Natal Care</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCare_validatePreNatalCareEntryRelationship(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return preNatalCare.validatePreNatalCareEntryRelationship(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySection(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(laborandDeliverySection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliverySection_validateLaborandDeliverySectionTemplateId(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliverySection_validateLaborandDeliverySectionClassCode(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliverySection_validateLaborandDeliverySectionCode(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliverySection_validateLaborandDeliverySectionMoodCode(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliverySection_validateLaborandDeliverySectionText(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliverySection_validateLaborandDeliverySectionLaborandDeliveryInformation(laborandDeliverySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliverySection_validateLaborandDeliverySectionBodyWeightatDelivery(laborandDeliverySection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateLaborandDeliverySectionTemplateId constraint of '<em>Laborand Delivery Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionTemplateId(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliverySection.validateLaborandDeliverySectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliverySectionClassCode constraint of '<em>Laborand Delivery Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionClassCode(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliverySection.validateLaborandDeliverySectionClassCode(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliverySectionCode constraint of '<em>Laborand Delivery Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionCode(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliverySection.validateLaborandDeliverySectionCode(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliverySectionMoodCode constraint of '<em>Laborand Delivery Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionMoodCode(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliverySection.validateLaborandDeliverySectionMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliverySectionText constraint of '<em>Laborand Delivery Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionText(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliverySection.validateLaborandDeliverySectionText(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliverySectionLaborandDeliveryInformation constraint of '<em>Laborand Delivery Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionLaborandDeliveryInformation(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliverySection.validateLaborandDeliverySectionLaborandDeliveryInformation(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliverySectionBodyWeightatDelivery constraint of '<em>Laborand Delivery Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionBodyWeightatDelivery(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliverySection.validateLaborandDeliverySectionBodyWeightatDelivery(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(laborandDeliveryInformation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationTemplateId(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationClassCode(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationCode(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationMoodCode(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationParticipant(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationPerformer(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationAttendantParticipation(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationHomeBirthPlanAssociation(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationTransferAssociation(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationEntryRelationship(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationMaternalMorbidities(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationLaborOnsets(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationObstetricProcedures(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationAttemptedForcepsDelivery(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationAttemptedVacuumExtraction(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationFetalPresentation(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationRouteandMethodofDelivery(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationBodyWeightatDelivery(laborandDeliveryInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborandDeliveryInformation_validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(laborandDeliveryInformation, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateLaborandDeliveryInformationTemplateId constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationTemplateId(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationClassCode constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationClassCode(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationClassCode(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationCode constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationCode(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationCode(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationMoodCode constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationMoodCode(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationParticipant constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationParticipant(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationParticipant(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationPerformer constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationPerformer(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationPerformer(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationAttendantParticipation constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationAttendantParticipation(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationAttendantParticipation(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationHomeBirthPlanAssociation constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationHomeBirthPlanAssociation(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationHomeBirthPlanAssociation(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationTransferAssociation constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationTransferAssociation(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationTransferAssociation(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationEntryRelationship constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationEntryRelationship(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationEntryRelationship(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationMaternalMorbidities constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationMaternalMorbidities(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationMaternalMorbidities(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationLaborOnsets constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationLaborOnsets(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationLaborOnsets(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationObstetricProcedures constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationObstetricProcedures(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationObstetricProcedures(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationAttemptedForcepsDelivery constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationAttemptedForcepsDelivery(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationAttemptedForcepsDelivery(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationAttemptedVacuumExtraction constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationAttemptedVacuumExtraction(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationAttemptedVacuumExtraction(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationFetalPresentation constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationFetalPresentation(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationFetalPresentation(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationRouteandMethodofDelivery constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationRouteandMethodofDelivery(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationRouteandMethodofDelivery(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationBodyWeightatDelivery constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationBodyWeightatDelivery(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationBodyWeightatDelivery(diagnostics, context);
  }

  /**
   * Validates the validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation constraint of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformation_validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborandDeliveryInformation.validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(newbornSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionTemplateId(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionClassCode(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionCode(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionMoodCode(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionText(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionSubject(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionEstimateofGestation(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionApgarScore(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionPlurality(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionBirthOrder(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionNumberofInfantsBornAlive(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionCongenitalAnomaliesoftheNewborn(newbornSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateNewbornSection_validateNewbornSectionWeight(newbornSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateNewbornSectionTemplateId constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionTemplateId(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateNewbornSectionClassCode constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionClassCode(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionClassCode(diagnostics, context);
  }

  /**
   * Validates the validateNewbornSectionCode constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionCode(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateNewbornSectionMoodCode constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionMoodCode(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateNewbornSectionText constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionText(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionText(diagnostics, context);
  }

  /**
   * Validates the validateNewbornSectionSubject constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionSubject(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionSubject(diagnostics, context);
  }

  /**
   * Validates the validateNewbornSectionEstimateofGestation constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionEstimateofGestation(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionEstimateofGestation(diagnostics, context);
  }

  /**
   * Validates the validateNewbornSectionApgarScore constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionApgarScore(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionApgarScore(diagnostics, context);
  }

  /**
   * Validates the validateNewbornSectionPlurality constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionPlurality(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionPlurality(diagnostics, context);
  }

  /**
   * Validates the validateNewbornSectionBirthOrder constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionBirthOrder(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionBirthOrder(diagnostics, context);
  }

  /**
   * Validates the validateNewbornSectionNumberofInfantsBornAlive constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionNumberofInfantsBornAlive(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionNumberofInfantsBornAlive(diagnostics, context);
  }

  /**
   * Validates the validateNewbornSectionCongenitalAnomaliesoftheNewborn constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionCongenitalAnomaliesoftheNewborn(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionCongenitalAnomaliesoftheNewborn(diagnostics, context);
  }

  /**
   * Validates the validateNewbornSectionWeight constraint of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSection_validateNewbornSectionWeight(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return newbornSection.validateNewbornSectionWeight(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(fetalDeathReportingPrenatalExperienceSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionTemplateId(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionClassCode(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionCode(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionMoodCode(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionText(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionHeight(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(fetalDeathReportingPrenatalExperienceSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionTemplateId constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionTemplateId(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionClassCode constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionClassCode(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionClassCode(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionCode constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionCode(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionMoodCode constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionMoodCode(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionText constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionText(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionText(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionHeight constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionHeight(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionHeight(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionRiskFactor constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent constraint of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSection_validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingPrenatalExperienceSection.validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSection(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(fetusSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetusSection_validateFetusSectionTemplateId(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetusSection_validateFetusSectionClassCode(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetusSection_validateFetusSectionCode(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetusSection_validateFetusSectionMoodCode(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetusSection_validateFetusSectionText(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetusSection_validateFetusSectionSubject(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetusSection_validateFetusSectionAbnormalConditionsoftheNewborn(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetusSection_validateFetusSectionBirthOrder(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetusSection_validateFetusSectionNumberofInfantsBornAlive(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetusSection_validateFetusSectionCongenitalAnomaliesoftheNewborn2(fetusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetusSection_validateFetusSectionWeight(fetusSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateFetusSectionTemplateId constraint of '<em>Fetus Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSection_validateFetusSectionTemplateId(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetusSection.validateFetusSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateFetusSectionClassCode constraint of '<em>Fetus Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSection_validateFetusSectionClassCode(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetusSection.validateFetusSectionClassCode(diagnostics, context);
  }

  /**
   * Validates the validateFetusSectionCode constraint of '<em>Fetus Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSection_validateFetusSectionCode(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetusSection.validateFetusSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateFetusSectionMoodCode constraint of '<em>Fetus Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSection_validateFetusSectionMoodCode(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetusSection.validateFetusSectionMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateFetusSectionText constraint of '<em>Fetus Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSection_validateFetusSectionText(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetusSection.validateFetusSectionText(diagnostics, context);
  }

  /**
   * Validates the validateFetusSectionSubject constraint of '<em>Fetus Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSection_validateFetusSectionSubject(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetusSection.validateFetusSectionSubject(diagnostics, context);
  }

  /**
   * Validates the validateFetusSectionAbnormalConditionsoftheNewborn constraint of '<em>Fetus Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSection_validateFetusSectionAbnormalConditionsoftheNewborn(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetusSection.validateFetusSectionAbnormalConditionsoftheNewborn(diagnostics, context);
  }

  /**
   * Validates the validateFetusSectionBirthOrder constraint of '<em>Fetus Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSection_validateFetusSectionBirthOrder(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetusSection.validateFetusSectionBirthOrder(diagnostics, context);
  }

  /**
   * Validates the validateFetusSectionNumberofInfantsBornAlive constraint of '<em>Fetus Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSection_validateFetusSectionNumberofInfantsBornAlive(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetusSection.validateFetusSectionNumberofInfantsBornAlive(diagnostics, context);
  }

  /**
   * Validates the validateFetusSectionCongenitalAnomaliesoftheNewborn2 constraint of '<em>Fetus Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSection_validateFetusSectionCongenitalAnomaliesoftheNewborn2(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetusSection.validateFetusSectionCongenitalAnomaliesoftheNewborn2(diagnostics, context);
  }

  /**
   * Validates the validateFetusSectionWeight constraint of '<em>Fetus Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSection_validateFetusSectionWeight(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetusSection.validateFetusSectionWeight(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeathReportingPrenatalExperienceSection(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetusSection(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeathReportingPrenatalExperienceSection constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeathReportingPrenatalExperienceSection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeathReportingPrenatalExperienceSection(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(diagnostics, context);
  }

  /**
   * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetusSection constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetusSection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetusSection(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHeight(Height height, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(height, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(height, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(height, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(height, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(height, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(height, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(height, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(height, diagnostics, context);
    if (result || diagnostics != null) result &= validateHeight_validateHeightTemplateId(height, diagnostics, context);
    if (result || diagnostics != null) result &= validateHeight_validateHeightClassCode(height, diagnostics, context);
    if (result || diagnostics != null) result &= validateHeight_validateHeightCode(height, diagnostics, context);
    if (result || diagnostics != null) result &= validateHeight_validateHeightMoodCode(height, diagnostics, context);
    if (result || diagnostics != null) result &= validateHeight_validateHeightValue(height, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateHeightTemplateId constraint of '<em>Height</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHeight_validateHeightTemplateId(Height height, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return height.validateHeightTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateHeightClassCode constraint of '<em>Height</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHeight_validateHeightClassCode(Height height, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return height.validateHeightClassCode(diagnostics, context);
  }

  /**
   * Validates the validateHeightCode constraint of '<em>Height</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHeight_validateHeightCode(Height height, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return height.validateHeightCode(diagnostics, context);
  }

  /**
   * Validates the validateHeightMoodCode constraint of '<em>Height</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHeight_validateHeightMoodCode(Height height, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return height.validateHeightMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateHeightValue constraint of '<em>Height</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHeight_validateHeightValue(Height height, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return height.validateHeightValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightatDelivery(BodyWeightatDelivery bodyWeightatDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(bodyWeightatDelivery, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(bodyWeightatDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bodyWeightatDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bodyWeightatDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(bodyWeightatDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(bodyWeightatDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(bodyWeightatDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bodyWeightatDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateBodyWeightatDelivery_validateBodyWeightatDeliveryTemplateId(bodyWeightatDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateBodyWeightatDelivery_validateBodyWeightatDeliveryClassCode(bodyWeightatDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateBodyWeightatDelivery_validateBodyWeightatDeliveryCode(bodyWeightatDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateBodyWeightatDelivery_validateBodyWeightatDeliveryValue(bodyWeightatDelivery, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateBodyWeightatDeliveryTemplateId constraint of '<em>Body Weightat Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightatDelivery_validateBodyWeightatDeliveryTemplateId(BodyWeightatDelivery bodyWeightatDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return bodyWeightatDelivery.validateBodyWeightatDeliveryTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateBodyWeightatDeliveryClassCode constraint of '<em>Body Weightat Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightatDelivery_validateBodyWeightatDeliveryClassCode(BodyWeightatDelivery bodyWeightatDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return bodyWeightatDelivery.validateBodyWeightatDeliveryClassCode(diagnostics, context);
  }

  /**
   * Validates the validateBodyWeightatDeliveryCode constraint of '<em>Body Weightat Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightatDelivery_validateBodyWeightatDeliveryCode(BodyWeightatDelivery bodyWeightatDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return bodyWeightatDelivery.validateBodyWeightatDeliveryCode(diagnostics, context);
  }

  /**
   * Validates the validateBodyWeightatDeliveryValue constraint of '<em>Body Weightat Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightatDelivery_validateBodyWeightatDeliveryValue(BodyWeightatDelivery bodyWeightatDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return bodyWeightatDelivery.validateBodyWeightatDeliveryValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrepregnancyBodyWeight(PrepregnancyBodyWeight prepregnancyBodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(prepregnancyBodyWeight, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(prepregnancyBodyWeight, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(prepregnancyBodyWeight, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(prepregnancyBodyWeight, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(prepregnancyBodyWeight, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(prepregnancyBodyWeight, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(prepregnancyBodyWeight, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(prepregnancyBodyWeight, diagnostics, context);
    if (result || diagnostics != null) result &= validatePrepregnancyBodyWeight_validatePrepregnancyBodyWeightTemplateId(prepregnancyBodyWeight, diagnostics, context);
    if (result || diagnostics != null) result &= validatePrepregnancyBodyWeight_validatePrepregnancyBodyWeightClassCode(prepregnancyBodyWeight, diagnostics, context);
    if (result || diagnostics != null) result &= validatePrepregnancyBodyWeight_validatePrepregnancyBodyWeightCode(prepregnancyBodyWeight, diagnostics, context);
    if (result || diagnostics != null) result &= validatePrepregnancyBodyWeight_validatePrepregnancyBodyWeightMoodCode(prepregnancyBodyWeight, diagnostics, context);
    if (result || diagnostics != null) result &= validatePrepregnancyBodyWeight_validatePrepregnancyBodyWeightValue(prepregnancyBodyWeight, diagnostics, context);
    return result;
  }

  /**
   * Validates the validatePrepregnancyBodyWeightTemplateId constraint of '<em>Prepregnancy Body Weight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrepregnancyBodyWeight_validatePrepregnancyBodyWeightTemplateId(PrepregnancyBodyWeight prepregnancyBodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return prepregnancyBodyWeight.validatePrepregnancyBodyWeightTemplateId(diagnostics, context);
  }

  /**
   * Validates the validatePrepregnancyBodyWeightClassCode constraint of '<em>Prepregnancy Body Weight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrepregnancyBodyWeight_validatePrepregnancyBodyWeightClassCode(PrepregnancyBodyWeight prepregnancyBodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return prepregnancyBodyWeight.validatePrepregnancyBodyWeightClassCode(diagnostics, context);
  }

  /**
   * Validates the validatePrepregnancyBodyWeightCode constraint of '<em>Prepregnancy Body Weight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrepregnancyBodyWeight_validatePrepregnancyBodyWeightCode(PrepregnancyBodyWeight prepregnancyBodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return prepregnancyBodyWeight.validatePrepregnancyBodyWeightCode(diagnostics, context);
  }

  /**
   * Validates the validatePrepregnancyBodyWeightMoodCode constraint of '<em>Prepregnancy Body Weight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrepregnancyBodyWeight_validatePrepregnancyBodyWeightMoodCode(PrepregnancyBodyWeight prepregnancyBodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return prepregnancyBodyWeight.validatePrepregnancyBodyWeightMoodCode(diagnostics, context);
  }

  /**
   * Validates the validatePrepregnancyBodyWeightValue constraint of '<em>Prepregnancy Body Weight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrepregnancyBodyWeight_validatePrepregnancyBodyWeightValue(PrepregnancyBodyWeight prepregnancyBodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return prepregnancyBodyWeight.validatePrepregnancyBodyWeightValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofBirthsStillLiving(NumberofBirthsStillLiving numberofBirthsStillLiving, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(numberofBirthsStillLiving, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(numberofBirthsStillLiving, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numberofBirthsStillLiving, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numberofBirthsStillLiving, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(numberofBirthsStillLiving, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(numberofBirthsStillLiving, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(numberofBirthsStillLiving, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numberofBirthsStillLiving, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofBirthsStillLiving_validateNumberofBirthsStillLivingTemplateId(numberofBirthsStillLiving, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofBirthsStillLiving_validateNumberofBirthsStillLivingClassCode(numberofBirthsStillLiving, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofBirthsStillLiving_validateNumberofBirthsStillLivingCode(numberofBirthsStillLiving, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofBirthsStillLiving_validateNumberofBirthsStillLivingMoodCode(numberofBirthsStillLiving, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofBirthsStillLiving_validateNumberofBirthsStillLivingValue(numberofBirthsStillLiving, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateNumberofBirthsStillLivingTemplateId constraint of '<em>Numberof Births Still Living</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofBirthsStillLiving_validateNumberofBirthsStillLivingTemplateId(NumberofBirthsStillLiving numberofBirthsStillLiving, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofBirthsStillLiving.validateNumberofBirthsStillLivingTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateNumberofBirthsStillLivingClassCode constraint of '<em>Numberof Births Still Living</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofBirthsStillLiving_validateNumberofBirthsStillLivingClassCode(NumberofBirthsStillLiving numberofBirthsStillLiving, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofBirthsStillLiving.validateNumberofBirthsStillLivingClassCode(diagnostics, context);
  }

  /**
   * Validates the validateNumberofBirthsStillLivingCode constraint of '<em>Numberof Births Still Living</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofBirthsStillLiving_validateNumberofBirthsStillLivingCode(NumberofBirthsStillLiving numberofBirthsStillLiving, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofBirthsStillLiving.validateNumberofBirthsStillLivingCode(diagnostics, context);
  }

  /**
   * Validates the validateNumberofBirthsStillLivingMoodCode constraint of '<em>Numberof Births Still Living</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofBirthsStillLiving_validateNumberofBirthsStillLivingMoodCode(NumberofBirthsStillLiving numberofBirthsStillLiving, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofBirthsStillLiving.validateNumberofBirthsStillLivingMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateNumberofBirthsStillLivingValue constraint of '<em>Numberof Births Still Living</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofBirthsStillLiving_validateNumberofBirthsStillLivingValue(NumberofBirthsStillLiving numberofBirthsStillLiving, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofBirthsStillLiving.validateNumberofBirthsStillLivingValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateofLastLiveBirth(DateofLastLiveBirth dateofLastLiveBirth, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(dateofLastLiveBirth, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(dateofLastLiveBirth, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateofLastLiveBirth, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateofLastLiveBirth, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateofLastLiveBirth, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(dateofLastLiveBirth, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateofLastLiveBirth, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateofLastLiveBirth, diagnostics, context);
    if (result || diagnostics != null) result &= validateDateofLastLiveBirth_validateDateofLastLiveBirthTemplateId(dateofLastLiveBirth, diagnostics, context);
    if (result || diagnostics != null) result &= validateDateofLastLiveBirth_validateDateofLastLiveBirthCode(dateofLastLiveBirth, diagnostics, context);
    if (result || diagnostics != null) result &= validateDateofLastLiveBirth_validateDateofLastLiveBirthMoodCode(dateofLastLiveBirth, diagnostics, context);
    if (result || diagnostics != null) result &= validateDateofLastLiveBirth_validateDateofLastLiveBirthValue(dateofLastLiveBirth, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateDateofLastLiveBirthTemplateId constraint of '<em>Dateof Last Live Birth</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateofLastLiveBirth_validateDateofLastLiveBirthTemplateId(DateofLastLiveBirth dateofLastLiveBirth, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return dateofLastLiveBirth.validateDateofLastLiveBirthTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateDateofLastLiveBirthCode constraint of '<em>Dateof Last Live Birth</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateofLastLiveBirth_validateDateofLastLiveBirthCode(DateofLastLiveBirth dateofLastLiveBirth, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return dateofLastLiveBirth.validateDateofLastLiveBirthCode(diagnostics, context);
  }

  /**
   * Validates the validateDateofLastLiveBirthMoodCode constraint of '<em>Dateof Last Live Birth</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateofLastLiveBirth_validateDateofLastLiveBirthMoodCode(DateofLastLiveBirth dateofLastLiveBirth, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return dateofLastLiveBirth.validateDateofLastLiveBirthMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateDateofLastLiveBirthValue constraint of '<em>Dateof Last Live Birth</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateofLastLiveBirth_validateDateofLastLiveBirthValue(DateofLastLiveBirth dateofLastLiveBirth, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return dateofLastLiveBirth.validateDateofLastLiveBirthValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofLiveBirthsnowDead(NumberofLiveBirthsnowDead numberofLiveBirthsnowDead, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(numberofLiveBirthsnowDead, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(numberofLiveBirthsnowDead, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numberofLiveBirthsnowDead, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numberofLiveBirthsnowDead, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(numberofLiveBirthsnowDead, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(numberofLiveBirthsnowDead, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(numberofLiveBirthsnowDead, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numberofLiveBirthsnowDead, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofLiveBirthsnowDead_validateNumberofLiveBirthsnowDeadTemplateId(numberofLiveBirthsnowDead, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofLiveBirthsnowDead_validateNumberofLiveBirthsnowDeadClassCode(numberofLiveBirthsnowDead, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofLiveBirthsnowDead_validateNumberofLiveBirthsnowDeadCode(numberofLiveBirthsnowDead, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofLiveBirthsnowDead_validateNumberofLiveBirthsnowDeadMoodCode(numberofLiveBirthsnowDead, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofLiveBirthsnowDead_validateNumberofLiveBirthsnowDeadValue(numberofLiveBirthsnowDead, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateNumberofLiveBirthsnowDeadTemplateId constraint of '<em>Numberof Live Birthsnow Dead</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofLiveBirthsnowDead_validateNumberofLiveBirthsnowDeadTemplateId(NumberofLiveBirthsnowDead numberofLiveBirthsnowDead, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofLiveBirthsnowDead.validateNumberofLiveBirthsnowDeadTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateNumberofLiveBirthsnowDeadClassCode constraint of '<em>Numberof Live Birthsnow Dead</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofLiveBirthsnowDead_validateNumberofLiveBirthsnowDeadClassCode(NumberofLiveBirthsnowDead numberofLiveBirthsnowDead, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofLiveBirthsnowDead.validateNumberofLiveBirthsnowDeadClassCode(diagnostics, context);
  }

  /**
   * Validates the validateNumberofLiveBirthsnowDeadCode constraint of '<em>Numberof Live Birthsnow Dead</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofLiveBirthsnowDead_validateNumberofLiveBirthsnowDeadCode(NumberofLiveBirthsnowDead numberofLiveBirthsnowDead, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofLiveBirthsnowDead.validateNumberofLiveBirthsnowDeadCode(diagnostics, context);
  }

  /**
   * Validates the validateNumberofLiveBirthsnowDeadMoodCode constraint of '<em>Numberof Live Birthsnow Dead</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofLiveBirthsnowDead_validateNumberofLiveBirthsnowDeadMoodCode(NumberofLiveBirthsnowDead numberofLiveBirthsnowDead, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofLiveBirthsnowDead.validateNumberofLiveBirthsnowDeadMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateNumberofLiveBirthsnowDeadValue constraint of '<em>Numberof Live Birthsnow Dead</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofLiveBirthsnowDead_validateNumberofLiveBirthsnowDeadValue(NumberofLiveBirthsnowDead numberofLiveBirthsnowDead, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofLiveBirthsnowDead.validateNumberofLiveBirthsnowDeadValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomes(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(otherPregnancyOutcomes, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(otherPregnancyOutcomes, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(otherPregnancyOutcomes, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(otherPregnancyOutcomes, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(otherPregnancyOutcomes, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(otherPregnancyOutcomes, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(otherPregnancyOutcomes, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(otherPregnancyOutcomes, diagnostics, context);
    if (result || diagnostics != null) result &= validateOtherPregnancyOutcomes_validateOtherPregnancyOutcomesTemplateId(otherPregnancyOutcomes, diagnostics, context);
    if (result || diagnostics != null) result &= validateOtherPregnancyOutcomes_validateOtherPregnancyOutcomesClassCode(otherPregnancyOutcomes, diagnostics, context);
    if (result || diagnostics != null) result &= validateOtherPregnancyOutcomes_validateOtherPregnancyOutcomesCode(otherPregnancyOutcomes, diagnostics, context);
    if (result || diagnostics != null) result &= validateOtherPregnancyOutcomes_validateOtherPregnancyOutcomesMoodCode(otherPregnancyOutcomes, diagnostics, context);
    if (result || diagnostics != null) result &= validateOtherPregnancyOutcomes_validateOtherPregnancyOutcomesValue(otherPregnancyOutcomes, diagnostics, context);
    if (result || diagnostics != null) result &= validateOtherPregnancyOutcomes_validateOtherPregnancyOutcomesEffectiveTime(otherPregnancyOutcomes, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateOtherPregnancyOutcomesTemplateId constraint of '<em>Other Pregnancy Outcomes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomes_validateOtherPregnancyOutcomesTemplateId(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return otherPregnancyOutcomes.validateOtherPregnancyOutcomesTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateOtherPregnancyOutcomesClassCode constraint of '<em>Other Pregnancy Outcomes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomes_validateOtherPregnancyOutcomesClassCode(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return otherPregnancyOutcomes.validateOtherPregnancyOutcomesClassCode(diagnostics, context);
  }

  /**
   * Validates the validateOtherPregnancyOutcomesCode constraint of '<em>Other Pregnancy Outcomes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomes_validateOtherPregnancyOutcomesCode(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return otherPregnancyOutcomes.validateOtherPregnancyOutcomesCode(diagnostics, context);
  }

  /**
   * Validates the validateOtherPregnancyOutcomesMoodCode constraint of '<em>Other Pregnancy Outcomes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomes_validateOtherPregnancyOutcomesMoodCode(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return otherPregnancyOutcomes.validateOtherPregnancyOutcomesMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateOtherPregnancyOutcomesValue constraint of '<em>Other Pregnancy Outcomes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomes_validateOtherPregnancyOutcomesValue(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return otherPregnancyOutcomes.validateOtherPregnancyOutcomesValue(diagnostics, context);
  }

  /**
   * Validates the validateOtherPregnancyOutcomesEffectiveTime constraint of '<em>Other Pregnancy Outcomes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomes_validateOtherPregnancyOutcomesEffectiveTime(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return otherPregnancyOutcomes.validateOtherPregnancyOutcomesEffectiveTime(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLastMenstrualPeriodDate(LastMenstrualPeriodDate lastMenstrualPeriodDate, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(lastMenstrualPeriodDate, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(lastMenstrualPeriodDate, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lastMenstrualPeriodDate, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lastMenstrualPeriodDate, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(lastMenstrualPeriodDate, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(lastMenstrualPeriodDate, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(lastMenstrualPeriodDate, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lastMenstrualPeriodDate, diagnostics, context);
    if (result || diagnostics != null) result &= validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateTemplateId(lastMenstrualPeriodDate, diagnostics, context);
    if (result || diagnostics != null) result &= validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateClassCode(lastMenstrualPeriodDate, diagnostics, context);
    if (result || diagnostics != null) result &= validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateCode(lastMenstrualPeriodDate, diagnostics, context);
    if (result || diagnostics != null) result &= validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateMoodCode(lastMenstrualPeriodDate, diagnostics, context);
    if (result || diagnostics != null) result &= validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateValue(lastMenstrualPeriodDate, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateLastMenstrualPeriodDateTemplateId constraint of '<em>Last Menstrual Period Date</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateTemplateId(LastMenstrualPeriodDate lastMenstrualPeriodDate, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return lastMenstrualPeriodDate.validateLastMenstrualPeriodDateTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateLastMenstrualPeriodDateClassCode constraint of '<em>Last Menstrual Period Date</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateClassCode(LastMenstrualPeriodDate lastMenstrualPeriodDate, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return lastMenstrualPeriodDate.validateLastMenstrualPeriodDateClassCode(diagnostics, context);
  }

  /**
   * Validates the validateLastMenstrualPeriodDateCode constraint of '<em>Last Menstrual Period Date</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateCode(LastMenstrualPeriodDate lastMenstrualPeriodDate, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return lastMenstrualPeriodDate.validateLastMenstrualPeriodDateCode(diagnostics, context);
  }

  /**
   * Validates the validateLastMenstrualPeriodDateMoodCode constraint of '<em>Last Menstrual Period Date</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateMoodCode(LastMenstrualPeriodDate lastMenstrualPeriodDate, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return lastMenstrualPeriodDate.validateLastMenstrualPeriodDateMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateLastMenstrualPeriodDateValue constraint of '<em>Last Menstrual Period Date</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateValue(LastMenstrualPeriodDate lastMenstrualPeriodDate, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return lastMenstrualPeriodDate.validateLastMenstrualPeriodDateValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingInfectionsPresent(BirthReportingInfectionsPresent birthReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(birthReportingInfectionsPresent, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(birthReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(birthReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(birthReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(birthReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(birthReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(birthReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(birthReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingInfectionsPresent_validateBirthReportingInfectionsPresentTemplateId(birthReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingInfectionsPresent_validateBirthReportingInfectionsPresentClassCode(birthReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingInfectionsPresent_validateBirthReportingInfectionsPresentCode(birthReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingInfectionsPresent_validateBirthReportingInfectionsPresentMoodCode(birthReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthReportingInfectionsPresent_validateBirthReportingInfectionsPresentValue(birthReportingInfectionsPresent, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateBirthReportingInfectionsPresentTemplateId constraint of '<em>Birth Reporting Infections Present</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingInfectionsPresent_validateBirthReportingInfectionsPresentTemplateId(BirthReportingInfectionsPresent birthReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingInfectionsPresent.validateBirthReportingInfectionsPresentTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingInfectionsPresentClassCode constraint of '<em>Birth Reporting Infections Present</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingInfectionsPresent_validateBirthReportingInfectionsPresentClassCode(BirthReportingInfectionsPresent birthReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingInfectionsPresent.validateBirthReportingInfectionsPresentClassCode(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingInfectionsPresentCode constraint of '<em>Birth Reporting Infections Present</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingInfectionsPresent_validateBirthReportingInfectionsPresentCode(BirthReportingInfectionsPresent birthReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingInfectionsPresent.validateBirthReportingInfectionsPresentCode(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingInfectionsPresentMoodCode constraint of '<em>Birth Reporting Infections Present</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingInfectionsPresent_validateBirthReportingInfectionsPresentMoodCode(BirthReportingInfectionsPresent birthReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingInfectionsPresent.validateBirthReportingInfectionsPresentMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateBirthReportingInfectionsPresentValue constraint of '<em>Birth Reporting Infections Present</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingInfectionsPresent_validateBirthReportingInfectionsPresentValue(BirthReportingInfectionsPresent birthReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthReportingInfectionsPresent.validateBirthReportingInfectionsPresentValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborOnsets(LaborOnsets laborOnsets, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(laborOnsets, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(laborOnsets, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(laborOnsets, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(laborOnsets, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(laborOnsets, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(laborOnsets, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(laborOnsets, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(laborOnsets, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborOnsets_validateLaborOnsetsTemplateId(laborOnsets, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborOnsets_validateLaborOnsetsClassCode(laborOnsets, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborOnsets_validateLaborOnsetsCode(laborOnsets, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborOnsets_validateLaborOnsetsMoodCode(laborOnsets, diagnostics, context);
    if (result || diagnostics != null) result &= validateLaborOnsets_validateLaborOnsetsValue(laborOnsets, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateLaborOnsetsTemplateId constraint of '<em>Labor Onsets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborOnsets_validateLaborOnsetsTemplateId(LaborOnsets laborOnsets, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborOnsets.validateLaborOnsetsTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateLaborOnsetsClassCode constraint of '<em>Labor Onsets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborOnsets_validateLaborOnsetsClassCode(LaborOnsets laborOnsets, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborOnsets.validateLaborOnsetsClassCode(diagnostics, context);
  }

  /**
   * Validates the validateLaborOnsetsCode constraint of '<em>Labor Onsets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborOnsets_validateLaborOnsetsCode(LaborOnsets laborOnsets, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborOnsets.validateLaborOnsetsCode(diagnostics, context);
  }

  /**
   * Validates the validateLaborOnsetsMoodCode constraint of '<em>Labor Onsets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborOnsets_validateLaborOnsetsMoodCode(LaborOnsets laborOnsets, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborOnsets.validateLaborOnsetsMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateLaborOnsetsValue constraint of '<em>Labor Onsets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborOnsets_validateLaborOnsetsValue(LaborOnsets laborOnsets, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return laborOnsets.validateLaborOnsetsValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingInfectionsPresent(FetalDeathReportingInfectionsPresent fetalDeathReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(fetalDeathReportingInfectionsPresent, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(fetalDeathReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fetalDeathReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fetalDeathReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(fetalDeathReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(fetalDeathReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(fetalDeathReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fetalDeathReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingInfectionsPresent_validateFetalDeathReportingInfectionsPresentTemplateId(fetalDeathReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingInfectionsPresent_validateFetalDeathReportingInfectionsPresentClassCode(fetalDeathReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingInfectionsPresent_validateFetalDeathReportingInfectionsPresentCode(fetalDeathReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingInfectionsPresent_validateFetalDeathReportingInfectionsPresentMoodCode(fetalDeathReportingInfectionsPresent, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalDeathReportingInfectionsPresent_validateFetalDeathReportingInfectionsPresentValue(fetalDeathReportingInfectionsPresent, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateFetalDeathReportingInfectionsPresentTemplateId constraint of '<em>Fetal Death Reporting Infections Present</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingInfectionsPresent_validateFetalDeathReportingInfectionsPresentTemplateId(FetalDeathReportingInfectionsPresent fetalDeathReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingInfectionsPresent.validateFetalDeathReportingInfectionsPresentTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingInfectionsPresentClassCode constraint of '<em>Fetal Death Reporting Infections Present</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingInfectionsPresent_validateFetalDeathReportingInfectionsPresentClassCode(FetalDeathReportingInfectionsPresent fetalDeathReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingInfectionsPresent.validateFetalDeathReportingInfectionsPresentClassCode(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingInfectionsPresentCode constraint of '<em>Fetal Death Reporting Infections Present</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingInfectionsPresent_validateFetalDeathReportingInfectionsPresentCode(FetalDeathReportingInfectionsPresent fetalDeathReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingInfectionsPresent.validateFetalDeathReportingInfectionsPresentCode(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingInfectionsPresentMoodCode constraint of '<em>Fetal Death Reporting Infections Present</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingInfectionsPresent_validateFetalDeathReportingInfectionsPresentMoodCode(FetalDeathReportingInfectionsPresent fetalDeathReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingInfectionsPresent.validateFetalDeathReportingInfectionsPresentMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateFetalDeathReportingInfectionsPresentValue constraint of '<em>Fetal Death Reporting Infections Present</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingInfectionsPresent_validateFetalDeathReportingInfectionsPresentValue(FetalDeathReportingInfectionsPresent fetalDeathReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalDeathReportingInfectionsPresent.validateFetalDeathReportingInfectionsPresentValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObstetricProcedures(ObstetricProcedures obstetricProcedures, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(obstetricProcedures, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(obstetricProcedures, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obstetricProcedures, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obstetricProcedures, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(obstetricProcedures, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(obstetricProcedures, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(obstetricProcedures, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obstetricProcedures, diagnostics, context);
    if (result || diagnostics != null) result &= validateObstetricProcedures_validateObstetricProceduresTemplateId(obstetricProcedures, diagnostics, context);
    if (result || diagnostics != null) result &= validateObstetricProcedures_validateObstetricProceduresClassCode(obstetricProcedures, diagnostics, context);
    if (result || diagnostics != null) result &= validateObstetricProcedures_validateObstetricProceduresCode(obstetricProcedures, diagnostics, context);
    if (result || diagnostics != null) result &= validateObstetricProcedures_validateObstetricProceduresMoodCode(obstetricProcedures, diagnostics, context);
    if (result || diagnostics != null) result &= validateObstetricProcedures_validateObstetricProceduresValue(obstetricProcedures, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateObstetricProceduresTemplateId constraint of '<em>Obstetric Procedures</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObstetricProcedures_validateObstetricProceduresTemplateId(ObstetricProcedures obstetricProcedures, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return obstetricProcedures.validateObstetricProceduresTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateObstetricProceduresClassCode constraint of '<em>Obstetric Procedures</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObstetricProcedures_validateObstetricProceduresClassCode(ObstetricProcedures obstetricProcedures, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return obstetricProcedures.validateObstetricProceduresClassCode(diagnostics, context);
  }

  /**
   * Validates the validateObstetricProceduresCode constraint of '<em>Obstetric Procedures</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObstetricProcedures_validateObstetricProceduresCode(ObstetricProcedures obstetricProcedures, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return obstetricProcedures.validateObstetricProceduresCode(diagnostics, context);
  }

  /**
   * Validates the validateObstetricProceduresMoodCode constraint of '<em>Obstetric Procedures</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObstetricProcedures_validateObstetricProceduresMoodCode(ObstetricProcedures obstetricProcedures, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return obstetricProcedures.validateObstetricProceduresMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateObstetricProceduresValue constraint of '<em>Obstetric Procedures</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObstetricProcedures_validateObstetricProceduresValue(ObstetricProcedures obstetricProcedures, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return obstetricProcedures.validateObstetricProceduresValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactors(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(riskFactors, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(riskFactors, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(riskFactors, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(riskFactors, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(riskFactors, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(riskFactors, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(riskFactors, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(riskFactors, diagnostics, context);
    if (result || diagnostics != null) result &= validateRiskFactors_validateRiskFactorsTemplateId(riskFactors, diagnostics, context);
    if (result || diagnostics != null) result &= validateRiskFactors_validateRiskFactorsClassCode(riskFactors, diagnostics, context);
    if (result || diagnostics != null) result &= validateRiskFactors_validateRiskFactorsCode(riskFactors, diagnostics, context);
    if (result || diagnostics != null) result &= validateRiskFactors_validateRiskFactorsMoodCode(riskFactors, diagnostics, context);
    if (result || diagnostics != null) result &= validateRiskFactors_validateRiskFactorsValue(riskFactors, diagnostics, context);
    if (result || diagnostics != null) result &= validateRiskFactors_validateRiskFactorsEntryRelationship(riskFactors, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateRiskFactorsTemplateId constraint of '<em>Risk Factors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactors_validateRiskFactorsTemplateId(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return riskFactors.validateRiskFactorsTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateRiskFactorsClassCode constraint of '<em>Risk Factors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactors_validateRiskFactorsClassCode(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return riskFactors.validateRiskFactorsClassCode(diagnostics, context);
  }

  /**
   * Validates the validateRiskFactorsCode constraint of '<em>Risk Factors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactors_validateRiskFactorsCode(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return riskFactors.validateRiskFactorsCode(diagnostics, context);
  }

  /**
   * Validates the validateRiskFactorsMoodCode constraint of '<em>Risk Factors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactors_validateRiskFactorsMoodCode(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return riskFactors.validateRiskFactorsMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateRiskFactorsValue constraint of '<em>Risk Factors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactors_validateRiskFactorsValue(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return riskFactors.validateRiskFactorsValue(diagnostics, context);
  }

  /**
   * Validates the validateRiskFactorsEntryRelationship constraint of '<em>Risk Factors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactors_validateRiskFactorsEntryRelationship(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return riskFactors.validateRiskFactorsEntryRelationship(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCharacteristicsofLaborandDelivery(CharacteristicsofLaborandDelivery characteristicsofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(characteristicsofLaborandDelivery, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(characteristicsofLaborandDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(characteristicsofLaborandDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(characteristicsofLaborandDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(characteristicsofLaborandDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(characteristicsofLaborandDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(characteristicsofLaborandDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(characteristicsofLaborandDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateCharacteristicsofLaborandDelivery_validateCharacteristicsofLaborandDeliveryTemplateId(characteristicsofLaborandDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateCharacteristicsofLaborandDelivery_validateCharacteristicsofLaborandDeliveryClassCode(characteristicsofLaborandDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateCharacteristicsofLaborandDelivery_validateCharacteristicsofLaborandDeliveryCode(characteristicsofLaborandDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateCharacteristicsofLaborandDelivery_validateCharacteristicsofLaborandDeliveryMoodCode(characteristicsofLaborandDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateCharacteristicsofLaborandDelivery_validateCharacteristicsofLaborandDeliveryValue(characteristicsofLaborandDelivery, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateCharacteristicsofLaborandDeliveryTemplateId constraint of '<em>Characteristicsof Laborand Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCharacteristicsofLaborandDelivery_validateCharacteristicsofLaborandDeliveryTemplateId(CharacteristicsofLaborandDelivery characteristicsofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return characteristicsofLaborandDelivery.validateCharacteristicsofLaborandDeliveryTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateCharacteristicsofLaborandDeliveryClassCode constraint of '<em>Characteristicsof Laborand Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCharacteristicsofLaborandDelivery_validateCharacteristicsofLaborandDeliveryClassCode(CharacteristicsofLaborandDelivery characteristicsofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return characteristicsofLaborandDelivery.validateCharacteristicsofLaborandDeliveryClassCode(diagnostics, context);
  }

  /**
   * Validates the validateCharacteristicsofLaborandDeliveryCode constraint of '<em>Characteristicsof Laborand Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCharacteristicsofLaborandDelivery_validateCharacteristicsofLaborandDeliveryCode(CharacteristicsofLaborandDelivery characteristicsofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return characteristicsofLaborandDelivery.validateCharacteristicsofLaborandDeliveryCode(diagnostics, context);
  }

  /**
   * Validates the validateCharacteristicsofLaborandDeliveryMoodCode constraint of '<em>Characteristicsof Laborand Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCharacteristicsofLaborandDelivery_validateCharacteristicsofLaborandDeliveryMoodCode(CharacteristicsofLaborandDelivery characteristicsofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return characteristicsofLaborandDelivery.validateCharacteristicsofLaborandDeliveryMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateCharacteristicsofLaborandDeliveryValue constraint of '<em>Characteristicsof Laborand Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCharacteristicsofLaborandDelivery_validateCharacteristicsofLaborandDeliveryValue(CharacteristicsofLaborandDelivery characteristicsofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return characteristicsofLaborandDelivery.validateCharacteristicsofLaborandDeliveryValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalMorbidities(MaternalMorbidities maternalMorbidities, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(maternalMorbidities, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(maternalMorbidities, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(maternalMorbidities, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(maternalMorbidities, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(maternalMorbidities, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(maternalMorbidities, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(maternalMorbidities, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(maternalMorbidities, diagnostics, context);
    if (result || diagnostics != null) result &= validateMaternalMorbidities_validateMaternalMorbiditiesTemplateId(maternalMorbidities, diagnostics, context);
    if (result || diagnostics != null) result &= validateMaternalMorbidities_validateMaternalMorbiditiesClassCode(maternalMorbidities, diagnostics, context);
    if (result || diagnostics != null) result &= validateMaternalMorbidities_validateMaternalMorbiditiesCode(maternalMorbidities, diagnostics, context);
    if (result || diagnostics != null) result &= validateMaternalMorbidities_validateMaternalMorbiditiesMoodCode(maternalMorbidities, diagnostics, context);
    if (result || diagnostics != null) result &= validateMaternalMorbidities_validateMaternalMorbiditiesValue(maternalMorbidities, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateMaternalMorbiditiesTemplateId constraint of '<em>Maternal Morbidities</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalMorbidities_validateMaternalMorbiditiesTemplateId(MaternalMorbidities maternalMorbidities, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return maternalMorbidities.validateMaternalMorbiditiesTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateMaternalMorbiditiesClassCode constraint of '<em>Maternal Morbidities</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalMorbidities_validateMaternalMorbiditiesClassCode(MaternalMorbidities maternalMorbidities, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return maternalMorbidities.validateMaternalMorbiditiesClassCode(diagnostics, context);
  }

  /**
   * Validates the validateMaternalMorbiditiesCode constraint of '<em>Maternal Morbidities</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalMorbidities_validateMaternalMorbiditiesCode(MaternalMorbidities maternalMorbidities, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return maternalMorbidities.validateMaternalMorbiditiesCode(diagnostics, context);
  }

  /**
   * Validates the validateMaternalMorbiditiesMoodCode constraint of '<em>Maternal Morbidities</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalMorbidities_validateMaternalMorbiditiesMoodCode(MaternalMorbidities maternalMorbidities, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return maternalMorbidities.validateMaternalMorbiditiesMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateMaternalMorbiditiesValue constraint of '<em>Maternal Morbidities</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalMorbidities_validateMaternalMorbiditiesValue(MaternalMorbidities maternalMorbidities, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return maternalMorbidities.validateMaternalMorbiditiesValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbnormalConditionsoftheNewborn(AbnormalConditionsoftheNewborn abnormalConditionsoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(abnormalConditionsoftheNewborn, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(abnormalConditionsoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abnormalConditionsoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abnormalConditionsoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(abnormalConditionsoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(abnormalConditionsoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(abnormalConditionsoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abnormalConditionsoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validateAbnormalConditionsoftheNewborn_validateAbnormalConditionsoftheNewbornTemplateId(abnormalConditionsoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validateAbnormalConditionsoftheNewborn_validateAbnormalConditionsoftheNewbornClassCode(abnormalConditionsoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validateAbnormalConditionsoftheNewborn_validateAbnormalConditionsoftheNewbornCode(abnormalConditionsoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validateAbnormalConditionsoftheNewborn_validateAbnormalConditionsoftheNewbornMoodCode(abnormalConditionsoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validateAbnormalConditionsoftheNewborn_validateAbnormalConditionsoftheNewbornValue(abnormalConditionsoftheNewborn, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateAbnormalConditionsoftheNewbornTemplateId constraint of '<em>Abnormal Conditionsofthe Newborn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbnormalConditionsoftheNewborn_validateAbnormalConditionsoftheNewbornTemplateId(AbnormalConditionsoftheNewborn abnormalConditionsoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return abnormalConditionsoftheNewborn.validateAbnormalConditionsoftheNewbornTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateAbnormalConditionsoftheNewbornClassCode constraint of '<em>Abnormal Conditionsofthe Newborn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbnormalConditionsoftheNewborn_validateAbnormalConditionsoftheNewbornClassCode(AbnormalConditionsoftheNewborn abnormalConditionsoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return abnormalConditionsoftheNewborn.validateAbnormalConditionsoftheNewbornClassCode(diagnostics, context);
  }

  /**
   * Validates the validateAbnormalConditionsoftheNewbornCode constraint of '<em>Abnormal Conditionsofthe Newborn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbnormalConditionsoftheNewborn_validateAbnormalConditionsoftheNewbornCode(AbnormalConditionsoftheNewborn abnormalConditionsoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return abnormalConditionsoftheNewborn.validateAbnormalConditionsoftheNewbornCode(diagnostics, context);
  }

  /**
   * Validates the validateAbnormalConditionsoftheNewbornMoodCode constraint of '<em>Abnormal Conditionsofthe Newborn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbnormalConditionsoftheNewborn_validateAbnormalConditionsoftheNewbornMoodCode(AbnormalConditionsoftheNewborn abnormalConditionsoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return abnormalConditionsoftheNewborn.validateAbnormalConditionsoftheNewbornMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateAbnormalConditionsoftheNewbornValue constraint of '<em>Abnormal Conditionsofthe Newborn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbnormalConditionsoftheNewborn_validateAbnormalConditionsoftheNewbornValue(AbnormalConditionsoftheNewborn abnormalConditionsoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return abnormalConditionsoftheNewborn.validateAbnormalConditionsoftheNewbornValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCongenitalAnomaliesoftheNewborn(CongenitalAnomaliesoftheNewborn congenitalAnomaliesoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(congenitalAnomaliesoftheNewborn, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(congenitalAnomaliesoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(congenitalAnomaliesoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(congenitalAnomaliesoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(congenitalAnomaliesoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(congenitalAnomaliesoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(congenitalAnomaliesoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(congenitalAnomaliesoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validateCongenitalAnomaliesoftheNewborn_validateCongenitalAnomaliesoftheNewbornTemplateId(congenitalAnomaliesoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validateCongenitalAnomaliesoftheNewborn_validateCongenitalAnomaliesoftheNewbornClassCode(congenitalAnomaliesoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validateCongenitalAnomaliesoftheNewborn_validateCongenitalAnomaliesoftheNewbornCode(congenitalAnomaliesoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validateCongenitalAnomaliesoftheNewborn_validateCongenitalAnomaliesoftheNewbornMoodCode(congenitalAnomaliesoftheNewborn, diagnostics, context);
    if (result || diagnostics != null) result &= validateCongenitalAnomaliesoftheNewborn_validateCongenitalAnomaliesoftheNewbornValue(congenitalAnomaliesoftheNewborn, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateCongenitalAnomaliesoftheNewbornTemplateId constraint of '<em>Congenital Anomaliesofthe Newborn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCongenitalAnomaliesoftheNewborn_validateCongenitalAnomaliesoftheNewbornTemplateId(CongenitalAnomaliesoftheNewborn congenitalAnomaliesoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return congenitalAnomaliesoftheNewborn.validateCongenitalAnomaliesoftheNewbornTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateCongenitalAnomaliesoftheNewbornClassCode constraint of '<em>Congenital Anomaliesofthe Newborn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCongenitalAnomaliesoftheNewborn_validateCongenitalAnomaliesoftheNewbornClassCode(CongenitalAnomaliesoftheNewborn congenitalAnomaliesoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return congenitalAnomaliesoftheNewborn.validateCongenitalAnomaliesoftheNewbornClassCode(diagnostics, context);
  }

  /**
   * Validates the validateCongenitalAnomaliesoftheNewbornCode constraint of '<em>Congenital Anomaliesofthe Newborn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCongenitalAnomaliesoftheNewborn_validateCongenitalAnomaliesoftheNewbornCode(CongenitalAnomaliesoftheNewborn congenitalAnomaliesoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return congenitalAnomaliesoftheNewborn.validateCongenitalAnomaliesoftheNewbornCode(diagnostics, context);
  }

  /**
   * Validates the validateCongenitalAnomaliesoftheNewbornMoodCode constraint of '<em>Congenital Anomaliesofthe Newborn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCongenitalAnomaliesoftheNewborn_validateCongenitalAnomaliesoftheNewbornMoodCode(CongenitalAnomaliesoftheNewborn congenitalAnomaliesoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return congenitalAnomaliesoftheNewborn.validateCongenitalAnomaliesoftheNewbornMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateCongenitalAnomaliesoftheNewbornValue constraint of '<em>Congenital Anomaliesofthe Newborn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCongenitalAnomaliesoftheNewborn_validateCongenitalAnomaliesoftheNewbornValue(CongenitalAnomaliesoftheNewborn congenitalAnomaliesoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return congenitalAnomaliesoftheNewborn.validateCongenitalAnomaliesoftheNewbornValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedForcepsDelivery(AttemptedForcepsDelivery attemptedForcepsDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(attemptedForcepsDelivery, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(attemptedForcepsDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attemptedForcepsDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attemptedForcepsDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(attemptedForcepsDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(attemptedForcepsDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(attemptedForcepsDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attemptedForcepsDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateAttemptedForcepsDelivery_validateAttemptedForcepsDeliveryTemplateId(attemptedForcepsDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateAttemptedForcepsDelivery_validateAttemptedForcepsDeliveryClassCode(attemptedForcepsDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateAttemptedForcepsDelivery_validateAttemptedForcepsDeliveryCode(attemptedForcepsDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateAttemptedForcepsDelivery_validateAttemptedForcepsDeliveryMoodCode(attemptedForcepsDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateAttemptedForcepsDelivery_validateAttemptedForcepsDeliveryValue(attemptedForcepsDelivery, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateAttemptedForcepsDeliveryTemplateId constraint of '<em>Attempted Forceps Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedForcepsDelivery_validateAttemptedForcepsDeliveryTemplateId(AttemptedForcepsDelivery attemptedForcepsDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return attemptedForcepsDelivery.validateAttemptedForcepsDeliveryTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateAttemptedForcepsDeliveryClassCode constraint of '<em>Attempted Forceps Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedForcepsDelivery_validateAttemptedForcepsDeliveryClassCode(AttemptedForcepsDelivery attemptedForcepsDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return attemptedForcepsDelivery.validateAttemptedForcepsDeliveryClassCode(diagnostics, context);
  }

  /**
   * Validates the validateAttemptedForcepsDeliveryCode constraint of '<em>Attempted Forceps Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedForcepsDelivery_validateAttemptedForcepsDeliveryCode(AttemptedForcepsDelivery attemptedForcepsDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return attemptedForcepsDelivery.validateAttemptedForcepsDeliveryCode(diagnostics, context);
  }

  /**
   * Validates the validateAttemptedForcepsDeliveryMoodCode constraint of '<em>Attempted Forceps Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedForcepsDelivery_validateAttemptedForcepsDeliveryMoodCode(AttemptedForcepsDelivery attemptedForcepsDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return attemptedForcepsDelivery.validateAttemptedForcepsDeliveryMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateAttemptedForcepsDeliveryValue constraint of '<em>Attempted Forceps Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedForcepsDelivery_validateAttemptedForcepsDeliveryValue(AttemptedForcepsDelivery attemptedForcepsDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return attemptedForcepsDelivery.validateAttemptedForcepsDeliveryValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedVacuumExtraction(AttemptedVacuumExtraction attemptedVacuumExtraction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(attemptedVacuumExtraction, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(attemptedVacuumExtraction, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attemptedVacuumExtraction, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attemptedVacuumExtraction, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(attemptedVacuumExtraction, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(attemptedVacuumExtraction, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(attemptedVacuumExtraction, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attemptedVacuumExtraction, diagnostics, context);
    if (result || diagnostics != null) result &= validateAttemptedVacuumExtraction_validateAttemptedVacuumExtractionTemplateId(attemptedVacuumExtraction, diagnostics, context);
    if (result || diagnostics != null) result &= validateAttemptedVacuumExtraction_validateAttemptedVacuumExtractionClassCode(attemptedVacuumExtraction, diagnostics, context);
    if (result || diagnostics != null) result &= validateAttemptedVacuumExtraction_validateAttemptedVacuumExtractionCode(attemptedVacuumExtraction, diagnostics, context);
    if (result || diagnostics != null) result &= validateAttemptedVacuumExtraction_validateAttemptedVacuumExtractionMoodCode(attemptedVacuumExtraction, diagnostics, context);
    if (result || diagnostics != null) result &= validateAttemptedVacuumExtraction_validateAttemptedVacuumExtractionValue(attemptedVacuumExtraction, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateAttemptedVacuumExtractionTemplateId constraint of '<em>Attempted Vacuum Extraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedVacuumExtraction_validateAttemptedVacuumExtractionTemplateId(AttemptedVacuumExtraction attemptedVacuumExtraction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return attemptedVacuumExtraction.validateAttemptedVacuumExtractionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateAttemptedVacuumExtractionClassCode constraint of '<em>Attempted Vacuum Extraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedVacuumExtraction_validateAttemptedVacuumExtractionClassCode(AttemptedVacuumExtraction attemptedVacuumExtraction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return attemptedVacuumExtraction.validateAttemptedVacuumExtractionClassCode(diagnostics, context);
  }

  /**
   * Validates the validateAttemptedVacuumExtractionCode constraint of '<em>Attempted Vacuum Extraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedVacuumExtraction_validateAttemptedVacuumExtractionCode(AttemptedVacuumExtraction attemptedVacuumExtraction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return attemptedVacuumExtraction.validateAttemptedVacuumExtractionCode(diagnostics, context);
  }

  /**
   * Validates the validateAttemptedVacuumExtractionMoodCode constraint of '<em>Attempted Vacuum Extraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedVacuumExtraction_validateAttemptedVacuumExtractionMoodCode(AttemptedVacuumExtraction attemptedVacuumExtraction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return attemptedVacuumExtraction.validateAttemptedVacuumExtractionMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateAttemptedVacuumExtractionValue constraint of '<em>Attempted Vacuum Extraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedVacuumExtraction_validateAttemptedVacuumExtractionValue(AttemptedVacuumExtraction attemptedVacuumExtraction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return attemptedVacuumExtraction.validateAttemptedVacuumExtractionValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalPresentation(FetalPresentation fetalPresentation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(fetalPresentation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(fetalPresentation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fetalPresentation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fetalPresentation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(fetalPresentation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(fetalPresentation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(fetalPresentation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fetalPresentation, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalPresentation_validateFetalPresentationTemplateId(fetalPresentation, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalPresentation_validateFetalPresentationClassCode(fetalPresentation, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalPresentation_validateFetalPresentationCode(fetalPresentation, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalPresentation_validateFetalPresentationMoodCode(fetalPresentation, diagnostics, context);
    if (result || diagnostics != null) result &= validateFetalPresentation_validateFetalPresentationValue(fetalPresentation, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateFetalPresentationTemplateId constraint of '<em>Fetal Presentation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalPresentation_validateFetalPresentationTemplateId(FetalPresentation fetalPresentation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalPresentation.validateFetalPresentationTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateFetalPresentationClassCode constraint of '<em>Fetal Presentation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalPresentation_validateFetalPresentationClassCode(FetalPresentation fetalPresentation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalPresentation.validateFetalPresentationClassCode(diagnostics, context);
  }

  /**
   * Validates the validateFetalPresentationCode constraint of '<em>Fetal Presentation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalPresentation_validateFetalPresentationCode(FetalPresentation fetalPresentation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalPresentation.validateFetalPresentationCode(diagnostics, context);
  }

  /**
   * Validates the validateFetalPresentationMoodCode constraint of '<em>Fetal Presentation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalPresentation_validateFetalPresentationMoodCode(FetalPresentation fetalPresentation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalPresentation.validateFetalPresentationMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateFetalPresentationValue constraint of '<em>Fetal Presentation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalPresentation_validateFetalPresentationValue(FetalPresentation fetalPresentation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return fetalPresentation.validateFetalPresentationValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDelivery(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(routeandMethodofDelivery, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(routeandMethodofDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(routeandMethodofDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(routeandMethodofDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(routeandMethodofDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(routeandMethodofDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(routeandMethodofDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(routeandMethodofDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateRouteandMethodofDelivery_validateRouteandMethodofDeliveryTemplateId(routeandMethodofDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateRouteandMethodofDelivery_validateRouteandMethodofDeliveryClassCode(routeandMethodofDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateRouteandMethodofDelivery_validateRouteandMethodofDeliveryCode(routeandMethodofDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateRouteandMethodofDelivery_validateRouteandMethodofDeliveryMoodCode(routeandMethodofDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateRouteandMethodofDelivery_validateRouteandMethodofDeliveryValue(routeandMethodofDelivery, diagnostics, context);
    if (result || diagnostics != null) result &= validateRouteandMethodofDelivery_validateRouteandMethodofDeliveryEntryRelationship(routeandMethodofDelivery, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateRouteandMethodofDeliveryTemplateId constraint of '<em>Routeand Methodof Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDelivery_validateRouteandMethodofDeliveryTemplateId(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return routeandMethodofDelivery.validateRouteandMethodofDeliveryTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateRouteandMethodofDeliveryClassCode constraint of '<em>Routeand Methodof Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDelivery_validateRouteandMethodofDeliveryClassCode(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return routeandMethodofDelivery.validateRouteandMethodofDeliveryClassCode(diagnostics, context);
  }

  /**
   * Validates the validateRouteandMethodofDeliveryCode constraint of '<em>Routeand Methodof Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDelivery_validateRouteandMethodofDeliveryCode(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return routeandMethodofDelivery.validateRouteandMethodofDeliveryCode(diagnostics, context);
  }

  /**
   * Validates the validateRouteandMethodofDeliveryMoodCode constraint of '<em>Routeand Methodof Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDelivery_validateRouteandMethodofDeliveryMoodCode(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return routeandMethodofDelivery.validateRouteandMethodofDeliveryMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateRouteandMethodofDeliveryValue constraint of '<em>Routeand Methodof Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDelivery_validateRouteandMethodofDeliveryValue(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return routeandMethodofDelivery.validateRouteandMethodofDeliveryValue(diagnostics, context);
  }

  /**
   * Validates the validateRouteandMethodofDeliveryEntryRelationship constraint of '<em>Routeand Methodof Delivery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDelivery_validateRouteandMethodofDeliveryEntryRelationship(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return routeandMethodofDelivery.validateRouteandMethodofDeliveryEntryRelationship(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWeight(Weight weight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(weight, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(weight, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(weight, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(weight, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(weight, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(weight, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(weight, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(weight, diagnostics, context);
    if (result || diagnostics != null) result &= validateWeight_validateWeightTemplateId(weight, diagnostics, context);
    if (result || diagnostics != null) result &= validateWeight_validateWeightClassCode(weight, diagnostics, context);
    if (result || diagnostics != null) result &= validateWeight_validateWeightCode(weight, diagnostics, context);
    if (result || diagnostics != null) result &= validateWeight_validateWeightMoodCode(weight, diagnostics, context);
    if (result || diagnostics != null) result &= validateWeight_validateWeightValue(weight, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateWeightTemplateId constraint of '<em>Weight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWeight_validateWeightTemplateId(Weight weight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return weight.validateWeightTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateWeightClassCode constraint of '<em>Weight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWeight_validateWeightClassCode(Weight weight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return weight.validateWeightClassCode(diagnostics, context);
  }

  /**
   * Validates the validateWeightCode constraint of '<em>Weight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWeight_validateWeightCode(Weight weight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return weight.validateWeightCode(diagnostics, context);
  }

  /**
   * Validates the validateWeightMoodCode constraint of '<em>Weight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWeight_validateWeightMoodCode(Weight weight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return weight.validateWeightMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateWeightValue constraint of '<em>Weight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWeight_validateWeightValue(Weight weight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return weight.validateWeightValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEstimateofGestation(EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(estimateofGestation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(estimateofGestation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(estimateofGestation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(estimateofGestation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(estimateofGestation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(estimateofGestation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(estimateofGestation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(estimateofGestation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimateofGestation_validateEstimateofGestationTemplateId(estimateofGestation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimateofGestation_validateEstimateofGestationClassCode(estimateofGestation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimateofGestation_validateEstimateofGestationCode(estimateofGestation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimateofGestation_validateEstimateofGestationMoodCode(estimateofGestation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimateofGestation_validateEstimateofGestationValue(estimateofGestation, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEstimateofGestationTemplateId constraint of '<em>Estimateof Gestation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEstimateofGestation_validateEstimateofGestationTemplateId(EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return estimateofGestation.validateEstimateofGestationTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEstimateofGestationClassCode constraint of '<em>Estimateof Gestation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEstimateofGestation_validateEstimateofGestationClassCode(EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return estimateofGestation.validateEstimateofGestationClassCode(diagnostics, context);
  }

  /**
   * Validates the validateEstimateofGestationCode constraint of '<em>Estimateof Gestation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEstimateofGestation_validateEstimateofGestationCode(EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return estimateofGestation.validateEstimateofGestationCode(diagnostics, context);
  }

  /**
   * Validates the validateEstimateofGestationMoodCode constraint of '<em>Estimateof Gestation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEstimateofGestation_validateEstimateofGestationMoodCode(EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return estimateofGestation.validateEstimateofGestationMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateEstimateofGestationValue constraint of '<em>Estimateof Gestation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEstimateofGestation_validateEstimateofGestationValue(EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return estimateofGestation.validateEstimateofGestationValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateApgarScore(ApgarScore apgarScore, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(apgarScore, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(apgarScore, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(apgarScore, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(apgarScore, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(apgarScore, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(apgarScore, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(apgarScore, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(apgarScore, diagnostics, context);
    if (result || diagnostics != null) result &= validateApgarScore_validateApgarScoreTemplateId(apgarScore, diagnostics, context);
    if (result || diagnostics != null) result &= validateApgarScore_validateApgarScoreClassCode(apgarScore, diagnostics, context);
    if (result || diagnostics != null) result &= validateApgarScore_validateApgarScoreCode(apgarScore, diagnostics, context);
    if (result || diagnostics != null) result &= validateApgarScore_validateApgarScoreMoodCode(apgarScore, diagnostics, context);
    if (result || diagnostics != null) result &= validateApgarScore_validateApgarScoreValue(apgarScore, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateApgarScoreTemplateId constraint of '<em>Apgar Score</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateApgarScore_validateApgarScoreTemplateId(ApgarScore apgarScore, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return apgarScore.validateApgarScoreTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateApgarScoreClassCode constraint of '<em>Apgar Score</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateApgarScore_validateApgarScoreClassCode(ApgarScore apgarScore, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return apgarScore.validateApgarScoreClassCode(diagnostics, context);
  }

  /**
   * Validates the validateApgarScoreCode constraint of '<em>Apgar Score</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateApgarScore_validateApgarScoreCode(ApgarScore apgarScore, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return apgarScore.validateApgarScoreCode(diagnostics, context);
  }

  /**
   * Validates the validateApgarScoreMoodCode constraint of '<em>Apgar Score</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateApgarScore_validateApgarScoreMoodCode(ApgarScore apgarScore, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return apgarScore.validateApgarScoreMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateApgarScoreValue constraint of '<em>Apgar Score</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateApgarScore_validateApgarScoreValue(ApgarScore apgarScore, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return apgarScore.validateApgarScoreValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePlurality(Plurality plurality, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(plurality, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(plurality, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(plurality, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(plurality, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(plurality, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(plurality, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(plurality, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(plurality, diagnostics, context);
    if (result || diagnostics != null) result &= validatePlurality_validatePluralityTemplateId(plurality, diagnostics, context);
    if (result || diagnostics != null) result &= validatePlurality_validatePluralityClassCode(plurality, diagnostics, context);
    if (result || diagnostics != null) result &= validatePlurality_validatePluralityCode(plurality, diagnostics, context);
    if (result || diagnostics != null) result &= validatePlurality_validatePluralityMoodCode(plurality, diagnostics, context);
    if (result || diagnostics != null) result &= validatePlurality_validatePluralityValue(plurality, diagnostics, context);
    return result;
  }

  /**
   * Validates the validatePluralityTemplateId constraint of '<em>Plurality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePlurality_validatePluralityTemplateId(Plurality plurality, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return plurality.validatePluralityTemplateId(diagnostics, context);
  }

  /**
   * Validates the validatePluralityClassCode constraint of '<em>Plurality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePlurality_validatePluralityClassCode(Plurality plurality, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return plurality.validatePluralityClassCode(diagnostics, context);
  }

  /**
   * Validates the validatePluralityCode constraint of '<em>Plurality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePlurality_validatePluralityCode(Plurality plurality, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return plurality.validatePluralityCode(diagnostics, context);
  }

  /**
   * Validates the validatePluralityMoodCode constraint of '<em>Plurality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePlurality_validatePluralityMoodCode(Plurality plurality, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return plurality.validatePluralityMoodCode(diagnostics, context);
  }

  /**
   * Validates the validatePluralityValue constraint of '<em>Plurality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePlurality_validatePluralityValue(Plurality plurality, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return plurality.validatePluralityValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofInfantsBornAlive(NumberofInfantsBornAlive numberofInfantsBornAlive, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(numberofInfantsBornAlive, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(numberofInfantsBornAlive, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numberofInfantsBornAlive, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numberofInfantsBornAlive, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(numberofInfantsBornAlive, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(numberofInfantsBornAlive, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(numberofInfantsBornAlive, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numberofInfantsBornAlive, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveTemplateId(numberofInfantsBornAlive, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveClassCode(numberofInfantsBornAlive, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveCode(numberofInfantsBornAlive, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveMoodCode(numberofInfantsBornAlive, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveValue(numberofInfantsBornAlive, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateNumberofInfantsBornAliveTemplateId constraint of '<em>Numberof Infants Born Alive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveTemplateId(NumberofInfantsBornAlive numberofInfantsBornAlive, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofInfantsBornAlive.validateNumberofInfantsBornAliveTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateNumberofInfantsBornAliveClassCode constraint of '<em>Numberof Infants Born Alive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveClassCode(NumberofInfantsBornAlive numberofInfantsBornAlive, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofInfantsBornAlive.validateNumberofInfantsBornAliveClassCode(diagnostics, context);
  }

  /**
   * Validates the validateNumberofInfantsBornAliveCode constraint of '<em>Numberof Infants Born Alive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveCode(NumberofInfantsBornAlive numberofInfantsBornAlive, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofInfantsBornAlive.validateNumberofInfantsBornAliveCode(diagnostics, context);
  }

  /**
   * Validates the validateNumberofInfantsBornAliveMoodCode constraint of '<em>Numberof Infants Born Alive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveMoodCode(NumberofInfantsBornAlive numberofInfantsBornAlive, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofInfantsBornAlive.validateNumberofInfantsBornAliveMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateNumberofInfantsBornAliveValue constraint of '<em>Numberof Infants Born Alive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveValue(NumberofInfantsBornAlive numberofInfantsBornAlive, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numberofInfantsBornAlive.validateNumberofInfantsBornAliveValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthOrder(BirthOrder birthOrder, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(birthOrder, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(birthOrder, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(birthOrder, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(birthOrder, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(birthOrder, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(birthOrder, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(birthOrder, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(birthOrder, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthOrder_validateBirthOrderTemplateId(birthOrder, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthOrder_validateBirthOrderClassCode(birthOrder, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthOrder_validateBirthOrderCodeP(birthOrder, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthOrder_validateBirthOrderCode(birthOrder, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthOrder_validateBirthOrderMoodCode(birthOrder, diagnostics, context);
    if (result || diagnostics != null) result &= validateBirthOrder_validateBirthOrderValue(birthOrder, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateBirthOrderTemplateId constraint of '<em>Birth Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthOrder_validateBirthOrderTemplateId(BirthOrder birthOrder, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthOrder.validateBirthOrderTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateBirthOrderClassCode constraint of '<em>Birth Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthOrder_validateBirthOrderClassCode(BirthOrder birthOrder, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthOrder.validateBirthOrderClassCode(diagnostics, context);
  }

  /**
   * Validates the validateBirthOrderCodeP constraint of '<em>Birth Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthOrder_validateBirthOrderCodeP(BirthOrder birthOrder, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthOrder.validateBirthOrderCodeP(diagnostics, context);
  }

  /**
   * Validates the validateBirthOrderCode constraint of '<em>Birth Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthOrder_validateBirthOrderCode(BirthOrder birthOrder, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthOrder.validateBirthOrderCode(diagnostics, context);
  }

  /**
   * Validates the validateBirthOrderMoodCode constraint of '<em>Birth Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthOrder_validateBirthOrderMoodCode(BirthOrder birthOrder, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthOrder.validateBirthOrderMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateBirthOrderValue constraint of '<em>Birth Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthOrder_validateBirthOrderValue(BirthOrder birthOrder, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return birthOrder.validateBirthOrderValue(diagnostics, context);
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
    return VsbrPlugin.INSTANCE;
  }

} //VsbrValidator
