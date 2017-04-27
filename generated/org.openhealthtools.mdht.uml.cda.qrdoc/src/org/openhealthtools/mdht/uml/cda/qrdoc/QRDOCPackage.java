/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.mdht.uml.cda.CDAPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCFactory
 * @model kind="package"
 *        annotation="http://www.openhealthtools.org/mdht/uml initializers='org.openhealthtools.mdht.uml.cda.qrdoc'"
 * @generated
 */
public interface QRDOCPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "qrdoc";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/qrdoc";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "qrdoc";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	QRDOCPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl.init();

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.QuestionnaireResponseDocumentHeaderImpl <em>Questionnaire Response Document Header</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QuestionnaireResponseDocumentHeaderImpl
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getQuestionnaireResponseDocumentHeader()
     * @generated
     */
	int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER = 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__REALM_CODE = CDAPackage.CLINICAL_DOCUMENT__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__TYPE_ID = CDAPackage.CLINICAL_DOCUMENT__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__TEMPLATE_ID = CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__ID = CDAPackage.CLINICAL_DOCUMENT__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__CODE = CDAPackage.CLINICAL_DOCUMENT__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__TITLE = CDAPackage.CLINICAL_DOCUMENT__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__EFFECTIVE_TIME = CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__CONFIDENTIALITY_CODE = CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__LANGUAGE_CODE = CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__SET_ID = CDAPackage.CLINICAL_DOCUMENT__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__VERSION_NUMBER = CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__COPY_TIME = CDAPackage.CLINICAL_DOCUMENT__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__RECORD_TARGET = CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__AUTHOR = CDAPackage.CLINICAL_DOCUMENT__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__DATA_ENTERER = CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__INFORMANT = CDAPackage.CLINICAL_DOCUMENT__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__CUSTODIAN = CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__INFORMATION_RECIPIENT = CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__LEGAL_AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__PARTICIPANT = CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__IN_FULFILLMENT_OF = CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__DOCUMENTATION_OF = CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__RELATED_DOCUMENT = CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__AUTHORIZATION = CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__COMPONENT_OF = CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__COMPONENT = CDAPackage.CLINICAL_DOCUMENT__COMPONENT;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__NULL_FLAVOR = CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__CLASS_CODE = CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__MOOD_CODE = CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Questionnaire Response Document Header</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_FEATURE_COUNT = CDAPackage.CLINICAL_DOCUMENT_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.QuestionnaireResponseDocumentImpl <em>Questionnaire Response Document</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QuestionnaireResponseDocumentImpl
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getQuestionnaireResponseDocument()
     * @generated
     */
	int QUESTIONNAIRE_RESPONSE_DOCUMENT = 1;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__REALM_CODE = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__TYPE_ID = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__TEMPLATE_ID = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__ID = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__CODE = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__TITLE = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__EFFECTIVE_TIME = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__CONFIDENTIALITY_CODE = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__LANGUAGE_CODE = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__SET_ID = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__VERSION_NUMBER = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__COPY_TIME = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__RECORD_TARGET = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__AUTHOR = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__DATA_ENTERER = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__INFORMANT = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__CUSTODIAN = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__INFORMATION_RECIPIENT = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__LEGAL_AUTHENTICATOR = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__AUTHENTICATOR = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__PARTICIPANT = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__IN_FULFILLMENT_OF = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__DOCUMENTATION_OF = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__RELATED_DOCUMENT = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__AUTHORIZATION = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__COMPONENT_OF = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__COMPONENT = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__COMPONENT;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__NULL_FLAVOR = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__CLASS_CODE = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_DOCUMENT__MOOD_CODE = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Questionnaire Response Document</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_RESPONSE_DOCUMENT_FEATURE_COUNT = QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.QuestionnaireResponseSectionImpl <em>Questionnaire Response Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QuestionnaireResponseSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getQuestionnaireResponseSection()
     * @generated
     */
	int QUESTIONNAIRE_RESPONSE_SECTION = 2;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__ID = CDAPackage.SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUESTIONNAIRE_RESPONSE_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Questionnaire Response Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_RESPONSE_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.ResponsesOrganizerImpl <em>Responses Organizer</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.ResponsesOrganizerImpl
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getResponsesOrganizer()
     * @generated
     */
	int RESPONSES_ORGANIZER = 3;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__REALM_CODE = CDAPackage.ORGANIZER__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__TYPE_ID = CDAPackage.ORGANIZER__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__TEMPLATE_ID = CDAPackage.ORGANIZER__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__ID = CDAPackage.ORGANIZER__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__CODE = CDAPackage.ORGANIZER__CODE;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__STATUS_CODE = CDAPackage.ORGANIZER__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__EFFECTIVE_TIME = CDAPackage.ORGANIZER__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__SUBJECT = CDAPackage.ORGANIZER__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__SPECIMEN = CDAPackage.ORGANIZER__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__PERFORMER = CDAPackage.ORGANIZER__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__AUTHOR = CDAPackage.ORGANIZER__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__INFORMANT = CDAPackage.ORGANIZER__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__PARTICIPANT = CDAPackage.ORGANIZER__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__REFERENCE = CDAPackage.ORGANIZER__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__PRECONDITION = CDAPackage.ORGANIZER__PRECONDITION;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__COMPONENT = CDAPackage.ORGANIZER__COMPONENT;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__NULL_FLAVOR = CDAPackage.ORGANIZER__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__CLASS_CODE = CDAPackage.ORGANIZER__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_ORGANIZER__MOOD_CODE = CDAPackage.ORGANIZER__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Responses Organizer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESPONSES_ORGANIZER_FEATURE_COUNT = CDAPackage.ORGANIZER_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.NumericResponsePatternObservationImpl <em>Numeric Response Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.NumericResponsePatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getNumericResponsePatternObservation()
     * @generated
     */
	int NUMERIC_RESPONSE_PATTERN_OBSERVATION = 4;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Numeric Response Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_RESPONSE_PATTERN_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.MultipleChoiceResponsePatternObservationImpl <em>Multiple Choice Response Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.MultipleChoiceResponsePatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getMultipleChoiceResponsePatternObservation()
     * @generated
     */
	int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION = 5;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Multiple Choice Response Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.TextResponsePatternObservationImpl <em>Text Response Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.TextResponsePatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getTextResponsePatternObservation()
     * @generated
     */
	int TEXT_RESPONSE_PATTERN_OBSERVATION = 6;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_RESPONSE_PATTERN_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Text Response Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_RESPONSE_PATTERN_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.AnalogSliderResponsePatternObservationImpl <em>Analog Slider Response Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.AnalogSliderResponsePatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getAnalogSliderResponsePatternObservation()
     * @generated
     */
	int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION = 7;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__REALM_CODE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__TYPE_ID = NUMERIC_RESPONSE_PATTERN_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__TEMPLATE_ID = NUMERIC_RESPONSE_PATTERN_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__ID = NUMERIC_RESPONSE_PATTERN_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__CODE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__DERIVATION_EXPR = NUMERIC_RESPONSE_PATTERN_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__TEXT = NUMERIC_RESPONSE_PATTERN_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__STATUS_CODE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__EFFECTIVE_TIME = NUMERIC_RESPONSE_PATTERN_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__PRIORITY_CODE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__REPEAT_NUMBER = NUMERIC_RESPONSE_PATTERN_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__LANGUAGE_CODE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__VALUE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__INTERPRETATION_CODE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__METHOD_CODE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__TARGET_SITE_CODE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__SUBJECT = NUMERIC_RESPONSE_PATTERN_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__SPECIMEN = NUMERIC_RESPONSE_PATTERN_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__PERFORMER = NUMERIC_RESPONSE_PATTERN_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__AUTHOR = NUMERIC_RESPONSE_PATTERN_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__INFORMANT = NUMERIC_RESPONSE_PATTERN_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__PARTICIPANT = NUMERIC_RESPONSE_PATTERN_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = NUMERIC_RESPONSE_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__REFERENCE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__PRECONDITION = NUMERIC_RESPONSE_PATTERN_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__REFERENCE_RANGE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__NULL_FLAVOR = NUMERIC_RESPONSE_PATTERN_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__CLASS_CODE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__MOOD_CODE = NUMERIC_RESPONSE_PATTERN_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__NEGATION_IND = NUMERIC_RESPONSE_PATTERN_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Analog Slider Response Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION_FEATURE_COUNT = NUMERIC_RESPONSE_PATTERN_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.DiscreteSliderResponsePatternObservationImpl <em>Discrete Slider Response Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.DiscreteSliderResponsePatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getDiscreteSliderResponsePatternObservation()
     * @generated
     */
	int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION = 8;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__REALM_CODE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__TYPE_ID = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__TEMPLATE_ID = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__ID = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__CODE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__DERIVATION_EXPR = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__TEXT = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__STATUS_CODE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__EFFECTIVE_TIME = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__PRIORITY_CODE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__REPEAT_NUMBER = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__LANGUAGE_CODE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__VALUE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__INTERPRETATION_CODE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__METHOD_CODE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__TARGET_SITE_CODE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__SUBJECT = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__SPECIMEN = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__PERFORMER = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__AUTHOR = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__INFORMANT = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__PARTICIPANT = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__REFERENCE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__PRECONDITION = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__REFERENCE_RANGE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__NULL_FLAVOR = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__CLASS_CODE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__MOOD_CODE = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__NEGATION_IND = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Discrete Slider Response Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION_FEATURE_COUNT = MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.ResponseMediaPatternImpl <em>Response Media Pattern</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.ResponseMediaPatternImpl
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getResponseMediaPattern()
     * @generated
     */
	int RESPONSE_MEDIA_PATTERN = 9;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_MEDIA_PATTERN__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Response Media Pattern</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESPONSE_MEDIA_PATTERN_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.ResponseReferenceRangePatternImpl <em>Response Reference Range Pattern</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.ResponseReferenceRangePatternImpl
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getResponseReferenceRangePattern()
     * @generated
     */
	int RESPONSE_REFERENCE_RANGE_PATTERN = 10;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_REFERENCE_RANGE_PATTERN__REALM_CODE = CDAPackage.REFERENCE_RANGE__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_REFERENCE_RANGE_PATTERN__TYPE_ID = CDAPackage.REFERENCE_RANGE__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_REFERENCE_RANGE_PATTERN__TEMPLATE_ID = CDAPackage.REFERENCE_RANGE__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Observation Range</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_REFERENCE_RANGE_PATTERN__OBSERVATION_RANGE = CDAPackage.REFERENCE_RANGE__OBSERVATION_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_REFERENCE_RANGE_PATTERN__NULL_FLAVOR = CDAPackage.REFERENCE_RANGE__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Type Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_REFERENCE_RANGE_PATTERN__TYPE_CODE = CDAPackage.REFERENCE_RANGE__TYPE_CODE;

	/**
     * The number of structural features of the '<em>Response Reference Range Pattern</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESPONSE_REFERENCE_RANGE_PATTERN_FEATURE_COUNT = CDAPackage.REFERENCE_RANGE_FEATURE_COUNT + 0;

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader <em>Questionnaire Response Document Header</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Questionnaire Response Document Header</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader
     * @generated
     */
	EClass getQuestionnaireResponseDocumentHeader();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocument <em>Questionnaire Response Document</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Questionnaire Response Document</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocument
     * @generated
     */
	EClass getQuestionnaireResponseDocument();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseSection <em>Questionnaire Response Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Questionnaire Response Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseSection
     * @generated
     */
	EClass getQuestionnaireResponseSection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer <em>Responses Organizer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Responses Organizer</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer
     * @generated
     */
	EClass getResponsesOrganizer();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrdoc.NumericResponsePatternObservation <em>Numeric Response Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Numeric Response Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.NumericResponsePatternObservation
     * @generated
     */
	EClass getNumericResponsePatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation <em>Multiple Choice Response Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multiple Choice Response Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation
     * @generated
     */
	EClass getMultipleChoiceResponsePatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrdoc.TextResponsePatternObservation <em>Text Response Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Response Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.TextResponsePatternObservation
     * @generated
     */
	EClass getTextResponsePatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrdoc.AnalogSliderResponsePatternObservation <em>Analog Slider Response Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Analog Slider Response Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.AnalogSliderResponsePatternObservation
     * @generated
     */
	EClass getAnalogSliderResponsePatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrdoc.DiscreteSliderResponsePatternObservation <em>Discrete Slider Response Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Discrete Slider Response Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.DiscreteSliderResponsePatternObservation
     * @generated
     */
	EClass getDiscreteSliderResponsePatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponseMediaPattern <em>Response Media Pattern</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Response Media Pattern</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.ResponseMediaPattern
     * @generated
     */
	EClass getResponseMediaPattern();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern <em>Response Reference Range Pattern</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Response Reference Range Pattern</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern
     * @generated
     */
	EClass getResponseReferenceRangePattern();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	QRDOCFactory getQRDOCFactory();

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
	interface Literals {
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.QuestionnaireResponseDocumentHeaderImpl <em>Questionnaire Response Document Header</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QuestionnaireResponseDocumentHeaderImpl
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getQuestionnaireResponseDocumentHeader()
         * @generated
         */
		EClass QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER = eINSTANCE.getQuestionnaireResponseDocumentHeader();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.QuestionnaireResponseDocumentImpl <em>Questionnaire Response Document</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QuestionnaireResponseDocumentImpl
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getQuestionnaireResponseDocument()
         * @generated
         */
		EClass QUESTIONNAIRE_RESPONSE_DOCUMENT = eINSTANCE.getQuestionnaireResponseDocument();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.QuestionnaireResponseSectionImpl <em>Questionnaire Response Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QuestionnaireResponseSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getQuestionnaireResponseSection()
         * @generated
         */
		EClass QUESTIONNAIRE_RESPONSE_SECTION = eINSTANCE.getQuestionnaireResponseSection();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.ResponsesOrganizerImpl <em>Responses Organizer</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.ResponsesOrganizerImpl
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getResponsesOrganizer()
         * @generated
         */
		EClass RESPONSES_ORGANIZER = eINSTANCE.getResponsesOrganizer();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.NumericResponsePatternObservationImpl <em>Numeric Response Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.NumericResponsePatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getNumericResponsePatternObservation()
         * @generated
         */
		EClass NUMERIC_RESPONSE_PATTERN_OBSERVATION = eINSTANCE.getNumericResponsePatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.MultipleChoiceResponsePatternObservationImpl <em>Multiple Choice Response Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.MultipleChoiceResponsePatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getMultipleChoiceResponsePatternObservation()
         * @generated
         */
		EClass MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION = eINSTANCE.getMultipleChoiceResponsePatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.TextResponsePatternObservationImpl <em>Text Response Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.TextResponsePatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getTextResponsePatternObservation()
         * @generated
         */
		EClass TEXT_RESPONSE_PATTERN_OBSERVATION = eINSTANCE.getTextResponsePatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.AnalogSliderResponsePatternObservationImpl <em>Analog Slider Response Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.AnalogSliderResponsePatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getAnalogSliderResponsePatternObservation()
         * @generated
         */
		EClass ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION = eINSTANCE.getAnalogSliderResponsePatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.DiscreteSliderResponsePatternObservationImpl <em>Discrete Slider Response Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.DiscreteSliderResponsePatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getDiscreteSliderResponsePatternObservation()
         * @generated
         */
		EClass DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION = eINSTANCE.getDiscreteSliderResponsePatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.ResponseMediaPatternImpl <em>Response Media Pattern</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.ResponseMediaPatternImpl
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getResponseMediaPattern()
         * @generated
         */
		EClass RESPONSE_MEDIA_PATTERN = eINSTANCE.getResponseMediaPattern();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrdoc.impl.ResponseReferenceRangePatternImpl <em>Response Reference Range Pattern</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.ResponseReferenceRangePatternImpl
         * @see org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCPackageImpl#getResponseReferenceRangePattern()
         * @generated
         */
		EClass RESPONSE_REFERENCE_RANGE_PATTERN = eINSTANCE.getResponseReferenceRangePattern();

	}

} // QRDOCPackage
