/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 *        annotation="http://www.openhealthtools.org/mdht/uml initializers='org.openhealthtools.mdht.uml.cda.sdtm'"
 * @generated
 */
public interface SdtmPackage extends EPackage {
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
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__ID = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__CODE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__CODE;

    /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__TITLE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__TITLE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__CONFIDENTIALITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SET_ID = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__SET_ID;

    /**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__VERSION_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER;

    /**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__COPY_TIME = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__COPY_TIME;

    /**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__RECORD_TARGET = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__AUTHOR;

    /**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__DATA_ENTERER = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__INFORMANT;

    /**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__CUSTODIAN = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN;

    /**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__INFORMATION_RECIPIENT = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT;

    /**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__LEGAL_AUTHENTICATOR = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

    /**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__AUTHENTICATOR = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__IN_FULFILLMENT_OF = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF;

    /**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__DOCUMENTATION_OF = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF;

    /**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__RELATED_DOCUMENT = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__AUTHORIZATION = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__COMPONENT_OF = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF;

    /**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__COMPONENT = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__COMPONENT;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE;

    /**
     * The number of structural features of the '<em>Subject Data Human Clinical Trials</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalSubjectDataDocumentSectionImpl <em>Human Clinical Subject Data Document Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalSubjectDataDocumentSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalSubjectDataDocumentSection()
     * @generated
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION = 1;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__ID = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__CODE;

    /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__TITLE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__TITLE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__TEXT;

    /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__CONFIDENTIALITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__CONFIDENTIALITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__SUBJECT;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__INFORMANT;

    /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__ENTRY = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__ENTRY;

    /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__COMPONENT = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__SECTION_ID = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__SECTION_ID;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__MOOD_CODE;

    /**
     * The number of structural features of the '<em>Human Clinical Subject Data Document Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.SECTION_FEATURE_COUNT + 0;

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
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Human Clinical Subject Demographics</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

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
    int DATA_COLLECTION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Data Collection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_COLLECTION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

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
    int EVENT_STUDY_DAY__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Event Study Day</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_STUDY_DAY_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

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
    int STUDY_ARM__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Study Arm</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_ARM_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.CommentImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getComment()
     * @generated
     */
    int COMMENT = 6;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DomainAssignmentImpl <em>Domain Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DomainAssignmentImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDomainAssignment()
     * @generated
     */
    int DOMAIN_ASSIGNMENT = 7;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Domain Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_ASSIGNMENT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.RelatedRecordImpl <em>Related Record</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.RelatedRecordImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getRelatedRecord()
     * @generated
     */
    int RELATED_RECORD = 8;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Related Record</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_RECORD_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SupplementalValueImpl <em>Supplemental Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SupplementalValueImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSupplementalValue()
     * @generated
     */
    int SUPPLEMENTAL_VALUE = 9;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Supplemental Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPPLEMENTAL_VALUE_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ReferencePeriodImpl <em>Reference Period</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ReferencePeriodImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getReferencePeriod()
     * @generated
     */
    int REFERENCE_PERIOD = 10;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Reference Period</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PERIOD_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.FindingAboutImpl <em>Finding About</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.FindingAboutImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getFindingAbout()
     * @generated
     */
    int FINDING_ABOUT = 11;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Finding About</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FINDING_ABOUT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.GroupIdentifierImpl <em>Group Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.GroupIdentifierImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getGroupIdentifier()
     * @generated
     */
    int GROUP_IDENTIFIER = 12;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Group Identifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_IDENTIFIER_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonPerformanceReasonImpl <em>Non Performance Reason</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonPerformanceReasonImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonPerformanceReason()
     * @generated
     */
    int NON_PERFORMANCE_REASON = 13;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Non Performance Reason</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PERFORMANCE_REASON_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.CategoryImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getCategory()
     * @generated
     */
    int CATEGORY = 14;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubCategoryImpl <em>Sub Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubCategoryImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubCategory()
     * @generated
     */
    int SUB_CATEGORY = 15;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Sub Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.VisitImpl <em>Visit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.VisitImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getVisit()
     * @generated
     */
    int VISIT = 16;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__ID = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__MOOD_CODE;

