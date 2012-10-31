/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphFactory
 * @model kind="package"
 *        annotation="http://www.openhealthtools.org/mdht/uml initializers='org.openhealthtools.mdht.uml.cda.ihe.qrph'"
 * @generated
 */
public interface QrphPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "qrph";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/ihe/qrph";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "qrph";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    QrphPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.QrphPackageImpl.init();

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.EarlyHearingCarePlanDocumentImpl <em>Early Hearing Care Plan Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.EarlyHearingCarePlanDocumentImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.QrphPackageImpl#getEarlyHearingCarePlanDocument()
     * @generated
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT = 0;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__REALM_CODE = IHEPackage.MEDICAL_DOCUMENT__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__TYPE_ID = IHEPackage.MEDICAL_DOCUMENT__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__TEMPLATE_ID = IHEPackage.MEDICAL_DOCUMENT__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__ID = IHEPackage.MEDICAL_DOCUMENT__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__CODE = IHEPackage.MEDICAL_DOCUMENT__CODE;

    /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__TITLE = IHEPackage.MEDICAL_DOCUMENT__TITLE;

    /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__EFFECTIVE_TIME = IHEPackage.MEDICAL_DOCUMENT__EFFECTIVE_TIME;

    /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__CONFIDENTIALITY_CODE = IHEPackage.MEDICAL_DOCUMENT__CONFIDENTIALITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__LANGUAGE_CODE = IHEPackage.MEDICAL_DOCUMENT__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__SET_ID = IHEPackage.MEDICAL_DOCUMENT__SET_ID;

    /**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__VERSION_NUMBER = IHEPackage.MEDICAL_DOCUMENT__VERSION_NUMBER;

    /**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__COPY_TIME = IHEPackage.MEDICAL_DOCUMENT__COPY_TIME;

    /**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__RECORD_TARGET = IHEPackage.MEDICAL_DOCUMENT__RECORD_TARGET;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__AUTHOR = IHEPackage.MEDICAL_DOCUMENT__AUTHOR;

    /**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__DATA_ENTERER = IHEPackage.MEDICAL_DOCUMENT__DATA_ENTERER;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__INFORMANT = IHEPackage.MEDICAL_DOCUMENT__INFORMANT;

    /**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__CUSTODIAN = IHEPackage.MEDICAL_DOCUMENT__CUSTODIAN;

    /**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__INFORMATION_RECIPIENT = IHEPackage.MEDICAL_DOCUMENT__INFORMATION_RECIPIENT;

    /**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__LEGAL_AUTHENTICATOR = IHEPackage.MEDICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

    /**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__AUTHENTICATOR = IHEPackage.MEDICAL_DOCUMENT__AUTHENTICATOR;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__PARTICIPANT = IHEPackage.MEDICAL_DOCUMENT__PARTICIPANT;

    /**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__IN_FULFILLMENT_OF = IHEPackage.MEDICAL_DOCUMENT__IN_FULFILLMENT_OF;

    /**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__DOCUMENTATION_OF = IHEPackage.MEDICAL_DOCUMENT__DOCUMENTATION_OF;

    /**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__RELATED_DOCUMENT = IHEPackage.MEDICAL_DOCUMENT__RELATED_DOCUMENT;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__AUTHORIZATION = IHEPackage.MEDICAL_DOCUMENT__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__COMPONENT_OF = IHEPackage.MEDICAL_DOCUMENT__COMPONENT_OF;

    /**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__COMPONENT = IHEPackage.MEDICAL_DOCUMENT__COMPONENT;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__NULL_FLAVOR = IHEPackage.MEDICAL_DOCUMENT__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__CLASS_CODE = IHEPackage.MEDICAL_DOCUMENT__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT__MOOD_CODE = IHEPackage.MEDICAL_DOCUMENT__MOOD_CODE;

    /**
     * The number of structural features of the '<em>Early Hearing Care Plan Document</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_HEARING_CARE_PLAN_DOCUMENT_FEATURE_COUNT = IHEPackage.MEDICAL_DOCUMENT_FEATURE_COUNT + 0;


    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.RiskIndicatorsForHearingLossSectionImpl <em>Risk Indicators For Hearing Loss Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.RiskIndicatorsForHearingLossSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.QrphPackageImpl#getRiskIndicatorsForHearingLossSection()
     * @generated
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION = 1;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__ID = CDAPackage.SECTION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__CODE = CDAPackage.SECTION__CODE;

    /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

    /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

    /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

    /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

    /**
     * The number of structural features of the '<em>Risk Indicators For Hearing Loss Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.HearingScreeningCodedResultsSectionImpl <em>Hearing Screening Coded Results Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.HearingScreeningCodedResultsSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.QrphPackageImpl#getHearingScreeningCodedResultsSection()
     * @generated
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION = 2;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__REALM_CODE = IHEPackage.CODED_RESULTS_SECTION__REALM_CODE;

    /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__TYPE_ID = IHEPackage.CODED_RESULTS_SECTION__TYPE_ID;

    /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__TEMPLATE_ID = IHEPackage.CODED_RESULTS_SECTION__TEMPLATE_ID;

    /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__ID = IHEPackage.CODED_RESULTS_SECTION__ID;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__CODE = IHEPackage.CODED_RESULTS_SECTION__CODE;

    /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__TITLE = IHEPackage.CODED_RESULTS_SECTION__TITLE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__TEXT = IHEPackage.CODED_RESULTS_SECTION__TEXT;

    /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.CODED_RESULTS_SECTION__CONFIDENTIALITY_CODE;

    /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__LANGUAGE_CODE = IHEPackage.CODED_RESULTS_SECTION__LANGUAGE_CODE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__SUBJECT = IHEPackage.CODED_RESULTS_SECTION__SUBJECT;

    /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__AUTHOR = IHEPackage.CODED_RESULTS_SECTION__AUTHOR;

    /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__INFORMANT = IHEPackage.CODED_RESULTS_SECTION__INFORMANT;

    /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__ENTRY = IHEPackage.CODED_RESULTS_SECTION__ENTRY;

    /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__COMPONENT = IHEPackage.CODED_RESULTS_SECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__SECTION_ID = IHEPackage.CODED_RESULTS_SECTION__SECTION_ID;

    /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__NULL_FLAVOR = IHEPackage.CODED_RESULTS_SECTION__NULL_FLAVOR;

    /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__CLASS_CODE = IHEPackage.CODED_RESULTS_SECTION__CLASS_CODE;

    /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION__MOOD_CODE = IHEPackage.CODED_RESULTS_SECTION__MOOD_CODE;

    /**
     * The number of structural features of the '<em>Hearing Screening Coded Results Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_CODED_RESULTS_SECTION_FEATURE_COUNT = IHEPackage.CODED_RESULTS_SECTION_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument <em>Early Hearing Care Plan Document</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Early Hearing Care Plan Document</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument
     * @generated
     */
    EClass getEarlyHearingCarePlanDocument();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.RiskIndicatorsForHearingLossSection <em>Risk Indicators For Hearing Loss Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Risk Indicators For Hearing Loss Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.RiskIndicatorsForHearingLossSection
     * @generated
     */
    EClass getRiskIndicatorsForHearingLossSection();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.HearingScreeningCodedResultsSection <em>Hearing Screening Coded Results Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Screening Coded Results Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.HearingScreeningCodedResultsSection
     * @generated
     */
    EClass getHearingScreeningCodedResultsSection();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    QrphFactory getQrphFactory();

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
     */interface Literals
    {
        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.EarlyHearingCarePlanDocumentImpl <em>Early Hearing Care Plan Document</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.EarlyHearingCarePlanDocumentImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.QrphPackageImpl#getEarlyHearingCarePlanDocument()
         * @generated
         */
        EClass EARLY_HEARING_CARE_PLAN_DOCUMENT = eINSTANCE.getEarlyHearingCarePlanDocument();
        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.RiskIndicatorsForHearingLossSectionImpl <em>Risk Indicators For Hearing Loss Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.RiskIndicatorsForHearingLossSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.QrphPackageImpl#getRiskIndicatorsForHearingLossSection()
         * @generated
         */
        EClass RISK_INDICATORS_FOR_HEARING_LOSS_SECTION = eINSTANCE.getRiskIndicatorsForHearingLossSection();
        /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.HearingScreeningCodedResultsSectionImpl <em>Hearing Screening Coded Results Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.HearingScreeningCodedResultsSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.QrphPackageImpl#getHearingScreeningCodedResultsSection()
         * @generated
         */
        EClass HEARING_SCREENING_CODED_RESULTS_SECTION = eINSTANCE.getHearingScreeningCodedResultsSection();

    }

} //QrphPackage
