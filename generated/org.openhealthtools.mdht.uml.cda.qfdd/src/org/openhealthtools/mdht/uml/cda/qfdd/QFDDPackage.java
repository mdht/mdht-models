/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd;

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
 * @see org.openhealthtools.mdht.uml.cda.qfdd.QFDDFactory
 * @model kind="package"
 *        annotation="http://www.openhealthtools.org/mdht/uml initializers='org.openhealthtools.mdht.uml.cda.qfdd'"
 * @generated
 */
public interface QFDDPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "qfdd";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/qfdd";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "qfdd";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	QFDDPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl.init();

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionaireHeaderImpl <em>Questionaire Header</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionaireHeaderImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionaireHeader()
     * @generated
     */
	int QUESTIONAIRE_HEADER = 1;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__REALM_CODE = CDAPackage.CLINICAL_DOCUMENT__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__TYPE_ID = CDAPackage.CLINICAL_DOCUMENT__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__TEMPLATE_ID = CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__ID = CDAPackage.CLINICAL_DOCUMENT__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__CODE = CDAPackage.CLINICAL_DOCUMENT__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__TITLE = CDAPackage.CLINICAL_DOCUMENT__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__EFFECTIVE_TIME = CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__CONFIDENTIALITY_CODE = CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__LANGUAGE_CODE = CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__SET_ID = CDAPackage.CLINICAL_DOCUMENT__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__VERSION_NUMBER = CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__COPY_TIME = CDAPackage.CLINICAL_DOCUMENT__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__RECORD_TARGET = CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__AUTHOR = CDAPackage.CLINICAL_DOCUMENT__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__DATA_ENTERER = CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__INFORMANT = CDAPackage.CLINICAL_DOCUMENT__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__CUSTODIAN = CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__INFORMATION_RECIPIENT = CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__LEGAL_AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__PARTICIPANT = CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__IN_FULFILLMENT_OF = CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__DOCUMENTATION_OF = CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__RELATED_DOCUMENT = CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__AUTHORIZATION = CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__COMPONENT_OF = CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__COMPONENT = CDAPackage.CLINICAL_DOCUMENT__COMPONENT;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__NULL_FLAVOR = CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__CLASS_CODE = CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER__MOOD_CODE = CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Questionaire Header</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_HEADER_FEATURE_COUNT = CDAPackage.CLINICAL_DOCUMENT_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionaireImpl <em>Questionaire</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionaireImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionaire()
     * @generated
     */
	int QUESTIONAIRE = 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__REALM_CODE = QUESTIONAIRE_HEADER__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__TYPE_ID = QUESTIONAIRE_HEADER__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__TEMPLATE_ID = QUESTIONAIRE_HEADER__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__ID = QUESTIONAIRE_HEADER__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__CODE = QUESTIONAIRE_HEADER__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__TITLE = QUESTIONAIRE_HEADER__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__EFFECTIVE_TIME = QUESTIONAIRE_HEADER__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__CONFIDENTIALITY_CODE = QUESTIONAIRE_HEADER__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__LANGUAGE_CODE = QUESTIONAIRE_HEADER__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__SET_ID = QUESTIONAIRE_HEADER__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__VERSION_NUMBER = QUESTIONAIRE_HEADER__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__COPY_TIME = QUESTIONAIRE_HEADER__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__RECORD_TARGET = QUESTIONAIRE_HEADER__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__AUTHOR = QUESTIONAIRE_HEADER__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__DATA_ENTERER = QUESTIONAIRE_HEADER__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__INFORMANT = QUESTIONAIRE_HEADER__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__CUSTODIAN = QUESTIONAIRE_HEADER__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__INFORMATION_RECIPIENT = QUESTIONAIRE_HEADER__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__LEGAL_AUTHENTICATOR = QUESTIONAIRE_HEADER__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__AUTHENTICATOR = QUESTIONAIRE_HEADER__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__PARTICIPANT = QUESTIONAIRE_HEADER__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__IN_FULFILLMENT_OF = QUESTIONAIRE_HEADER__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__DOCUMENTATION_OF = QUESTIONAIRE_HEADER__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__RELATED_DOCUMENT = QUESTIONAIRE_HEADER__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__AUTHORIZATION = QUESTIONAIRE_HEADER__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__COMPONENT_OF = QUESTIONAIRE_HEADER__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__COMPONENT = QUESTIONAIRE_HEADER__COMPONENT;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__NULL_FLAVOR = QUESTIONAIRE_HEADER__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__CLASS_CODE = QUESTIONAIRE_HEADER__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE__MOOD_CODE = QUESTIONAIRE_HEADER__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Questionaire</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONAIRE_FEATURE_COUNT = QUESTIONAIRE_HEADER_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionsOrganizerImpl <em>Questions Organizer</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionsOrganizerImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionsOrganizer()
     * @generated
     */
	int QUESTIONS_ORGANIZER = 5;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.NumericQuestionPatternObservationImpl <em>Numeric Question Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.NumericQuestionPatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getNumericQuestionPatternObservation()
     * @generated
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION = 6;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionHelpTextPatternObservationImpl <em>Question Help Text Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionHelpTextPatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionHelpTextPatternObservation()
     * @generated
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION = 7;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.MultipleChoiceQuestionPatternObservationImpl <em>Multiple Choice Question Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.MultipleChoiceQuestionPatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getMultipleChoiceQuestionPatternObservation()
     * @generated
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION = 8;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionOptionsPatternObservationImpl <em>Question Options Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionOptionsPatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionOptionsPatternObservation()
     * @generated
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION = 9;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionMediaPatternImpl <em>Question Media Pattern</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionMediaPatternImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionMediaPattern()
     * @generated
     */
	int QUESTION_MEDIA_PATTERN = 10;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionFeedbackPatternObservationImpl <em>Question Feedback Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionFeedbackPatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionFeedbackPatternObservation()
     * @generated
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION = 11;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.TextQuestionPatternObservationImpl <em>Text Question Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.TextQuestionPatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getTextQuestionPatternObservation()
     * @generated
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION = 12;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.AnalogSliderQuestionPatternObservationImpl <em>Analog Slider Question Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.AnalogSliderQuestionPatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getAnalogSliderQuestionPatternObservation()
     * @generated
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION = 13;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.DiscreteSliderQuestionPatternObservationImpl <em>Discrete Slider Question Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.DiscreteSliderQuestionPatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getDiscreteSliderQuestionPatternObservation()
     * @generated
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION = 14;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionReferenceRangePatternImpl <em>Question Reference Range Pattern</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionReferenceRangePatternImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionReferenceRangePattern()
     * @generated
     */
	int QUESTION_REFERENCE_RANGE_PATTERN = 15;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.CopyRightPatternObservationImpl <em>Copy Right Pattern Observation</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.CopyRightPatternObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getCopyRightPatternObservation()
     * @generated
     */
	int COPY_RIGHT_PATTERN_OBSERVATION = 3;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.PreconditionPatternImpl <em>Precondition Pattern</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.PreconditionPatternImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getPreconditionPattern()
     * @generated
     */
	int PRECONDITION_PATTERN = 16;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.CriterionPatternImpl <em>Criterion Pattern</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.CriterionPatternImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getCriterionPattern()
     * @generated
     */
	int CRITERION_PATTERN = 17;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionnaireFormDefinitionSectionImpl <em>Questionnaire Form Definition Section</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionnaireFormDefinitionSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionnaireFormDefinitionSection()
     * @generated
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION = 4;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.CopyRightSectionImpl <em>Copy Right Section</em>}' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.CopyRightSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getCopyRightSection()
     * @generated
     */
	int COPY_RIGHT_SECTION = 2;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__ID = CDAPackage.SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Copy Right Section</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Copy Right Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COPY_RIGHT_PATTERN_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__ID = CDAPackage.SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Questionnaire Form Definition Section</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONNAIRE_FORM_DEFINITION_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__REALM_CODE = CDAPackage.ORGANIZER__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__TYPE_ID = CDAPackage.ORGANIZER__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__TEMPLATE_ID = CDAPackage.ORGANIZER__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__ID = CDAPackage.ORGANIZER__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__CODE = CDAPackage.ORGANIZER__CODE;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__STATUS_CODE = CDAPackage.ORGANIZER__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__EFFECTIVE_TIME = CDAPackage.ORGANIZER__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__SUBJECT = CDAPackage.ORGANIZER__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__SPECIMEN = CDAPackage.ORGANIZER__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__PERFORMER = CDAPackage.ORGANIZER__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__AUTHOR = CDAPackage.ORGANIZER__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__INFORMANT = CDAPackage.ORGANIZER__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__PARTICIPANT = CDAPackage.ORGANIZER__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__REFERENCE = CDAPackage.ORGANIZER__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__PRECONDITION = CDAPackage.ORGANIZER__PRECONDITION;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__COMPONENT = CDAPackage.ORGANIZER__COMPONENT;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__NULL_FLAVOR = CDAPackage.ORGANIZER__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__CLASS_CODE = CDAPackage.ORGANIZER__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER__MOOD_CODE = CDAPackage.ORGANIZER__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Questions Organizer</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTIONS_ORGANIZER_FEATURE_COUNT = CDAPackage.ORGANIZER_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Numeric Question Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NUMERIC_QUESTION_PATTERN_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Question Help Text Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_HELP_TEXT_PATTERN_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Multiple Choice Question Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Question Options Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_OPTIONS_PATTERN_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Question Media Pattern</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_MEDIA_PATTERN_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Question Feedback Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_FEEDBACK_PATTERN_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Text Question Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TEXT_QUESTION_PATTERN_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__REALM_CODE = NUMERIC_QUESTION_PATTERN_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__TYPE_ID = NUMERIC_QUESTION_PATTERN_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__TEMPLATE_ID = NUMERIC_QUESTION_PATTERN_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__ID = NUMERIC_QUESTION_PATTERN_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__CODE = NUMERIC_QUESTION_PATTERN_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__DERIVATION_EXPR = NUMERIC_QUESTION_PATTERN_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__TEXT = NUMERIC_QUESTION_PATTERN_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__STATUS_CODE = NUMERIC_QUESTION_PATTERN_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__EFFECTIVE_TIME = NUMERIC_QUESTION_PATTERN_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__PRIORITY_CODE = NUMERIC_QUESTION_PATTERN_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__REPEAT_NUMBER = NUMERIC_QUESTION_PATTERN_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__LANGUAGE_CODE = NUMERIC_QUESTION_PATTERN_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__VALUE = NUMERIC_QUESTION_PATTERN_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__INTERPRETATION_CODE = NUMERIC_QUESTION_PATTERN_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__METHOD_CODE = NUMERIC_QUESTION_PATTERN_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__TARGET_SITE_CODE = NUMERIC_QUESTION_PATTERN_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__SUBJECT = NUMERIC_QUESTION_PATTERN_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__SPECIMEN = NUMERIC_QUESTION_PATTERN_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__PERFORMER = NUMERIC_QUESTION_PATTERN_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__AUTHOR = NUMERIC_QUESTION_PATTERN_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__INFORMANT = NUMERIC_QUESTION_PATTERN_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__PARTICIPANT = NUMERIC_QUESTION_PATTERN_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = NUMERIC_QUESTION_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__REFERENCE = NUMERIC_QUESTION_PATTERN_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__PRECONDITION = NUMERIC_QUESTION_PATTERN_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__REFERENCE_RANGE = NUMERIC_QUESTION_PATTERN_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__NULL_FLAVOR = NUMERIC_QUESTION_PATTERN_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__CLASS_CODE = NUMERIC_QUESTION_PATTERN_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__MOOD_CODE = NUMERIC_QUESTION_PATTERN_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__NEGATION_IND = NUMERIC_QUESTION_PATTERN_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Analog Slider Question Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_FEATURE_COUNT = NUMERIC_QUESTION_PATTERN_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__REALM_CODE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__TYPE_ID = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__TEMPLATE_ID = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__ID = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__CODE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__DERIVATION_EXPR = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__TEXT = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__STATUS_CODE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__EFFECTIVE_TIME = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__PRIORITY_CODE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__REPEAT_NUMBER = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__LANGUAGE_CODE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__VALUE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__INTERPRETATION_CODE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__METHOD_CODE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__TARGET_SITE_CODE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__SUBJECT = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__SPECIMEN = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__PERFORMER = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__AUTHOR = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__INFORMANT = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__PARTICIPANT = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__REFERENCE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__PRECONDITION = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__REFERENCE_RANGE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__NULL_FLAVOR = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__CLASS_CODE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__MOOD_CODE = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__NEGATION_IND = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Discrete Slider Question Pattern Observation</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION_FEATURE_COUNT = MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_REFERENCE_RANGE_PATTERN__REALM_CODE = CDAPackage.REFERENCE_RANGE__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_REFERENCE_RANGE_PATTERN__TYPE_ID = CDAPackage.REFERENCE_RANGE__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_REFERENCE_RANGE_PATTERN__TEMPLATE_ID = CDAPackage.REFERENCE_RANGE__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Observation Range</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_REFERENCE_RANGE_PATTERN__OBSERVATION_RANGE = CDAPackage.REFERENCE_RANGE__OBSERVATION_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_REFERENCE_RANGE_PATTERN__NULL_FLAVOR = CDAPackage.REFERENCE_RANGE__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Type Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_REFERENCE_RANGE_PATTERN__TYPE_CODE = CDAPackage.REFERENCE_RANGE__TYPE_CODE;

	/**
     * The number of structural features of the '<em>Question Reference Range Pattern</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUESTION_REFERENCE_RANGE_PATTERN_FEATURE_COUNT = CDAPackage.REFERENCE_RANGE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRECONDITION_PATTERN__REALM_CODE = CDAPackage.PRECONDITION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRECONDITION_PATTERN__TYPE_ID = CDAPackage.PRECONDITION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRECONDITION_PATTERN__TEMPLATE_ID = CDAPackage.PRECONDITION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Criterion</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRECONDITION_PATTERN__CRITERION = CDAPackage.PRECONDITION__CRITERION;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRECONDITION_PATTERN__NULL_FLAVOR = CDAPackage.PRECONDITION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Type Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRECONDITION_PATTERN__TYPE_CODE = CDAPackage.PRECONDITION__TYPE_CODE;

	/**
     * The number of structural features of the '<em>Precondition Pattern</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRECONDITION_PATTERN_FEATURE_COUNT = CDAPackage.PRECONDITION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITERION_PATTERN__REALM_CODE = CDAPackage.CRITERION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITERION_PATTERN__TYPE_ID = CDAPackage.CRITERION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITERION_PATTERN__TEMPLATE_ID = CDAPackage.CRITERION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITERION_PATTERN__CODE = CDAPackage.CRITERION__CODE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITERION_PATTERN__TEXT = CDAPackage.CRITERION__TEXT;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITERION_PATTERN__VALUE = CDAPackage.CRITERION__VALUE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITERION_PATTERN__NULL_FLAVOR = CDAPackage.CRITERION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITERION_PATTERN__CLASS_CODE = CDAPackage.CRITERION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITERION_PATTERN__MOOD_CODE = CDAPackage.CRITERION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Criterion Pattern</em>' class.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITERION_PATTERN_FEATURE_COUNT = CDAPackage.CRITERION_FEATURE_COUNT + 0;

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.Questionaire <em>Questionaire</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Questionaire</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.Questionaire
     * @generated
     */
	EClass getQuestionaire();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader <em>Questionaire Header</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Questionaire Header</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader
     * @generated
     */
	EClass getQuestionaireHeader();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer <em>Questions Organizer</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Questions Organizer</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer
     * @generated
     */
	EClass getQuestionsOrganizer();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation <em>Numeric Question Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Numeric Question Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation
     * @generated
     */
	EClass getNumericQuestionPatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation <em>Question Help Text Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Question Help Text Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation
     * @generated
     */
	EClass getQuestionHelpTextPatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation <em>Multiple Choice Question Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Multiple Choice Question Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation
     * @generated
     */
	EClass getMultipleChoiceQuestionPatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation <em>Question Options Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Question Options Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation
     * @generated
     */
	EClass getQuestionOptionsPatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionMediaPattern <em>Question Media Pattern</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Question Media Pattern</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionMediaPattern
     * @generated
     */
	EClass getQuestionMediaPattern();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation <em>Question Feedback Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Question Feedback Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation
     * @generated
     */
	EClass getQuestionFeedbackPatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation <em>Text Question Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Question Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation
     * @generated
     */
	EClass getTextQuestionPatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation <em>Analog Slider Question Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Analog Slider Question Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation
     * @generated
     */
	EClass getAnalogSliderQuestionPatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.DiscreteSliderQuestionPatternObservation <em>Discrete Slider Question Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Discrete Slider Question Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.DiscreteSliderQuestionPatternObservation
     * @generated
     */
	EClass getDiscreteSliderQuestionPatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern <em>Question Reference Range Pattern</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Question Reference Range Pattern</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern
     * @generated
     */
	EClass getQuestionReferenceRangePattern();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation <em>Copy Right Pattern Observation</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Copy Right Pattern Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation
     * @generated
     */
	EClass getCopyRightPatternObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.PreconditionPattern <em>Precondition Pattern</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Precondition Pattern</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.PreconditionPattern
     * @generated
     */
	EClass getPreconditionPattern();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern <em>Criterion Pattern</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Criterion Pattern</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern
     * @generated
     */
	EClass getCriterionPattern();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection <em>Questionnaire Form Definition Section</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Questionnaire Form Definition Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection
     * @generated
     */
	EClass getQuestionnaireFormDefinitionSection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection <em>Copy Right Section</em>}'.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the meta object for class '<em>Copy Right Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection
     * @generated
     */
	EClass getCopyRightSection();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	QFDDFactory getQFDDFactory();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionaireImpl <em>Questionaire</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionaireImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionaire()
         * @generated
         */
		EClass QUESTIONAIRE = eINSTANCE.getQuestionaire();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionaireHeaderImpl <em>Questionaire Header</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionaireHeaderImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionaireHeader()
         * @generated
         */
		EClass QUESTIONAIRE_HEADER = eINSTANCE.getQuestionaireHeader();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionsOrganizerImpl <em>Questions Organizer</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionsOrganizerImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionsOrganizer()
         * @generated
         */
		EClass QUESTIONS_ORGANIZER = eINSTANCE.getQuestionsOrganizer();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.NumericQuestionPatternObservationImpl <em>Numeric Question Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.NumericQuestionPatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getNumericQuestionPatternObservation()
         * @generated
         */
		EClass NUMERIC_QUESTION_PATTERN_OBSERVATION = eINSTANCE.getNumericQuestionPatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionHelpTextPatternObservationImpl <em>Question Help Text Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionHelpTextPatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionHelpTextPatternObservation()
         * @generated
         */
		EClass QUESTION_HELP_TEXT_PATTERN_OBSERVATION = eINSTANCE.getQuestionHelpTextPatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.MultipleChoiceQuestionPatternObservationImpl <em>Multiple Choice Question Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.MultipleChoiceQuestionPatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getMultipleChoiceQuestionPatternObservation()
         * @generated
         */
		EClass MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION = eINSTANCE.getMultipleChoiceQuestionPatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionOptionsPatternObservationImpl <em>Question Options Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionOptionsPatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionOptionsPatternObservation()
         * @generated
         */
		EClass QUESTION_OPTIONS_PATTERN_OBSERVATION = eINSTANCE.getQuestionOptionsPatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionMediaPatternImpl <em>Question Media Pattern</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionMediaPatternImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionMediaPattern()
         * @generated
         */
		EClass QUESTION_MEDIA_PATTERN = eINSTANCE.getQuestionMediaPattern();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionFeedbackPatternObservationImpl <em>Question Feedback Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionFeedbackPatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionFeedbackPatternObservation()
         * @generated
         */
		EClass QUESTION_FEEDBACK_PATTERN_OBSERVATION = eINSTANCE.getQuestionFeedbackPatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.TextQuestionPatternObservationImpl <em>Text Question Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.TextQuestionPatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getTextQuestionPatternObservation()
         * @generated
         */
		EClass TEXT_QUESTION_PATTERN_OBSERVATION = eINSTANCE.getTextQuestionPatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.AnalogSliderQuestionPatternObservationImpl <em>Analog Slider Question Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.AnalogSliderQuestionPatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getAnalogSliderQuestionPatternObservation()
         * @generated
         */
		EClass ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION = eINSTANCE.getAnalogSliderQuestionPatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.DiscreteSliderQuestionPatternObservationImpl <em>Discrete Slider Question Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.DiscreteSliderQuestionPatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getDiscreteSliderQuestionPatternObservation()
         * @generated
         */
		EClass DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION = eINSTANCE.getDiscreteSliderQuestionPatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionReferenceRangePatternImpl <em>Question Reference Range Pattern</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionReferenceRangePatternImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionReferenceRangePattern()
         * @generated
         */
		EClass QUESTION_REFERENCE_RANGE_PATTERN = eINSTANCE.getQuestionReferenceRangePattern();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.CopyRightPatternObservationImpl <em>Copy Right Pattern Observation</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.CopyRightPatternObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getCopyRightPatternObservation()
         * @generated
         */
		EClass COPY_RIGHT_PATTERN_OBSERVATION = eINSTANCE.getCopyRightPatternObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.PreconditionPatternImpl <em>Precondition Pattern</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.PreconditionPatternImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getPreconditionPattern()
         * @generated
         */
		EClass PRECONDITION_PATTERN = eINSTANCE.getPreconditionPattern();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.CriterionPatternImpl <em>Criterion Pattern</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.CriterionPatternImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getCriterionPattern()
         * @generated
         */
		EClass CRITERION_PATTERN = eINSTANCE.getCriterionPattern();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionnaireFormDefinitionSectionImpl <em>Questionnaire Form Definition Section</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QuestionnaireFormDefinitionSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getQuestionnaireFormDefinitionSection()
         * @generated
         */
		EClass QUESTIONNAIRE_FORM_DEFINITION_SECTION = eINSTANCE.getQuestionnaireFormDefinitionSection();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qfdd.impl.CopyRightSectionImpl <em>Copy Right Section</em>}' class.
         * <!-- begin-user-doc -->
		* <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.CopyRightSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDPackageImpl#getCopyRightSection()
         * @generated
         */
		EClass COPY_RIGHT_SECTION = eINSTANCE.getCopyRightSection();

	}

} // QFDDPackage