    /**
     * The feature id for the '<em><b>SDTC Discharge Disposition Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT__SDTC_DISCHARGE_DISPOSITION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER__SDTC_DISCHARGE_DISPOSITION_CODE;

    /**
     * The number of structural features of the '<em>Visit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ENCOUNTER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.VitalSignImpl <em>Vital Sign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.VitalSignImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getVitalSign()
     * @generated
     */
    int VITAL_SIGN = 17;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Vital Sign</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VITAL_SIGN_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.TimingReferenceImpl <em>Timing Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.TimingReferenceImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getTimingReference()
     * @generated
     */
    int TIMING_REFERENCE = 18;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Timing Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMING_REFERENCE_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PlannedStudyDayImpl <em>Planned Study Day</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PlannedStudyDayImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPlannedStudyDay()
     * @generated
     */
    int PLANNED_STUDY_DAY = 19;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Planned Study Day</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANNED_STUDY_DAY_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyDayPeriodImpl <em>Study Day Period</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyDayPeriodImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyDayPeriod()
     * @generated
     */
    int STUDY_DAY_PERIOD = 20;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Study Day Period</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_DAY_PERIOD_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ExclusionReasonImpl <em>Exclusion Reason</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ExclusionReasonImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getExclusionReason()
     * @generated
     */
    int EXCLUSION_REASON = 21;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Exclusion Reason</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSION_REASON_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PositionofSubjectImpl <em>Positionof Subject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PositionofSubjectImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPositionofSubject()
     * @generated
     */
    int POSITIONOF_SUBJECT = 22;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Positionof Subject</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONOF_SUBJECT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ECGTestResultImpl <em>ECG Test Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ECGTestResultImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getECGTestResult()
     * @generated
     */
    int ECG_TEST_RESULT = 23;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>ECG Test Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECG_TEST_RESULT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PhysicalExaminationFindingImpl <em>Physical Examination Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PhysicalExaminationFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPhysicalExaminationFinding()
     * @generated
     */
    int PHYSICAL_EXAMINATION_FINDING = 24;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Physical Examination Finding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_EXAMINATION_FINDING_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.BodySystemorOrganClassImpl <em>Body Systemor Organ Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.BodySystemorOrganClassImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getBodySystemorOrganClass()
     * @generated
     */
    int BODY_SYSTEMOR_ORGAN_CLASS = 25;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Body Systemor Organ Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_SYSTEMOR_ORGAN_CLASS_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySpecimenFindingImpl <em>Microbiology Specimen Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySpecimenFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMicrobiologySpecimenFinding()
     * @generated
     */
    int MICROBIOLOGY_SPECIMEN_FINDING = 26;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Microbiology Specimen Finding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SPECIMEN_FINDING_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SpecimenInformationImpl <em>Specimen Information</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SpecimenInformationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSpecimenInformation()
     * @generated
     */
    int SPECIMEN_INFORMATION = 27;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__ID = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__APPROACH_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__APPROACH_SITE_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Specimen Information</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIMEN_INFORMATION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.PROCEDURE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ResultCategoryImpl <em>Result Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ResultCategoryImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getResultCategory()
     * @generated
     */
    int RESULT_CATEGORY = 28;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Result Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_CATEGORY_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySusceptibilityImpl <em>Microbiology Susceptibility</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySusceptibilityImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMicrobiologySusceptibility()
     * @generated
     */
    int MICROBIOLOGY_SUSCEPTIBILITY = 29;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Microbiology Susceptibility</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROBIOLOGY_SUSCEPTIBILITY_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticConcentrationFindingImpl <em>Pharmacokinetic Concentration Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticConcentrationFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPharmacokineticConcentrationFinding()
     * @generated
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING = 30;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Pharmacokinetic Concentration Finding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_CONCENTRATION_FINDING_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.FastingStatusImpl <em>Fasting Status</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.FastingStatusImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getFastingStatus()
     * @generated
     */
    int FASTING_STATUS = 31;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Fasting Status</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FASTING_STATUS_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.AssayQuantitationImpl <em>Assay Quantitation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.AssayQuantitationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getAssayQuantitation()
     * @generated
     */
    int ASSAY_QUANTITATION = 32;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Assay Quantitation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSAY_QUANTITATION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DrugAccountabilityImpl <em>Drug Accountability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DrugAccountabilityImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDrugAccountability()
     * @generated
     */
    int DRUG_ACCOUNTABILITY = 33;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Drug Accountability</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DRUG_ACCOUNTABILITY_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalLaboratoryTestResultImpl <em>Human Clinical Laboratory Test Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalLaboratoryTestResultImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalLaboratoryTestResult()
     * @generated
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT = 34;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Human Clinical Laboratory Test Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_LABORATORY_TEST_RESULT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ToxicityImpl <em>Toxicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ToxicityImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getToxicity()
     * @generated
     */
    int TOXICITY = 35;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Toxicity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOXICITY_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.QuestionnaireFindingImpl <em>Questionnaire Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.QuestionnaireFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getQuestionnaireFinding()
     * @generated
     */
    int QUESTIONNAIRE_FINDING = 36;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Questionnaire Finding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_FINDING_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticParameterFindingImpl <em>Pharmacokinetic Parameter Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticParameterFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPharmacokineticParameterFinding()
     * @generated
     */
    int PHARMACOKINETIC_PARAMETER_FINDING = 37;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Pharmacokinetic Parameter Finding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHARMACOKINETIC_PARAMETER_FINDING_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectElementImpl <em>Subject Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectElementImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectElement()
     * @generated
     */
    int SUBJECT_ELEMENT = 38;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Subject Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_ELEMENT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyEpochImpl <em>Study Epoch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyEpochImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyEpoch()
     * @generated
     */
    int STUDY_EPOCH = 39;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Study Epoch</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_EPOCH_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalDispositionImpl <em>Human Clinical Disposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalDispositionImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalDisposition()
     * @generated
     */
    int HUMAN_CLINICAL_DISPOSITION = 40;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Human Clinical Disposition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_DISPOSITION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MedicalHistoryItemImpl <em>Medical History Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MedicalHistoryItemImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMedicalHistoryItem()
     * @generated
     */
    int MEDICAL_HISTORY_ITEM = 41;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Medical History Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICAL_HISTORY_ITEM_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PreSpecifiedEventImpl <em>Pre Specified Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PreSpecifiedEventImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPreSpecifiedEvent()
     * @generated
     */
    int PRE_SPECIFIED_EVENT = 42;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Pre Specified Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_SPECIFIED_EVENT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StartRelativetoReferencePeriodImpl <em>Start Relativeto Reference Period</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StartRelativetoReferencePeriodImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStartRelativetoReferencePeriod()
     * @generated
     */
    int START_RELATIVETO_REFERENCE_PERIOD = 43;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Start Relativeto Reference Period</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_RELATIVETO_REFERENCE_PERIOD_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StopRelativetoReferencePeriodImpl <em>Stop Relativeto Reference Period</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StopRelativetoReferencePeriodImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStopRelativetoReferencePeriod()
     * @generated
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD = 44;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Stop Relativeto Reference Period</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_RELATIVETO_REFERENCE_PERIOD_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ProtocolDeviationImpl <em>Protocol Deviation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ProtocolDeviationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getProtocolDeviation()
     * @generated
     */
    int PROTOCOL_DEVIATION = 45;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Protocol Deviation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_DEVIATION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ClinicalEventImpl <em>Clinical Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ClinicalEventImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getClinicalEvent()
     * @generated
     */
    int CLINICAL_EVENT = 46;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Clinical Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_EVENT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.EventorFindingSeverityImpl <em>Eventor Finding Severity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.EventorFindingSeverityImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getEventorFindingSeverity()
     * @generated
     */
    int EVENTOR_FINDING_SEVERITY = 47;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Eventor Finding Severity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTOR_FINDING_SEVERITY_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectCharacteristicImpl <em>Subject Characteristic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectCharacteristicImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectCharacteristic()
     * @generated
     */
    int SUBJECT_CHARACTERISTIC = 48;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Subject Characteristic</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_CHARACTERISTIC_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudySubjectEventImpl <em>Study Subject Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudySubjectEventImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudySubjectEvent()
     * @generated
     */
    int STUDY_SUBJECT_EVENT = 49;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Study Subject Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_EVENT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SeriousEventImpl <em>Serious Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SeriousEventImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSeriousEvent()
     * @generated
     */
    int SERIOUS_EVENT = 50;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Serious Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERIOUS_EVENT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTreatmentActionTakenImpl <em>Study Treatment Action Taken</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTreatmentActionTakenImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyTreatmentActionTaken()
     * @generated
     */
    int STUDY_TREATMENT_ACTION_TAKEN = 51;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Study Treatment Action Taken</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_ACTION_TAKEN_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.OtherTreatmentActionTakenImpl <em>Other Treatment Action Taken</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.OtherTreatmentActionTakenImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getOtherTreatmentActionTaken()
     * @generated
     */
    int OTHER_TREATMENT_ACTION_TAKEN = 52;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Other Treatment Action Taken</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OTHER_TREATMENT_ACTION_TAKEN_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTreatmentCausalityImpl <em>Study Treatment Causality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTreatmentCausalityImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyTreatmentCausality()
     * @generated
     */
    int STUDY_TREATMENT_CAUSALITY = 53;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Study Treatment Causality</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TREATMENT_CAUSALITY_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonStudyTreatmentRelationshipImpl <em>Non Study Treatment Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonStudyTreatmentRelationshipImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonStudyTreatmentRelationship()
     * @generated
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP = 54;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Non Study Treatment Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_STUDY_TREATMENT_RELATIONSHIP_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.EventPatternImpl <em>Event Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.EventPatternImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getEventPattern()
     * @generated
     */
    int EVENT_PATTERN = 55;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.EventOutcomeImpl <em>Event Outcome</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.EventOutcomeImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getEventOutcome()
     * @generated
     */
    int EVENT_OUTCOME = 56;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Event Outcome</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OUTCOME_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ConcomitantTreatmentImpl <em>Concomitant Treatment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ConcomitantTreatmentImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getConcomitantTreatment()
     * @generated
     */
    int CONCOMITANT_TREATMENT = 57;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Concomitant Treatment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_TREATMENT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.EventDurationImpl <em>Event Duration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.EventDurationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getEventDuration()
     * @generated
     */
    int EVENT_DURATION = 58;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Event Duration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DURATION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudySubjectFindingImpl <em>Study Subject Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudySubjectFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudySubjectFinding()
     * @generated
     */
    int STUDY_SUBJECT_FINDING = 59;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Study Subject Finding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_FINDING_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DeathRelationshipImpl <em>Death Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DeathRelationshipImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDeathRelationship()
     * @generated
     */
    int DEATH_RELATIONSHIP = 60;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Death Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_RELATIONSHIP_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudySubjectInterventionImpl <em>Study Subject Intervention</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudySubjectInterventionImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudySubjectIntervention()
     * @generated
     */
    int STUDY_SUBJECT_INTERVENTION = 61;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Route Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__ROUTE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

