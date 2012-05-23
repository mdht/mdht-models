/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory
 * @model kind="package"
 * @generated
 */
public interface SdtmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sdtm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/sdtm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sdtm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SdtmPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl.init();

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectDataHumanClinicalTrialsImpl <em>Subject Data Human Clinical Trials</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectDataHumanClinicalTrialsImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectDataHumanClinicalTrials()
   * @generated
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS = 0;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__REALM_CODE = CDAPackage.CLINICAL_DOCUMENT__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__TYPE_ID = CDAPackage.CLINICAL_DOCUMENT__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__TEMPLATE_ID = CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__ID = CDAPackage.CLINICAL_DOCUMENT__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__CODE = CDAPackage.CLINICAL_DOCUMENT__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__TITLE = CDAPackage.CLINICAL_DOCUMENT__TITLE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__EFFECTIVE_TIME = CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__CONFIDENTIALITY_CODE = CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__LANGUAGE_CODE = CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Set Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SET_ID = CDAPackage.CLINICAL_DOCUMENT__SET_ID;

  /**
   * The feature id for the '<em><b>Version Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__VERSION_NUMBER = CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER;

  /**
   * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__COPY_TIME = CDAPackage.CLINICAL_DOCUMENT__COPY_TIME;

  /**
   * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__RECORD_TARGET = CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__AUTHOR = CDAPackage.CLINICAL_DOCUMENT__AUTHOR;

  /**
   * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__DATA_ENTERER = CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__INFORMANT = CDAPackage.CLINICAL_DOCUMENT__INFORMANT;

  /**
   * The feature id for the '<em><b>Custodian</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__CUSTODIAN = CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN;

  /**
   * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__INFORMATION_RECIPIENT = CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT;

  /**
   * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__LEGAL_AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

  /**
   * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__PARTICIPANT = CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT;

  /**
   * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__IN_FULFILLMENT_OF = CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF;

  /**
   * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__DOCUMENTATION_OF = CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF;

  /**
   * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__RELATED_DOCUMENT = CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT;

  /**
   * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__AUTHORIZATION = CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION;

  /**
   * The feature id for the '<em><b>Component Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__COMPONENT_OF = CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__COMPONENT = CDAPackage.CLINICAL_DOCUMENT__COMPONENT;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__NULL_FLAVOR = CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__CLASS_CODE = CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__MOOD_CODE = CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE;

  /**
   * The number of structural features of the '<em>Subject Data Human Clinical Trials</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_FEATURE_COUNT = CDAPackage.CLINICAL_DOCUMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalSubjectDataDocumentBodyImpl <em>Human Clinical Subject Data Document Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalSubjectDataDocumentBodyImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalSubjectDataDocumentBody()
   * @generated
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY = 1;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__ID = CDAPackage.SECTION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__CODE = CDAPackage.SECTION__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__TITLE = CDAPackage.SECTION__TITLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__TEXT = CDAPackage.SECTION__TEXT;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__SUBJECT = CDAPackage.SECTION__SUBJECT;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__AUTHOR = CDAPackage.SECTION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__INFORMANT = CDAPackage.SECTION__INFORMANT;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__ENTRY = CDAPackage.SECTION__ENTRY;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__COMPONENT = CDAPackage.SECTION__COMPONENT;

  /**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

  /**
   * The number of structural features of the '<em>Human Clinical Subject Data Document Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalSubjectDemographicsImpl <em>Human Clinical Subject Demographics</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalSubjectDemographicsImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalSubjectDemographics()
   * @generated
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS = 2;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__REALM_CODE = CDAPackage.ORGANIZER__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__TYPE_ID = CDAPackage.ORGANIZER__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__TEMPLATE_ID = CDAPackage.ORGANIZER__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__ID = CDAPackage.ORGANIZER__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__CODE = CDAPackage.ORGANIZER__CODE;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__STATUS_CODE = CDAPackage.ORGANIZER__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EFFECTIVE_TIME = CDAPackage.ORGANIZER__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__SUBJECT = CDAPackage.ORGANIZER__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__SPECIMEN = CDAPackage.ORGANIZER__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__PERFORMER = CDAPackage.ORGANIZER__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__AUTHOR = CDAPackage.ORGANIZER__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__INFORMANT = CDAPackage.ORGANIZER__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__PARTICIPANT = CDAPackage.ORGANIZER__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__REFERENCE = CDAPackage.ORGANIZER__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__PRECONDITION = CDAPackage.ORGANIZER__PRECONDITION;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__COMPONENT = CDAPackage.ORGANIZER__COMPONENT;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__NULL_FLAVOR = CDAPackage.ORGANIZER__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__CLASS_CODE = CDAPackage.ORGANIZER__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__MOOD_CODE = CDAPackage.ORGANIZER__MOOD_CODE;

  /**
   * The number of structural features of the '<em>Human Clinical Subject Demographics</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_FEATURE_COUNT = CDAPackage.ORGANIZER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DataCollectionImpl <em>Data Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DataCollectionImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDataCollection()
   * @generated
   */
  int DATA_COLLECTION = 3;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__REALM_CODE = CDAPackage.ACT__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__TYPE_ID = CDAPackage.ACT__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__ID = CDAPackage.ACT__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__CODE = CDAPackage.ACT__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__TEXT = CDAPackage.ACT__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__SUBJECT = CDAPackage.ACT__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__SPECIMEN = CDAPackage.ACT__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__PERFORMER = CDAPackage.ACT__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__AUTHOR = CDAPackage.ACT__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__INFORMANT = CDAPackage.ACT__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__REFERENCE = CDAPackage.ACT__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__PRECONDITION = CDAPackage.ACT__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Data Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.EventStudyDayImpl <em>Event Study Day</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.EventStudyDayImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getEventStudyDay()
   * @generated
   */
  int EVENT_STUDY_DAY = 4;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Event Study Day</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_STUDY_DAY_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyArmImpl <em>Study Arm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyArmImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyArm()
   * @generated
   */
  int STUDY_ARM = 5;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__REALM_CODE = CDAPackage.ACT__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__TYPE_ID = CDAPackage.ACT__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__ID = CDAPackage.ACT__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__CODE = CDAPackage.ACT__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__TEXT = CDAPackage.ACT__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__SUBJECT = CDAPackage.ACT__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__SPECIMEN = CDAPackage.ACT__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__PERFORMER = CDAPackage.ACT__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__AUTHOR = CDAPackage.ACT__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__INFORMANT = CDAPackage.ACT__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__REFERENCE = CDAPackage.ACT__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__PRECONDITION = CDAPackage.ACT__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Study Arm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_ARM_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.VisitImpl <em>Visit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.VisitImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getVisit()
   * @generated
   */
  int VISIT = 6;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__REALM_CODE = CDAPackage.ENCOUNTER__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__TYPE_ID = CDAPackage.ENCOUNTER__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__TEMPLATE_ID = CDAPackage.ENCOUNTER__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__ID = CDAPackage.ENCOUNTER__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__CODE = CDAPackage.ENCOUNTER__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__TEXT = CDAPackage.ENCOUNTER__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__STATUS_CODE = CDAPackage.ENCOUNTER__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__EFFECTIVE_TIME = CDAPackage.ENCOUNTER__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__PRIORITY_CODE = CDAPackage.ENCOUNTER__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__SUBJECT = CDAPackage.ENCOUNTER__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__SPECIMEN = CDAPackage.ENCOUNTER__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__PERFORMER = CDAPackage.ENCOUNTER__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__AUTHOR = CDAPackage.ENCOUNTER__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__INFORMANT = CDAPackage.ENCOUNTER__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__PARTICIPANT = CDAPackage.ENCOUNTER__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__ENTRY_RELATIONSHIP = CDAPackage.ENCOUNTER__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__REFERENCE = CDAPackage.ENCOUNTER__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__PRECONDITION = CDAPackage.ENCOUNTER__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__NULL_FLAVOR = CDAPackage.ENCOUNTER__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__CLASS_CODE = CDAPackage.ENCOUNTER__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT__MOOD_CODE = CDAPackage.ENCOUNTER__MOOD_CODE;

  /**
   * The number of structural features of the '<em>Visit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIT_FEATURE_COUNT = CDAPackage.ENCOUNTER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.AdverseEventImpl <em>Adverse Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.AdverseEventImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getAdverseEvent()
   * @generated
   */
  int ADVERSE_EVENT = 7;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Adverse Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVERSE_EVENT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.GroupIdentifierImpl <em>Group Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.GroupIdentifierImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getGroupIdentifier()
   * @generated
   */
  int GROUP_IDENTIFIER = 8;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__REALM_CODE = CDAPackage.ACT__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__TYPE_ID = CDAPackage.ACT__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__ID = CDAPackage.ACT__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__CODE = CDAPackage.ACT__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__TEXT = CDAPackage.ACT__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__SUBJECT = CDAPackage.ACT__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__SPECIMEN = CDAPackage.ACT__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__PERFORMER = CDAPackage.ACT__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__AUTHOR = CDAPackage.ACT__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__INFORMANT = CDAPackage.ACT__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__REFERENCE = CDAPackage.ACT__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__PRECONDITION = CDAPackage.ACT__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Group Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_IDENTIFIER_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.BodySystemorOrganClassImpl <em>Body Systemor Organ Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.BodySystemorOrganClassImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getBodySystemorOrganClass()
   * @generated
   */
  int BODY_SYSTEMOR_ORGAN_CLASS = 9;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Body Systemor Organ Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_SYSTEMOR_ORGAN_CLASS_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.EventSeverityImpl <em>Event Severity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.EventSeverityImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getEventSeverity()
   * @generated
   */
  int EVENT_SEVERITY = 10;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Event Severity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEVERITY_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PreSpecifiedEventImpl <em>Pre Specified Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PreSpecifiedEventImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPreSpecifiedEvent()
   * @generated
   */
  int PRE_SPECIFIED_EVENT = 11;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Pre Specified Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_SPECIFIED_EVENT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyDayPeriodImpl <em>Study Day Period</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyDayPeriodImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyDayPeriod()
   * @generated
   */
  int STUDY_DAY_PERIOD = 12;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Study Day Period</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_DAY_PERIOD_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.VitalSignImpl <em>Vital Sign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.VitalSignImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getVitalSign()
   * @generated
   */
  int VITAL_SIGN = 13;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Vital Sign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VITAL_SIGN_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PlannedStudyDayImpl <em>Planned Study Day</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PlannedStudyDayImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPlannedStudyDay()
   * @generated
   */
  int PLANNED_STUDY_DAY = 14;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Planned Study Day</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_STUDY_DAY_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.TimingReferenceImpl <em>Timing Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.TimingReferenceImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getTimingReference()
   * @generated
   */
  int TIMING_REFERENCE = 15;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__REALM_CODE = CDAPackage.ACT__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__TYPE_ID = CDAPackage.ACT__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__ID = CDAPackage.ACT__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__CODE = CDAPackage.ACT__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__TEXT = CDAPackage.ACT__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__SUBJECT = CDAPackage.ACT__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__SPECIMEN = CDAPackage.ACT__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__PERFORMER = CDAPackage.ACT__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__AUTHOR = CDAPackage.ACT__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__INFORMANT = CDAPackage.ACT__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__REFERENCE = CDAPackage.ACT__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__PRECONDITION = CDAPackage.ACT__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Timing Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_REFERENCE_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonPerformanceReasonImpl <em>Non Performance Reason</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonPerformanceReasonImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonPerformanceReason()
   * @generated
   */
  int NON_PERFORMANCE_REASON = 16;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Non Performance Reason</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PERFORMANCE_REASON_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ECGTestResultImpl <em>ECG Test Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ECGTestResultImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getECGTestResult()
   * @generated
   */
  int ECG_TEST_RESULT = 17;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>ECG Test Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECG_TEST_RESULT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.BaselineIndicatorImpl <em>Baseline Indicator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.BaselineIndicatorImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getBaselineIndicator()
   * @generated
   */
  int BASELINE_INDICATOR = 18;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Baseline Indicator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_INDICATOR_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DerivedDataIndicatorImpl <em>Derived Data Indicator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DerivedDataIndicatorImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDerivedDataIndicator()
   * @generated
   */
  int DERIVED_DATA_INDICATOR = 19;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Derived Data Indicator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_DATA_INDICATOR_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.InclusionorExclusionCriteriaNotMetImpl <em>Inclusionor Exclusion Criteria Not Met</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.InclusionorExclusionCriteriaNotMetImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getInclusionorExclusionCriteriaNotMet()
   * @generated
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET = 20;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Inclusionor Exclusion Criteria Not Met</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanLaboratoryTestResultImpl <em>Non Human Laboratory Test Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanLaboratoryTestResultImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonHumanLaboratoryTestResult()
   * @generated
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT = 21;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Non Human Laboratory Test Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_LABORATORY_TEST_RESULT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SpecimenInformationImpl <em>Specimen Information</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SpecimenInformationImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSpecimenInformation()
   * @generated
   */
  int SPECIMEN_INFORMATION = 22;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__REALM_CODE = CDAPackage.PROCEDURE__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__TYPE_ID = CDAPackage.PROCEDURE__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__TEMPLATE_ID = CDAPackage.PROCEDURE__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__ID = CDAPackage.PROCEDURE__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__CODE = CDAPackage.PROCEDURE__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__TEXT = CDAPackage.PROCEDURE__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__STATUS_CODE = CDAPackage.PROCEDURE__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__EFFECTIVE_TIME = CDAPackage.PROCEDURE__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__PRIORITY_CODE = CDAPackage.PROCEDURE__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__LANGUAGE_CODE = CDAPackage.PROCEDURE__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__METHOD_CODE = CDAPackage.PROCEDURE__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__APPROACH_SITE_CODE = CDAPackage.PROCEDURE__APPROACH_SITE_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__TARGET_SITE_CODE = CDAPackage.PROCEDURE__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__SUBJECT = CDAPackage.PROCEDURE__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__SPECIMEN = CDAPackage.PROCEDURE__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__PERFORMER = CDAPackage.PROCEDURE__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__AUTHOR = CDAPackage.PROCEDURE__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__INFORMANT = CDAPackage.PROCEDURE__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__PARTICIPANT = CDAPackage.PROCEDURE__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__ENTRY_RELATIONSHIP = CDAPackage.PROCEDURE__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__REFERENCE = CDAPackage.PROCEDURE__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__PRECONDITION = CDAPackage.PROCEDURE__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__NULL_FLAVOR = CDAPackage.PROCEDURE__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__CLASS_CODE = CDAPackage.PROCEDURE__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__MOOD_CODE = CDAPackage.PROCEDURE__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION__NEGATION_IND = CDAPackage.PROCEDURE__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Specimen Information</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIMEN_INFORMATION_FEATURE_COUNT = CDAPackage.PROCEDURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PhysicalExaminationFindingImpl <em>Physical Examination Finding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PhysicalExaminationFindingImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPhysicalExaminationFinding()
   * @generated
   */
  int PHYSICAL_EXAMINATION_FINDING = 23;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Physical Examination Finding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHYSICAL_EXAMINATION_FINDING_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySpecimenFindingImpl <em>Microbiology Specimen Finding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySpecimenFindingImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMicrobiologySpecimenFinding()
   * @generated
   */
  int MICROBIOLOGY_SPECIMEN_FINDING = 24;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Microbiology Specimen Finding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SPECIMEN_FINDING_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySusceptibilityImpl <em>Microbiology Susceptibility</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySusceptibilityImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMicrobiologySusceptibility()
   * @generated
   */
  int MICROBIOLOGY_SUSCEPTIBILITY = 25;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Microbiology Susceptibility</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROBIOLOGY_SUSCEPTIBILITY_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticConcentrationFindingImpl <em>Pharmacokinetic Concentration Finding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticConcentrationFindingImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPharmacokineticConcentrationFinding()
   * @generated
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING = 26;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Pharmacokinetic Concentration Finding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_CONCENTRATION_FINDING_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.FindingAboutImpl <em>Finding About</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.FindingAboutImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getFindingAbout()
   * @generated
   */
  int FINDING_ABOUT = 27;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Finding About</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINDING_ABOUT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DrugAccountabilityImpl <em>Drug Accountability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DrugAccountabilityImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDrugAccountability()
   * @generated
   */
  int DRUG_ACCOUNTABILITY = 28;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Drug Accountability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRUG_ACCOUNTABILITY_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectElementImpl <em>Subject Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectElementImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectElement()
   * @generated
   */
  int SUBJECT_ELEMENT = 29;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__REALM_CODE = CDAPackage.ACT__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__TYPE_ID = CDAPackage.ACT__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__ID = CDAPackage.ACT__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__CODE = CDAPackage.ACT__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__TEXT = CDAPackage.ACT__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__SUBJECT = CDAPackage.ACT__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__SPECIMEN = CDAPackage.ACT__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__PERFORMER = CDAPackage.ACT__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__AUTHOR = CDAPackage.ACT__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__INFORMANT = CDAPackage.ACT__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__REFERENCE = CDAPackage.ACT__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__PRECONDITION = CDAPackage.ACT__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Subject Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_ELEMENT_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyEpochImpl <em>Study Epoch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyEpochImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyEpoch()
   * @generated
   */
  int STUDY_EPOCH = 30;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__REALM_CODE = CDAPackage.ACT__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__TYPE_ID = CDAPackage.ACT__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__ID = CDAPackage.ACT__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__CODE = CDAPackage.ACT__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__TEXT = CDAPackage.ACT__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__SUBJECT = CDAPackage.ACT__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__SPECIMEN = CDAPackage.ACT__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__PERFORMER = CDAPackage.ACT__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__AUTHOR = CDAPackage.ACT__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__INFORMANT = CDAPackage.ACT__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__REFERENCE = CDAPackage.ACT__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__PRECONDITION = CDAPackage.ACT__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Study Epoch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_EPOCH_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubstanceUseImpl <em>Substance Use</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubstanceUseImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubstanceUse()
   * @generated
   */
  int SUBSTANCE_USE = 31;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__REALM_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__TYPE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__TEMPLATE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__ID = CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__TEXT = CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__STATUS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__EFFECTIVE_TIME = CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__PRIORITY_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__REPEAT_NUMBER = CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Route Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__ROUTE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

  /**
   * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__APPROACH_SITE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

  /**
   * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

  /**
   * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__RATE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

  /**
   * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__MAX_DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

  /**
   * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__ADMINISTRATION_UNIT_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__SUBJECT = CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__SPECIMEN = CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Consumable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__CONSUMABLE = CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__PERFORMER = CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__AUTHOR = CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__INFORMANT = CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__PARTICIPANT = CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__ENTRY_RELATIONSHIP = CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__REFERENCE = CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__PRECONDITION = CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__NULL_FLAVOR = CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__CLASS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__MOOD_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE__NEGATION_IND = CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Substance Use</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_USE_FEATURE_COUNT = CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ActivityStartTimingReferenceImpl <em>Activity Start Timing Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ActivityStartTimingReferenceImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getActivityStartTimingReference()
   * @generated
   */
  int ACTIVITY_START_TIMING_REFERENCE = 32;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__REALM_CODE = CDAPackage.ACT__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__TYPE_ID = CDAPackage.ACT__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__ID = CDAPackage.ACT__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__CODE = CDAPackage.ACT__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__TEXT = CDAPackage.ACT__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__SUBJECT = CDAPackage.ACT__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__SPECIMEN = CDAPackage.ACT__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__PERFORMER = CDAPackage.ACT__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__AUTHOR = CDAPackage.ACT__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__INFORMANT = CDAPackage.ACT__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__REFERENCE = CDAPackage.ACT__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__PRECONDITION = CDAPackage.ACT__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Activity Start Timing Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_TIMING_REFERENCE_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ActivityEndTimingReferenceImpl <em>Activity End Timing Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ActivityEndTimingReferenceImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getActivityEndTimingReference()
   * @generated
   */
  int ACTIVITY_END_TIMING_REFERENCE = 33;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__REALM_CODE = CDAPackage.ACT__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__TYPE_ID = CDAPackage.ACT__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__ID = CDAPackage.ACT__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__CODE = CDAPackage.ACT__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__TEXT = CDAPackage.ACT__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__SUBJECT = CDAPackage.ACT__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__SPECIMEN = CDAPackage.ACT__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__PERFORMER = CDAPackage.ACT__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__AUTHOR = CDAPackage.ACT__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__INFORMANT = CDAPackage.ACT__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__REFERENCE = CDAPackage.ACT__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__PRECONDITION = CDAPackage.ACT__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Activity End Timing Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_END_TIMING_REFERENCE_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalDispositionImpl <em>Human Clinical Disposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalDispositionImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalDisposition()
   * @generated
   */
  int HUMAN_CLINICAL_DISPOSITION = 34;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__REALM_CODE = CDAPackage.ACT__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__TYPE_ID = CDAPackage.ACT__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__ID = CDAPackage.ACT__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__CODE = CDAPackage.ACT__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__TEXT = CDAPackage.ACT__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__SUBJECT = CDAPackage.ACT__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__SPECIMEN = CDAPackage.ACT__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__PERFORMER = CDAPackage.ACT__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__AUTHOR = CDAPackage.ACT__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__INFORMANT = CDAPackage.ACT__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__REFERENCE = CDAPackage.ACT__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__PRECONDITION = CDAPackage.ACT__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Human Clinical Disposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_DISPOSITION_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MedicalHistoryItemImpl <em>Medical History Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MedicalHistoryItemImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMedicalHistoryItem()
   * @generated
   */
  int MEDICAL_HISTORY_ITEM = 35;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Medical History Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDICAL_HISTORY_ITEM_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ProtocolDeviationImpl <em>Protocol Deviation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ProtocolDeviationImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getProtocolDeviation()
   * @generated
   */
  int PROTOCOL_DEVIATION = 36;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Protocol Deviation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DEVIATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ClinicalEventImpl <em>Clinical Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ClinicalEventImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getClinicalEvent()
   * @generated
   */
  int CLINICAL_EVENT = 37;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Clinical Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_EVENT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectCharacteristicImpl <em>Subject Characteristic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectCharacteristicImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectCharacteristic()
   * @generated
   */
  int SUBJECT_CHARACTERISTIC = 38;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Subject Characteristic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_CHARACTERISTIC_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticParameterFindingImpl <em>Pharmacokinetic Parameter Finding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticParameterFindingImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPharmacokineticParameterFinding()
   * @generated
   */
  int PHARMACOKINETIC_PARAMETER_FINDING = 39;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Pharmacokinetic Parameter Finding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHARMACOKINETIC_PARAMETER_FINDING_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ConcomitantMedicationImpl <em>Concomitant Medication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ConcomitantMedicationImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getConcomitantMedication()
   * @generated
   */
  int CONCOMITANT_MEDICATION = 40;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__REALM_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__TYPE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__TEMPLATE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__ID = CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__TEXT = CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__STATUS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__EFFECTIVE_TIME = CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__PRIORITY_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__REPEAT_NUMBER = CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Route Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__ROUTE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

  /**
   * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__APPROACH_SITE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

  /**
   * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

  /**
   * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__RATE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

  /**
   * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__MAX_DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

  /**
   * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__ADMINISTRATION_UNIT_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__SUBJECT = CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__SPECIMEN = CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Consumable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__CONSUMABLE = CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__PERFORMER = CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__AUTHOR = CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__INFORMANT = CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__PARTICIPANT = CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__ENTRY_RELATIONSHIP = CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__REFERENCE = CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__PRECONDITION = CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__NULL_FLAVOR = CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__CLASS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__MOOD_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION__NEGATION_IND = CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Concomitant Medication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCOMITANT_MEDICATION_FEATURE_COUNT = CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ConsumableMaterialImpl <em>Consumable Material</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ConsumableMaterialImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getConsumableMaterial()
   * @generated
   */
  int CONSUMABLE_MATERIAL = 41;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_MATERIAL__REALM_CODE = CDAPackage.CONSUMABLE__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_MATERIAL__TYPE_ID = CDAPackage.CONSUMABLE__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_MATERIAL__TEMPLATE_ID = CDAPackage.CONSUMABLE__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Manufactured Product</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_MATERIAL__MANUFACTURED_PRODUCT = CDAPackage.CONSUMABLE__MANUFACTURED_PRODUCT;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_MATERIAL__NULL_FLAVOR = CDAPackage.CONSUMABLE__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Type Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_MATERIAL__TYPE_CODE = CDAPackage.CONSUMABLE__TYPE_CODE;

  /**
   * The number of structural features of the '<em>Consumable Material</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_MATERIAL_FEATURE_COUNT = CDAPackage.CONSUMABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalExposureImpl <em>Human Clinical Exposure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalExposureImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalExposure()
   * @generated
   */
  int HUMAN_CLINICAL_EXPOSURE = 42;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__REALM_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__TYPE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__TEMPLATE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__ID = CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__TEXT = CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__STATUS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__EFFECTIVE_TIME = CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__PRIORITY_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__REPEAT_NUMBER = CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Route Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__ROUTE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

  /**
   * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__APPROACH_SITE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

  /**
   * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

  /**
   * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__RATE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

  /**
   * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__MAX_DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

  /**
   * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__ADMINISTRATION_UNIT_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__SUBJECT = CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__SPECIMEN = CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Consumable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__CONSUMABLE = CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__PERFORMER = CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__AUTHOR = CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__INFORMANT = CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__PARTICIPANT = CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__ENTRY_RELATIONSHIP = CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__REFERENCE = CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__PRECONDITION = CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__NULL_FLAVOR = CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__CLASS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__MOOD_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE__NEGATION_IND = CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Human Clinical Exposure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_EXPOSURE_FEATURE_COUNT = CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTestPerformerImpl <em>Study Test Performer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTestPerformerImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyTestPerformer()
   * @generated
   */
  int STUDY_TEST_PERFORMER = 43;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_TEST_PERFORMER__REALM_CODE = CDAPackage.PARTICIPANT1__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_TEST_PERFORMER__TYPE_ID = CDAPackage.PARTICIPANT1__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_TEST_PERFORMER__TEMPLATE_ID = CDAPackage.PARTICIPANT1__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Function Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_TEST_PERFORMER__FUNCTION_CODE = CDAPackage.PARTICIPANT1__FUNCTION_CODE;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_TEST_PERFORMER__TIME = CDAPackage.PARTICIPANT1__TIME;

  /**
   * The feature id for the '<em><b>Associated Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_TEST_PERFORMER__ASSOCIATED_ENTITY = CDAPackage.PARTICIPANT1__ASSOCIATED_ENTITY;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_TEST_PERFORMER__NULL_FLAVOR = CDAPackage.PARTICIPANT1__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Type Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_TEST_PERFORMER__TYPE_CODE = CDAPackage.PARTICIPANT1__TYPE_CODE;

  /**
   * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_TEST_PERFORMER__CONTEXT_CONTROL_CODE = CDAPackage.PARTICIPANT1__CONTEXT_CONTROL_CODE;

  /**
   * The number of structural features of the '<em>Study Test Performer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_TEST_PERFORMER_FEATURE_COUNT = CDAPackage.PARTICIPANT1_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.QuestionnaireFindingImpl <em>Questionnaire Finding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.QuestionnaireFindingImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getQuestionnaireFinding()
   * @generated
   */
  int QUESTIONNAIRE_FINDING = 44;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Questionnaire Finding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FINDING_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyFindingEvaluatorImpl <em>Study Finding Evaluator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyFindingEvaluatorImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyFindingEvaluator()
   * @generated
   */
  int STUDY_FINDING_EVALUATOR = 45;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_FINDING_EVALUATOR__REALM_CODE = CDAPackage.PARTICIPANT1__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_FINDING_EVALUATOR__TYPE_ID = CDAPackage.PARTICIPANT1__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_FINDING_EVALUATOR__TEMPLATE_ID = CDAPackage.PARTICIPANT1__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Function Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_FINDING_EVALUATOR__FUNCTION_CODE = CDAPackage.PARTICIPANT1__FUNCTION_CODE;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_FINDING_EVALUATOR__TIME = CDAPackage.PARTICIPANT1__TIME;

  /**
   * The feature id for the '<em><b>Associated Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_FINDING_EVALUATOR__ASSOCIATED_ENTITY = CDAPackage.PARTICIPANT1__ASSOCIATED_ENTITY;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_FINDING_EVALUATOR__NULL_FLAVOR = CDAPackage.PARTICIPANT1__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Type Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_FINDING_EVALUATOR__TYPE_CODE = CDAPackage.PARTICIPANT1__TYPE_CODE;

  /**
   * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_FINDING_EVALUATOR__CONTEXT_CONTROL_CODE = CDAPackage.PARTICIPANT1__CONTEXT_CONTROL_CODE;

  /**
   * The number of structural features of the '<em>Study Finding Evaluator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDY_FINDING_EVALUATOR_FEATURE_COUNT = CDAPackage.PARTICIPANT1_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectDataNonClinicalTrialsImpl <em>Subject Data Non Clinical Trials</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectDataNonClinicalTrialsImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectDataNonClinicalTrials()
   * @generated
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS = 46;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__REALM_CODE = CDAPackage.CLINICAL_DOCUMENT__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__TYPE_ID = CDAPackage.CLINICAL_DOCUMENT__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__TEMPLATE_ID = CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__ID = CDAPackage.CLINICAL_DOCUMENT__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__CODE = CDAPackage.CLINICAL_DOCUMENT__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__TITLE = CDAPackage.CLINICAL_DOCUMENT__TITLE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__EFFECTIVE_TIME = CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__CONFIDENTIALITY_CODE = CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__LANGUAGE_CODE = CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Set Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__SET_ID = CDAPackage.CLINICAL_DOCUMENT__SET_ID;

  /**
   * The feature id for the '<em><b>Version Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__VERSION_NUMBER = CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER;

  /**
   * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__COPY_TIME = CDAPackage.CLINICAL_DOCUMENT__COPY_TIME;

  /**
   * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__RECORD_TARGET = CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__AUTHOR = CDAPackage.CLINICAL_DOCUMENT__AUTHOR;

  /**
   * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__DATA_ENTERER = CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__INFORMANT = CDAPackage.CLINICAL_DOCUMENT__INFORMANT;

  /**
   * The feature id for the '<em><b>Custodian</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__CUSTODIAN = CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN;

  /**
   * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__INFORMATION_RECIPIENT = CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT;

  /**
   * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__LEGAL_AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

  /**
   * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__PARTICIPANT = CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT;

  /**
   * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__IN_FULFILLMENT_OF = CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF;

  /**
   * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__DOCUMENTATION_OF = CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF;

  /**
   * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__RELATED_DOCUMENT = CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT;

  /**
   * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__AUTHORIZATION = CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION;

  /**
   * The feature id for the '<em><b>Component Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__COMPONENT_OF = CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__COMPONENT = CDAPackage.CLINICAL_DOCUMENT__COMPONENT;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__NULL_FLAVOR = CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__CLASS_CODE = CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS__MOOD_CODE = CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE;

  /**
   * The number of structural features of the '<em>Subject Data Non Clinical Trials</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_DATA_NON_CLINICAL_TRIALS_FEATURE_COUNT = CDAPackage.CLINICAL_DOCUMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanSubjectDataDocumentBodyImpl <em>Non Human Subject Data Document Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanSubjectDataDocumentBodyImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonHumanSubjectDataDocumentBody()
   * @generated
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY = 47;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__ID = CDAPackage.SECTION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__CODE = CDAPackage.SECTION__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__TITLE = CDAPackage.SECTION__TITLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__TEXT = CDAPackage.SECTION__TEXT;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__SUBJECT = CDAPackage.SECTION__SUBJECT;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__AUTHOR = CDAPackage.SECTION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__INFORMANT = CDAPackage.SECTION__INFORMANT;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__ENTRY = CDAPackage.SECTION__ENTRY;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__COMPONENT = CDAPackage.SECTION__COMPONENT;

  /**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

  /**
   * The number of structural features of the '<em>Non Human Subject Data Document Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanExposureImpl <em>Non Human Exposure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanExposureImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonHumanExposure()
   * @generated
   */
  int NON_HUMAN_EXPOSURE = 48;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__REALM_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__TYPE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__TEMPLATE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__ID = CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__TEXT = CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__STATUS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__EFFECTIVE_TIME = CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__PRIORITY_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__REPEAT_NUMBER = CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Route Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__ROUTE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

  /**
   * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__APPROACH_SITE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

  /**
   * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

  /**
   * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__RATE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

  /**
   * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__MAX_DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

  /**
   * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__ADMINISTRATION_UNIT_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__SUBJECT = CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__SPECIMEN = CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Consumable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__CONSUMABLE = CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__PERFORMER = CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__AUTHOR = CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__INFORMANT = CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__PARTICIPANT = CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__ENTRY_RELATIONSHIP = CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__REFERENCE = CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__PRECONDITION = CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__NULL_FLAVOR = CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__CLASS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__MOOD_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE__NEGATION_IND = CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Non Human Exposure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_EXPOSURE_FEATURE_COUNT = CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanDispositionImpl <em>Non Human Disposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanDispositionImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonHumanDisposition()
   * @generated
   */
  int NON_HUMAN_DISPOSITION = 49;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__REALM_CODE = CDAPackage.ACT__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__TYPE_ID = CDAPackage.ACT__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__ID = CDAPackage.ACT__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__CODE = CDAPackage.ACT__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__TEXT = CDAPackage.ACT__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__SUBJECT = CDAPackage.ACT__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__SPECIMEN = CDAPackage.ACT__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__PERFORMER = CDAPackage.ACT__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__AUTHOR = CDAPackage.ACT__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__INFORMANT = CDAPackage.ACT__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__REFERENCE = CDAPackage.ACT__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__PRECONDITION = CDAPackage.ACT__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Non Human Disposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_HUMAN_DISPOSITION_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalLaboratoryTestResultImpl <em>Human Clinical Laboratory Test Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalLaboratoryTestResultImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalLaboratoryTestResult()
   * @generated
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT = 50;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Human Clinical Laboratory Test Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_CLINICAL_LABORATORY_TEST_RESULT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.BodyWeightImpl <em>Body Weight</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.BodyWeightImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getBodyWeight()
   * @generated
   */
  int BODY_WEIGHT = 51;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Body Weight</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.BodyWeightGainImpl <em>Body Weight Gain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.BodyWeightGainImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getBodyWeightGain()
   * @generated
   */
  int BODY_WEIGHT_GAIN = 52;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Body Weight Gain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_WEIGHT_GAIN_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ClinicalObservationImpl <em>Clinical Observation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ClinicalObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getClinicalObservation()
   * @generated
   */
  int CLINICAL_OBSERVATION = 53;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Clinical Observation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DeathDiagnosisImpl <em>Death Diagnosis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DeathDiagnosisImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDeathDiagnosis()
   * @generated
   */
  int DEATH_DIAGNOSIS = 54;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Death Diagnosis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEATH_DIAGNOSIS_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.FoodandWaterConsumptionImpl <em>Foodand Water Consumption</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.FoodandWaterConsumptionImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getFoodandWaterConsumption()
   * @generated
   */
  int FOODAND_WATER_CONSUMPTION = 55;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Foodand Water Consumption</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOODAND_WATER_CONSUMPTION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MacroscopicFindingImpl <em>Macroscopic Finding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MacroscopicFindingImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMacroscopicFinding()
   * @generated
   */
  int MACROSCOPIC_FINDING = 56;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Macroscopic Finding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACROSCOPIC_FINDING_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MicroscopicFindingsImpl <em>Microscopic Findings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MicroscopicFindingsImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMicroscopicFindings()
   * @generated
   */
  int MICROSCOPIC_FINDINGS = 57;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Microscopic Findings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MICROSCOPIC_FINDINGS_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.OrganMeasurementImpl <em>Organ Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.OrganMeasurementImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getOrganMeasurement()
   * @generated
   */
  int ORGAN_MEASUREMENT = 58;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Organ Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGAN_MEASUREMENT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PalpableMassImpl <em>Palpable Mass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PalpableMassImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPalpableMass()
   * @generated
   */
  int PALPABLE_MASS = 59;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Palpable Mass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PALPABLE_MASS_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.TumorFindingImpl <em>Tumor Finding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.TumorFindingImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getTumorFinding()
   * @generated
   */
  int TUMOR_FINDING = 60;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Tumor Finding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUMOR_FINDING_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectPoolImpl <em>Subject Pool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectPoolImpl
   * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectPool()
   * @generated
   */
  int SUBJECT_POOL = 61;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__ID = CDAPackage.OBSERVATION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__CODE = CDAPackage.OBSERVATION__CODE;

  /**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__TEXT = CDAPackage.OBSERVATION__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__VALUE = CDAPackage.OBSERVATION__VALUE;

  /**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

  /**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

  /**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

  /**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Subject Pool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_POOL_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials <em>Subject Data Human Clinical Trials</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subject Data Human Clinical Trials</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials
   * @generated
   */
  EClass getSubjectDataHumanClinicalTrials();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody <em>Human Clinical Subject Data Document Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Human Clinical Subject Data Document Body</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody
   * @generated
   */
  EClass getHumanClinicalSubjectDataDocumentBody();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics <em>Human Clinical Subject Demographics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Human Clinical Subject Demographics</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics
   * @generated
   */
  EClass getHumanClinicalSubjectDemographics();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection <em>Data Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Collection</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.DataCollection
   * @generated
   */
  EClass getDataCollection();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay <em>Event Study Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Study Day</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay
   * @generated
   */
  EClass getEventStudyDay();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyArm <em>Study Arm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Study Arm</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyArm
   * @generated
   */
  EClass getStudyArm();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit <em>Visit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visit</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.Visit
   * @generated
   */
  EClass getVisit();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent <em>Adverse Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adverse Event</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent
   * @generated
   */
  EClass getAdverseEvent();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier <em>Group Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Identifier</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier
   * @generated
   */
  EClass getGroupIdentifier();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass <em>Body Systemor Organ Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Systemor Organ Class</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass
   * @generated
   */
  EClass getBodySystemorOrganClass();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity <em>Event Severity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Severity</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity
   * @generated
   */
  EClass getEventSeverity();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent <em>Pre Specified Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Specified Event</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent
   * @generated
   */
  EClass getPreSpecifiedEvent();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod <em>Study Day Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Study Day Period</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod
   * @generated
   */
  EClass getStudyDayPeriod();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign <em>Vital Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vital Sign</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.VitalSign
   * @generated
   */
  EClass getVitalSign();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay <em>Planned Study Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Planned Study Day</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay
   * @generated
   */
  EClass getPlannedStudyDay();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference <em>Timing Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timing Reference</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.TimingReference
   * @generated
   */
  EClass getTimingReference();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason <em>Non Performance Reason</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Performance Reason</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason
   * @generated
   */
  EClass getNonPerformanceReason();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult <em>ECG Test Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECG Test Result</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult
   * @generated
   */
  EClass getECGTestResult();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator <em>Baseline Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Baseline Indicator</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator
   * @generated
   */
  EClass getBaselineIndicator();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator <em>Derived Data Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Derived Data Indicator</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator
   * @generated
   */
  EClass getDerivedDataIndicator();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet <em>Inclusionor Exclusion Criteria Not Met</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inclusionor Exclusion Criteria Not Met</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet
   * @generated
   */
  EClass getInclusionorExclusionCriteriaNotMet();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult <em>Non Human Laboratory Test Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Human Laboratory Test Result</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult
   * @generated
   */
  EClass getNonHumanLaboratoryTestResult();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation <em>Specimen Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specimen Information</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation
   * @generated
   */
  EClass getSpecimenInformation();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding <em>Physical Examination Finding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Physical Examination Finding</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding
   * @generated
   */
  EClass getPhysicalExaminationFinding();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding <em>Microbiology Specimen Finding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Microbiology Specimen Finding</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding
   * @generated
   */
  EClass getMicrobiologySpecimenFinding();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility <em>Microbiology Susceptibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Microbiology Susceptibility</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility
   * @generated
   */
  EClass getMicrobiologySusceptibility();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding <em>Pharmacokinetic Concentration Finding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pharmacokinetic Concentration Finding</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding
   * @generated
   */
  EClass getPharmacokineticConcentrationFinding();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout <em>Finding About</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Finding About</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout
   * @generated
   */
  EClass getFindingAbout();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability <em>Drug Accountability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drug Accountability</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability
   * @generated
   */
  EClass getDrugAccountability();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement <em>Subject Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subject Element</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement
   * @generated
   */
  EClass getSubjectElement();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch <em>Study Epoch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Study Epoch</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch
   * @generated
   */
  EClass getStudyEpoch();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse <em>Substance Use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Substance Use</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse
   * @generated
   */
  EClass getSubstanceUse();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference <em>Activity Start Timing Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Start Timing Reference</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference
   * @generated
   */
  EClass getActivityStartTimingReference();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference <em>Activity End Timing Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity End Timing Reference</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference
   * @generated
   */
  EClass getActivityEndTimingReference();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition <em>Human Clinical Disposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Human Clinical Disposition</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition
   * @generated
   */
  EClass getHumanClinicalDisposition();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem <em>Medical History Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Medical History Item</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem
   * @generated
   */
  EClass getMedicalHistoryItem();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation <em>Protocol Deviation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol Deviation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation
   * @generated
   */
  EClass getProtocolDeviation();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent <em>Clinical Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clinical Event</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent
   * @generated
   */
  EClass getClinicalEvent();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic <em>Subject Characteristic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subject Characteristic</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic
   * @generated
   */
  EClass getSubjectCharacteristic();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding <em>Pharmacokinetic Parameter Finding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pharmacokinetic Parameter Finding</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding
   * @generated
   */
  EClass getPharmacokineticParameterFinding();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication <em>Concomitant Medication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concomitant Medication</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication
   * @generated
   */
  EClass getConcomitantMedication();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial <em>Consumable Material</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Consumable Material</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial
   * @generated
   */
  EClass getConsumableMaterial();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure <em>Human Clinical Exposure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Human Clinical Exposure</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure
   * @generated
   */
  EClass getHumanClinicalExposure();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTestPerformer <em>Study Test Performer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Study Test Performer</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyTestPerformer
   * @generated
   */
  EClass getStudyTestPerformer();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding <em>Questionnaire Finding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Questionnaire Finding</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding
   * @generated
   */
  EClass getQuestionnaireFinding();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator <em>Study Finding Evaluator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Study Finding Evaluator</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator
   * @generated
   */
  EClass getStudyFindingEvaluator();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials <em>Subject Data Non Clinical Trials</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subject Data Non Clinical Trials</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials
   * @generated
   */
  EClass getSubjectDataNonClinicalTrials();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanSubjectDataDocumentBody <em>Non Human Subject Data Document Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Human Subject Data Document Body</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.NonHumanSubjectDataDocumentBody
   * @generated
   */
  EClass getNonHumanSubjectDataDocumentBody();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanExposure <em>Non Human Exposure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Human Exposure</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.NonHumanExposure
   * @generated
   */
  EClass getNonHumanExposure();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanDisposition <em>Non Human Disposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Human Disposition</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.NonHumanDisposition
   * @generated
   */
  EClass getNonHumanDisposition();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult <em>Human Clinical Laboratory Test Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Human Clinical Laboratory Test Result</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult
   * @generated
   */
  EClass getHumanClinicalLaboratoryTestResult();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight <em>Body Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Weight</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight
   * @generated
   */
  EClass getBodyWeight();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain <em>Body Weight Gain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Weight Gain</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain
   * @generated
   */
  EClass getBodyWeightGain();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation <em>Clinical Observation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clinical Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation
   * @generated
   */
  EClass getClinicalObservation();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis <em>Death Diagnosis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Death Diagnosis</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis
   * @generated
   */
  EClass getDeathDiagnosis();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption <em>Foodand Water Consumption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foodand Water Consumption</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption
   * @generated
   */
  EClass getFoodandWaterConsumption();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding <em>Macroscopic Finding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Macroscopic Finding</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding
   * @generated
   */
  EClass getMacroscopicFinding();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFindings <em>Microscopic Findings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Microscopic Findings</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFindings
   * @generated
   */
  EClass getMicroscopicFindings();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement <em>Organ Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Organ Measurement</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement
   * @generated
   */
  EClass getOrganMeasurement();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass <em>Palpable Mass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Palpable Mass</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass
   * @generated
   */
  EClass getPalpableMass();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding <em>Tumor Finding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tumor Finding</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding
   * @generated
   */
  EClass getTumorFinding();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectPool <em>Subject Pool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subject Pool</em>'.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectPool
   * @generated
   */
  EClass getSubjectPool();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SdtmFactory getSdtmFactory();

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
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectDataHumanClinicalTrialsImpl <em>Subject Data Human Clinical Trials</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectDataHumanClinicalTrialsImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectDataHumanClinicalTrials()
     * @generated
     */
    EClass SUBJECT_DATA_HUMAN_CLINICAL_TRIALS = eINSTANCE.getSubjectDataHumanClinicalTrials();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalSubjectDataDocumentBodyImpl <em>Human Clinical Subject Data Document Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalSubjectDataDocumentBodyImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalSubjectDataDocumentBody()
     * @generated
     */
    EClass HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY = eINSTANCE.getHumanClinicalSubjectDataDocumentBody();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalSubjectDemographicsImpl <em>Human Clinical Subject Demographics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalSubjectDemographicsImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalSubjectDemographics()
     * @generated
     */
    EClass HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS = eINSTANCE.getHumanClinicalSubjectDemographics();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DataCollectionImpl <em>Data Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DataCollectionImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDataCollection()
     * @generated
     */
    EClass DATA_COLLECTION = eINSTANCE.getDataCollection();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.EventStudyDayImpl <em>Event Study Day</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.EventStudyDayImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getEventStudyDay()
     * @generated
     */
    EClass EVENT_STUDY_DAY = eINSTANCE.getEventStudyDay();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyArmImpl <em>Study Arm</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyArmImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyArm()
     * @generated
     */
    EClass STUDY_ARM = eINSTANCE.getStudyArm();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.VisitImpl <em>Visit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.VisitImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getVisit()
     * @generated
     */
    EClass VISIT = eINSTANCE.getVisit();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.AdverseEventImpl <em>Adverse Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.AdverseEventImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getAdverseEvent()
     * @generated
     */
    EClass ADVERSE_EVENT = eINSTANCE.getAdverseEvent();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.GroupIdentifierImpl <em>Group Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.GroupIdentifierImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getGroupIdentifier()
     * @generated
     */
    EClass GROUP_IDENTIFIER = eINSTANCE.getGroupIdentifier();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.BodySystemorOrganClassImpl <em>Body Systemor Organ Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.BodySystemorOrganClassImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getBodySystemorOrganClass()
     * @generated
     */
    EClass BODY_SYSTEMOR_ORGAN_CLASS = eINSTANCE.getBodySystemorOrganClass();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.EventSeverityImpl <em>Event Severity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.EventSeverityImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getEventSeverity()
     * @generated
     */
    EClass EVENT_SEVERITY = eINSTANCE.getEventSeverity();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PreSpecifiedEventImpl <em>Pre Specified Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PreSpecifiedEventImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPreSpecifiedEvent()
     * @generated
     */
    EClass PRE_SPECIFIED_EVENT = eINSTANCE.getPreSpecifiedEvent();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyDayPeriodImpl <em>Study Day Period</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyDayPeriodImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyDayPeriod()
     * @generated
     */
    EClass STUDY_DAY_PERIOD = eINSTANCE.getStudyDayPeriod();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.VitalSignImpl <em>Vital Sign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.VitalSignImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getVitalSign()
     * @generated
     */
    EClass VITAL_SIGN = eINSTANCE.getVitalSign();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PlannedStudyDayImpl <em>Planned Study Day</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PlannedStudyDayImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPlannedStudyDay()
     * @generated
     */
    EClass PLANNED_STUDY_DAY = eINSTANCE.getPlannedStudyDay();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.TimingReferenceImpl <em>Timing Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.TimingReferenceImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getTimingReference()
     * @generated
     */
    EClass TIMING_REFERENCE = eINSTANCE.getTimingReference();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonPerformanceReasonImpl <em>Non Performance Reason</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonPerformanceReasonImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonPerformanceReason()
     * @generated
     */
    EClass NON_PERFORMANCE_REASON = eINSTANCE.getNonPerformanceReason();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ECGTestResultImpl <em>ECG Test Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ECGTestResultImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getECGTestResult()
     * @generated
     */
    EClass ECG_TEST_RESULT = eINSTANCE.getECGTestResult();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.BaselineIndicatorImpl <em>Baseline Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.BaselineIndicatorImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getBaselineIndicator()
     * @generated
     */
    EClass BASELINE_INDICATOR = eINSTANCE.getBaselineIndicator();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DerivedDataIndicatorImpl <em>Derived Data Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DerivedDataIndicatorImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDerivedDataIndicator()
     * @generated
     */
    EClass DERIVED_DATA_INDICATOR = eINSTANCE.getDerivedDataIndicator();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.InclusionorExclusionCriteriaNotMetImpl <em>Inclusionor Exclusion Criteria Not Met</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.InclusionorExclusionCriteriaNotMetImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getInclusionorExclusionCriteriaNotMet()
     * @generated
     */
    EClass INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET = eINSTANCE.getInclusionorExclusionCriteriaNotMet();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanLaboratoryTestResultImpl <em>Non Human Laboratory Test Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanLaboratoryTestResultImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonHumanLaboratoryTestResult()
     * @generated
     */
    EClass NON_HUMAN_LABORATORY_TEST_RESULT = eINSTANCE.getNonHumanLaboratoryTestResult();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SpecimenInformationImpl <em>Specimen Information</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SpecimenInformationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSpecimenInformation()
     * @generated
     */
    EClass SPECIMEN_INFORMATION = eINSTANCE.getSpecimenInformation();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PhysicalExaminationFindingImpl <em>Physical Examination Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PhysicalExaminationFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPhysicalExaminationFinding()
     * @generated
     */
    EClass PHYSICAL_EXAMINATION_FINDING = eINSTANCE.getPhysicalExaminationFinding();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySpecimenFindingImpl <em>Microbiology Specimen Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySpecimenFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMicrobiologySpecimenFinding()
     * @generated
     */
    EClass MICROBIOLOGY_SPECIMEN_FINDING = eINSTANCE.getMicrobiologySpecimenFinding();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySusceptibilityImpl <em>Microbiology Susceptibility</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySusceptibilityImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMicrobiologySusceptibility()
     * @generated
     */
    EClass MICROBIOLOGY_SUSCEPTIBILITY = eINSTANCE.getMicrobiologySusceptibility();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticConcentrationFindingImpl <em>Pharmacokinetic Concentration Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticConcentrationFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPharmacokineticConcentrationFinding()
     * @generated
     */
    EClass PHARMACOKINETIC_CONCENTRATION_FINDING = eINSTANCE.getPharmacokineticConcentrationFinding();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.FindingAboutImpl <em>Finding About</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.FindingAboutImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getFindingAbout()
     * @generated
     */
    EClass FINDING_ABOUT = eINSTANCE.getFindingAbout();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DrugAccountabilityImpl <em>Drug Accountability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DrugAccountabilityImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDrugAccountability()
     * @generated
     */
    EClass DRUG_ACCOUNTABILITY = eINSTANCE.getDrugAccountability();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectElementImpl <em>Subject Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectElementImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectElement()
     * @generated
     */
    EClass SUBJECT_ELEMENT = eINSTANCE.getSubjectElement();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyEpochImpl <em>Study Epoch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyEpochImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyEpoch()
     * @generated
     */
    EClass STUDY_EPOCH = eINSTANCE.getStudyEpoch();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubstanceUseImpl <em>Substance Use</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubstanceUseImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubstanceUse()
     * @generated
     */
    EClass SUBSTANCE_USE = eINSTANCE.getSubstanceUse();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ActivityStartTimingReferenceImpl <em>Activity Start Timing Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ActivityStartTimingReferenceImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getActivityStartTimingReference()
     * @generated
     */
    EClass ACTIVITY_START_TIMING_REFERENCE = eINSTANCE.getActivityStartTimingReference();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ActivityEndTimingReferenceImpl <em>Activity End Timing Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ActivityEndTimingReferenceImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getActivityEndTimingReference()
     * @generated
     */
    EClass ACTIVITY_END_TIMING_REFERENCE = eINSTANCE.getActivityEndTimingReference();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalDispositionImpl <em>Human Clinical Disposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalDispositionImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalDisposition()
     * @generated
     */
    EClass HUMAN_CLINICAL_DISPOSITION = eINSTANCE.getHumanClinicalDisposition();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MedicalHistoryItemImpl <em>Medical History Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MedicalHistoryItemImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMedicalHistoryItem()
     * @generated
     */
    EClass MEDICAL_HISTORY_ITEM = eINSTANCE.getMedicalHistoryItem();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ProtocolDeviationImpl <em>Protocol Deviation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ProtocolDeviationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getProtocolDeviation()
     * @generated
     */
    EClass PROTOCOL_DEVIATION = eINSTANCE.getProtocolDeviation();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ClinicalEventImpl <em>Clinical Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ClinicalEventImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getClinicalEvent()
     * @generated
     */
    EClass CLINICAL_EVENT = eINSTANCE.getClinicalEvent();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectCharacteristicImpl <em>Subject Characteristic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectCharacteristicImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectCharacteristic()
     * @generated
     */
    EClass SUBJECT_CHARACTERISTIC = eINSTANCE.getSubjectCharacteristic();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticParameterFindingImpl <em>Pharmacokinetic Parameter Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticParameterFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPharmacokineticParameterFinding()
     * @generated
     */
    EClass PHARMACOKINETIC_PARAMETER_FINDING = eINSTANCE.getPharmacokineticParameterFinding();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ConcomitantMedicationImpl <em>Concomitant Medication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ConcomitantMedicationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getConcomitantMedication()
     * @generated
     */
    EClass CONCOMITANT_MEDICATION = eINSTANCE.getConcomitantMedication();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ConsumableMaterialImpl <em>Consumable Material</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ConsumableMaterialImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getConsumableMaterial()
     * @generated
     */
    EClass CONSUMABLE_MATERIAL = eINSTANCE.getConsumableMaterial();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalExposureImpl <em>Human Clinical Exposure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalExposureImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalExposure()
     * @generated
     */
    EClass HUMAN_CLINICAL_EXPOSURE = eINSTANCE.getHumanClinicalExposure();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTestPerformerImpl <em>Study Test Performer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTestPerformerImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyTestPerformer()
     * @generated
     */
    EClass STUDY_TEST_PERFORMER = eINSTANCE.getStudyTestPerformer();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.QuestionnaireFindingImpl <em>Questionnaire Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.QuestionnaireFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getQuestionnaireFinding()
     * @generated
     */
    EClass QUESTIONNAIRE_FINDING = eINSTANCE.getQuestionnaireFinding();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyFindingEvaluatorImpl <em>Study Finding Evaluator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyFindingEvaluatorImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyFindingEvaluator()
     * @generated
     */
    EClass STUDY_FINDING_EVALUATOR = eINSTANCE.getStudyFindingEvaluator();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectDataNonClinicalTrialsImpl <em>Subject Data Non Clinical Trials</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectDataNonClinicalTrialsImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectDataNonClinicalTrials()
     * @generated
     */
    EClass SUBJECT_DATA_NON_CLINICAL_TRIALS = eINSTANCE.getSubjectDataNonClinicalTrials();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanSubjectDataDocumentBodyImpl <em>Non Human Subject Data Document Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanSubjectDataDocumentBodyImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonHumanSubjectDataDocumentBody()
     * @generated
     */
    EClass NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY = eINSTANCE.getNonHumanSubjectDataDocumentBody();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanExposureImpl <em>Non Human Exposure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanExposureImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonHumanExposure()
     * @generated
     */
    EClass NON_HUMAN_EXPOSURE = eINSTANCE.getNonHumanExposure();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanDispositionImpl <em>Non Human Disposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonHumanDispositionImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonHumanDisposition()
     * @generated
     */
    EClass NON_HUMAN_DISPOSITION = eINSTANCE.getNonHumanDisposition();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalLaboratoryTestResultImpl <em>Human Clinical Laboratory Test Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalLaboratoryTestResultImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalLaboratoryTestResult()
     * @generated
     */
    EClass HUMAN_CLINICAL_LABORATORY_TEST_RESULT = eINSTANCE.getHumanClinicalLaboratoryTestResult();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.BodyWeightImpl <em>Body Weight</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.BodyWeightImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getBodyWeight()
     * @generated
     */
    EClass BODY_WEIGHT = eINSTANCE.getBodyWeight();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.BodyWeightGainImpl <em>Body Weight Gain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.BodyWeightGainImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getBodyWeightGain()
     * @generated
     */
    EClass BODY_WEIGHT_GAIN = eINSTANCE.getBodyWeightGain();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ClinicalObservationImpl <em>Clinical Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ClinicalObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getClinicalObservation()
     * @generated
     */
    EClass CLINICAL_OBSERVATION = eINSTANCE.getClinicalObservation();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DeathDiagnosisImpl <em>Death Diagnosis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DeathDiagnosisImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDeathDiagnosis()
     * @generated
     */
    EClass DEATH_DIAGNOSIS = eINSTANCE.getDeathDiagnosis();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.FoodandWaterConsumptionImpl <em>Foodand Water Consumption</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.FoodandWaterConsumptionImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getFoodandWaterConsumption()
     * @generated
     */
    EClass FOODAND_WATER_CONSUMPTION = eINSTANCE.getFoodandWaterConsumption();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MacroscopicFindingImpl <em>Macroscopic Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MacroscopicFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMacroscopicFinding()
     * @generated
     */
    EClass MACROSCOPIC_FINDING = eINSTANCE.getMacroscopicFinding();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MicroscopicFindingsImpl <em>Microscopic Findings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MicroscopicFindingsImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMicroscopicFindings()
     * @generated
     */
    EClass MICROSCOPIC_FINDINGS = eINSTANCE.getMicroscopicFindings();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.OrganMeasurementImpl <em>Organ Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.OrganMeasurementImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getOrganMeasurement()
     * @generated
     */
    EClass ORGAN_MEASUREMENT = eINSTANCE.getOrganMeasurement();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PalpableMassImpl <em>Palpable Mass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PalpableMassImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPalpableMass()
     * @generated
     */
    EClass PALPABLE_MASS = eINSTANCE.getPalpableMass();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.TumorFindingImpl <em>Tumor Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.TumorFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getTumorFinding()
     * @generated
     */
    EClass TUMOR_FINDING = eINSTANCE.getTumorFinding();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectPoolImpl <em>Subject Pool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectPoolImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectPool()
     * @generated
     */
    EClass SUBJECT_POOL = eINSTANCE.getSubjectPool();

  }

} //SdtmPackage
