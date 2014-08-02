/**
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
public class VsbrValidator extends EObjectValidator {
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Mood Code' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Realm Code' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Realm Code P' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Type Id' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TYPE_ID = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Id' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Code P' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Code' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Title' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Effective Time' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Confidentiality Code P' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Confidentiality Code' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Language Code' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Author' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Custodian' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Record Target' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Prenatal Testing And Surveillance' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PRENATAL_TESTING_AND_SURVEILLANCE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Pregnancy History' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PREGNANCY_HISTORY = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Newborn Delivery Section' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_NEWBORN_DELIVERY_SECTION = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Labor And Delivery Section' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABOR_AND_DELIVERY_SECTION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords History Of Infection Live Birth Section' of 'Reporting Birth Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_HISTORY_OF_INFECTION_LIVE_BIRTH_SECTION = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Testingand Surveillance Section Template Id' of 'Prenatal Testingand Surveillance Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_TESTINGAND_SURVEILLANCE_SECTION__PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Testingand Surveillance Section Class Code' of 'Prenatal Testingand Surveillance Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_TESTINGAND_SURVEILLANCE_SECTION__PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Testingand Surveillance Section Mood Code' of 'Prenatal Testingand Surveillance Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_TESTINGAND_SURVEILLANCE_SECTION__PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Testingand Surveillance Section Code' of 'Prenatal Testingand Surveillance Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_TESTINGAND_SURVEILLANCE_SECTION__PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Testingand Surveillance Section Text' of 'Prenatal Testingand Surveillance Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_TESTINGAND_SURVEILLANCE_SECTION__PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Testingand Surveillance Section Prenatal Care' of 'Prenatal Testingand Surveillance Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_TESTINGAND_SURVEILLANCE_SECTION__PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRENATAL_CARE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Care Template Id' of 'Prenatal Care'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_CARE__PRENATAL_CARE_TEMPLATE_ID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Care Class Code' of 'Prenatal Care'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_CARE__PRENATAL_CARE_CLASS_CODE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Care Mood Code' of 'Prenatal Care'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_CARE__PRENATAL_CARE_MOOD_CODE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Care Negation Ind' of 'Prenatal Care'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_CARE__PRENATAL_CARE_NEGATION_IND = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Care Code P' of 'Prenatal Care'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_CARE__PRENATAL_CARE_CODE_P = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Care Code' of 'Prenatal Care'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_CARE__PRENATAL_CARE_CODE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Care Effective Time' of 'Prenatal Care'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_CARE__PRENATAL_CARE_EFFECTIVE_TIME = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prenatal Care Entry Relationship' of 'Prenatal Care'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRENATAL_CARE__PRENATAL_CARE_ENTRY_RELATIONSHIP = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prior Pregnancy History Section Template Id' of 'Prior Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_TEMPLATE_ID = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prior Pregnancy History Section Class Code' of 'Prior Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_CLASS_CODE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prior Pregnancy History Section Mood Code' of 'Prior Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_MOOD_CODE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prior Pregnancy History Section Code' of 'Prior Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_CODE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prior Pregnancy History Section Code P' of 'Prior Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_CODE_P = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prior Pregnancy History Section Text' of 'Prior Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_TEXT = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prior Pregnancy History Section Dateof Last Live Birth' of 'Prior Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_DATEOF_LAST_LIVE_BIRTH = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prior Pregnancy History Section Last Menstrual Period Date' of 'Prior Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_LAST_MENSTRUAL_PERIOD_DATE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prior Pregnancy History Section Numberof Births Still Living' of 'Prior Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_BIRTHS_STILL_LIVING = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prior Pregnancy History Section Numberof Live Birthsnow Dead' of 'Prior Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prior Pregnancy History Section Other Pregnancy Outcomes' of 'Prior Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_OTHER_PREGNANCY_OUTCOMES = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prior Pregnancy History Section Estimateof Gestation' of 'Prior Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_ESTIMATEOF_GESTATION = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateof Last Live Birth Template Id' of 'Dateof Last Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_TEMPLATE_ID = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateof Last Live Birth Mood Code' of 'Dateof Last Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_MOOD_CODE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateof Last Live Birth Code P' of 'Dateof Last Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_CODE_P = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateof Last Live Birth Code' of 'Dateof Last Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_CODE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateof Last Live Birth Value' of 'Dateof Last Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_VALUE = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Date Template Id' of 'Last Menstrual Period Date'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_TEMPLATE_ID = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Date Class Code' of 'Last Menstrual Period Date'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_CLASS_CODE = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Date Mood Code' of 'Last Menstrual Period Date'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_MOOD_CODE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Date Code P' of 'Last Menstrual Period Date'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_CODE_P = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Date Code' of 'Last Menstrual Period Date'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_CODE = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Date Value' of 'Last Menstrual Period Date'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_VALUE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Births Now Living Template Id' of 'Numberof Births Now Living'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_BIRTHS_NOW_LIVING__NUMBEROF_BIRTHS_NOW_LIVING_TEMPLATE_ID = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Births Now Living Class Code' of 'Numberof Births Now Living'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_BIRTHS_NOW_LIVING__NUMBEROF_BIRTHS_NOW_LIVING_CLASS_CODE = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Births Now Living Mood Code' of 'Numberof Births Now Living'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_BIRTHS_NOW_LIVING__NUMBEROF_BIRTHS_NOW_LIVING_MOOD_CODE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Births Now Living Code P' of 'Numberof Births Now Living'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_BIRTHS_NOW_LIVING__NUMBEROF_BIRTHS_NOW_LIVING_CODE_P = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Births Now Living Code' of 'Numberof Births Now Living'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_BIRTHS_NOW_LIVING__NUMBEROF_BIRTHS_NOW_LIVING_CODE = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Births Now Living Value' of 'Numberof Births Now Living'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_BIRTHS_NOW_LIVING__NUMBEROF_BIRTHS_NOW_LIVING_VALUE = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Live Births Now Dead Template Id' of 'Numberof Live Births Now Dead'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LIVE_BIRTHS_NOW_DEAD__NUMBEROF_LIVE_BIRTHS_NOW_DEAD_TEMPLATE_ID = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Live Births Now Dead Class Code' of 'Numberof Live Births Now Dead'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LIVE_BIRTHS_NOW_DEAD__NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CLASS_CODE = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Live Births Now Dead Mood Code' of 'Numberof Live Births Now Dead'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LIVE_BIRTHS_NOW_DEAD__NUMBEROF_LIVE_BIRTHS_NOW_DEAD_MOOD_CODE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Live Births Now Dead Code P' of 'Numberof Live Births Now Dead'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LIVE_BIRTHS_NOW_DEAD__NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE_P = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Live Births Now Dead Code' of 'Numberof Live Births Now Dead'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LIVE_BIRTHS_NOW_DEAD__NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Live Births Now Dead Value' of 'Numberof Live Births Now Dead'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LIVE_BIRTHS_NOW_DEAD__NUMBEROF_LIVE_BIRTHS_NOW_DEAD_VALUE = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcome Template Id' of 'Other Pregnancy Outcome'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_TEMPLATE_ID = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcome Class Code' of 'Other Pregnancy Outcome'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_CLASS_CODE = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcome Mood Code' of 'Other Pregnancy Outcome'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_MOOD_CODE = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcome Code P' of 'Other Pregnancy Outcome'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_CODE_P = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcome Code' of 'Other Pregnancy Outcome'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_CODE = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcome Effective Time' of 'Other Pregnancy Outcome'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_EFFECTIVE_TIME = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Pregnancy Outcome Value' of 'Other Pregnancy Outcome'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_VALUE = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimateof Gestation Template Id' of 'Estimateof Gestation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_TEMPLATE_ID = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimateof Gestation Class Code' of 'Estimateof Gestation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_CLASS_CODE = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimateof Gestation Mood Code' of 'Estimateof Gestation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_MOOD_CODE = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimateof Gestation Code P' of 'Estimateof Gestation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_CODE_P = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimateof Gestation Code' of 'Estimateof Gestation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_CODE = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimateof Gestation Value' of 'Estimateof Gestation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_VALUE = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Template Id' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_TEMPLATE_ID = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Class Code' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_CLASS_CODE = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Mood Code' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_MOOD_CODE = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Code' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_CODE = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Text' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_TEXT = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Subject' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_SUBJECT = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Birth Order' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_BIRTH_ORDER = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Number Of Infants Born Alive' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NUMBER_OF_INFANTS_BORN_ALIVE = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Congenital Anomalies' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_CONGENITAL_ANOMALIES = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborns Vital Signs Section' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORNS_VITAL_SIGNS_SECTION = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Abnormal Conditions Of The Newborn' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_ABNORMAL_CONDITIONS_OF_THE_NEWBORN = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Infant Living' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_INFANT_LIVING = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Infant Breastfed' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_INFANT_BREASTFED = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Infant Transfer' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_INFANT_TRANSFER = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Plurality' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_PLURALITY = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Assessments Section' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_ASSESSMENTS_SECTION = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Class Code' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_CLASS_CODE = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Determiner Code' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_DETERMINER_CODE = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn SDTC Id' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_SDTC_ID = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Name' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_NAME = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Administrative Gender Code' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Administrative Gender Code P' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE_P = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Birth Time' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_BIRTH_TIME = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborn Subject Role Of Newborn Class Code' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CLASS_CODE = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborn Subject Role Of Newborn Code' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CODE = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborn Subject Role Of Newborn Subject' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_SUBJECT = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborn Subject Type Code' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_TYPE_CODE = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborn Delivery Section Newborn Subject Related Subject' of 'Newborn Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_RELATED_SUBJECT = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Order Template Id' of 'Birth Order'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTH_ORDER__BIRTH_ORDER_TEMPLATE_ID = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Order Class Code' of 'Birth Order'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTH_ORDER__BIRTH_ORDER_CLASS_CODE = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Order Mood Code' of 'Birth Order'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTH_ORDER__BIRTH_ORDER_MOOD_CODE = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Order Code P' of 'Birth Order'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTH_ORDER__BIRTH_ORDER_CODE_P = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Order Code' of 'Birth Order'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTH_ORDER__BIRTH_ORDER_CODE = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Order Value' of 'Birth Order'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTH_ORDER__BIRTH_ORDER_VALUE = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Infants Born Alive Template Id' of 'Numberof Infants Born Alive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_TEMPLATE_ID = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Infants Born Alive Class Code' of 'Numberof Infants Born Alive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_CLASS_CODE = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Infants Born Alive Mood Code' of 'Numberof Infants Born Alive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_MOOD_CODE = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Infants Born Alive Code P' of 'Numberof Infants Born Alive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_CODE_P = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Infants Born Alive Code' of 'Numberof Infants Born Alive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_CODE = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Infants Born Alive Value' of 'Numberof Infants Born Alive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_INFANTS_BORN_ALIVE__NUMBEROF_INFANTS_BORN_ALIVE_VALUE = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaly Template Id' of 'Congenital Anomaly'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_TEMPLATE_ID = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaly Class Code' of 'Congenital Anomaly'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_CLASS_CODE = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaly Mood Code' of 'Congenital Anomaly'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_MOOD_CODE = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaly Code P' of 'Congenital Anomaly'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_CODE_P = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaly Code' of 'Congenital Anomaly'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_CODE = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaly Code VS' of 'Congenital Anomaly'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_CODE_VS = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaly Value' of 'Congenital Anomaly'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_VALUE = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaly Value P' of 'Congenital Anomaly'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_VALUE_P = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaly Down Confirmation Association' of 'Congenital Anomaly'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_DOWN_CONFIRMATION_ASSOCIATION = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Congenital Anomaly Chromosomal Disorder Confirmation Association' of 'Congenital Anomaly'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_CHROMOSOMAL_DISORDER_CONFIRMATION_ASSOCIATION = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Section Template Id' of 'Newborns Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_TEMPLATE_ID = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Section Class Code' of 'Newborns Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_CLASS_CODE = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Section Mood Code' of 'Newborns Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_MOOD_CODE = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Section Code' of 'Newborns Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_CODE = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Section Code P' of 'Newborns Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_CODE_P = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Section Text' of 'Newborns Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_TEXT = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Section Newborns Vital Signs Observation' of 'Newborns Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_NEWBORNS_VITAL_SIGNS_OBSERVATION = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Observation Template Id' of 'Newborns Vital Signs Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_OBSERVATION__NEWBORNS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Observation Class Code' of 'Newborns Vital Signs Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_OBSERVATION__NEWBORNS_VITAL_SIGNS_OBSERVATION_CLASS_CODE = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Observation Mood Code' of 'Newborns Vital Signs Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_OBSERVATION__NEWBORNS_VITAL_SIGNS_OBSERVATION_MOOD_CODE = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Observation Code P' of 'Newborns Vital Signs Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_OBSERVATION__NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE_P = 144;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Observation Code' of 'Newborns Vital Signs Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_OBSERVATION__NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE = 145;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Newborns Vital Signs Observation Value' of 'Newborns Vital Signs Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEWBORNS_VITAL_SIGNS_OBSERVATION__NEWBORNS_VITAL_SIGNS_OBSERVATION_VALUE = 146;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionofthe Newborn Template Id' of 'Abnormal Conditionofthe Newborn'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_TEMPLATE_ID = 147;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionofthe Newborn Class Code' of 'Abnormal Conditionofthe Newborn'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_CLASS_CODE = 148;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionofthe Newborn Mood Code' of 'Abnormal Conditionofthe Newborn'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_MOOD_CODE = 149;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionofthe Newborn Code P' of 'Abnormal Conditionofthe Newborn'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_P = 150;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionofthe Newborn Code' of 'Abnormal Conditionofthe Newborn'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE = 151;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionofthe Newborn Code VS' of 'Abnormal Conditionofthe Newborn'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_VS = 152;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionofthe Newborn Value' of 'Abnormal Conditionofthe Newborn'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE = 153;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abnormal Conditionofthe Newborn Value P' of 'Abnormal Conditionofthe Newborn'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE_P = 154;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Living Template Id' of 'Infant Living'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_LIVING__INFANT_LIVING_TEMPLATE_ID = 155;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Living Class Code' of 'Infant Living'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_LIVING__INFANT_LIVING_CLASS_CODE = 156;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Living Mood Code' of 'Infant Living'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_LIVING__INFANT_LIVING_MOOD_CODE = 157;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Living Code P' of 'Infant Living'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_LIVING__INFANT_LIVING_CODE_P = 158;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Living Code' of 'Infant Living'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_LIVING__INFANT_LIVING_CODE = 159;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Living Value' of 'Infant Living'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_LIVING__INFANT_LIVING_VALUE = 160;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Breastfed Template Id' of 'Infant Breastfed'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_BREASTFED__INFANT_BREASTFED_TEMPLATE_ID = 161;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Breastfed Class Code' of 'Infant Breastfed'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_BREASTFED__INFANT_BREASTFED_CLASS_CODE = 162;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Breastfed Mood Code' of 'Infant Breastfed'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_BREASTFED__INFANT_BREASTFED_MOOD_CODE = 163;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Breastfed Code P' of 'Infant Breastfed'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_BREASTFED__INFANT_BREASTFED_CODE_P = 164;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Breastfed Code' of 'Infant Breastfed'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_BREASTFED__INFANT_BREASTFED_CODE = 165;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Breastfed Value' of 'Infant Breastfed'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_BREASTFED__INFANT_BREASTFED_VALUE = 166;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Transfer Template Id' of 'Infant Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_TRANSFER__INFANT_TRANSFER_TEMPLATE_ID = 167;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Transfer Class Code' of 'Infant Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_TRANSFER__INFANT_TRANSFER_CLASS_CODE = 168;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Transfer Mood Code' of 'Infant Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_TRANSFER__INFANT_TRANSFER_MOOD_CODE = 169;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Transfer Code P' of 'Infant Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_TRANSFER__INFANT_TRANSFER_CODE_P = 170;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Transfer Code' of 'Infant Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_TRANSFER__INFANT_TRANSFER_CODE = 171;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Transfer Value' of 'Infant Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_TRANSFER__INFANT_TRANSFER_VALUE = 172;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infant Transfer Participant' of 'Infant Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFANT_TRANSFER__INFANT_TRANSFER_PARTICIPANT = 173;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plurality Template Id' of 'Plurality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLURALITY__PLURALITY_TEMPLATE_ID = 174;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plurality Class Code' of 'Plurality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLURALITY__PLURALITY_CLASS_CODE = 175;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plurality Mood Code' of 'Plurality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLURALITY__PLURALITY_MOOD_CODE = 176;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plurality Code P' of 'Plurality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLURALITY__PLURALITY_CODE_P = 177;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plurality Code' of 'Plurality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLURALITY__PLURALITY_CODE = 178;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plurality Value' of 'Plurality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLURALITY__PLURALITY_VALUE = 179;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessments Section Template Id' of 'Assessments Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_TEMPLATE_ID = 180;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessments Section Class Code' of 'Assessments Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_CLASS_CODE = 181;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessments Section Mood Code' of 'Assessments Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_MOOD_CODE = 182;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessments Section Code' of 'Assessments Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_CODE = 183;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessments Section Code P' of 'Assessments Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_CODE_P = 184;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessments Section Text' of 'Assessments Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_TEXT = 185;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessments Section Assessment Observation' of 'Assessments Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_ASSESSMENT_OBSERVATION = 186;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Observation Template Id' of 'Assessment Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_OBSERVATION__ASSESSMENT_OBSERVATION_TEMPLATE_ID = 187;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Observation Class Code' of 'Assessment Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_OBSERVATION__ASSESSMENT_OBSERVATION_CLASS_CODE = 188;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Observation Mood Code' of 'Assessment Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_OBSERVATION__ASSESSMENT_OBSERVATION_MOOD_CODE = 189;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Observation Code P' of 'Assessment Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_OBSERVATION__ASSESSMENT_OBSERVATION_CODE_P = 190;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Observation Code' of 'Assessment Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_OBSERVATION__ASSESSMENT_OBSERVATION_CODE = 191;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Observation Value' of 'Assessment Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_OBSERVATION__ASSESSMENT_OBSERVATION_VALUE = 192;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Template Id' of 'Laborand Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_TEMPLATE_ID = 193;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Class Code' of 'Laborand Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_CLASS_CODE = 194;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Mood Code' of 'Laborand Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_MOOD_CODE = 195;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Code' of 'Laborand Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_CODE = 196;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Text' of 'Laborand Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_TEXT = 197;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Labor And Delivery Process' of 'Laborand Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCESS = 198;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Labor And Delivery Procedures Section' of 'Laborand Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCEDURES_SECTION = 199;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Labor Onsets' of 'Laborand Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_LABOR_ONSETS = 200;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Section Mothers Vital Signs Section' of 'Laborand Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_MOTHERS_VITAL_SIGNS_SECTION = 201;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Template Id' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_TEMPLATE_ID = 202;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Class Code' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_CLASS_CODE = 203;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Mood Code' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_MOOD_CODE = 204;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Code P' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_CODE_P = 205;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Code' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_CODE = 206;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Attendant Participation' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_ATTENDANT_PARTICIPATION = 207;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Entry Relationship' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_ENTRY_RELATIONSHIP = 208;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Characteristics Of Labor And Delivery' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_CHARACTERISTICS_OF_LABOR_AND_DELIVERY = 209;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Home Birth Plan' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_HOME_BIRTH_PLAN = 210;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Maternal Transfer' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_MATERNAL_TRANSFER = 211;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Participating Location' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_PARTICIPATING_LOCATION = 212;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Maternal Morbidities' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_MATERNAL_MORBIDITIES = 213;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Process Risk Factors' of 'Laborand Delivery Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_RISK_FACTORS = 214;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicof Laborand Delivery Template Id' of 'Characteristicof Laborand Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_TEMPLATE_ID = 215;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicof Laborand Delivery Class Code' of 'Characteristicof Laborand Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_CLASS_CODE = 216;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicof Laborand Delivery Mood Code' of 'Characteristicof Laborand Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_MOOD_CODE = 217;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicof Laborand Delivery Code P' of 'Characteristicof Laborand Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_CODE_P = 218;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicof Laborand Delivery Code' of 'Characteristicof Laborand Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_CODE = 219;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicof Laborand Delivery Code VS' of 'Characteristicof Laborand Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_CODE_VS = 220;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicof Laborand Delivery Value' of 'Characteristicof Laborand Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_VALUE = 221;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Characteristicof Laborand Delivery Value P' of 'Characteristicof Laborand Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_VALUE_P = 222;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Planned Home Birth Template Id' of 'Planned Home Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANNED_HOME_BIRTH__PLANNED_HOME_BIRTH_TEMPLATE_ID = 223;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Planned Home Birth Class Code' of 'Planned Home Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANNED_HOME_BIRTH__PLANNED_HOME_BIRTH_CLASS_CODE = 224;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Planned Home Birth Mood Code' of 'Planned Home Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANNED_HOME_BIRTH__PLANNED_HOME_BIRTH_MOOD_CODE = 225;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Planned Home Birth Code P' of 'Planned Home Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANNED_HOME_BIRTH__PLANNED_HOME_BIRTH_CODE_P = 226;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Planned Home Birth Code' of 'Planned Home Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANNED_HOME_BIRTH__PLANNED_HOME_BIRTH_CODE = 227;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Planned Home Birth Value' of 'Planned Home Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANNED_HOME_BIRTH__PLANNED_HOME_BIRTH_VALUE = 228;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Transfer Template Id' of 'Maternal Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_TRANSFER__MATERNAL_TRANSFER_TEMPLATE_ID = 229;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Transfer Class Code' of 'Maternal Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_TRANSFER__MATERNAL_TRANSFER_CLASS_CODE = 230;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Transfer Mood Code' of 'Maternal Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_TRANSFER__MATERNAL_TRANSFER_MOOD_CODE = 231;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Transfer Code P' of 'Maternal Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_TRANSFER__MATERNAL_TRANSFER_CODE_P = 232;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Transfer Code' of 'Maternal Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_TRANSFER__MATERNAL_TRANSFER_CODE = 233;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Transfer Value' of 'Maternal Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_TRANSFER__MATERNAL_TRANSFER_VALUE = 234;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Transfer Participant' of 'Maternal Transfer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_TRANSFER__MATERNAL_TRANSFER_PARTICIPANT = 235;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidity Template Id' of 'Maternal Morbidity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_TEMPLATE_ID = 236;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidity Class Code' of 'Maternal Morbidity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_CLASS_CODE = 237;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidity Mood Code' of 'Maternal Morbidity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_MOOD_CODE = 238;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidity Code P' of 'Maternal Morbidity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_CODE_P = 239;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidity Code' of 'Maternal Morbidity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_CODE = 240;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidity Code VS' of 'Maternal Morbidity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_CODE_VS = 241;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidity Value' of 'Maternal Morbidity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_VALUE = 242;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Maternal Morbidity Value P' of 'Maternal Morbidity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERNAL_MORBIDITY__MATERNAL_MORBIDITY_VALUE_P = 243;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Risk Factor Template Id' of 'Pregnancy Risk Factor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_TEMPLATE_ID = 244;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Risk Factor Class Code' of 'Pregnancy Risk Factor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_CLASS_CODE = 245;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Risk Factor Mood Code' of 'Pregnancy Risk Factor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_MOOD_CODE = 246;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Risk Factor Code P' of 'Pregnancy Risk Factor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_CODE_P = 247;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Risk Factor Code' of 'Pregnancy Risk Factor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_CODE = 248;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Risk Factor Code VS' of 'Pregnancy Risk Factor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_CODE_VS = 249;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Risk Factor Value' of 'Pregnancy Risk Factor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_VALUE = 250;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Risk Factor Value P' of 'Pregnancy Risk Factor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_VALUE_P = 251;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Risk Factor Entry Relationship' of 'Pregnancy Risk Factor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_ENTRY_RELATIONSHIP = 252;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Procedure Section Template Id' of 'Laborand Delivery Procedure Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_TEMPLATE_ID = 253;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Procedure Section Class Code' of 'Laborand Delivery Procedure Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_CLASS_CODE = 254;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Procedure Section Mood Code' of 'Laborand Delivery Procedure Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_MOOD_CODE = 255;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Procedure Section Code' of 'Laborand Delivery Procedure Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_CODE = 256;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Procedure Section Code P' of 'Laborand Delivery Procedure Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_CODE_P = 257;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Procedure Section Text' of 'Laborand Delivery Procedure Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_TEXT = 258;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Procedure Section Obstetric Procedure' of 'Laborand Delivery Procedure Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_OBSTETRIC_PROCEDURE = 259;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Laborand Delivery Procedure Section Method Of Delivery' of 'Laborand Delivery Procedure Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_METHOD_OF_DELIVERY = 260;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obstetric Procedure Template Id' of 'Obstetric Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBSTETRIC_PROCEDURE__OBSTETRIC_PROCEDURE_TEMPLATE_ID = 261;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obstetric Procedure Class Code' of 'Obstetric Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBSTETRIC_PROCEDURE__OBSTETRIC_PROCEDURE_CLASS_CODE = 262;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obstetric Procedure Mood Code' of 'Obstetric Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBSTETRIC_PROCEDURE__OBSTETRIC_PROCEDURE_MOOD_CODE = 263;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obstetric Procedure Negation Ind' of 'Obstetric Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBSTETRIC_PROCEDURE__OBSTETRIC_PROCEDURE_NEGATION_IND = 264;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obstetric Procedure Code' of 'Obstetric Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBSTETRIC_PROCEDURE__OBSTETRIC_PROCEDURE_CODE = 265;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obstetric Procedure Code P' of 'Obstetric Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBSTETRIC_PROCEDURE__OBSTETRIC_PROCEDURE_CODE_P = 266;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Methodof Delivery Template Id' of 'Methodof Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METHODOF_DELIVERY__METHODOF_DELIVERY_TEMPLATE_ID = 267;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Methodof Delivery Class Code' of 'Methodof Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METHODOF_DELIVERY__METHODOF_DELIVERY_CLASS_CODE = 268;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Methodof Delivery Mood Code' of 'Methodof Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METHODOF_DELIVERY__METHODOF_DELIVERY_MOOD_CODE = 269;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Methodof Delivery Code' of 'Methodof Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METHODOF_DELIVERY__METHODOF_DELIVERY_CODE = 270;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Methodof Delivery Code P' of 'Methodof Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METHODOF_DELIVERY__METHODOF_DELIVERY_CODE_P = 271;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Methodof Delivery Final Route And Method' of 'Methodof Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METHODOF_DELIVERY__METHODOF_DELIVERY_FINAL_ROUTE_AND_METHOD = 272;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Methodof Delivery Fetal Presentation' of 'Methodof Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METHODOF_DELIVERY__METHODOF_DELIVERY_FETAL_PRESENTATION = 273;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Methodof Delivery Hysterotomy Hysterectomy Association' of 'Methodof Delivery'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METHODOF_DELIVERY__METHODOF_DELIVERY_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION = 274;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Onsetof Labor Template Id' of 'Onsetof Labor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONSETOF_LABOR__ONSETOF_LABOR_TEMPLATE_ID = 275;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Onsetof Labor Class Code' of 'Onsetof Labor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONSETOF_LABOR__ONSETOF_LABOR_CLASS_CODE = 276;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Onsetof Labor Mood Code' of 'Onsetof Labor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONSETOF_LABOR__ONSETOF_LABOR_MOOD_CODE = 277;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Onsetof Labor Code P' of 'Onsetof Labor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONSETOF_LABOR__ONSETOF_LABOR_CODE_P = 278;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Onsetof Labor Code' of 'Onsetof Labor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONSETOF_LABOR__ONSETOF_LABOR_CODE = 279;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Onsetof Labor Code VS' of 'Onsetof Labor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONSETOF_LABOR__ONSETOF_LABOR_CODE_VS = 280;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Onsetof Labor Value' of 'Onsetof Labor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONSETOF_LABOR__ONSETOF_LABOR_VALUE = 281;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Onsetof Labor Value P' of 'Onsetof Labor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONSETOF_LABOR__ONSETOF_LABOR_VALUE_P = 282;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Section Template Id' of 'Mothers Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_TEMPLATE_ID = 283;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Section Class Code' of 'Mothers Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_CLASS_CODE = 284;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Section Mood Code' of 'Mothers Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_MOOD_CODE = 285;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Section Code' of 'Mothers Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_CODE = 286;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Section Code P' of 'Mothers Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_CODE_P = 287;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Section Text' of 'Mothers Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_TEXT = 288;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Section Mothers Vital Signs Observation' of 'Mothers Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_MOTHERS_VITAL_SIGNS_OBSERVATION = 289;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Observation Template Id' of 'Mothers Vital Signs Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_OBSERVATION__MOTHERS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID = 290;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Observation Class Code' of 'Mothers Vital Signs Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_OBSERVATION__MOTHERS_VITAL_SIGNS_OBSERVATION_CLASS_CODE = 291;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Observation Mood Code' of 'Mothers Vital Signs Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_OBSERVATION__MOTHERS_VITAL_SIGNS_OBSERVATION_MOOD_CODE = 292;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Observation Code P' of 'Mothers Vital Signs Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_OBSERVATION__MOTHERS_VITAL_SIGNS_OBSERVATION_CODE_P = 293;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Observation Code' of 'Mothers Vital Signs Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_OBSERVATION__MOTHERS_VITAL_SIGNS_OBSERVATION_CODE = 294;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mothers Vital Signs Observation Value' of 'Mothers Vital Signs Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTHERS_VITAL_SIGNS_OBSERVATION__MOTHERS_VITAL_SIGNS_OBSERVATION_VALUE = 295;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Historyof Infection Live Birth Section Template Id' of 'Historyof Infection Live Birth Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORYOF_INFECTION_LIVE_BIRTH_SECTION__HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEMPLATE_ID = 296;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Historyof Infection Live Birth Section Code' of 'Historyof Infection Live Birth Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORYOF_INFECTION_LIVE_BIRTH_SECTION__HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_CODE = 297;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Historyof Infection Live Birth Section Text' of 'Historyof Infection Live Birth Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORYOF_INFECTION_LIVE_BIRTH_SECTION__HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEXT = 298;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Historyof Infection Live Birth Section Infection Present Live Birth' of 'Historyof Infection Live Birth Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORYOF_INFECTION_LIVE_BIRTH_SECTION__HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_INFECTION_PRESENT_LIVE_BIRTH = 299;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Live Birth Template Id' of 'Infection Present Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_TEMPLATE_ID = 300;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Live Birth Class Code' of 'Infection Present Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_CLASS_CODE = 301;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Live Birth Mood Code' of 'Infection Present Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_MOOD_CODE = 302;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Live Birth Code P' of 'Infection Present Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_CODE_P = 303;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Live Birth Code' of 'Infection Present Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_CODE = 304;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Live Birth Code VS' of 'Infection Present Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_CODE_VS = 305;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Live Birth Value' of 'Infection Present Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_VALUE = 306;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Live Birth Value P' of 'Infection Present Live Birth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_VALUE_P = 307;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Template Id' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_TEMPLATE_ID = 308;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Class Code' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_CLASS_CODE = 309;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Mood Code' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_MOOD_CODE = 310;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Code' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_CODE = 311;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Text' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_TEXT = 312;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Birth Order' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_BIRTH_ORDER = 313;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Number Of Infants Born Alive' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_NUMBER_OF_INFANTS_BORN_ALIVE = 314;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Autopsy Performance' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_AUTOPSY_PERFORMANCE = 315;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Fetal Death Occurrance' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DEATH_OCCURRANCE = 316;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Plurality' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_PLURALITY = 317;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Congenital Anomaly' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_CONGENITAL_ANOMALY = 318;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Fetal Delivery Time' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_TIME = 319;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Fetal Delivery Subject' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT = 320;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Class Code' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_CLASS_CODE = 321;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Determiner Code' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_DETERMINER_CODE = 322;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Name' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_NAME = 323;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Administrative Gender Code' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE = 324;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Administrative Gender Code P' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE_P = 325;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Class Code' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_CLASS_CODE = 326;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS = 327;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Fetal Delivery Subject Type Code' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_TYPE_CODE = 328;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus' of 'Fetal Delivery Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS = 329;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Template Id' of 'Autopsy Performance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_TEMPLATE_ID = 330;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Class Code' of 'Autopsy Performance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CLASS_CODE = 331;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Mood Code' of 'Autopsy Performance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_MOOD_CODE = 332;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Code P' of 'Autopsy Performance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CODE_P = 333;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Code' of 'Autopsy Performance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CODE = 334;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Value' of 'Autopsy Performance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_VALUE = 335;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Value P' of 'Autopsy Performance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_VALUE_P = 336;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Use Association' of 'Autopsy Performance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_USE_ASSOCIATION = 337;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Histological Exam Association' of 'Autopsy Performance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_HISTOLOGICAL_EXAM_ASSOCIATION = 338;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Occurrance Template Id' of 'Fetal Death Occurrance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_TEMPLATE_ID = 339;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Occurrance Class Code' of 'Fetal Death Occurrance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_CLASS_CODE = 340;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Occurrance Mood Code' of 'Fetal Death Occurrance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_MOOD_CODE = 341;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Occurrance Code P' of 'Fetal Death Occurrance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_CODE_P = 342;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Occurrance Code' of 'Fetal Death Occurrance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_CODE = 343;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Occurrance Value' of 'Fetal Death Occurrance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_VALUE = 344;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Death Occurrance Value P' of 'Fetal Death Occurrance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DEATH_OCCURRANCE__FETAL_DEATH_OCCURRANCE_VALUE_P = 345;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Time Template Id' of 'Fetal Delivery Time'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_TIME__FETAL_DELIVERY_TIME_TEMPLATE_ID = 346;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Time Mood Code' of 'Fetal Delivery Time'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_TIME__FETAL_DELIVERY_TIME_MOOD_CODE = 347;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Time Code P' of 'Fetal Delivery Time'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_TIME__FETAL_DELIVERY_TIME_CODE_P = 348;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Time Code' of 'Fetal Delivery Time'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_TIME__FETAL_DELIVERY_TIME_CODE = 349;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Time Value' of 'Fetal Delivery Time'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_TIME__FETAL_DELIVERY_TIME_VALUE = 350;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fetal Delivery Time Participating Location' of 'Fetal Delivery Time'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FETAL_DELIVERY_TIME__FETAL_DELIVERY_TIME_PARTICIPATING_LOCATION = 351;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Template Id' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID = 352;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Class Code' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE = 353;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Mood Code' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE = 354;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Realm Code' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE = 355;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Realm Code P' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P = 356;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Type Id' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TYPE_ID = 357;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Id' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID = 358;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Code P' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P = 359;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Code' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE = 360;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Title' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE = 361;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Effective Time' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME = 362;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Confidentiality Code P' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P = 363;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Confidentiality Code' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE = 364;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Language Code' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE = 365;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Author' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR = 366;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Custodian' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN = 367;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Record Target' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET = 368;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Labor And Delivery Section' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABOR_AND_DELIVERY_SECTION = 369;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Fetal Delivery Section' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_FETAL_DELIVERY_SECTION = 370;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Prenatal Testing And Surveillance' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PRENATAL_TESTING_AND_SURVEILLANCE = 371;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Pregnancy History' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PREGNANCY_HISTORY = 372;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords History Of Infection Fetal Death Section' of 'Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_HISTORY_OF_INFECTION_FETAL_DEATH_SECTION = 373;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Historyof Infection Fetal Death Section Template Id' of 'Historyof Infection Fetal Death Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORYOF_INFECTION_FETAL_DEATH_SECTION__HISTORYOF_INFECTION_FETAL_DEATH_SECTION_TEMPLATE_ID = 374;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Historyof Infection Fetal Death Section Code' of 'Historyof Infection Fetal Death Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORYOF_INFECTION_FETAL_DEATH_SECTION__HISTORYOF_INFECTION_FETAL_DEATH_SECTION_CODE = 375;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Historyof Infection Fetal Death Section Infection Present Fetal Death' of 'Historyof Infection Fetal Death Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORYOF_INFECTION_FETAL_DEATH_SECTION__HISTORYOF_INFECTION_FETAL_DEATH_SECTION_INFECTION_PRESENT_FETAL_DEATH = 376;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Fetal Death Template Id' of 'Infection Present Fetal Death'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_TEMPLATE_ID = 377;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Fetal Death Class Code' of 'Infection Present Fetal Death'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_CLASS_CODE = 378;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Fetal Death Mood Code' of 'Infection Present Fetal Death'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_MOOD_CODE = 379;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Fetal Death Code P' of 'Infection Present Fetal Death'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_CODE_P = 380;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Fetal Death Code' of 'Infection Present Fetal Death'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_CODE = 381;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Fetal Death Code VS' of 'Infection Present Fetal Death'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_CODE_VS = 382;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Fetal Death Value' of 'Infection Present Fetal Death'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_VALUE = 383;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Infection Present Fetal Death Value P' of 'Infection Present Fetal Death'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_VALUE_P = 384;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 384;

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
	public VsbrValidator() {
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
	protected EPackage getEPackage() {
		return VsbrPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case VsbrPackage.REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS:
				return validateReportingBirthInformationfromaclinicalsettingtovitalrecords(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) value, diagnostics, context);
			case VsbrPackage.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION:
				return validatePrenatalTestingandSurveillanceSection(
					(PrenatalTestingandSurveillanceSection) value, diagnostics, context);
			case VsbrPackage.PRENATAL_CARE:
				return validatePrenatalCare((PrenatalCare) value, diagnostics, context);
			case VsbrPackage.PRIOR_PREGNANCY_HISTORY_SECTION:
				return validatePriorPregnancyHistorySection((PriorPregnancyHistorySection) value, diagnostics, context);
			case VsbrPackage.DATEOF_LAST_LIVE_BIRTH:
				return validateDateofLastLiveBirth((DateofLastLiveBirth) value, diagnostics, context);
			case VsbrPackage.LAST_MENSTRUAL_PERIOD_DATE:
				return validateLastMenstrualPeriodDate((LastMenstrualPeriodDate) value, diagnostics, context);
			case VsbrPackage.NUMBEROF_BIRTHS_NOW_LIVING:
				return validateNumberofBirthsNowLiving((NumberofBirthsNowLiving) value, diagnostics, context);
			case VsbrPackage.NUMBEROF_LIVE_BIRTHS_NOW_DEAD:
				return validateNumberofLiveBirthsNowDead((NumberofLiveBirthsNowDead) value, diagnostics, context);
			case VsbrPackage.OTHER_PREGNANCY_OUTCOME:
				return validateOtherPregnancyOutcome((OtherPregnancyOutcome) value, diagnostics, context);
			case VsbrPackage.ESTIMATEOF_GESTATION:
				return validateEstimateofGestation((EstimateofGestation) value, diagnostics, context);
			case VsbrPackage.NEWBORN_DELIVERY_SECTION:
				return validateNewbornDeliverySection((NewbornDeliverySection) value, diagnostics, context);
			case VsbrPackage.BIRTH_ORDER:
				return validateBirthOrder((BirthOrder) value, diagnostics, context);
			case VsbrPackage.NUMBEROF_INFANTS_BORN_ALIVE:
				return validateNumberofInfantsBornAlive((NumberofInfantsBornAlive) value, diagnostics, context);
			case VsbrPackage.CONGENITAL_ANOMALY:
				return validateCongenitalAnomaly((CongenitalAnomaly) value, diagnostics, context);
			case VsbrPackage.NEWBORNS_VITAL_SIGNS_SECTION:
				return validateNewbornsVitalSignsSection((NewbornsVitalSignsSection) value, diagnostics, context);
			case VsbrPackage.NEWBORNS_VITAL_SIGNS_OBSERVATION:
				return validateNewbornsVitalSignsObservation(
					(NewbornsVitalSignsObservation) value, diagnostics, context);
			case VsbrPackage.ABNORMAL_CONDITIONOFTHE_NEWBORN:
				return validateAbnormalConditionoftheNewborn(
					(AbnormalConditionoftheNewborn) value, diagnostics, context);
			case VsbrPackage.INFANT_LIVING:
				return validateInfantLiving((InfantLiving) value, diagnostics, context);
			case VsbrPackage.INFANT_BREASTFED:
				return validateInfantBreastfed((InfantBreastfed) value, diagnostics, context);
			case VsbrPackage.INFANT_TRANSFER:
				return validateInfantTransfer((InfantTransfer) value, diagnostics, context);
			case VsbrPackage.PLURALITY:
				return validatePlurality((Plurality) value, diagnostics, context);
			case VsbrPackage.ASSESSMENTS_SECTION:
				return validateAssessmentsSection((AssessmentsSection) value, diagnostics, context);
			case VsbrPackage.ASSESSMENT_OBSERVATION:
				return validateAssessmentObservation((AssessmentObservation) value, diagnostics, context);
			case VsbrPackage.LABORAND_DELIVERY_SECTION:
				return validateLaborandDeliverySection((LaborandDeliverySection) value, diagnostics, context);
			case VsbrPackage.LABORAND_DELIVERY_PROCESS:
				return validateLaborandDeliveryProcess((LaborandDeliveryProcess) value, diagnostics, context);
			case VsbrPackage.CHARACTERISTICOF_LABORAND_DELIVERY:
				return validateCharacteristicofLaborandDelivery(
					(CharacteristicofLaborandDelivery) value, diagnostics, context);
			case VsbrPackage.PLANNED_HOME_BIRTH:
				return validatePlannedHomeBirth((PlannedHomeBirth) value, diagnostics, context);
			case VsbrPackage.MATERNAL_TRANSFER:
				return validateMaternalTransfer((MaternalTransfer) value, diagnostics, context);
			case VsbrPackage.MATERNAL_MORBIDITY:
				return validateMaternalMorbidity((MaternalMorbidity) value, diagnostics, context);
			case VsbrPackage.PREGNANCY_RISK_FACTOR:
				return validatePregnancyRiskFactor((PregnancyRiskFactor) value, diagnostics, context);
			case VsbrPackage.LABORAND_DELIVERY_PROCEDURE_SECTION:
				return validateLaborandDeliveryProcedureSection(
					(LaborandDeliveryProcedureSection) value, diagnostics, context);
			case VsbrPackage.OBSTETRIC_PROCEDURE:
				return validateObstetricProcedure((ObstetricProcedure) value, diagnostics, context);
			case VsbrPackage.METHODOF_DELIVERY:
				return validateMethodofDelivery((MethodofDelivery) value, diagnostics, context);
			case VsbrPackage.ONSETOF_LABOR:
				return validateOnsetofLabor((OnsetofLabor) value, diagnostics, context);
			case VsbrPackage.MOTHERS_VITAL_SIGNS_SECTION:
				return validateMothersVitalSignsSection((MothersVitalSignsSection) value, diagnostics, context);
			case VsbrPackage.MOTHERS_VITAL_SIGNS_OBSERVATION:
				return validateMothersVitalSignsObservation((MothersVitalSignsObservation) value, diagnostics, context);
			case VsbrPackage.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION:
				return validateHistoryofInfectionLiveBirthSection(
					(HistoryofInfectionLiveBirthSection) value, diagnostics, context);
			case VsbrPackage.INFECTION_PRESENT_LIVE_BIRTH:
				return validateInfectionPresentLiveBirth((InfectionPresentLiveBirth) value, diagnostics, context);
			case VsbrPackage.FETAL_DELIVERY_SECTION:
				return validateFetalDeliverySection((FetalDeliverySection) value, diagnostics, context);
			case VsbrPackage.AUTOPSY_PERFORMANCE:
				return validateAutopsyPerformance((AutopsyPerformance) value, diagnostics, context);
			case VsbrPackage.FETAL_DEATH_OCCURRANCE:
				return validateFetalDeathOccurrance((FetalDeathOccurrance) value, diagnostics, context);
			case VsbrPackage.FETAL_DELIVERY_TIME:
				return validateFetalDeliveryTime((FetalDeliveryTime) value, diagnostics, context);
			case VsbrPackage.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS:
				return validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) value, diagnostics, context);
			case VsbrPackage.HISTORYOF_INFECTION_FETAL_DEATH_SECTION:
				return validateHistoryofInfectionFetalDeathSection(
					(HistoryofInfectionFetalDeathSection) value, diagnostics, context);
			case VsbrPackage.INFECTION_PRESENT_FETAL_DEATH:
				return validateInfectionPresentFetalDeath((InfectionPresentFetalDeath) value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(
			reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(
			reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTypeId(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornDeliverySection(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionLiveBirthSection(
				reportingBirthInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTypeId constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTypeId(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTypeId(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPregnancyHistory constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornDeliverySection constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornDeliverySection(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornDeliverySection(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingBirthInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionLiveBirthSection constraint of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecords_validateReportingBirthInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionLiveBirthSection(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingBirthInformationfromaclinicalsettingtovitalrecords.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionLiveBirthSection(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSection(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(prenatalTestingandSurveillanceSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(prenatalTestingandSurveillanceSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(
				prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(
				prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalTestingandSurveillanceSection_validatePrenatalTestingandSurveillanceSectionTemplateId(
				prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalTestingandSurveillanceSection_validatePrenatalTestingandSurveillanceSectionClassCode(
				prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalTestingandSurveillanceSection_validatePrenatalTestingandSurveillanceSectionMoodCode(
				prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalTestingandSurveillanceSection_validatePrenatalTestingandSurveillanceSectionCode(
				prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalTestingandSurveillanceSection_validatePrenatalTestingandSurveillanceSectionText(
				prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalTestingandSurveillanceSection_validatePrenatalTestingandSurveillanceSectionPrenatalCare(
				prenatalTestingandSurveillanceSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePrenatalTestingandSurveillanceSectionTemplateId constraint of '<em>Prenatal Testingand Surveillance Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSection_validatePrenatalTestingandSurveillanceSectionTemplateId(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return prenatalTestingandSurveillanceSection.validatePrenatalTestingandSurveillanceSectionTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrenatalTestingandSurveillanceSectionClassCode constraint of '<em>Prenatal Testingand Surveillance Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSection_validatePrenatalTestingandSurveillanceSectionClassCode(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return prenatalTestingandSurveillanceSection.validatePrenatalTestingandSurveillanceSectionClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrenatalTestingandSurveillanceSectionMoodCode constraint of '<em>Prenatal Testingand Surveillance Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSection_validatePrenatalTestingandSurveillanceSectionMoodCode(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return prenatalTestingandSurveillanceSection.validatePrenatalTestingandSurveillanceSectionMoodCode(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrenatalTestingandSurveillanceSectionCode constraint of '<em>Prenatal Testingand Surveillance Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSection_validatePrenatalTestingandSurveillanceSectionCode(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return prenatalTestingandSurveillanceSection.validatePrenatalTestingandSurveillanceSectionCode(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrenatalTestingandSurveillanceSectionText constraint of '<em>Prenatal Testingand Surveillance Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSection_validatePrenatalTestingandSurveillanceSectionText(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return prenatalTestingandSurveillanceSection.validatePrenatalTestingandSurveillanceSectionText(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrenatalTestingandSurveillanceSectionPrenatalCare constraint of '<em>Prenatal Testingand Surveillance Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSection_validatePrenatalTestingandSurveillanceSectionPrenatalCare(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return prenatalTestingandSurveillanceSection.validatePrenatalTestingandSurveillanceSectionPrenatalCare(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCare(PrenatalCare prenatalCare, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(prenatalCare, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(prenatalCare, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalCare_validatePrenatalCareTemplateId(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalCare_validatePrenatalCareClassCode(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalCare_validatePrenatalCareMoodCode(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalCare_validatePrenatalCareNegationInd(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalCare_validatePrenatalCareCodeP(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalCare_validatePrenatalCareCode(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalCare_validatePrenatalCareEffectiveTime(prenatalCare, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrenatalCare_validatePrenatalCareEntryRelationship(prenatalCare, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePrenatalCareTemplateId constraint of '<em>Prenatal Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCare_validatePrenatalCareTemplateId(PrenatalCare prenatalCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return prenatalCare.validatePrenatalCareTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePrenatalCareClassCode constraint of '<em>Prenatal Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCare_validatePrenatalCareClassCode(PrenatalCare prenatalCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return prenatalCare.validatePrenatalCareClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePrenatalCareMoodCode constraint of '<em>Prenatal Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCare_validatePrenatalCareMoodCode(PrenatalCare prenatalCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return prenatalCare.validatePrenatalCareMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePrenatalCareNegationInd constraint of '<em>Prenatal Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCare_validatePrenatalCareNegationInd(PrenatalCare prenatalCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return prenatalCare.validatePrenatalCareNegationInd(diagnostics, context);
	}

	/**
	 * Validates the validatePrenatalCareCodeP constraint of '<em>Prenatal Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCare_validatePrenatalCareCodeP(PrenatalCare prenatalCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return prenatalCare.validatePrenatalCareCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePrenatalCareCode constraint of '<em>Prenatal Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCare_validatePrenatalCareCode(PrenatalCare prenatalCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return prenatalCare.validatePrenatalCareCode(diagnostics, context);
	}

	/**
	 * Validates the validatePrenatalCareEffectiveTime constraint of '<em>Prenatal Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCare_validatePrenatalCareEffectiveTime(PrenatalCare prenatalCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return prenatalCare.validatePrenatalCareEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validatePrenatalCareEntryRelationship constraint of '<em>Prenatal Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCare_validatePrenatalCareEntryRelationship(PrenatalCare prenatalCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return prenatalCare.validatePrenatalCareEntryRelationship(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection(PriorPregnancyHistorySection priorPregnancyHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(priorPregnancyHistorySection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(priorPregnancyHistorySection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionTemplateId(
				priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionClassCode(
				priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionMoodCode(
				priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionCode(
				priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionCodeP(
				priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionText(
				priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionDateofLastLiveBirth(
				priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(
				priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(
				priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(
				priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(
				priorPregnancyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionEstimateofGestation(
				priorPregnancyHistorySection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePriorPregnancyHistorySectionTemplateId constraint of '<em>Prior Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionTemplateId(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return priorPregnancyHistorySection.validatePriorPregnancyHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePriorPregnancyHistorySectionClassCode constraint of '<em>Prior Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionClassCode(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return priorPregnancyHistorySection.validatePriorPregnancyHistorySectionClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePriorPregnancyHistorySectionMoodCode constraint of '<em>Prior Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionMoodCode(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return priorPregnancyHistorySection.validatePriorPregnancyHistorySectionMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePriorPregnancyHistorySectionCode constraint of '<em>Prior Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionCode(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return priorPregnancyHistorySection.validatePriorPregnancyHistorySectionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePriorPregnancyHistorySectionCodeP constraint of '<em>Prior Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionCodeP(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return priorPregnancyHistorySection.validatePriorPregnancyHistorySectionCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePriorPregnancyHistorySectionText constraint of '<em>Prior Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionText(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return priorPregnancyHistorySection.validatePriorPregnancyHistorySectionText(diagnostics, context);
	}

	/**
	 * Validates the validatePriorPregnancyHistorySectionDateofLastLiveBirth constraint of '<em>Prior Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionDateofLastLiveBirth(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return priorPregnancyHistorySection.validatePriorPregnancyHistorySectionDateofLastLiveBirth(
			diagnostics, context);
	}

	/**
	 * Validates the validatePriorPregnancyHistorySectionLastMenstrualPeriodDate constraint of '<em>Prior Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return priorPregnancyHistorySection.validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(
			diagnostics, context);
	}

	/**
	 * Validates the validatePriorPregnancyHistorySectionNumberofBirthsStillLiving constraint of '<em>Prior Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return priorPregnancyHistorySection.validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(
			diagnostics, context);
	}

	/**
	 * Validates the validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead constraint of '<em>Prior Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return priorPregnancyHistorySection.validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(
			diagnostics, context);
	}

	/**
	 * Validates the validatePriorPregnancyHistorySectionOtherPregnancyOutcomes constraint of '<em>Prior Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return priorPregnancyHistorySection.validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(
			diagnostics, context);
	}

	/**
	 * Validates the validatePriorPregnancyHistorySectionEstimateofGestation constraint of '<em>Prior Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySection_validatePriorPregnancyHistorySectionEstimateofGestation(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return priorPregnancyHistorySection.validatePriorPregnancyHistorySectionEstimateofGestation(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateofLastLiveBirth(DateofLastLiveBirth dateofLastLiveBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateofLastLiveBirth, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(dateofLastLiveBirth, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(dateofLastLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(dateofLastLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(dateofLastLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(dateofLastLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(dateofLastLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(dateofLastLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(dateofLastLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDateofLastLiveBirth_validateDateofLastLiveBirthTemplateId(
				dateofLastLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDateofLastLiveBirth_validateDateofLastLiveBirthMoodCode(
				dateofLastLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDateofLastLiveBirth_validateDateofLastLiveBirthCodeP(
				dateofLastLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDateofLastLiveBirth_validateDateofLastLiveBirthCode(
				dateofLastLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDateofLastLiveBirth_validateDateofLastLiveBirthValue(
				dateofLastLiveBirth, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateDateofLastLiveBirthTemplateId constraint of '<em>Dateof Last Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateofLastLiveBirth_validateDateofLastLiveBirthTemplateId(
			DateofLastLiveBirth dateofLastLiveBirth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateofLastLiveBirth.validateDateofLastLiveBirthTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateDateofLastLiveBirthMoodCode constraint of '<em>Dateof Last Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateofLastLiveBirth_validateDateofLastLiveBirthMoodCode(
			DateofLastLiveBirth dateofLastLiveBirth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateofLastLiveBirth.validateDateofLastLiveBirthMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateDateofLastLiveBirthCodeP constraint of '<em>Dateof Last Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateofLastLiveBirth_validateDateofLastLiveBirthCodeP(
			DateofLastLiveBirth dateofLastLiveBirth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateofLastLiveBirth.validateDateofLastLiveBirthCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateDateofLastLiveBirthCode constraint of '<em>Dateof Last Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateofLastLiveBirth_validateDateofLastLiveBirthCode(DateofLastLiveBirth dateofLastLiveBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateofLastLiveBirth.validateDateofLastLiveBirthCode(diagnostics, context);
	}

	/**
	 * Validates the validateDateofLastLiveBirthValue constraint of '<em>Dateof Last Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateofLastLiveBirth_validateDateofLastLiveBirthValue(
			DateofLastLiveBirth dateofLastLiveBirth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateofLastLiveBirth.validateDateofLastLiveBirthValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodDate(LastMenstrualPeriodDate lastMenstrualPeriodDate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lastMenstrualPeriodDate, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(lastMenstrualPeriodDate, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(lastMenstrualPeriodDate, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(lastMenstrualPeriodDate, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(lastMenstrualPeriodDate, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(lastMenstrualPeriodDate, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(lastMenstrualPeriodDate, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(lastMenstrualPeriodDate, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(lastMenstrualPeriodDate, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateTemplateId(
				lastMenstrualPeriodDate, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateClassCode(
				lastMenstrualPeriodDate, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateMoodCode(
				lastMenstrualPeriodDate, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateCodeP(
				lastMenstrualPeriodDate, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateCode(
				lastMenstrualPeriodDate, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateValue(
				lastMenstrualPeriodDate, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateLastMenstrualPeriodDateTemplateId constraint of '<em>Last Menstrual Period Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateTemplateId(
			LastMenstrualPeriodDate lastMenstrualPeriodDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriodDate.validateLastMenstrualPeriodDateTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateLastMenstrualPeriodDateClassCode constraint of '<em>Last Menstrual Period Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateClassCode(
			LastMenstrualPeriodDate lastMenstrualPeriodDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriodDate.validateLastMenstrualPeriodDateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateLastMenstrualPeriodDateMoodCode constraint of '<em>Last Menstrual Period Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateMoodCode(
			LastMenstrualPeriodDate lastMenstrualPeriodDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriodDate.validateLastMenstrualPeriodDateMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateLastMenstrualPeriodDateCodeP constraint of '<em>Last Menstrual Period Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateCodeP(
			LastMenstrualPeriodDate lastMenstrualPeriodDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriodDate.validateLastMenstrualPeriodDateCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateLastMenstrualPeriodDateCode constraint of '<em>Last Menstrual Period Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateCode(
			LastMenstrualPeriodDate lastMenstrualPeriodDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriodDate.validateLastMenstrualPeriodDateCode(diagnostics, context);
	}

	/**
	 * Validates the validateLastMenstrualPeriodDateValue constraint of '<em>Last Menstrual Period Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodDate_validateLastMenstrualPeriodDateValue(
			LastMenstrualPeriodDate lastMenstrualPeriodDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriodDate.validateLastMenstrualPeriodDateValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofBirthsNowLiving(NumberofBirthsNowLiving numberofBirthsNowLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numberofBirthsNowLiving, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(numberofBirthsNowLiving, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(numberofBirthsNowLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(numberofBirthsNowLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(numberofBirthsNowLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(numberofBirthsNowLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(numberofBirthsNowLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(numberofBirthsNowLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(numberofBirthsNowLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofBirthsNowLiving_validateNumberofBirthsNowLivingTemplateId(
				numberofBirthsNowLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofBirthsNowLiving_validateNumberofBirthsNowLivingClassCode(
				numberofBirthsNowLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofBirthsNowLiving_validateNumberofBirthsNowLivingMoodCode(
				numberofBirthsNowLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofBirthsNowLiving_validateNumberofBirthsNowLivingCodeP(
				numberofBirthsNowLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofBirthsNowLiving_validateNumberofBirthsNowLivingCode(
				numberofBirthsNowLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofBirthsNowLiving_validateNumberofBirthsNowLivingValue(
				numberofBirthsNowLiving, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateNumberofBirthsNowLivingTemplateId constraint of '<em>Numberof Births Now Living</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofBirthsNowLiving_validateNumberofBirthsNowLivingTemplateId(
			NumberofBirthsNowLiving numberofBirthsNowLiving, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numberofBirthsNowLiving.validateNumberofBirthsNowLivingTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofBirthsNowLivingClassCode constraint of '<em>Numberof Births Now Living</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofBirthsNowLiving_validateNumberofBirthsNowLivingClassCode(
			NumberofBirthsNowLiving numberofBirthsNowLiving, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numberofBirthsNowLiving.validateNumberofBirthsNowLivingClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofBirthsNowLivingMoodCode constraint of '<em>Numberof Births Now Living</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofBirthsNowLiving_validateNumberofBirthsNowLivingMoodCode(
			NumberofBirthsNowLiving numberofBirthsNowLiving, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numberofBirthsNowLiving.validateNumberofBirthsNowLivingMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofBirthsNowLivingCodeP constraint of '<em>Numberof Births Now Living</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofBirthsNowLiving_validateNumberofBirthsNowLivingCodeP(
			NumberofBirthsNowLiving numberofBirthsNowLiving, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numberofBirthsNowLiving.validateNumberofBirthsNowLivingCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofBirthsNowLivingCode constraint of '<em>Numberof Births Now Living</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofBirthsNowLiving_validateNumberofBirthsNowLivingCode(
			NumberofBirthsNowLiving numberofBirthsNowLiving, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numberofBirthsNowLiving.validateNumberofBirthsNowLivingCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofBirthsNowLivingValue constraint of '<em>Numberof Births Now Living</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofBirthsNowLiving_validateNumberofBirthsNowLivingValue(
			NumberofBirthsNowLiving numberofBirthsNowLiving, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numberofBirthsNowLiving.validateNumberofBirthsNowLivingValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDead(NumberofLiveBirthsNowDead numberofLiveBirthsNowDead,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numberofLiveBirthsNowDead, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(numberofLiveBirthsNowDead, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(numberofLiveBirthsNowDead, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(numberofLiveBirthsNowDead, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(numberofLiveBirthsNowDead, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(numberofLiveBirthsNowDead, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(numberofLiveBirthsNowDead, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(numberofLiveBirthsNowDead, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(numberofLiveBirthsNowDead, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLiveBirthsNowDead_validateNumberofLiveBirthsNowDeadTemplateId(
				numberofLiveBirthsNowDead, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLiveBirthsNowDead_validateNumberofLiveBirthsNowDeadClassCode(
				numberofLiveBirthsNowDead, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLiveBirthsNowDead_validateNumberofLiveBirthsNowDeadMoodCode(
				numberofLiveBirthsNowDead, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLiveBirthsNowDead_validateNumberofLiveBirthsNowDeadCodeP(
				numberofLiveBirthsNowDead, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLiveBirthsNowDead_validateNumberofLiveBirthsNowDeadCode(
				numberofLiveBirthsNowDead, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLiveBirthsNowDead_validateNumberofLiveBirthsNowDeadValue(
				numberofLiveBirthsNowDead, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateNumberofLiveBirthsNowDeadTemplateId constraint of '<em>Numberof Live Births Now Dead</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDead_validateNumberofLiveBirthsNowDeadTemplateId(
			NumberofLiveBirthsNowDead numberofLiveBirthsNowDead, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLiveBirthsNowDead.validateNumberofLiveBirthsNowDeadTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofLiveBirthsNowDeadClassCode constraint of '<em>Numberof Live Births Now Dead</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDead_validateNumberofLiveBirthsNowDeadClassCode(
			NumberofLiveBirthsNowDead numberofLiveBirthsNowDead, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLiveBirthsNowDead.validateNumberofLiveBirthsNowDeadClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofLiveBirthsNowDeadMoodCode constraint of '<em>Numberof Live Births Now Dead</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDead_validateNumberofLiveBirthsNowDeadMoodCode(
			NumberofLiveBirthsNowDead numberofLiveBirthsNowDead, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLiveBirthsNowDead.validateNumberofLiveBirthsNowDeadMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofLiveBirthsNowDeadCodeP constraint of '<em>Numberof Live Births Now Dead</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDead_validateNumberofLiveBirthsNowDeadCodeP(
			NumberofLiveBirthsNowDead numberofLiveBirthsNowDead, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLiveBirthsNowDead.validateNumberofLiveBirthsNowDeadCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofLiveBirthsNowDeadCode constraint of '<em>Numberof Live Births Now Dead</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDead_validateNumberofLiveBirthsNowDeadCode(
			NumberofLiveBirthsNowDead numberofLiveBirthsNowDead, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLiveBirthsNowDead.validateNumberofLiveBirthsNowDeadCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofLiveBirthsNowDeadValue constraint of '<em>Numberof Live Births Now Dead</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDead_validateNumberofLiveBirthsNowDeadValue(
			NumberofLiveBirthsNowDead numberofLiveBirthsNowDead, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLiveBirthsNowDead.validateNumberofLiveBirthsNowDeadValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherPregnancyOutcome(OtherPregnancyOutcome otherPregnancyOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(otherPregnancyOutcome, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(otherPregnancyOutcome, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeTemplateId(
				otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeClassCode(
				otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeMoodCode(
				otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeCodeP(
				otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeCode(
				otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeEffectiveTime(
				otherPregnancyOutcome, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeValue(
				otherPregnancyOutcome, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateOtherPregnancyOutcomeTemplateId constraint of '<em>Other Pregnancy Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeTemplateId(
			OtherPregnancyOutcome otherPregnancyOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return otherPregnancyOutcome.validateOtherPregnancyOutcomeTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateOtherPregnancyOutcomeClassCode constraint of '<em>Other Pregnancy Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeClassCode(
			OtherPregnancyOutcome otherPregnancyOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return otherPregnancyOutcome.validateOtherPregnancyOutcomeClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateOtherPregnancyOutcomeMoodCode constraint of '<em>Other Pregnancy Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeMoodCode(
			OtherPregnancyOutcome otherPregnancyOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return otherPregnancyOutcome.validateOtherPregnancyOutcomeMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateOtherPregnancyOutcomeCodeP constraint of '<em>Other Pregnancy Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeCodeP(
			OtherPregnancyOutcome otherPregnancyOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return otherPregnancyOutcome.validateOtherPregnancyOutcomeCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateOtherPregnancyOutcomeCode constraint of '<em>Other Pregnancy Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeCode(
			OtherPregnancyOutcome otherPregnancyOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return otherPregnancyOutcome.validateOtherPregnancyOutcomeCode(diagnostics, context);
	}

	/**
	 * Validates the validateOtherPregnancyOutcomeEffectiveTime constraint of '<em>Other Pregnancy Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeEffectiveTime(
			OtherPregnancyOutcome otherPregnancyOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return otherPregnancyOutcome.validateOtherPregnancyOutcomeEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateOtherPregnancyOutcomeValue constraint of '<em>Other Pregnancy Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherPregnancyOutcome_validateOtherPregnancyOutcomeValue(
			OtherPregnancyOutcome otherPregnancyOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return otherPregnancyOutcome.validateOtherPregnancyOutcomeValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestation(EstimateofGestation estimateofGestation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(estimateofGestation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(estimateofGestation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(estimateofGestation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(estimateofGestation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(estimateofGestation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(estimateofGestation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(estimateofGestation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(estimateofGestation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(estimateofGestation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstimateofGestation_validateEstimateofGestationTemplateId(
				estimateofGestation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstimateofGestation_validateEstimateofGestationClassCode(
				estimateofGestation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstimateofGestation_validateEstimateofGestationMoodCode(
				estimateofGestation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstimateofGestation_validateEstimateofGestationCodeP(
				estimateofGestation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstimateofGestation_validateEstimateofGestationCode(
				estimateofGestation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstimateofGestation_validateEstimateofGestationValue(
				estimateofGestation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateEstimateofGestationTemplateId constraint of '<em>Estimateof Gestation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestation_validateEstimateofGestationTemplateId(
			EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estimateofGestation.validateEstimateofGestationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEstimateofGestationClassCode constraint of '<em>Estimateof Gestation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestation_validateEstimateofGestationClassCode(
			EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estimateofGestation.validateEstimateofGestationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateEstimateofGestationMoodCode constraint of '<em>Estimateof Gestation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestation_validateEstimateofGestationMoodCode(
			EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estimateofGestation.validateEstimateofGestationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateEstimateofGestationCodeP constraint of '<em>Estimateof Gestation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestation_validateEstimateofGestationCodeP(
			EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estimateofGestation.validateEstimateofGestationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateEstimateofGestationCode constraint of '<em>Estimateof Gestation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestation_validateEstimateofGestationCode(EstimateofGestation estimateofGestation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estimateofGestation.validateEstimateofGestationCode(diagnostics, context);
	}

	/**
	 * Validates the validateEstimateofGestationValue constraint of '<em>Estimateof Gestation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestation_validateEstimateofGestationValue(
			EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estimateofGestation.validateEstimateofGestationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection(NewbornDeliverySection newbornDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(newbornDeliverySection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(newbornDeliverySection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionTemplateId(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionClassCode(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionMoodCode(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionCode(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionText(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionSubject(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionBirthOrder(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNumberOfInfantsBornAlive(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionCongenitalAnomalies(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornsVitalSignsSection(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionAbnormalConditionsOfTheNewborn(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionInfantLiving(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionInfantBreastfed(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionInfantTransfer(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionPlurality(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionAssessmentsSection(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectTypeCode(
				newbornDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRelatedSubject(
				newbornDeliverySection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateNewbornDeliverySectionTemplateId constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionTemplateId(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionClassCode constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionClassCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionMoodCode constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionMoodCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionCode constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionText constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionText(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionText(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionSubject constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionSubject(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionSubject(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionBirthOrder constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionBirthOrder(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionBirthOrder(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNumberOfInfantsBornAlive constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNumberOfInfantsBornAlive(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNumberOfInfantsBornAlive(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionCongenitalAnomalies constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionCongenitalAnomalies(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionCongenitalAnomalies(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornsVitalSignsSection constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornsVitalSignsSection(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornsVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionAbnormalConditionsOfTheNewborn constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionAbnormalConditionsOfTheNewborn(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionAbnormalConditionsOfTheNewborn(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionInfantLiving constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionInfantLiving(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionInfantLiving(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionInfantBreastfed constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionInfantBreastfed(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionInfantBreastfed(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionInfantTransfer constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionInfantTransfer(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionInfantTransfer(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionPlurality constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionPlurality(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionPlurality(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionAssessmentsSection constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionAssessmentsSection(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionAssessmentsSection(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(
			diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(
			diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(
			diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(
			diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornSubjectTypeCode constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectTypeCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornSubjectTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornDeliverySectionNewbornSubjectRelatedSubject constraint of '<em>Newborn Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySection_validateNewbornDeliverySectionNewbornSubjectRelatedSubject(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newbornDeliverySection.validateNewbornDeliverySectionNewbornSubjectRelatedSubject(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrder(BirthOrder birthOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(birthOrder, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(birthOrder, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(birthOrder, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(birthOrder, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(birthOrder, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(birthOrder, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(birthOrder, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(birthOrder, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(birthOrder, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBirthOrder_validateBirthOrderTemplateId(birthOrder, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBirthOrder_validateBirthOrderClassCode(birthOrder, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBirthOrder_validateBirthOrderMoodCode(birthOrder, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBirthOrder_validateBirthOrderCodeP(birthOrder, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBirthOrder_validateBirthOrderCode(birthOrder, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBirthOrder_validateBirthOrderValue(birthOrder, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateBirthOrderTemplateId constraint of '<em>Birth Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrder_validateBirthOrderTemplateId(BirthOrder birthOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return birthOrder.validateBirthOrderTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateBirthOrderClassCode constraint of '<em>Birth Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrder_validateBirthOrderClassCode(BirthOrder birthOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return birthOrder.validateBirthOrderClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateBirthOrderMoodCode constraint of '<em>Birth Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrder_validateBirthOrderMoodCode(BirthOrder birthOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return birthOrder.validateBirthOrderMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateBirthOrderCodeP constraint of '<em>Birth Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrder_validateBirthOrderCodeP(BirthOrder birthOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return birthOrder.validateBirthOrderCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateBirthOrderCode constraint of '<em>Birth Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrder_validateBirthOrderCode(BirthOrder birthOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return birthOrder.validateBirthOrderCode(diagnostics, context);
	}

	/**
	 * Validates the validateBirthOrderValue constraint of '<em>Birth Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrder_validateBirthOrderValue(BirthOrder birthOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return birthOrder.validateBirthOrderValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofInfantsBornAlive(NumberofInfantsBornAlive numberofInfantsBornAlive,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numberofInfantsBornAlive, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(numberofInfantsBornAlive, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(numberofInfantsBornAlive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(numberofInfantsBornAlive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(numberofInfantsBornAlive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(numberofInfantsBornAlive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(numberofInfantsBornAlive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(numberofInfantsBornAlive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(numberofInfantsBornAlive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveTemplateId(
				numberofInfantsBornAlive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveClassCode(
				numberofInfantsBornAlive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveMoodCode(
				numberofInfantsBornAlive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveCodeP(
				numberofInfantsBornAlive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveCode(
				numberofInfantsBornAlive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveValue(
				numberofInfantsBornAlive, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateNumberofInfantsBornAliveTemplateId constraint of '<em>Numberof Infants Born Alive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveTemplateId(
			NumberofInfantsBornAlive numberofInfantsBornAlive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numberofInfantsBornAlive.validateNumberofInfantsBornAliveTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofInfantsBornAliveClassCode constraint of '<em>Numberof Infants Born Alive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveClassCode(
			NumberofInfantsBornAlive numberofInfantsBornAlive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numberofInfantsBornAlive.validateNumberofInfantsBornAliveClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofInfantsBornAliveMoodCode constraint of '<em>Numberof Infants Born Alive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveMoodCode(
			NumberofInfantsBornAlive numberofInfantsBornAlive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numberofInfantsBornAlive.validateNumberofInfantsBornAliveMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofInfantsBornAliveCodeP constraint of '<em>Numberof Infants Born Alive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveCodeP(
			NumberofInfantsBornAlive numberofInfantsBornAlive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numberofInfantsBornAlive.validateNumberofInfantsBornAliveCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofInfantsBornAliveCode constraint of '<em>Numberof Infants Born Alive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveCode(
			NumberofInfantsBornAlive numberofInfantsBornAlive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numberofInfantsBornAlive.validateNumberofInfantsBornAliveCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofInfantsBornAliveValue constraint of '<em>Numberof Infants Born Alive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofInfantsBornAlive_validateNumberofInfantsBornAliveValue(
			NumberofInfantsBornAlive numberofInfantsBornAlive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numberofInfantsBornAlive.validateNumberofInfantsBornAliveValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomaly(CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(congenitalAnomaly, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(congenitalAnomaly, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCongenitalAnomaly_validateCongenitalAnomalyTemplateId(
				congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCongenitalAnomaly_validateCongenitalAnomalyClassCode(
				congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCongenitalAnomaly_validateCongenitalAnomalyMoodCode(
				congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCongenitalAnomaly_validateCongenitalAnomalyCodeP(congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCongenitalAnomaly_validateCongenitalAnomalyCode(congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCongenitalAnomaly_validateCongenitalAnomalyCodeVS(congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCongenitalAnomaly_validateCongenitalAnomalyValue(congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCongenitalAnomaly_validateCongenitalAnomalyValueP(congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCongenitalAnomaly_validateCongenitalAnomalyDownConfirmationAssociation(
				congenitalAnomaly, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCongenitalAnomaly_validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(
				congenitalAnomaly, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateCongenitalAnomalyTemplateId constraint of '<em>Congenital Anomaly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomaly_validateCongenitalAnomalyTemplateId(CongenitalAnomaly congenitalAnomaly,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return congenitalAnomaly.validateCongenitalAnomalyTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCongenitalAnomalyClassCode constraint of '<em>Congenital Anomaly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomaly_validateCongenitalAnomalyClassCode(CongenitalAnomaly congenitalAnomaly,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return congenitalAnomaly.validateCongenitalAnomalyClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateCongenitalAnomalyMoodCode constraint of '<em>Congenital Anomaly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomaly_validateCongenitalAnomalyMoodCode(CongenitalAnomaly congenitalAnomaly,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return congenitalAnomaly.validateCongenitalAnomalyMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateCongenitalAnomalyCodeP constraint of '<em>Congenital Anomaly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomaly_validateCongenitalAnomalyCodeP(CongenitalAnomaly congenitalAnomaly,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return congenitalAnomaly.validateCongenitalAnomalyCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateCongenitalAnomalyCode constraint of '<em>Congenital Anomaly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomaly_validateCongenitalAnomalyCode(CongenitalAnomaly congenitalAnomaly,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return congenitalAnomaly.validateCongenitalAnomalyCode(diagnostics, context);
	}

	/**
	 * Validates the validateCongenitalAnomalyCodeVS constraint of '<em>Congenital Anomaly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomaly_validateCongenitalAnomalyCodeVS(CongenitalAnomaly congenitalAnomaly,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return congenitalAnomaly.validateCongenitalAnomalyCodeVS(diagnostics, context);
	}

	/**
	 * Validates the validateCongenitalAnomalyValue constraint of '<em>Congenital Anomaly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomaly_validateCongenitalAnomalyValue(CongenitalAnomaly congenitalAnomaly,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return congenitalAnomaly.validateCongenitalAnomalyValue(diagnostics, context);
	}

	/**
	 * Validates the validateCongenitalAnomalyValueP constraint of '<em>Congenital Anomaly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomaly_validateCongenitalAnomalyValueP(CongenitalAnomaly congenitalAnomaly,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return congenitalAnomaly.validateCongenitalAnomalyValueP(diagnostics, context);
	}

	/**
	 * Validates the validateCongenitalAnomalyDownConfirmationAssociation constraint of '<em>Congenital Anomaly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomaly_validateCongenitalAnomalyDownConfirmationAssociation(
			CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return congenitalAnomaly.validateCongenitalAnomalyDownConfirmationAssociation(diagnostics, context);
	}

	/**
	 * Validates the validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation constraint of '<em>Congenital Anomaly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomaly_validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(
			CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return congenitalAnomaly.validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSection(NewbornsVitalSignsSection newbornsVitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(newbornsVitalSignsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(newbornsVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionTemplateId(
				newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionClassCode(
				newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionMoodCode(
				newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionCode(
				newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionCodeP(
				newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionText(
				newbornsVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(
				newbornsVitalSignsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateNewbornsVitalSignsSectionTemplateId constraint of '<em>Newborns Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionTemplateId(
			NewbornsVitalSignsSection newbornsVitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsSection.validateNewbornsVitalSignsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornsVitalSignsSectionClassCode constraint of '<em>Newborns Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionClassCode(
			NewbornsVitalSignsSection newbornsVitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsSection.validateNewbornsVitalSignsSectionClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornsVitalSignsSectionMoodCode constraint of '<em>Newborns Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionMoodCode(
			NewbornsVitalSignsSection newbornsVitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsSection.validateNewbornsVitalSignsSectionMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornsVitalSignsSectionCode constraint of '<em>Newborns Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionCode(
			NewbornsVitalSignsSection newbornsVitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsSection.validateNewbornsVitalSignsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornsVitalSignsSectionCodeP constraint of '<em>Newborns Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionCodeP(
			NewbornsVitalSignsSection newbornsVitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsSection.validateNewbornsVitalSignsSectionCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornsVitalSignsSectionText constraint of '<em>Newborns Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionText(
			NewbornsVitalSignsSection newbornsVitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsSection.validateNewbornsVitalSignsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation constraint of '<em>Newborns Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSection_validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(
			NewbornsVitalSignsSection newbornsVitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsSection.validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservation(NewbornsVitalSignsObservation newbornsVitalSignsObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(newbornsVitalSignsObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(newbornsVitalSignsObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(newbornsVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(newbornsVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(newbornsVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(newbornsVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(newbornsVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(newbornsVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(newbornsVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsObservation_validateNewbornsVitalSignsObservationTemplateId(
				newbornsVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsObservation_validateNewbornsVitalSignsObservationClassCode(
				newbornsVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsObservation_validateNewbornsVitalSignsObservationMoodCode(
				newbornsVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsObservation_validateNewbornsVitalSignsObservationCodeP(
				newbornsVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsObservation_validateNewbornsVitalSignsObservationCode(
				newbornsVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNewbornsVitalSignsObservation_validateNewbornsVitalSignsObservationValue(
				newbornsVitalSignsObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateNewbornsVitalSignsObservationTemplateId constraint of '<em>Newborns Vital Signs Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservation_validateNewbornsVitalSignsObservationTemplateId(
			NewbornsVitalSignsObservation newbornsVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsObservation.validateNewbornsVitalSignsObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornsVitalSignsObservationClassCode constraint of '<em>Newborns Vital Signs Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservation_validateNewbornsVitalSignsObservationClassCode(
			NewbornsVitalSignsObservation newbornsVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsObservation.validateNewbornsVitalSignsObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornsVitalSignsObservationMoodCode constraint of '<em>Newborns Vital Signs Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservation_validateNewbornsVitalSignsObservationMoodCode(
			NewbornsVitalSignsObservation newbornsVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsObservation.validateNewbornsVitalSignsObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornsVitalSignsObservationCodeP constraint of '<em>Newborns Vital Signs Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservation_validateNewbornsVitalSignsObservationCodeP(
			NewbornsVitalSignsObservation newbornsVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsObservation.validateNewbornsVitalSignsObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornsVitalSignsObservationCode constraint of '<em>Newborns Vital Signs Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservation_validateNewbornsVitalSignsObservationCode(
			NewbornsVitalSignsObservation newbornsVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsObservation.validateNewbornsVitalSignsObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateNewbornsVitalSignsObservationValue constraint of '<em>Newborns Vital Signs Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservation_validateNewbornsVitalSignsObservationValue(
			NewbornsVitalSignsObservation newbornsVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return newbornsVitalSignsObservation.validateNewbornsVitalSignsObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewborn(AbnormalConditionoftheNewborn abnormalConditionoftheNewborn,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abnormalConditionoftheNewborn, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(abnormalConditionoftheNewborn, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornTemplateId(
				abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornClassCode(
				abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornMoodCode(
				abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornCodeP(
				abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornCode(
				abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornCodeVS(
				abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornValue(
				abnormalConditionoftheNewborn, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornValueP(
				abnormalConditionoftheNewborn, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAbnormalConditionoftheNewbornTemplateId constraint of '<em>Abnormal Conditionofthe Newborn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornTemplateId(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return abnormalConditionoftheNewborn.validateAbnormalConditionoftheNewbornTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAbnormalConditionoftheNewbornClassCode constraint of '<em>Abnormal Conditionofthe Newborn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornClassCode(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return abnormalConditionoftheNewborn.validateAbnormalConditionoftheNewbornClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAbnormalConditionoftheNewbornMoodCode constraint of '<em>Abnormal Conditionofthe Newborn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornMoodCode(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return abnormalConditionoftheNewborn.validateAbnormalConditionoftheNewbornMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAbnormalConditionoftheNewbornCodeP constraint of '<em>Abnormal Conditionofthe Newborn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornCodeP(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return abnormalConditionoftheNewborn.validateAbnormalConditionoftheNewbornCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateAbnormalConditionoftheNewbornCode constraint of '<em>Abnormal Conditionofthe Newborn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornCode(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return abnormalConditionoftheNewborn.validateAbnormalConditionoftheNewbornCode(diagnostics, context);
	}

	/**
	 * Validates the validateAbnormalConditionoftheNewbornCodeVS constraint of '<em>Abnormal Conditionofthe Newborn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornCodeVS(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return abnormalConditionoftheNewborn.validateAbnormalConditionoftheNewbornCodeVS(diagnostics, context);
	}

	/**
	 * Validates the validateAbnormalConditionoftheNewbornValue constraint of '<em>Abnormal Conditionofthe Newborn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornValue(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return abnormalConditionoftheNewborn.validateAbnormalConditionoftheNewbornValue(diagnostics, context);
	}

	/**
	 * Validates the validateAbnormalConditionoftheNewbornValueP constraint of '<em>Abnormal Conditionofthe Newborn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewborn_validateAbnormalConditionoftheNewbornValueP(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return abnormalConditionoftheNewborn.validateAbnormalConditionoftheNewbornValueP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLiving(InfantLiving infantLiving, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infantLiving, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(infantLiving, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(infantLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(infantLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(infantLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(infantLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(infantLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(infantLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(infantLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantLiving_validateInfantLivingTemplateId(infantLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantLiving_validateInfantLivingClassCode(infantLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantLiving_validateInfantLivingMoodCode(infantLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantLiving_validateInfantLivingCodeP(infantLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantLiving_validateInfantLivingCode(infantLiving, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantLiving_validateInfantLivingValue(infantLiving, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateInfantLivingTemplateId constraint of '<em>Infant Living</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLiving_validateInfantLivingTemplateId(InfantLiving infantLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantLiving.validateInfantLivingTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateInfantLivingClassCode constraint of '<em>Infant Living</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLiving_validateInfantLivingClassCode(InfantLiving infantLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantLiving.validateInfantLivingClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfantLivingMoodCode constraint of '<em>Infant Living</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLiving_validateInfantLivingMoodCode(InfantLiving infantLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantLiving.validateInfantLivingMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfantLivingCodeP constraint of '<em>Infant Living</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLiving_validateInfantLivingCodeP(InfantLiving infantLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantLiving.validateInfantLivingCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateInfantLivingCode constraint of '<em>Infant Living</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLiving_validateInfantLivingCode(InfantLiving infantLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantLiving.validateInfantLivingCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfantLivingValue constraint of '<em>Infant Living</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLiving_validateInfantLivingValue(InfantLiving infantLiving,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantLiving.validateInfantLivingValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfed(InfantBreastfed infantBreastfed, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infantBreastfed, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(infantBreastfed, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(infantBreastfed, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(infantBreastfed, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(infantBreastfed, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(infantBreastfed, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(infantBreastfed, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(infantBreastfed, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(infantBreastfed, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantBreastfed_validateInfantBreastfedTemplateId(infantBreastfed, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantBreastfed_validateInfantBreastfedClassCode(infantBreastfed, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantBreastfed_validateInfantBreastfedMoodCode(infantBreastfed, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantBreastfed_validateInfantBreastfedCodeP(infantBreastfed, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantBreastfed_validateInfantBreastfedCode(infantBreastfed, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantBreastfed_validateInfantBreastfedValue(infantBreastfed, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateInfantBreastfedTemplateId constraint of '<em>Infant Breastfed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfed_validateInfantBreastfedTemplateId(InfantBreastfed infantBreastfed,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantBreastfed.validateInfantBreastfedTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateInfantBreastfedClassCode constraint of '<em>Infant Breastfed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfed_validateInfantBreastfedClassCode(InfantBreastfed infantBreastfed,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantBreastfed.validateInfantBreastfedClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfantBreastfedMoodCode constraint of '<em>Infant Breastfed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfed_validateInfantBreastfedMoodCode(InfantBreastfed infantBreastfed,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantBreastfed.validateInfantBreastfedMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfantBreastfedCodeP constraint of '<em>Infant Breastfed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfed_validateInfantBreastfedCodeP(InfantBreastfed infantBreastfed,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantBreastfed.validateInfantBreastfedCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateInfantBreastfedCode constraint of '<em>Infant Breastfed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfed_validateInfantBreastfedCode(InfantBreastfed infantBreastfed,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantBreastfed.validateInfantBreastfedCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfantBreastfedValue constraint of '<em>Infant Breastfed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfed_validateInfantBreastfedValue(InfantBreastfed infantBreastfed,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantBreastfed.validateInfantBreastfedValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantTransfer(InfantTransfer infantTransfer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infantTransfer, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(infantTransfer, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantTransfer_validateInfantTransferTemplateId(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantTransfer_validateInfantTransferClassCode(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantTransfer_validateInfantTransferMoodCode(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantTransfer_validateInfantTransferCodeP(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantTransfer_validateInfantTransferCode(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantTransfer_validateInfantTransferValue(infantTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfantTransfer_validateInfantTransferParticipant(infantTransfer, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateInfantTransferTemplateId constraint of '<em>Infant Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantTransfer_validateInfantTransferTemplateId(InfantTransfer infantTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantTransfer.validateInfantTransferTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateInfantTransferClassCode constraint of '<em>Infant Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantTransfer_validateInfantTransferClassCode(InfantTransfer infantTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantTransfer.validateInfantTransferClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfantTransferMoodCode constraint of '<em>Infant Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantTransfer_validateInfantTransferMoodCode(InfantTransfer infantTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantTransfer.validateInfantTransferMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfantTransferCodeP constraint of '<em>Infant Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantTransfer_validateInfantTransferCodeP(InfantTransfer infantTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantTransfer.validateInfantTransferCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateInfantTransferCode constraint of '<em>Infant Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantTransfer_validateInfantTransferCode(InfantTransfer infantTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantTransfer.validateInfantTransferCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfantTransferValue constraint of '<em>Infant Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantTransfer_validateInfantTransferValue(InfantTransfer infantTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantTransfer.validateInfantTransferValue(diagnostics, context);
	}

	/**
	 * Validates the validateInfantTransferParticipant constraint of '<em>Infant Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantTransfer_validateInfantTransferParticipant(InfantTransfer infantTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infantTransfer.validateInfantTransferParticipant(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlurality(Plurality plurality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(plurality, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(plurality, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(plurality, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(plurality, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(plurality, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(plurality, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(plurality, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(plurality, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(plurality, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlurality_validatePluralityTemplateId(plurality, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlurality_validatePluralityClassCode(plurality, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlurality_validatePluralityMoodCode(plurality, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlurality_validatePluralityCodeP(plurality, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlurality_validatePluralityCode(plurality, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlurality_validatePluralityValue(plurality, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePluralityTemplateId constraint of '<em>Plurality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlurality_validatePluralityTemplateId(Plurality plurality, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return plurality.validatePluralityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePluralityClassCode constraint of '<em>Plurality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlurality_validatePluralityClassCode(Plurality plurality, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return plurality.validatePluralityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePluralityMoodCode constraint of '<em>Plurality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlurality_validatePluralityMoodCode(Plurality plurality, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return plurality.validatePluralityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePluralityCodeP constraint of '<em>Plurality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlurality_validatePluralityCodeP(Plurality plurality, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return plurality.validatePluralityCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePluralityCode constraint of '<em>Plurality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlurality_validatePluralityCode(Plurality plurality, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return plurality.validatePluralityCode(diagnostics, context);
	}

	/**
	 * Validates the validatePluralityValue constraint of '<em>Plurality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlurality_validatePluralityValue(Plurality plurality, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return plurality.validatePluralityValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentsSection(AssessmentsSection assessmentsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessmentsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(assessmentsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentsSection_validateAssessmentsSectionTemplateId(
				assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentsSection_validateAssessmentsSectionClassCode(
				assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentsSection_validateAssessmentsSectionMoodCode(
				assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentsSection_validateAssessmentsSectionCode(
				assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentsSection_validateAssessmentsSectionCodeP(
				assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentsSection_validateAssessmentsSectionText(
				assessmentsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentsSection_validateAssessmentsSectionAssessmentObservation(
				assessmentsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAssessmentsSectionTemplateId constraint of '<em>Assessments Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentsSection_validateAssessmentsSectionTemplateId(
			AssessmentsSection assessmentsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentsSection.validateAssessmentsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentsSectionClassCode constraint of '<em>Assessments Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentsSection_validateAssessmentsSectionClassCode(
			AssessmentsSection assessmentsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentsSection.validateAssessmentsSectionClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentsSectionMoodCode constraint of '<em>Assessments Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentsSection_validateAssessmentsSectionMoodCode(AssessmentsSection assessmentsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentsSection.validateAssessmentsSectionMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentsSectionCode constraint of '<em>Assessments Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentsSection_validateAssessmentsSectionCode(AssessmentsSection assessmentsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentsSection.validateAssessmentsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentsSectionCodeP constraint of '<em>Assessments Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentsSection_validateAssessmentsSectionCodeP(AssessmentsSection assessmentsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentsSection.validateAssessmentsSectionCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentsSectionText constraint of '<em>Assessments Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentsSection_validateAssessmentsSectionText(AssessmentsSection assessmentsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentsSection.validateAssessmentsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentsSectionAssessmentObservation constraint of '<em>Assessments Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentsSection_validateAssessmentsSectionAssessmentObservation(
			AssessmentsSection assessmentsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentsSection.validateAssessmentsSectionAssessmentObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservation(AssessmentObservation assessmentObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessmentObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(assessmentObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(assessmentObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(assessmentObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(assessmentObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(assessmentObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(assessmentObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(assessmentObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(assessmentObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentObservation_validateAssessmentObservationTemplateId(
				assessmentObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentObservation_validateAssessmentObservationClassCode(
				assessmentObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentObservation_validateAssessmentObservationMoodCode(
				assessmentObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentObservation_validateAssessmentObservationCodeP(
				assessmentObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentObservation_validateAssessmentObservationCode(
				assessmentObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentObservation_validateAssessmentObservationValue(
				assessmentObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAssessmentObservationTemplateId constraint of '<em>Assessment Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservation_validateAssessmentObservationTemplateId(
			AssessmentObservation assessmentObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentObservation.validateAssessmentObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentObservationClassCode constraint of '<em>Assessment Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservation_validateAssessmentObservationClassCode(
			AssessmentObservation assessmentObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentObservation.validateAssessmentObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentObservationMoodCode constraint of '<em>Assessment Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservation_validateAssessmentObservationMoodCode(
			AssessmentObservation assessmentObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentObservation.validateAssessmentObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentObservationCodeP constraint of '<em>Assessment Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservation_validateAssessmentObservationCodeP(
			AssessmentObservation assessmentObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentObservation.validateAssessmentObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentObservationCode constraint of '<em>Assessment Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservation_validateAssessmentObservationCode(
			AssessmentObservation assessmentObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentObservation.validateAssessmentObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentObservationValue constraint of '<em>Assessment Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservation_validateAssessmentObservationValue(
			AssessmentObservation assessmentObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentObservation.validateAssessmentObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySection(LaborandDeliverySection laborandDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(laborandDeliverySection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(laborandDeliverySection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliverySection_validateLaborandDeliverySectionTemplateId(
				laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliverySection_validateLaborandDeliverySectionClassCode(
				laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliverySection_validateLaborandDeliverySectionMoodCode(
				laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliverySection_validateLaborandDeliverySectionCode(
				laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliverySection_validateLaborandDeliverySectionText(
				laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliverySection_validateLaborandDeliverySectionLaborAndDeliveryProcess(
				laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliverySection_validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(
				laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliverySection_validateLaborandDeliverySectionLaborOnsets(
				laborandDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliverySection_validateLaborandDeliverySectionMothersVitalSignsSection(
				laborandDeliverySection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateLaborandDeliverySectionTemplateId constraint of '<em>Laborand Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionTemplateId(
			LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliverySection.validateLaborandDeliverySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliverySectionClassCode constraint of '<em>Laborand Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionClassCode(
			LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliverySection.validateLaborandDeliverySectionClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliverySectionMoodCode constraint of '<em>Laborand Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionMoodCode(
			LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliverySection.validateLaborandDeliverySectionMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliverySectionCode constraint of '<em>Laborand Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionCode(
			LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliverySection.validateLaborandDeliverySectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliverySectionText constraint of '<em>Laborand Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionText(
			LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliverySection.validateLaborandDeliverySectionText(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliverySectionLaborAndDeliveryProcess constraint of '<em>Laborand Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionLaborAndDeliveryProcess(
			LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliverySection.validateLaborandDeliverySectionLaborAndDeliveryProcess(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliverySectionLaborAndDeliveryProceduresSection constraint of '<em>Laborand Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(
			LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliverySection.validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(
			diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliverySectionLaborOnsets constraint of '<em>Laborand Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionLaborOnsets(
			LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliverySection.validateLaborandDeliverySectionLaborOnsets(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliverySectionMothersVitalSignsSection constraint of '<em>Laborand Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySection_validateLaborandDeliverySectionMothersVitalSignsSection(
			LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliverySection.validateLaborandDeliverySectionMothersVitalSignsSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess(LaborandDeliveryProcess laborandDeliveryProcess,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(laborandDeliveryProcess, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(laborandDeliveryProcess, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessTemplateId(
				laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessClassCode(
				laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessMoodCode(
				laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessCodeP(
				laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessCode(
				laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessAttendantParticipation(
				laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessEntryRelationship(
				laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(
				laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessHomeBirthPlan(
				laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessMaternalTransfer(
				laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessParticipatingLocation(
				laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessMaternalMorbidities(
				laborandDeliveryProcess, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcess_validateLaborandDeliveryProcessRiskFactors(
				laborandDeliveryProcess, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateLaborandDeliveryProcessTemplateId constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessTemplateId(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcessClassCode constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessClassCode(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcessMoodCode constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessMoodCode(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcessCodeP constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessCodeP(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcessCode constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessCode(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessCode(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcessAttendantParticipation constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessAttendantParticipation(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessAttendantParticipation(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcessEntryRelationship constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessEntryRelationship(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessEntryRelationship(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(
			diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcessHomeBirthPlan constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessHomeBirthPlan(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessHomeBirthPlan(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcessMaternalTransfer constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessMaternalTransfer(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessMaternalTransfer(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcessParticipatingLocation constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessParticipatingLocation(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessParticipatingLocation(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcessMaternalMorbidities constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessMaternalMorbidities(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessMaternalMorbidities(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcessRiskFactors constraint of '<em>Laborand Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcess_validateLaborandDeliveryProcessRiskFactors(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laborandDeliveryProcess.validateLaborandDeliveryProcessRiskFactors(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDelivery(
			CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(characteristicofLaborandDelivery, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(characteristicofLaborandDelivery, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryTemplateId(
				characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryClassCode(
				characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryMoodCode(
				characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryCodeP(
				characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryCode(
				characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryCodeVS(
				characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryValue(
				characteristicofLaborandDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryValueP(
				characteristicofLaborandDelivery, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateCharacteristicofLaborandDeliveryTemplateId constraint of '<em>Characteristicof Laborand Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryTemplateId(
			CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return characteristicofLaborandDelivery.validateCharacteristicofLaborandDeliveryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCharacteristicofLaborandDeliveryClassCode constraint of '<em>Characteristicof Laborand Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryClassCode(
			CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return characteristicofLaborandDelivery.validateCharacteristicofLaborandDeliveryClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateCharacteristicofLaborandDeliveryMoodCode constraint of '<em>Characteristicof Laborand Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryMoodCode(
			CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return characteristicofLaborandDelivery.validateCharacteristicofLaborandDeliveryMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateCharacteristicofLaborandDeliveryCodeP constraint of '<em>Characteristicof Laborand Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryCodeP(
			CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return characteristicofLaborandDelivery.validateCharacteristicofLaborandDeliveryCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateCharacteristicofLaborandDeliveryCode constraint of '<em>Characteristicof Laborand Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryCode(
			CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return characteristicofLaborandDelivery.validateCharacteristicofLaborandDeliveryCode(diagnostics, context);
	}

	/**
	 * Validates the validateCharacteristicofLaborandDeliveryCodeVS constraint of '<em>Characteristicof Laborand Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryCodeVS(
			CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return characteristicofLaborandDelivery.validateCharacteristicofLaborandDeliveryCodeVS(diagnostics, context);
	}

	/**
	 * Validates the validateCharacteristicofLaborandDeliveryValue constraint of '<em>Characteristicof Laborand Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryValue(
			CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return characteristicofLaborandDelivery.validateCharacteristicofLaborandDeliveryValue(diagnostics, context);
	}

	/**
	 * Validates the validateCharacteristicofLaborandDeliveryValueP constraint of '<em>Characteristicof Laborand Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDelivery_validateCharacteristicofLaborandDeliveryValueP(
			CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return characteristicofLaborandDelivery.validateCharacteristicofLaborandDeliveryValueP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedHomeBirth(PlannedHomeBirth plannedHomeBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(plannedHomeBirth, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(plannedHomeBirth, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(plannedHomeBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(plannedHomeBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(plannedHomeBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(plannedHomeBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(plannedHomeBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(plannedHomeBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(plannedHomeBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlannedHomeBirth_validatePlannedHomeBirthTemplateId(
				plannedHomeBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlannedHomeBirth_validatePlannedHomeBirthClassCode(plannedHomeBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlannedHomeBirth_validatePlannedHomeBirthMoodCode(plannedHomeBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlannedHomeBirth_validatePlannedHomeBirthCodeP(plannedHomeBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlannedHomeBirth_validatePlannedHomeBirthCode(plannedHomeBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlannedHomeBirth_validatePlannedHomeBirthValue(plannedHomeBirth, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePlannedHomeBirthTemplateId constraint of '<em>Planned Home Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedHomeBirth_validatePlannedHomeBirthTemplateId(PlannedHomeBirth plannedHomeBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return plannedHomeBirth.validatePlannedHomeBirthTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlannedHomeBirthClassCode constraint of '<em>Planned Home Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedHomeBirth_validatePlannedHomeBirthClassCode(PlannedHomeBirth plannedHomeBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return plannedHomeBirth.validatePlannedHomeBirthClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePlannedHomeBirthMoodCode constraint of '<em>Planned Home Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedHomeBirth_validatePlannedHomeBirthMoodCode(PlannedHomeBirth plannedHomeBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return plannedHomeBirth.validatePlannedHomeBirthMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePlannedHomeBirthCodeP constraint of '<em>Planned Home Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedHomeBirth_validatePlannedHomeBirthCodeP(PlannedHomeBirth plannedHomeBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return plannedHomeBirth.validatePlannedHomeBirthCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePlannedHomeBirthCode constraint of '<em>Planned Home Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedHomeBirth_validatePlannedHomeBirthCode(PlannedHomeBirth plannedHomeBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return plannedHomeBirth.validatePlannedHomeBirthCode(diagnostics, context);
	}

	/**
	 * Validates the validatePlannedHomeBirthValue constraint of '<em>Planned Home Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedHomeBirth_validatePlannedHomeBirthValue(PlannedHomeBirth plannedHomeBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return plannedHomeBirth.validatePlannedHomeBirthValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalTransfer(MaternalTransfer maternalTransfer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(maternalTransfer, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(maternalTransfer, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalTransfer_validateMaternalTransferTemplateId(
				maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalTransfer_validateMaternalTransferClassCode(maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalTransfer_validateMaternalTransferMoodCode(maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalTransfer_validateMaternalTransferCodeP(maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalTransfer_validateMaternalTransferCode(maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalTransfer_validateMaternalTransferValue(maternalTransfer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalTransfer_validateMaternalTransferParticipant(
				maternalTransfer, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMaternalTransferTemplateId constraint of '<em>Maternal Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalTransfer_validateMaternalTransferTemplateId(MaternalTransfer maternalTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalTransfer.validateMaternalTransferTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalTransferClassCode constraint of '<em>Maternal Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalTransfer_validateMaternalTransferClassCode(MaternalTransfer maternalTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalTransfer.validateMaternalTransferClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalTransferMoodCode constraint of '<em>Maternal Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalTransfer_validateMaternalTransferMoodCode(MaternalTransfer maternalTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalTransfer.validateMaternalTransferMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalTransferCodeP constraint of '<em>Maternal Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalTransfer_validateMaternalTransferCodeP(MaternalTransfer maternalTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalTransfer.validateMaternalTransferCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalTransferCode constraint of '<em>Maternal Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalTransfer_validateMaternalTransferCode(MaternalTransfer maternalTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalTransfer.validateMaternalTransferCode(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalTransferValue constraint of '<em>Maternal Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalTransfer_validateMaternalTransferValue(MaternalTransfer maternalTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalTransfer.validateMaternalTransferValue(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalTransferParticipant constraint of '<em>Maternal Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalTransfer_validateMaternalTransferParticipant(MaternalTransfer maternalTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalTransfer.validateMaternalTransferParticipant(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidity(MaternalMorbidity maternalMorbidity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(maternalMorbidity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(maternalMorbidity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalMorbidity_validateMaternalMorbidityTemplateId(
				maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalMorbidity_validateMaternalMorbidityClassCode(
				maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalMorbidity_validateMaternalMorbidityMoodCode(
				maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalMorbidity_validateMaternalMorbidityCodeP(maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalMorbidity_validateMaternalMorbidityCode(maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalMorbidity_validateMaternalMorbidityCodeVS(maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalMorbidity_validateMaternalMorbidityValue(maternalMorbidity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaternalMorbidity_validateMaternalMorbidityValueP(maternalMorbidity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMaternalMorbidityTemplateId constraint of '<em>Maternal Morbidity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidity_validateMaternalMorbidityTemplateId(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalMorbidity.validateMaternalMorbidityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalMorbidityClassCode constraint of '<em>Maternal Morbidity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidity_validateMaternalMorbidityClassCode(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalMorbidity.validateMaternalMorbidityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalMorbidityMoodCode constraint of '<em>Maternal Morbidity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidity_validateMaternalMorbidityMoodCode(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalMorbidity.validateMaternalMorbidityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalMorbidityCodeP constraint of '<em>Maternal Morbidity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidity_validateMaternalMorbidityCodeP(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalMorbidity.validateMaternalMorbidityCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalMorbidityCode constraint of '<em>Maternal Morbidity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidity_validateMaternalMorbidityCode(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalMorbidity.validateMaternalMorbidityCode(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalMorbidityCodeVS constraint of '<em>Maternal Morbidity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidity_validateMaternalMorbidityCodeVS(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalMorbidity.validateMaternalMorbidityCodeVS(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalMorbidityValue constraint of '<em>Maternal Morbidity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidity_validateMaternalMorbidityValue(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalMorbidity.validateMaternalMorbidityValue(diagnostics, context);
	}

	/**
	 * Validates the validateMaternalMorbidityValueP constraint of '<em>Maternal Morbidity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidity_validateMaternalMorbidityValueP(MaternalMorbidity maternalMorbidity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maternalMorbidity.validateMaternalMorbidityValueP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactor(PregnancyRiskFactor pregnancyRiskFactor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pregnancyRiskFactor, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(pregnancyRiskFactor, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePregnancyRiskFactor_validatePregnancyRiskFactorTemplateId(
				pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePregnancyRiskFactor_validatePregnancyRiskFactorClassCode(
				pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePregnancyRiskFactor_validatePregnancyRiskFactorMoodCode(
				pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePregnancyRiskFactor_validatePregnancyRiskFactorCodeP(
				pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePregnancyRiskFactor_validatePregnancyRiskFactorCode(
				pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePregnancyRiskFactor_validatePregnancyRiskFactorCodeVS(
				pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePregnancyRiskFactor_validatePregnancyRiskFactorValue(
				pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePregnancyRiskFactor_validatePregnancyRiskFactorValueP(
				pregnancyRiskFactor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePregnancyRiskFactor_validatePregnancyRiskFactorEntryRelationship(
				pregnancyRiskFactor, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePregnancyRiskFactorTemplateId constraint of '<em>Pregnancy Risk Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactor_validatePregnancyRiskFactorTemplateId(
			PregnancyRiskFactor pregnancyRiskFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyRiskFactor.validatePregnancyRiskFactorTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyRiskFactorClassCode constraint of '<em>Pregnancy Risk Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactor_validatePregnancyRiskFactorClassCode(
			PregnancyRiskFactor pregnancyRiskFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyRiskFactor.validatePregnancyRiskFactorClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyRiskFactorMoodCode constraint of '<em>Pregnancy Risk Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactor_validatePregnancyRiskFactorMoodCode(
			PregnancyRiskFactor pregnancyRiskFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyRiskFactor.validatePregnancyRiskFactorMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyRiskFactorCodeP constraint of '<em>Pregnancy Risk Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactor_validatePregnancyRiskFactorCodeP(
			PregnancyRiskFactor pregnancyRiskFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyRiskFactor.validatePregnancyRiskFactorCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyRiskFactorCode constraint of '<em>Pregnancy Risk Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactor_validatePregnancyRiskFactorCode(PregnancyRiskFactor pregnancyRiskFactor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyRiskFactor.validatePregnancyRiskFactorCode(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyRiskFactorCodeVS constraint of '<em>Pregnancy Risk Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactor_validatePregnancyRiskFactorCodeVS(
			PregnancyRiskFactor pregnancyRiskFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyRiskFactor.validatePregnancyRiskFactorCodeVS(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyRiskFactorValue constraint of '<em>Pregnancy Risk Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactor_validatePregnancyRiskFactorValue(
			PregnancyRiskFactor pregnancyRiskFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyRiskFactor.validatePregnancyRiskFactorValue(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyRiskFactorValueP constraint of '<em>Pregnancy Risk Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactor_validatePregnancyRiskFactorValueP(
			PregnancyRiskFactor pregnancyRiskFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyRiskFactor.validatePregnancyRiskFactorValueP(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyRiskFactorEntryRelationship constraint of '<em>Pregnancy Risk Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactor_validatePregnancyRiskFactorEntryRelationship(
			PregnancyRiskFactor pregnancyRiskFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyRiskFactor.validatePregnancyRiskFactorEntryRelationship(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSection(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(laborandDeliveryProcedureSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(laborandDeliveryProcedureSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(
				laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(
				laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionTemplateId(
				laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionClassCode(
				laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionMoodCode(
				laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionCode(
				laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionCodeP(
				laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionText(
				laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionObstetricProcedure(
				laborandDeliveryProcedureSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionMethodOfDelivery(
				laborandDeliveryProcedureSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateLaborandDeliveryProcedureSectionTemplateId constraint of '<em>Laborand Delivery Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionTemplateId(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return laborandDeliveryProcedureSection.validateLaborandDeliveryProcedureSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcedureSectionClassCode constraint of '<em>Laborand Delivery Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionClassCode(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return laborandDeliveryProcedureSection.validateLaborandDeliveryProcedureSectionClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcedureSectionMoodCode constraint of '<em>Laborand Delivery Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionMoodCode(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return laborandDeliveryProcedureSection.validateLaborandDeliveryProcedureSectionMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcedureSectionCode constraint of '<em>Laborand Delivery Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionCode(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return laborandDeliveryProcedureSection.validateLaborandDeliveryProcedureSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcedureSectionCodeP constraint of '<em>Laborand Delivery Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionCodeP(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return laborandDeliveryProcedureSection.validateLaborandDeliveryProcedureSectionCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcedureSectionText constraint of '<em>Laborand Delivery Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionText(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return laborandDeliveryProcedureSection.validateLaborandDeliveryProcedureSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcedureSectionObstetricProcedure constraint of '<em>Laborand Delivery Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionObstetricProcedure(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return laborandDeliveryProcedureSection.validateLaborandDeliveryProcedureSectionObstetricProcedure(
			diagnostics, context);
	}

	/**
	 * Validates the validateLaborandDeliveryProcedureSectionMethodOfDelivery constraint of '<em>Laborand Delivery Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSection_validateLaborandDeliveryProcedureSectionMethodOfDelivery(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return laborandDeliveryProcedureSection.validateLaborandDeliveryProcedureSectionMethodOfDelivery(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedure(ObstetricProcedure obstetricProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(obstetricProcedure, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(obstetricProcedure, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(obstetricProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(obstetricProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(obstetricProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(obstetricProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(obstetricProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(obstetricProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(obstetricProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateObstetricProcedure_validateObstetricProcedureTemplateId(
				obstetricProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateObstetricProcedure_validateObstetricProcedureClassCode(
				obstetricProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateObstetricProcedure_validateObstetricProcedureMoodCode(
				obstetricProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateObstetricProcedure_validateObstetricProcedureNegationInd(
				obstetricProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateObstetricProcedure_validateObstetricProcedureCode(
				obstetricProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateObstetricProcedure_validateObstetricProcedureCodeP(
				obstetricProcedure, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateObstetricProcedureTemplateId constraint of '<em>Obstetric Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedure_validateObstetricProcedureTemplateId(
			ObstetricProcedure obstetricProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return obstetricProcedure.validateObstetricProcedureTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateObstetricProcedureClassCode constraint of '<em>Obstetric Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedure_validateObstetricProcedureClassCode(
			ObstetricProcedure obstetricProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return obstetricProcedure.validateObstetricProcedureClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateObstetricProcedureMoodCode constraint of '<em>Obstetric Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedure_validateObstetricProcedureMoodCode(ObstetricProcedure obstetricProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return obstetricProcedure.validateObstetricProcedureMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateObstetricProcedureNegationInd constraint of '<em>Obstetric Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedure_validateObstetricProcedureNegationInd(
			ObstetricProcedure obstetricProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return obstetricProcedure.validateObstetricProcedureNegationInd(diagnostics, context);
	}

	/**
	 * Validates the validateObstetricProcedureCode constraint of '<em>Obstetric Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedure_validateObstetricProcedureCode(ObstetricProcedure obstetricProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return obstetricProcedure.validateObstetricProcedureCode(diagnostics, context);
	}

	/**
	 * Validates the validateObstetricProcedureCodeP constraint of '<em>Obstetric Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedure_validateObstetricProcedureCodeP(ObstetricProcedure obstetricProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return obstetricProcedure.validateObstetricProcedureCodeP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDelivery(MethodofDelivery methodofDelivery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(methodofDelivery, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(methodofDelivery, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMethodofDelivery_validateMethodofDeliveryTemplateId(
				methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMethodofDelivery_validateMethodofDeliveryClassCode(methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMethodofDelivery_validateMethodofDeliveryMoodCode(methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMethodofDelivery_validateMethodofDeliveryCode(methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMethodofDelivery_validateMethodofDeliveryCodeP(methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMethodofDelivery_validateMethodofDeliveryFinalRouteAndMethod(
				methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMethodofDelivery_validateMethodofDeliveryFetalPresentation(
				methodofDelivery, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMethodofDelivery_validateMethodofDeliveryHysterotomyHysterectomyAssociation(
				methodofDelivery, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMethodofDeliveryTemplateId constraint of '<em>Methodof Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDelivery_validateMethodofDeliveryTemplateId(MethodofDelivery methodofDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return methodofDelivery.validateMethodofDeliveryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMethodofDeliveryClassCode constraint of '<em>Methodof Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDelivery_validateMethodofDeliveryClassCode(MethodofDelivery methodofDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return methodofDelivery.validateMethodofDeliveryClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMethodofDeliveryMoodCode constraint of '<em>Methodof Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDelivery_validateMethodofDeliveryMoodCode(MethodofDelivery methodofDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return methodofDelivery.validateMethodofDeliveryMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMethodofDeliveryCode constraint of '<em>Methodof Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDelivery_validateMethodofDeliveryCode(MethodofDelivery methodofDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return methodofDelivery.validateMethodofDeliveryCode(diagnostics, context);
	}

	/**
	 * Validates the validateMethodofDeliveryCodeP constraint of '<em>Methodof Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDelivery_validateMethodofDeliveryCodeP(MethodofDelivery methodofDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return methodofDelivery.validateMethodofDeliveryCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateMethodofDeliveryFinalRouteAndMethod constraint of '<em>Methodof Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDelivery_validateMethodofDeliveryFinalRouteAndMethod(
			MethodofDelivery methodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return methodofDelivery.validateMethodofDeliveryFinalRouteAndMethod(diagnostics, context);
	}

	/**
	 * Validates the validateMethodofDeliveryFetalPresentation constraint of '<em>Methodof Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDelivery_validateMethodofDeliveryFetalPresentation(
			MethodofDelivery methodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return methodofDelivery.validateMethodofDeliveryFetalPresentation(diagnostics, context);
	}

	/**
	 * Validates the validateMethodofDeliveryHysterotomyHysterectomyAssociation constraint of '<em>Methodof Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDelivery_validateMethodofDeliveryHysterotomyHysterectomyAssociation(
			MethodofDelivery methodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return methodofDelivery.validateMethodofDeliveryHysterotomyHysterectomyAssociation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLabor(OnsetofLabor onsetofLabor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(onsetofLabor, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(onsetofLabor, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOnsetofLabor_validateOnsetofLaborTemplateId(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOnsetofLabor_validateOnsetofLaborClassCode(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOnsetofLabor_validateOnsetofLaborMoodCode(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOnsetofLabor_validateOnsetofLaborCodeP(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOnsetofLabor_validateOnsetofLaborCode(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOnsetofLabor_validateOnsetofLaborCodeVS(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOnsetofLabor_validateOnsetofLaborValue(onsetofLabor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOnsetofLabor_validateOnsetofLaborValueP(onsetofLabor, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateOnsetofLaborTemplateId constraint of '<em>Onsetof Labor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLabor_validateOnsetofLaborTemplateId(OnsetofLabor onsetofLabor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return onsetofLabor.validateOnsetofLaborTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateOnsetofLaborClassCode constraint of '<em>Onsetof Labor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLabor_validateOnsetofLaborClassCode(OnsetofLabor onsetofLabor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return onsetofLabor.validateOnsetofLaborClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateOnsetofLaborMoodCode constraint of '<em>Onsetof Labor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLabor_validateOnsetofLaborMoodCode(OnsetofLabor onsetofLabor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return onsetofLabor.validateOnsetofLaborMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateOnsetofLaborCodeP constraint of '<em>Onsetof Labor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLabor_validateOnsetofLaborCodeP(OnsetofLabor onsetofLabor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return onsetofLabor.validateOnsetofLaborCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateOnsetofLaborCode constraint of '<em>Onsetof Labor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLabor_validateOnsetofLaborCode(OnsetofLabor onsetofLabor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return onsetofLabor.validateOnsetofLaborCode(diagnostics, context);
	}

	/**
	 * Validates the validateOnsetofLaborCodeVS constraint of '<em>Onsetof Labor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLabor_validateOnsetofLaborCodeVS(OnsetofLabor onsetofLabor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return onsetofLabor.validateOnsetofLaborCodeVS(diagnostics, context);
	}

	/**
	 * Validates the validateOnsetofLaborValue constraint of '<em>Onsetof Labor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLabor_validateOnsetofLaborValue(OnsetofLabor onsetofLabor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return onsetofLabor.validateOnsetofLaborValue(diagnostics, context);
	}

	/**
	 * Validates the validateOnsetofLaborValueP constraint of '<em>Onsetof Labor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLabor_validateOnsetofLaborValueP(OnsetofLabor onsetofLabor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return onsetofLabor.validateOnsetofLaborValueP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSection(MothersVitalSignsSection mothersVitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mothersVitalSignsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(mothersVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsSection_validateMothersVitalSignsSectionTemplateId(
				mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsSection_validateMothersVitalSignsSectionClassCode(
				mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsSection_validateMothersVitalSignsSectionMoodCode(
				mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsSection_validateMothersVitalSignsSectionCode(
				mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsSection_validateMothersVitalSignsSectionCodeP(
				mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsSection_validateMothersVitalSignsSectionText(
				mothersVitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsSection_validateMothersVitalSignsSectionMothersVitalSignsObservation(
				mothersVitalSignsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMothersVitalSignsSectionTemplateId constraint of '<em>Mothers Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSection_validateMothersVitalSignsSectionTemplateId(
			MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mothersVitalSignsSection.validateMothersVitalSignsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMothersVitalSignsSectionClassCode constraint of '<em>Mothers Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSection_validateMothersVitalSignsSectionClassCode(
			MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mothersVitalSignsSection.validateMothersVitalSignsSectionClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMothersVitalSignsSectionMoodCode constraint of '<em>Mothers Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSection_validateMothersVitalSignsSectionMoodCode(
			MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mothersVitalSignsSection.validateMothersVitalSignsSectionMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMothersVitalSignsSectionCode constraint of '<em>Mothers Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSection_validateMothersVitalSignsSectionCode(
			MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mothersVitalSignsSection.validateMothersVitalSignsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateMothersVitalSignsSectionCodeP constraint of '<em>Mothers Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSection_validateMothersVitalSignsSectionCodeP(
			MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mothersVitalSignsSection.validateMothersVitalSignsSectionCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateMothersVitalSignsSectionText constraint of '<em>Mothers Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSection_validateMothersVitalSignsSectionText(
			MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mothersVitalSignsSection.validateMothersVitalSignsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateMothersVitalSignsSectionMothersVitalSignsObservation constraint of '<em>Mothers Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSection_validateMothersVitalSignsSectionMothersVitalSignsObservation(
			MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mothersVitalSignsSection.validateMothersVitalSignsSectionMothersVitalSignsObservation(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservation(MothersVitalSignsObservation mothersVitalSignsObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mothersVitalSignsObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(mothersVitalSignsObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(mothersVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(mothersVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(mothersVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(mothersVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(mothersVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(mothersVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(mothersVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsObservation_validateMothersVitalSignsObservationTemplateId(
				mothersVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsObservation_validateMothersVitalSignsObservationClassCode(
				mothersVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsObservation_validateMothersVitalSignsObservationMoodCode(
				mothersVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsObservation_validateMothersVitalSignsObservationCodeP(
				mothersVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsObservation_validateMothersVitalSignsObservationCode(
				mothersVitalSignsObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMothersVitalSignsObservation_validateMothersVitalSignsObservationValue(
				mothersVitalSignsObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMothersVitalSignsObservationTemplateId constraint of '<em>Mothers Vital Signs Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservation_validateMothersVitalSignsObservationTemplateId(
			MothersVitalSignsObservation mothersVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return mothersVitalSignsObservation.validateMothersVitalSignsObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMothersVitalSignsObservationClassCode constraint of '<em>Mothers Vital Signs Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservation_validateMothersVitalSignsObservationClassCode(
			MothersVitalSignsObservation mothersVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return mothersVitalSignsObservation.validateMothersVitalSignsObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMothersVitalSignsObservationMoodCode constraint of '<em>Mothers Vital Signs Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservation_validateMothersVitalSignsObservationMoodCode(
			MothersVitalSignsObservation mothersVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return mothersVitalSignsObservation.validateMothersVitalSignsObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMothersVitalSignsObservationCodeP constraint of '<em>Mothers Vital Signs Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservation_validateMothersVitalSignsObservationCodeP(
			MothersVitalSignsObservation mothersVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return mothersVitalSignsObservation.validateMothersVitalSignsObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateMothersVitalSignsObservationCode constraint of '<em>Mothers Vital Signs Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservation_validateMothersVitalSignsObservationCode(
			MothersVitalSignsObservation mothersVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return mothersVitalSignsObservation.validateMothersVitalSignsObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateMothersVitalSignsObservationValue constraint of '<em>Mothers Vital Signs Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservation_validateMothersVitalSignsObservationValue(
			MothersVitalSignsObservation mothersVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return mothersVitalSignsObservation.validateMothersVitalSignsObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionLiveBirthSection(
			HistoryofInfectionLiveBirthSection historyofInfectionLiveBirthSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(historyofInfectionLiveBirthSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(historyofInfectionLiveBirthSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(historyofInfectionLiveBirthSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(historyofInfectionLiveBirthSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				historyofInfectionLiveBirthSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(historyofInfectionLiveBirthSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(historyofInfectionLiveBirthSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(historyofInfectionLiveBirthSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(historyofInfectionLiveBirthSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(
				historyofInfectionLiveBirthSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(
				historyofInfectionLiveBirthSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHistoryofInfectionLiveBirthSection_validateHistoryofInfectionLiveBirthSectionTemplateId(
				historyofInfectionLiveBirthSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHistoryofInfectionLiveBirthSection_validateHistoryofInfectionLiveBirthSectionCode(
				historyofInfectionLiveBirthSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHistoryofInfectionLiveBirthSection_validateHistoryofInfectionLiveBirthSectionText(
				historyofInfectionLiveBirthSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHistoryofInfectionLiveBirthSection_validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(
				historyofInfectionLiveBirthSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHistoryofInfectionLiveBirthSectionTemplateId constraint of '<em>Historyof Infection Live Birth Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionLiveBirthSection_validateHistoryofInfectionLiveBirthSectionTemplateId(
			HistoryofInfectionLiveBirthSection historyofInfectionLiveBirthSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return historyofInfectionLiveBirthSection.validateHistoryofInfectionLiveBirthSectionTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateHistoryofInfectionLiveBirthSectionCode constraint of '<em>Historyof Infection Live Birth Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionLiveBirthSection_validateHistoryofInfectionLiveBirthSectionCode(
			HistoryofInfectionLiveBirthSection historyofInfectionLiveBirthSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return historyofInfectionLiveBirthSection.validateHistoryofInfectionLiveBirthSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryofInfectionLiveBirthSectionText constraint of '<em>Historyof Infection Live Birth Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionLiveBirthSection_validateHistoryofInfectionLiveBirthSectionText(
			HistoryofInfectionLiveBirthSection historyofInfectionLiveBirthSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return historyofInfectionLiveBirthSection.validateHistoryofInfectionLiveBirthSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth constraint of '<em>Historyof Infection Live Birth Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionLiveBirthSection_validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(
			HistoryofInfectionLiveBirthSection historyofInfectionLiveBirthSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return historyofInfectionLiveBirthSection.validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirth(InfectionPresentLiveBirth infectionPresentLiveBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infectionPresentLiveBirth, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(infectionPresentLiveBirth, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthTemplateId(
				infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthClassCode(
				infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthMoodCode(
				infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthCodeP(
				infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthCode(
				infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthCodeVS(
				infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthValue(
				infectionPresentLiveBirth, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthValueP(
				infectionPresentLiveBirth, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateInfectionPresentLiveBirthTemplateId constraint of '<em>Infection Present Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthTemplateId(
			InfectionPresentLiveBirth infectionPresentLiveBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentLiveBirth.validateInfectionPresentLiveBirthTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentLiveBirthClassCode constraint of '<em>Infection Present Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthClassCode(
			InfectionPresentLiveBirth infectionPresentLiveBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentLiveBirth.validateInfectionPresentLiveBirthClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentLiveBirthMoodCode constraint of '<em>Infection Present Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthMoodCode(
			InfectionPresentLiveBirth infectionPresentLiveBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentLiveBirth.validateInfectionPresentLiveBirthMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentLiveBirthCodeP constraint of '<em>Infection Present Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthCodeP(
			InfectionPresentLiveBirth infectionPresentLiveBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentLiveBirth.validateInfectionPresentLiveBirthCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentLiveBirthCode constraint of '<em>Infection Present Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthCode(
			InfectionPresentLiveBirth infectionPresentLiveBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentLiveBirth.validateInfectionPresentLiveBirthCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentLiveBirthCodeVS constraint of '<em>Infection Present Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthCodeVS(
			InfectionPresentLiveBirth infectionPresentLiveBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentLiveBirth.validateInfectionPresentLiveBirthCodeVS(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentLiveBirthValue constraint of '<em>Infection Present Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthValue(
			InfectionPresentLiveBirth infectionPresentLiveBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentLiveBirth.validateInfectionPresentLiveBirthValue(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentLiveBirthValueP constraint of '<em>Infection Present Live Birth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirth_validateInfectionPresentLiveBirthValueP(
			InfectionPresentLiveBirth infectionPresentLiveBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentLiveBirth.validateInfectionPresentLiveBirthValueP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection(FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fetalDeliverySection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(fetalDeliverySection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionTemplateId(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionClassCode(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionMoodCode(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionCode(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionText(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionBirthOrder(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionNumberOfInfantsBornAlive(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionAutopsyPerformance(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionFetalDeathOccurrance(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionPlurality(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionCongenitalAnomaly(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliveryTime(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubject(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectTypeCode(
				fetalDeliverySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(
				fetalDeliverySection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFetalDeliverySectionTemplateId constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionTemplateId(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionClassCode constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionClassCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionMoodCode constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionMoodCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionCode constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionText constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionText(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionText(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionBirthOrder constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionBirthOrder(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionBirthOrder(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionNumberOfInfantsBornAlive constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionNumberOfInfantsBornAlive(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionNumberOfInfantsBornAlive(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionAutopsyPerformance constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionAutopsyPerformance(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionAutopsyPerformance(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionFetalDeathOccurrance constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionFetalDeathOccurrance(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionFetalDeathOccurrance(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionPlurality constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionPlurality(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionPlurality(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionCongenitalAnomaly constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionCongenitalAnomaly(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionCongenitalAnomaly(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionFetalDeliveryTime constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliveryTime(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionFetalDeliveryTime(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionFetalDeliverySubject constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubject(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionFetalDeliverySubject(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(
			diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(
			diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionFetalDeliverySubjectTypeCode constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectTypeCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionFetalDeliverySubjectTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus constraint of '<em>Fetal Delivery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliverySection_validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliverySection.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformance(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(autopsyPerformance, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(autopsyPerformance, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAutopsyPerformance_validateAutopsyPerformanceTemplateId(
				autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAutopsyPerformance_validateAutopsyPerformanceClassCode(
				autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAutopsyPerformance_validateAutopsyPerformanceMoodCode(
				autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAutopsyPerformance_validateAutopsyPerformanceCodeP(
				autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAutopsyPerformance_validateAutopsyPerformanceCode(
				autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAutopsyPerformance_validateAutopsyPerformanceValue(
				autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAutopsyPerformance_validateAutopsyPerformanceValueP(
				autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAutopsyPerformance_validateAutopsyPerformanceUseAssociation(
				autopsyPerformance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAutopsyPerformance_validateAutopsyPerformanceHistologicalExamAssociation(
				autopsyPerformance, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAutopsyPerformanceTemplateId constraint of '<em>Autopsy Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformance_validateAutopsyPerformanceTemplateId(
			AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return autopsyPerformance.validateAutopsyPerformanceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAutopsyPerformanceClassCode constraint of '<em>Autopsy Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformance_validateAutopsyPerformanceClassCode(
			AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return autopsyPerformance.validateAutopsyPerformanceClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAutopsyPerformanceMoodCode constraint of '<em>Autopsy Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformance_validateAutopsyPerformanceMoodCode(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return autopsyPerformance.validateAutopsyPerformanceMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAutopsyPerformanceCodeP constraint of '<em>Autopsy Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformance_validateAutopsyPerformanceCodeP(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return autopsyPerformance.validateAutopsyPerformanceCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateAutopsyPerformanceCode constraint of '<em>Autopsy Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformance_validateAutopsyPerformanceCode(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return autopsyPerformance.validateAutopsyPerformanceCode(diagnostics, context);
	}

	/**
	 * Validates the validateAutopsyPerformanceValue constraint of '<em>Autopsy Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformance_validateAutopsyPerformanceValue(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return autopsyPerformance.validateAutopsyPerformanceValue(diagnostics, context);
	}

	/**
	 * Validates the validateAutopsyPerformanceValueP constraint of '<em>Autopsy Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformance_validateAutopsyPerformanceValueP(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return autopsyPerformance.validateAutopsyPerformanceValueP(diagnostics, context);
	}

	/**
	 * Validates the validateAutopsyPerformanceUseAssociation constraint of '<em>Autopsy Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformance_validateAutopsyPerformanceUseAssociation(
			AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return autopsyPerformance.validateAutopsyPerformanceUseAssociation(diagnostics, context);
	}

	/**
	 * Validates the validateAutopsyPerformanceHistologicalExamAssociation constraint of '<em>Autopsy Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformance_validateAutopsyPerformanceHistologicalExamAssociation(
			AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return autopsyPerformance.validateAutopsyPerformanceHistologicalExamAssociation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurrance(FetalDeathOccurrance fetalDeathOccurrance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fetalDeathOccurrance, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(fetalDeathOccurrance, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeathOccurrance_validateFetalDeathOccurranceTemplateId(
				fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeathOccurrance_validateFetalDeathOccurranceClassCode(
				fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeathOccurrance_validateFetalDeathOccurranceMoodCode(
				fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeathOccurrance_validateFetalDeathOccurranceCodeP(
				fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeathOccurrance_validateFetalDeathOccurranceCode(
				fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeathOccurrance_validateFetalDeathOccurranceValue(
				fetalDeathOccurrance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeathOccurrance_validateFetalDeathOccurranceValueP(
				fetalDeathOccurrance, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFetalDeathOccurranceTemplateId constraint of '<em>Fetal Death Occurrance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurrance_validateFetalDeathOccurranceTemplateId(
			FetalDeathOccurrance fetalDeathOccurrance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeathOccurrance.validateFetalDeathOccurranceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeathOccurranceClassCode constraint of '<em>Fetal Death Occurrance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurrance_validateFetalDeathOccurranceClassCode(
			FetalDeathOccurrance fetalDeathOccurrance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeathOccurrance.validateFetalDeathOccurranceClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeathOccurranceMoodCode constraint of '<em>Fetal Death Occurrance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurrance_validateFetalDeathOccurranceMoodCode(
			FetalDeathOccurrance fetalDeathOccurrance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeathOccurrance.validateFetalDeathOccurranceMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeathOccurranceCodeP constraint of '<em>Fetal Death Occurrance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurrance_validateFetalDeathOccurranceCodeP(
			FetalDeathOccurrance fetalDeathOccurrance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeathOccurrance.validateFetalDeathOccurranceCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeathOccurranceCode constraint of '<em>Fetal Death Occurrance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurrance_validateFetalDeathOccurranceCode(
			FetalDeathOccurrance fetalDeathOccurrance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeathOccurrance.validateFetalDeathOccurranceCode(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeathOccurranceValue constraint of '<em>Fetal Death Occurrance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurrance_validateFetalDeathOccurranceValue(
			FetalDeathOccurrance fetalDeathOccurrance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeathOccurrance.validateFetalDeathOccurranceValue(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeathOccurranceValueP constraint of '<em>Fetal Death Occurrance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurrance_validateFetalDeathOccurranceValueP(
			FetalDeathOccurrance fetalDeathOccurrance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeathOccurrance.validateFetalDeathOccurranceValueP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliveryTime(FetalDeliveryTime fetalDeliveryTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fetalDeliveryTime, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(fetalDeliveryTime, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(fetalDeliveryTime, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(fetalDeliveryTime, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(fetalDeliveryTime, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(fetalDeliveryTime, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(fetalDeliveryTime, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(fetalDeliveryTime, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(fetalDeliveryTime, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliveryTime_validateFetalDeliveryTimeTemplateId(
				fetalDeliveryTime, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliveryTime_validateFetalDeliveryTimeMoodCode(
				fetalDeliveryTime, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliveryTime_validateFetalDeliveryTimeCodeP(fetalDeliveryTime, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliveryTime_validateFetalDeliveryTimeCode(fetalDeliveryTime, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliveryTime_validateFetalDeliveryTimeValue(fetalDeliveryTime, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFetalDeliveryTime_validateFetalDeliveryTimeParticipatingLocation(
				fetalDeliveryTime, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFetalDeliveryTimeTemplateId constraint of '<em>Fetal Delivery Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliveryTime_validateFetalDeliveryTimeTemplateId(FetalDeliveryTime fetalDeliveryTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliveryTime.validateFetalDeliveryTimeTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliveryTimeMoodCode constraint of '<em>Fetal Delivery Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliveryTime_validateFetalDeliveryTimeMoodCode(FetalDeliveryTime fetalDeliveryTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliveryTime.validateFetalDeliveryTimeMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliveryTimeCodeP constraint of '<em>Fetal Delivery Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliveryTime_validateFetalDeliveryTimeCodeP(FetalDeliveryTime fetalDeliveryTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliveryTime.validateFetalDeliveryTimeCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliveryTimeCode constraint of '<em>Fetal Delivery Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliveryTime_validateFetalDeliveryTimeCode(FetalDeliveryTime fetalDeliveryTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliveryTime.validateFetalDeliveryTimeCode(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliveryTimeValue constraint of '<em>Fetal Delivery Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliveryTime_validateFetalDeliveryTimeValue(FetalDeliveryTime fetalDeliveryTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliveryTime.validateFetalDeliveryTimeValue(diagnostics, context);
	}

	/**
	 * Validates the validateFetalDeliveryTimeParticipatingLocation constraint of '<em>Fetal Delivery Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeliveryTime_validateFetalDeliveryTimeParticipatingLocation(
			FetalDeliveryTime fetalDeliveryTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fetalDeliveryTime.validateFetalDeliveryTimeParticipatingLocation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionFetalDeathSection(
				reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(
			diagnostics, context);
	}

	/**
	 * Validates the validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionFetalDeathSection constraint of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecords_validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionFetalDeathSection(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionFetalDeathSection(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionFetalDeathSection(
			HistoryofInfectionFetalDeathSection historyofInfectionFetalDeathSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(historyofInfectionFetalDeathSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(historyofInfectionFetalDeathSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(historyofInfectionFetalDeathSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(historyofInfectionFetalDeathSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				historyofInfectionFetalDeathSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(historyofInfectionFetalDeathSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(historyofInfectionFetalDeathSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(historyofInfectionFetalDeathSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(historyofInfectionFetalDeathSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(
				historyofInfectionFetalDeathSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(
				historyofInfectionFetalDeathSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHistoryofInfectionFetalDeathSection_validateHistoryofInfectionFetalDeathSectionTemplateId(
				historyofInfectionFetalDeathSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHistoryofInfectionFetalDeathSection_validateHistoryofInfectionFetalDeathSectionCode(
				historyofInfectionFetalDeathSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHistoryofInfectionFetalDeathSection_validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(
				historyofInfectionFetalDeathSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHistoryofInfectionFetalDeathSectionTemplateId constraint of '<em>Historyof Infection Fetal Death Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionFetalDeathSection_validateHistoryofInfectionFetalDeathSectionTemplateId(
			HistoryofInfectionFetalDeathSection historyofInfectionFetalDeathSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return historyofInfectionFetalDeathSection.validateHistoryofInfectionFetalDeathSectionTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateHistoryofInfectionFetalDeathSectionCode constraint of '<em>Historyof Infection Fetal Death Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionFetalDeathSection_validateHistoryofInfectionFetalDeathSectionCode(
			HistoryofInfectionFetalDeathSection historyofInfectionFetalDeathSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return historyofInfectionFetalDeathSection.validateHistoryofInfectionFetalDeathSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath constraint of '<em>Historyof Infection Fetal Death Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionFetalDeathSection_validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(
			HistoryofInfectionFetalDeathSection historyofInfectionFetalDeathSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return historyofInfectionFetalDeathSection.validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeath(InfectionPresentFetalDeath infectionPresentFetalDeath,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infectionPresentFetalDeath, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(infectionPresentFetalDeath, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathTemplateId(
				infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathClassCode(
				infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathMoodCode(
				infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathCodeP(
				infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathCode(
				infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathCodeVS(
				infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathValue(
				infectionPresentFetalDeath, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathValueP(
				infectionPresentFetalDeath, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateInfectionPresentFetalDeathTemplateId constraint of '<em>Infection Present Fetal Death</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathTemplateId(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentFetalDeath.validateInfectionPresentFetalDeathTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentFetalDeathClassCode constraint of '<em>Infection Present Fetal Death</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathClassCode(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentFetalDeath.validateInfectionPresentFetalDeathClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentFetalDeathMoodCode constraint of '<em>Infection Present Fetal Death</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathMoodCode(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentFetalDeath.validateInfectionPresentFetalDeathMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentFetalDeathCodeP constraint of '<em>Infection Present Fetal Death</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathCodeP(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentFetalDeath.validateInfectionPresentFetalDeathCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentFetalDeathCode constraint of '<em>Infection Present Fetal Death</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathCode(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentFetalDeath.validateInfectionPresentFetalDeathCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentFetalDeathCodeVS constraint of '<em>Infection Present Fetal Death</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathCodeVS(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentFetalDeath.validateInfectionPresentFetalDeathCodeVS(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentFetalDeathValue constraint of '<em>Infection Present Fetal Death</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathValue(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentFetalDeath.validateInfectionPresentFetalDeathValue(diagnostics, context);
	}

	/**
	 * Validates the validateInfectionPresentFetalDeathValueP constraint of '<em>Infection Present Fetal Death</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeath_validateInfectionPresentFetalDeathValueP(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return infectionPresentFetalDeath.validateInfectionPresentFetalDeathValueP(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VsbrPlugin.INSTANCE;
	}

} // VsbrValidator