    /**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__APPROACH_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

    /**
     * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__DOSE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

    /**
     * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__RATE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

    /**
     * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__MAX_DOSE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

    /**
     * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__ADMINISTRATION_UNIT_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Consumable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__CONSUMABLE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Study Subject Intervention</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_SUBJECT_INTERVENTION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.IndicationImpl <em>Indication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.IndicationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getIndication()
     * @generated
     */
    int INDICATION = 62;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Indication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.IntendedRegimenImpl <em>Intended Regimen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.IntendedRegimenImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getIntendedRegimen()
     * @generated
     */
    int INTENDED_REGIMEN = 63;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Intended Regimen</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTENDED_REGIMEN_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DoseAdjustmentReasonImpl <em>Dose Adjustment Reason</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DoseAdjustmentReasonImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDoseAdjustmentReason()
     * @generated
     */
    int DOSE_ADJUSTMENT_REASON = 64;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Dose Adjustment Reason</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOSE_ADJUSTMENT_REASON_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.AdverseEventImpl <em>Adverse Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.AdverseEventImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getAdverseEvent()
     * @generated
     */
    int ADVERSE_EVENT = 65;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Adverse Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERSE_EVENT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.InclusionorExclusionCriteriaNotMetImpl <em>Inclusionor Exclusion Criteria Not Met</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.InclusionorExclusionCriteriaNotMetImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getInclusionorExclusionCriteriaNotMet()
     * @generated
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET = 66;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Inclusionor Exclusion Criteria Not Met</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ConcomitantMedicationImpl <em>Concomitant Medication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ConcomitantMedicationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getConcomitantMedication()
     * @generated
     */
    int CONCOMITANT_MEDICATION = 67;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Route Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__ROUTE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

    /**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__APPROACH_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

    /**
     * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__DOSE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

    /**
     * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__RATE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

    /**
     * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__MAX_DOSE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

    /**
     * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__ADMINISTRATION_UNIT_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Consumable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__CONSUMABLE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Concomitant Medication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCOMITANT_MEDICATION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ConsumableMaterialImpl <em>Consumable Material</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ConsumableMaterialImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getConsumableMaterial()
     * @generated
     */
    int CONSUMABLE_MATERIAL = 68;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMABLE_MATERIAL__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.CONSUMABLE__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMABLE_MATERIAL__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.CONSUMABLE__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMABLE_MATERIAL__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.CONSUMABLE__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Manufactured Product</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMABLE_MATERIAL__MANUFACTURED_PRODUCT = org.eclipse.mdht.uml.cda.CDAPackage.CONSUMABLE__MANUFACTURED_PRODUCT;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMABLE_MATERIAL__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.CONSUMABLE__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Type Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMABLE_MATERIAL__TYPE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.CONSUMABLE__TYPE_CODE;

    /**
     * The number of structural features of the '<em>Consumable Material</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMABLE_MATERIAL_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.CONSUMABLE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalExposureImpl <em>Human Clinical Exposure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalExposureImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalExposure()
     * @generated
     */
    int HUMAN_CLINICAL_EXPOSURE = 69;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Route Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__ROUTE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

    /**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__APPROACH_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

    /**
     * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__DOSE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

    /**
     * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__RATE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

    /**
     * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__MAX_DOSE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

    /**
     * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__ADMINISTRATION_UNIT_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Consumable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__CONSUMABLE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Human Clinical Exposure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_CLINICAL_EXPOSURE_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubstanceUseImpl <em>Substance Use</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubstanceUseImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubstanceUse()
     * @generated
     */
    int SUBSTANCE_USE = 70;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Route Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__ROUTE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

