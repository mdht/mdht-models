/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory
 * @model kind="package"
 * @generated
 */
public interface EmspcrPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "emspcr";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/emspcr";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "emspcr";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EmspcrPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl.init();

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.PatientCareReportImpl <em>Patient Care Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.PatientCareReportImpl
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getPatientCareReport()
   * @generated
   */
  int PATIENT_CARE_REPORT = 0;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__REALM_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__TYPE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__TEMPLATE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__TITLE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__EFFECTIVE_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__CONFIDENTIALITY_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__LANGUAGE_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Set Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__SET_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

  /**
   * The feature id for the '<em><b>Version Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__VERSION_NUMBER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

  /**
   * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__COPY_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

  /**
   * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__RECORD_TARGET = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__AUTHOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

  /**
   * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__DATA_ENTERER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__INFORMANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

  /**
   * The feature id for the '<em><b>Custodian</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__CUSTODIAN = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

  /**
   * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__INFORMATION_RECIPIENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

  /**
   * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__LEGAL_AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

  /**
   * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__PARTICIPANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

  /**
   * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__IN_FULFILLMENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

  /**
   * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__DOCUMENTATION_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

  /**
   * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__RELATED_DOCUMENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

  /**
   * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__AUTHORIZATION = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

  /**
   * The feature id for the '<em><b>Component Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__COMPONENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__COMPONENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__NULL_FLAVOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__CLASS_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__MOOD_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

  /**
   * The number of structural features of the '<em>Patient Care Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT_FEATURE_COUNT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;


  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.BillingImpl <em>Billing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.BillingImpl
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getBilling()
   * @generated
   */
  int BILLING = 1;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__ID = CDAPackage.SECTION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__CODE = CDAPackage.SECTION__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__TITLE = CDAPackage.SECTION__TITLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__TEXT = CDAPackage.SECTION__TEXT;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__SUBJECT = CDAPackage.SECTION__SUBJECT;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__AUTHOR = CDAPackage.SECTION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__INFORMANT = CDAPackage.SECTION__INFORMANT;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__ENTRY = CDAPackage.SECTION__ENTRY;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__COMPONENT = CDAPackage.SECTION__COMPONENT;

  /**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

  /**
   * The number of structural features of the '<em>Billing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BILLING_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport <em>Patient Care Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Patient Care Report</em>'.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport
   * @generated
   */
  EClass getPatientCareReport();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.Billing <em>Billing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Billing</em>'.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.Billing
   * @generated
   */
  EClass getBilling();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EmspcrFactory getEmspcrFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.PatientCareReportImpl <em>Patient Care Report</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.PatientCareReportImpl
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getPatientCareReport()
     * @generated
     */
    EClass PATIENT_CARE_REPORT = eINSTANCE.getPatientCareReport();
    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.BillingImpl <em>Billing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.BillingImpl
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getBilling()
     * @generated
     */
    EClass BILLING = eINSTANCE.getBilling();

  }

} //EmspcrPackage