    /**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__APPROACH_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

    /**
     * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__DOSE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

    /**
     * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__RATE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

    /**
     * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__MAX_DOSE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

    /**
     * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__ADMINISTRATION_UNIT_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Consumable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__CONSUMABLE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Substance Use</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTANCE_USE_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanLaboratoryTestResultImpl <em>Nonhuman Laboratory Test Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanLaboratoryTestResultImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonhumanLaboratoryTestResult()
     * @generated
     */
    int NONHUMAN_LABORATORY_TEST_RESULT = 71;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Nonhuman Laboratory Test Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_LABORATORY_TEST_RESULT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTestOrganizationImpl <em>Study Test Organization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTestOrganizationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyTestOrganization()
     * @generated
     */
    int STUDY_TEST_ORGANIZATION = 72;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TEST_ORGANIZATION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TEST_ORGANIZATION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TEST_ORGANIZATION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TEST_ORGANIZATION__TIME = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__TIME;

    /**
     * The feature id for the '<em><b>Awareness Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TEST_ORGANIZATION__AWARENESS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__AWARENESS_CODE;

    /**
     * The feature id for the '<em><b>Participant Role</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TEST_ORGANIZATION__PARTICIPANT_ROLE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__PARTICIPANT_ROLE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TEST_ORGANIZATION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Type Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TEST_ORGANIZATION__TYPE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__TYPE_CODE;

    /**
     * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TEST_ORGANIZATION__CONTEXT_CONTROL_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__CONTEXT_CONTROL_CODE;

    /**
     * The number of structural features of the '<em>Study Test Organization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_TEST_ORGANIZATION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyFindingEvaluatorImpl <em>Study Finding Evaluator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyFindingEvaluatorImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyFindingEvaluator()
     * @generated
     */
    int STUDY_FINDING_EVALUATOR = 73;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_FINDING_EVALUATOR__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_FINDING_EVALUATOR__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_FINDING_EVALUATOR__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_FINDING_EVALUATOR__TIME = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__TIME;

    /**
     * The feature id for the '<em><b>Awareness Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_FINDING_EVALUATOR__AWARENESS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__AWARENESS_CODE;

    /**
     * The feature id for the '<em><b>Participant Role</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_FINDING_EVALUATOR__PARTICIPANT_ROLE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__PARTICIPANT_ROLE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_FINDING_EVALUATOR__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Type Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_FINDING_EVALUATOR__TYPE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__TYPE_CODE;

    /**
     * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_FINDING_EVALUATOR__CONTEXT_CONTROL_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__CONTEXT_CONTROL_CODE;

    /**
     * The number of structural features of the '<em>Study Finding Evaluator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUDY_FINDING_EVALUATOR_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectDataNonClinicalTrialsImpl <em>Subject Data Non Clinical Trials</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectDataNonClinicalTrialsImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectDataNonClinicalTrials()
     * @generated
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS = 74;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__ID = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__CODE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__CODE;

    /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__TITLE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__TITLE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__CONFIDENTIALITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__SET_ID = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__SET_ID;

    /**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__VERSION_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER;

    /**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__COPY_TIME = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__COPY_TIME;

    /**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__RECORD_TARGET = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__AUTHOR;

    /**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__DATA_ENTERER = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__INFORMANT;

    /**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__CUSTODIAN = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN;

    /**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__INFORMATION_RECIPIENT = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT;

    /**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__LEGAL_AUTHENTICATOR = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

    /**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__AUTHENTICATOR = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__IN_FULFILLMENT_OF = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF;

    /**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__DOCUMENTATION_OF = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF;

    /**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__RELATED_DOCUMENT = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__AUTHORIZATION = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__COMPONENT_OF = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF;

    /**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__COMPONENT = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__COMPONENT;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE;

    /**
     * The number of structural features of the '<em>Subject Data Non Clinical Trials</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_DATA_NON_CLINICAL_TRIALS_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.CLINICAL_DOCUMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanSubjectDataDocumentSectionImpl <em>Nonhuman Subject Data Document Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanSubjectDataDocumentSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonhumanSubjectDataDocumentSection()
     * @generated
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION = 75;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__ID = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__CODE;

    /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__TITLE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__TITLE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__TEXT;

    /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__CONFIDENTIALITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__CONFIDENTIALITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__SUBJECT;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__INFORMANT;

    /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__ENTRY = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__ENTRY;

    /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__COMPONENT = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__SECTION_ID = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__SECTION_ID;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SECTION__MOOD_CODE;

    /**
     * The number of structural features of the '<em>Nonhuman Subject Data Document Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.SECTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanSubjectDemographicsImpl <em>Nonhuman Subject Demographics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanSubjectDemographicsImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonhumanSubjectDemographics()
     * @generated
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS = 76;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Nonhuman Subject Demographics</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_SUBJECT_DEMOGRAPHICS_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanDispositionImpl <em>Nonhuman Disposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanDispositionImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonhumanDisposition()
     * @generated
     */
    int NONHUMAN_DISPOSITION = 77;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Nonhuman Disposition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_DISPOSITION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanExposureImpl <em>Nonhuman Exposure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanExposureImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonhumanExposure()
     * @generated
     */
    int NONHUMAN_EXPOSURE = 78;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__ID = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Route Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__ROUTE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

    /**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__APPROACH_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

    /**
     * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__DOSE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

    /**
     * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__RATE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

    /**
     * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__MAX_DOSE_QUANTITY = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

    /**
     * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__ADMINISTRATION_UNIT_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Consumable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__CONSUMABLE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Nonhuman Exposure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONHUMAN_EXPOSURE_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.BodyWeightImpl <em>Body Weight</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.BodyWeightImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getBodyWeight()
     * @generated
     */
    int BODY_WEIGHT = 79;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Body Weight</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.BodyWeightGainImpl <em>Body Weight Gain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.BodyWeightGainImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getBodyWeightGain()
     * @generated
     */
    int BODY_WEIGHT_GAIN = 80;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Body Weight Gain</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_WEIGHT_GAIN_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ClinicalObservationImpl <em>Clinical Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ClinicalObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getClinicalObservation()
     * @generated
     */
    int CLINICAL_OBSERVATION = 81;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Clinical Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLINICAL_OBSERVATION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DeathDiagnosisImpl <em>Death Diagnosis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DeathDiagnosisImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDeathDiagnosis()
     * @generated
     */
    int DEATH_DIAGNOSIS = 82;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Death Diagnosis</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEATH_DIAGNOSIS_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.FoodandWaterConsumptionImpl <em>Foodand Water Consumption</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.FoodandWaterConsumptionImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getFoodandWaterConsumption()
     * @generated
     */
    int FOODAND_WATER_CONSUMPTION = 83;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Foodand Water Consumption</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOODAND_WATER_CONSUMPTION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MacroscopicFindingImpl <em>Macroscopic Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MacroscopicFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMacroscopicFinding()
     * @generated
     */
    int MACROSCOPIC_FINDING = 84;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Macroscopic Finding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROSCOPIC_FINDING_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MicroscopicFindingImpl <em>Microscopic Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MicroscopicFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMicroscopicFinding()
     * @generated
     */
    int MICROSCOPIC_FINDING = 85;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Microscopic Finding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSCOPIC_FINDING_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.OrganMeasurementImpl <em>Organ Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.OrganMeasurementImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getOrganMeasurement()
     * @generated
     */
    int ORGAN_MEASUREMENT = 86;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Organ Measurement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORGAN_MEASUREMENT_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PalpableMassImpl <em>Palpable Mass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PalpableMassImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPalpableMass()
     * @generated
     */
    int PALPABLE_MASS = 87;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Palpable Mass</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PALPABLE_MASS_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.TumorFindingImpl <em>Tumor Finding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.TumorFindingImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getTumorFinding()
     * @generated
     */
    int TUMOR_FINDING = 88;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CODE;

    /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__DERIVATION_EXPR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__DERIVATION_EXPR;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__REPEAT_NUMBER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REPEAT_NUMBER;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__METHOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__METHOD_CODE;

    /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__TARGET_SITE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__TARGET_SITE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__PRECONDITION;

    /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__REFERENCE_RANGE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__REFERENCE_RANGE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Tumor Finding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUMOR_FINDING_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectPoolImpl <em>Subject Pool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubjectPoolImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubjectPool()
     * @generated
     */
    int SUBJECT_POOL = 89;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__ID = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__TEXT;

    /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__STATUS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__STATUS_CODE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__EFFECTIVE_TIME = org.eclipse.mdht.uml.cda.CDAPackage.ACT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__PRIORITY_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRIORITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__LANGUAGE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__SUBJECT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SUBJECT;

    /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__SPECIMEN = org.eclipse.mdht.uml.cda.CDAPackage.ACT__SPECIMEN;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__PERFORMER = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PERFORMER;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__AUTHOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__INFORMANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__INFORMANT;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__PARTICIPANT = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__ENTRY_RELATIONSHIP = org.eclipse.mdht.uml.cda.CDAPackage.ACT__ENTRY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__REFERENCE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__REFERENCE;

    /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__PRECONDITION = org.eclipse.mdht.uml.cda.CDAPackage.ACT__PRECONDITION;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.ACT__MOOD_CODE;

    /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL__NEGATION_IND = org.eclipse.mdht.uml.cda.CDAPackage.ACT__NEGATION_IND;

    /**
     * The number of structural features of the '<em>Subject Pool</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_POOL_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.ACT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MassIdentificationImpl <em>Mass Identification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MassIdentificationImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMassIdentification()
     * @generated
     */
    int MASS_IDENTIFICATION = 90;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASS_IDENTIFICATION__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASS_IDENTIFICATION__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASS_IDENTIFICATION__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASS_IDENTIFICATION__TIME = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__TIME;

    /**
     * The feature id for the '<em><b>Awareness Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASS_IDENTIFICATION__AWARENESS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__AWARENESS_CODE;

    /**
     * The feature id for the '<em><b>Participant Role</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASS_IDENTIFICATION__PARTICIPANT_ROLE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__PARTICIPANT_ROLE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASS_IDENTIFICATION__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Type Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASS_IDENTIFICATION__TYPE_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__TYPE_CODE;

    /**
     * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASS_IDENTIFICATION__CONTEXT_CONTROL_CODE = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2__CONTEXT_CONTROL_CODE;

    /**
     * The number of structural features of the '<em>Mass Identification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASS_IDENTIFICATION_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.PARTICIPANT2_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ReferenceRangeImpl <em>Reference Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ReferenceRangeImpl
     * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getReferenceRange()
     * @generated
     */
    int REFERENCE_RANGE = 91;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_RANGE__REALM_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_RANGE__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_RANGE__TYPE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_RANGE__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_RANGE__TEMPLATE_ID = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_RANGE__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_RANGE__CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_RANGE__CODE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_RANGE__TEXT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_RANGE__TEXT;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_RANGE__VALUE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_RANGE__VALUE;

    /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_RANGE__INTERPRETATION_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_RANGE__INTERPRETATION_CODE;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_RANGE__NULL_FLAVOR = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_RANGE__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_RANGE__CLASS_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_RANGE__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_RANGE__MOOD_CODE = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_RANGE__MOOD_CODE;

    /**
     * The number of structural features of the '<em>Reference Range</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_RANGE_FEATURE_COUNT = org.eclipse.mdht.uml.cda.CDAPackage.OBSERVATION_RANGE_FEATURE_COUNT + 0;


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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection <em>Human Clinical Subject Data Document Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Human Clinical Subject Data Document Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection
     * @generated
     */
    EClass getHumanClinicalSubjectDataDocumentSection();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.Comment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comment</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.Comment
     * @generated
     */
    EClass getComment();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment <em>Domain Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Domain Assignment</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment
     * @generated
     */
    EClass getDomainAssignment();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord <em>Related Record</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Related Record</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord
     * @generated
     */
    EClass getRelatedRecord();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue <em>Supplemental Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Supplemental Value</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue
     * @generated
     */
    EClass getSupplementalValue();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ReferencePeriod <em>Reference Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Period</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.ReferencePeriod
     * @generated
     */
    EClass getReferencePeriod();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier <em>Group Identifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Group Identifier</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier
     * @generated
     */
    EClass getGroupIdentifier();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.Category <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Category</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.Category
     * @generated
     */
    EClass getCategory();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubCategory <em>Sub Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Category</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.SubCategory
     * @generated
     */
    EClass getSubCategory();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign <em>Vital Sign</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Vital Sign</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.VitalSign
     * @generated
     */
    EClass getVitalSign();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay <em>Planned Study Day</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Planned Study Day</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay
     * @generated
     */
    EClass getPlannedStudyDay();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason <em>Exclusion Reason</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exclusion Reason</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason
     * @generated
     */
    EClass getExclusionReason();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject <em>Positionof Subject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Positionof Subject</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject
     * @generated
     */
    EClass getPositionofSubject();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding <em>Physical Examination Finding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Physical Examination Finding</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding
     * @generated
     */
    EClass getPhysicalExaminationFinding();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding <em>Microbiology Specimen Finding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Microbiology Specimen Finding</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding
     * @generated
     */
    EClass getMicrobiologySpecimenFinding();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory <em>Result Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result Category</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory
     * @generated
     */
    EClass getResultCategory();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus <em>Fasting Status</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fasting Status</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus
     * @generated
     */
    EClass getFastingStatus();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation <em>Assay Quantitation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assay Quantitation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation
     * @generated
     */
    EClass getAssayQuantitation();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult <em>Human Clinical Laboratory Test Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Human Clinical Laboratory Test Result</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult
     * @generated
     */
    EClass getHumanClinicalLaboratoryTestResult();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.Toxicity <em>Toxicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Toxicity</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.Toxicity
     * @generated
     */
    EClass getToxicity();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding <em>Pharmacokinetic Parameter Finding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pharmacokinetic Parameter Finding</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding
     * @generated
     */
    EClass getPharmacokineticParameterFinding();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent <em>Pre Specified Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pre Specified Event</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent
     * @generated
     */
    EClass getPreSpecifiedEvent();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod <em>Start Relativeto Reference Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Start Relativeto Reference Period</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod
     * @generated
     */
    EClass getStartRelativetoReferencePeriod();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod <em>Stop Relativeto Reference Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Stop Relativeto Reference Period</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod
     * @generated
     */
    EClass getStopRelativetoReferencePeriod();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity <em>Eventor Finding Severity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Eventor Finding Severity</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity
     * @generated
     */
    EClass getEventorFindingSeverity();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent <em>Study Subject Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Study Subject Event</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent
     * @generated
     */
    EClass getStudySubjectEvent();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent <em>Serious Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Serious Event</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent
     * @generated
     */
    EClass getSeriousEvent();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken <em>Study Treatment Action Taken</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Study Treatment Action Taken</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken
     * @generated
     */
    EClass getStudyTreatmentActionTaken();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken <em>Other Treatment Action Taken</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Other Treatment Action Taken</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken
     * @generated
     */
    EClass getOtherTreatmentActionTaken();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality <em>Study Treatment Causality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Study Treatment Causality</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality
     * @generated
     */
    EClass getStudyTreatmentCausality();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship <em>Non Study Treatment Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Non Study Treatment Relationship</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship
     * @generated
     */
    EClass getNonStudyTreatmentRelationship();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventPattern <em>Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Pattern</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.EventPattern
     * @generated
     */
    EClass getEventPattern();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventOutcome <em>Event Outcome</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Outcome</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.EventOutcome
     * @generated
     */
    EClass getEventOutcome();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment <em>Concomitant Treatment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Concomitant Treatment</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment
     * @generated
     */
    EClass getConcomitantTreatment();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventDuration <em>Event Duration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Duration</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.EventDuration
     * @generated
     */
    EClass getEventDuration();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding <em>Study Subject Finding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Study Subject Finding</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding
     * @generated
     */
    EClass getStudySubjectFinding();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship <em>Death Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Death Relationship</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship
     * @generated
     */
    EClass getDeathRelationship();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention <em>Study Subject Intervention</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Study Subject Intervention</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention
     * @generated
     */
    EClass getStudySubjectIntervention();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.Indication <em>Indication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Indication</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.Indication
     * @generated
     */
    EClass getIndication();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.IntendedRegimen <em>Intended Regimen</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intended Regimen</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.IntendedRegimen
     * @generated
     */
    EClass getIntendedRegimen();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DoseAdjustmentReason <em>Dose Adjustment Reason</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dose Adjustment Reason</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.DoseAdjustmentReason
     * @generated
     */
    EClass getDoseAdjustmentReason();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet <em>Inclusionor Exclusion Criteria Not Met</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inclusionor Exclusion Criteria Not Met</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet
     * @generated
     */
    EClass getInclusionorExclusionCriteriaNotMet();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse <em>Substance Use</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Substance Use</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse
     * @generated
     */
    EClass getSubstanceUse();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult <em>Nonhuman Laboratory Test Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Nonhuman Laboratory Test Result</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult
     * @generated
     */
    EClass getNonhumanLaboratoryTestResult();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization <em>Study Test Organization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Study Test Organization</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization
     * @generated
     */
    EClass getStudyTestOrganization();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection <em>Nonhuman Subject Data Document Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Nonhuman Subject Data Document Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection
     * @generated
     */
    EClass getNonhumanSubjectDataDocumentSection();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics <em>Nonhuman Subject Demographics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Nonhuman Subject Demographics</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics
     * @generated
     */
    EClass getNonhumanSubjectDemographics();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition <em>Nonhuman Disposition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Nonhuman Disposition</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition
     * @generated
     */
    EClass getNonhumanDisposition();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure <em>Nonhuman Exposure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Nonhuman Exposure</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure
     * @generated
     */
    EClass getNonhumanExposure();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding <em>Microscopic Finding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Microscopic Finding</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding
     * @generated
     */
    EClass getMicroscopicFinding();

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
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification <em>Mass Identification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mass Identification</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification
     * @generated
     */
    EClass getMassIdentification();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ReferenceRange <em>Reference Range</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Range</em>'.
     * @see org.openhealthtools.mdht.uml.cda.sdtm.ReferenceRange
     * @generated
     */
    EClass getReferenceRange();

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
     */interface Literals {
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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalSubjectDataDocumentSectionImpl <em>Human Clinical Subject Data Document Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalSubjectDataDocumentSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalSubjectDataDocumentSection()
         * @generated
         */
        EClass HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION = eINSTANCE.getHumanClinicalSubjectDataDocumentSection();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.CommentImpl <em>Comment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.CommentImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getComment()
         * @generated
         */
        EClass COMMENT = eINSTANCE.getComment();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DomainAssignmentImpl <em>Domain Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DomainAssignmentImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDomainAssignment()
         * @generated
         */
        EClass DOMAIN_ASSIGNMENT = eINSTANCE.getDomainAssignment();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.RelatedRecordImpl <em>Related Record</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.RelatedRecordImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getRelatedRecord()
         * @generated
         */
        EClass RELATED_RECORD = eINSTANCE.getRelatedRecord();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SupplementalValueImpl <em>Supplemental Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SupplementalValueImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSupplementalValue()
         * @generated
         */
        EClass SUPPLEMENTAL_VALUE = eINSTANCE.getSupplementalValue();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ReferencePeriodImpl <em>Reference Period</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ReferencePeriodImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getReferencePeriod()
         * @generated
         */
        EClass REFERENCE_PERIOD = eINSTANCE.getReferencePeriod();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.GroupIdentifierImpl <em>Group Identifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.GroupIdentifierImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getGroupIdentifier()
         * @generated
         */
        EClass GROUP_IDENTIFIER = eINSTANCE.getGroupIdentifier();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.CategoryImpl <em>Category</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.CategoryImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getCategory()
         * @generated
         */
        EClass CATEGORY = eINSTANCE.getCategory();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubCategoryImpl <em>Sub Category</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubCategoryImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubCategory()
         * @generated
         */
        EClass SUB_CATEGORY = eINSTANCE.getSubCategory();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.VitalSignImpl <em>Vital Sign</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.VitalSignImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getVitalSign()
         * @generated
         */
        EClass VITAL_SIGN = eINSTANCE.getVitalSign();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PlannedStudyDayImpl <em>Planned Study Day</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PlannedStudyDayImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPlannedStudyDay()
         * @generated
         */
        EClass PLANNED_STUDY_DAY = eINSTANCE.getPlannedStudyDay();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ExclusionReasonImpl <em>Exclusion Reason</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ExclusionReasonImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getExclusionReason()
         * @generated
         */
        EClass EXCLUSION_REASON = eINSTANCE.getExclusionReason();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PositionofSubjectImpl <em>Positionof Subject</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PositionofSubjectImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPositionofSubject()
         * @generated
         */
        EClass POSITIONOF_SUBJECT = eINSTANCE.getPositionofSubject();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PhysicalExaminationFindingImpl <em>Physical Examination Finding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PhysicalExaminationFindingImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPhysicalExaminationFinding()
         * @generated
         */
        EClass PHYSICAL_EXAMINATION_FINDING = eINSTANCE.getPhysicalExaminationFinding();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySpecimenFindingImpl <em>Microbiology Specimen Finding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MicrobiologySpecimenFindingImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMicrobiologySpecimenFinding()
         * @generated
         */
        EClass MICROBIOLOGY_SPECIMEN_FINDING = eINSTANCE.getMicrobiologySpecimenFinding();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ResultCategoryImpl <em>Result Category</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ResultCategoryImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getResultCategory()
         * @generated
         */
        EClass RESULT_CATEGORY = eINSTANCE.getResultCategory();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.FastingStatusImpl <em>Fasting Status</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.FastingStatusImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getFastingStatus()
         * @generated
         */
        EClass FASTING_STATUS = eINSTANCE.getFastingStatus();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.AssayQuantitationImpl <em>Assay Quantitation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.AssayQuantitationImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getAssayQuantitation()
         * @generated
         */
        EClass ASSAY_QUANTITATION = eINSTANCE.getAssayQuantitation();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalLaboratoryTestResultImpl <em>Human Clinical Laboratory Test Result</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.HumanClinicalLaboratoryTestResultImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getHumanClinicalLaboratoryTestResult()
         * @generated
         */
        EClass HUMAN_CLINICAL_LABORATORY_TEST_RESULT = eINSTANCE.getHumanClinicalLaboratoryTestResult();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ToxicityImpl <em>Toxicity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ToxicityImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getToxicity()
         * @generated
         */
        EClass TOXICITY = eINSTANCE.getToxicity();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticParameterFindingImpl <em>Pharmacokinetic Parameter Finding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PharmacokineticParameterFindingImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPharmacokineticParameterFinding()
         * @generated
         */
        EClass PHARMACOKINETIC_PARAMETER_FINDING = eINSTANCE.getPharmacokineticParameterFinding();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.PreSpecifiedEventImpl <em>Pre Specified Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.PreSpecifiedEventImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getPreSpecifiedEvent()
         * @generated
         */
        EClass PRE_SPECIFIED_EVENT = eINSTANCE.getPreSpecifiedEvent();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StartRelativetoReferencePeriodImpl <em>Start Relativeto Reference Period</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StartRelativetoReferencePeriodImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStartRelativetoReferencePeriod()
         * @generated
         */
        EClass START_RELATIVETO_REFERENCE_PERIOD = eINSTANCE.getStartRelativetoReferencePeriod();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StopRelativetoReferencePeriodImpl <em>Stop Relativeto Reference Period</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StopRelativetoReferencePeriodImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStopRelativetoReferencePeriod()
         * @generated
         */
        EClass STOP_RELATIVETO_REFERENCE_PERIOD = eINSTANCE.getStopRelativetoReferencePeriod();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.EventorFindingSeverityImpl <em>Eventor Finding Severity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.EventorFindingSeverityImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getEventorFindingSeverity()
         * @generated
         */
        EClass EVENTOR_FINDING_SEVERITY = eINSTANCE.getEventorFindingSeverity();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudySubjectEventImpl <em>Study Subject Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudySubjectEventImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudySubjectEvent()
         * @generated
         */
        EClass STUDY_SUBJECT_EVENT = eINSTANCE.getStudySubjectEvent();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SeriousEventImpl <em>Serious Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SeriousEventImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSeriousEvent()
         * @generated
         */
        EClass SERIOUS_EVENT = eINSTANCE.getSeriousEvent();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTreatmentActionTakenImpl <em>Study Treatment Action Taken</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTreatmentActionTakenImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyTreatmentActionTaken()
         * @generated
         */
        EClass STUDY_TREATMENT_ACTION_TAKEN = eINSTANCE.getStudyTreatmentActionTaken();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.OtherTreatmentActionTakenImpl <em>Other Treatment Action Taken</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.OtherTreatmentActionTakenImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getOtherTreatmentActionTaken()
         * @generated
         */
        EClass OTHER_TREATMENT_ACTION_TAKEN = eINSTANCE.getOtherTreatmentActionTaken();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTreatmentCausalityImpl <em>Study Treatment Causality</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTreatmentCausalityImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyTreatmentCausality()
         * @generated
         */
        EClass STUDY_TREATMENT_CAUSALITY = eINSTANCE.getStudyTreatmentCausality();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonStudyTreatmentRelationshipImpl <em>Non Study Treatment Relationship</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonStudyTreatmentRelationshipImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonStudyTreatmentRelationship()
         * @generated
         */
        EClass NON_STUDY_TREATMENT_RELATIONSHIP = eINSTANCE.getNonStudyTreatmentRelationship();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.EventPatternImpl <em>Event Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.EventPatternImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getEventPattern()
         * @generated
         */
        EClass EVENT_PATTERN = eINSTANCE.getEventPattern();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.EventOutcomeImpl <em>Event Outcome</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.EventOutcomeImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getEventOutcome()
         * @generated
         */
        EClass EVENT_OUTCOME = eINSTANCE.getEventOutcome();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ConcomitantTreatmentImpl <em>Concomitant Treatment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ConcomitantTreatmentImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getConcomitantTreatment()
         * @generated
         */
        EClass CONCOMITANT_TREATMENT = eINSTANCE.getConcomitantTreatment();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.EventDurationImpl <em>Event Duration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.EventDurationImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getEventDuration()
         * @generated
         */
        EClass EVENT_DURATION = eINSTANCE.getEventDuration();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudySubjectFindingImpl <em>Study Subject Finding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudySubjectFindingImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudySubjectFinding()
         * @generated
         */
        EClass STUDY_SUBJECT_FINDING = eINSTANCE.getStudySubjectFinding();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DeathRelationshipImpl <em>Death Relationship</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DeathRelationshipImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDeathRelationship()
         * @generated
         */
        EClass DEATH_RELATIONSHIP = eINSTANCE.getDeathRelationship();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudySubjectInterventionImpl <em>Study Subject Intervention</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudySubjectInterventionImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudySubjectIntervention()
         * @generated
         */
        EClass STUDY_SUBJECT_INTERVENTION = eINSTANCE.getStudySubjectIntervention();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.IndicationImpl <em>Indication</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.IndicationImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getIndication()
         * @generated
         */
        EClass INDICATION = eINSTANCE.getIndication();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.IntendedRegimenImpl <em>Intended Regimen</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.IntendedRegimenImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getIntendedRegimen()
         * @generated
         */
        EClass INTENDED_REGIMEN = eINSTANCE.getIntendedRegimen();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.DoseAdjustmentReasonImpl <em>Dose Adjustment Reason</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.DoseAdjustmentReasonImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getDoseAdjustmentReason()
         * @generated
         */
        EClass DOSE_ADJUSTMENT_REASON = eINSTANCE.getDoseAdjustmentReason();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.InclusionorExclusionCriteriaNotMetImpl <em>Inclusionor Exclusion Criteria Not Met</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.InclusionorExclusionCriteriaNotMetImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getInclusionorExclusionCriteriaNotMet()
         * @generated
         */
        EClass INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET = eINSTANCE.getInclusionorExclusionCriteriaNotMet();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.SubstanceUseImpl <em>Substance Use</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SubstanceUseImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getSubstanceUse()
         * @generated
         */
        EClass SUBSTANCE_USE = eINSTANCE.getSubstanceUse();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanLaboratoryTestResultImpl <em>Nonhuman Laboratory Test Result</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanLaboratoryTestResultImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonhumanLaboratoryTestResult()
         * @generated
         */
        EClass NONHUMAN_LABORATORY_TEST_RESULT = eINSTANCE.getNonhumanLaboratoryTestResult();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTestOrganizationImpl <em>Study Test Organization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.StudyTestOrganizationImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getStudyTestOrganization()
         * @generated
         */
        EClass STUDY_TEST_ORGANIZATION = eINSTANCE.getStudyTestOrganization();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanSubjectDataDocumentSectionImpl <em>Nonhuman Subject Data Document Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanSubjectDataDocumentSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonhumanSubjectDataDocumentSection()
         * @generated
         */
        EClass NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION = eINSTANCE.getNonhumanSubjectDataDocumentSection();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanSubjectDemographicsImpl <em>Nonhuman Subject Demographics</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanSubjectDemographicsImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonhumanSubjectDemographics()
         * @generated
         */
        EClass NONHUMAN_SUBJECT_DEMOGRAPHICS = eINSTANCE.getNonhumanSubjectDemographics();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanDispositionImpl <em>Nonhuman Disposition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanDispositionImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonhumanDisposition()
         * @generated
         */
        EClass NONHUMAN_DISPOSITION = eINSTANCE.getNonhumanDisposition();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanExposureImpl <em>Nonhuman Exposure</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.NonhumanExposureImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getNonhumanExposure()
         * @generated
         */
        EClass NONHUMAN_EXPOSURE = eINSTANCE.getNonhumanExposure();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MicroscopicFindingImpl <em>Microscopic Finding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MicroscopicFindingImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMicroscopicFinding()
         * @generated
         */
        EClass MICROSCOPIC_FINDING = eINSTANCE.getMicroscopicFinding();

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

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.MassIdentificationImpl <em>Mass Identification</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.MassIdentificationImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getMassIdentification()
         * @generated
         */
        EClass MASS_IDENTIFICATION = eINSTANCE.getMassIdentification();

        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.sdtm.impl.ReferenceRangeImpl <em>Reference Range</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.ReferenceRangeImpl
         * @see org.openhealthtools.mdht.uml.cda.sdtm.impl.SdtmPackageImpl#getReferenceRange()
         * @generated
         */
        EClass REFERENCE_RANGE = eINSTANCE.getReferenceRange();

    }

} //SdtmPackage
