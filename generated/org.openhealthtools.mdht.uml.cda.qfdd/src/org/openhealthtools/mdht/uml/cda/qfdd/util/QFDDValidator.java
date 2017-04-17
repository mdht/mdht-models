/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.mdht.uml.cda.util.CDAValidator;
import org.openhealthtools.mdht.uml.cda.qfdd.*;
import org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection;
import org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.DiscreteSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.PreconditionPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionMediaPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern;
import org.openhealthtools.mdht.uml.cda.qfdd.Questionaire;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer;
import org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage
 * @generated
 */
public class QFDDValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QFDDValidator INSTANCE = new QFDDValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.qfdd";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Copy Right Section' of 'Questionaire'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE__QUESTIONAIRE_COPY_RIGHT_SECTION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Questionnaire Form Definition Section' of 'Questionaire'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE__QUESTIONAIRE_QUESTIONNAIRE_FORM_DEFINITION_SECTION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Template Id' of 'Questionaire'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE__QUESTIONAIRE_HEADER_TEMPLATE_ID = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Template Id' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_TEMPLATE_ID = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Code P' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CODE_P = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Code' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Confidentiality Code P' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE_P = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Confidentiality Code' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Effective Time' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_EFFECTIVE_TIME = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Language Code' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_LANGUAGE_CODE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Language Code P' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_LANGUAGE_CODE_P = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Realm Code' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_REALM_CODE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Realm Code P' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_REALM_CODE_P = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Title' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_TITLE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Type Id' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_TYPE_ID = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Id' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Author' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Custodian' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Record Target' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_RECORD_TARGET = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Type Id Extension' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_TYPE_ID_EXTENSION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Type Id Root' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_TYPE_ID_ROOT = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Author Assigned Author Authoring Device Manufacturer Model Name' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Author Assigned Author Authoring Device Software Name' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Author Assigned Author Person Name' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Author Assigned Author Addr' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ADDR = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Author Assigned Author Id' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ID = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Author Assigned Author Telecom' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_TELECOM = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Author Assigned Author Assigned Authoring Device' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Author Assigned Author Assigned Person' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_PERSON = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Author Assigned Author Represented Organization' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Author Time' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_TIME = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Addr' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Id' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Name' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Telecom' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Custodian Assigned Custodian Represented Custodian Organization' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Custodian Assigned Custodian' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Record Target Patient Role II Null Flavor' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_II_NULL_FLAVOR = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Record Target Patient Role Id' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_ID = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionaire Header Record Target Patient Role' of 'Questionaire Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questions Organizer Template Id' of 'Questions Organizer'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_TEMPLATE_ID = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questions Organizer Class Code' of 'Questions Organizer'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_CLASS_CODE = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questions Organizer Id' of 'Questions Organizer'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_ID = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questions Organizer Mood Code' of 'Questions Organizer'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_MOOD_CODE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questions Organizer Status Code' of 'Questions Organizer'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_STATUS_CODE = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questions Organizer Precondition' of 'Questions Organizer'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_PRECONDITION = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questions Organizer Numeric Question Pattern Observation' of 'Questions Organizer'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_NUMERIC_QUESTION_PATTERN_OBSERVATION = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questions Organizer Multiple Choice Question Pattern Observation' of 'Questions Organizer'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questions Organizer Text Question Pattern Observation' of 'Questions Organizer'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_TEXT_QUESTION_PATTERN_OBSERVATION = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questions Organizer Analog Slider Question Pattern Observation' of 'Questions Organizer'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questions Organizer Discrete Slider Question Pattern Observation' of 'Questions Organizer'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Question Pattern Observation Template Id' of 'Numeric Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Question Pattern Observation Class Code' of 'Numeric Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_CLASS_CODE = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Question Pattern Observation Code' of 'Numeric Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_CODE = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Question Pattern Observation Id' of 'Numeric Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_ID = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Question Pattern Observation Mood Code' of 'Numeric Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_MOOD_CODE = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Question Pattern Observation Language Code' of 'Numeric Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Question Pattern Observation Question Help Text Pattern Observation' of 'Numeric Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Question Pattern Observation Question Feedback Pattern Observation' of 'Numeric Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Question Pattern Observation Precondition' of 'Numeric Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_PRECONDITION = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Question Pattern Observation Reference Range' of 'Numeric Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Help Text Pattern Observation Template Id' of 'Question Help Text Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_TEMPLATE_ID = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Help Text Pattern Observation Class Code' of 'Question Help Text Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CLASS_CODE = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Help Text Pattern Observation Code P' of 'Question Help Text Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE_P = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Help Text Pattern Observation Code' of 'Question Help Text Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Help Text Pattern Observation Mood Code' of 'Question Help Text Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_MOOD_CODE = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Help Text Pattern Observation Value' of 'Question Help Text Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_VALUE = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Help Text Pattern Observation Language Code P' of 'Question Help Text Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE_P = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Help Text Pattern Observation Language Code' of 'Question Help Text Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Template Id' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Class Code' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CLASS_CODE = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Code' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CODE = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Id' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_ID = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Language Code' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Mood Code' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_MOOD_CODE = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Question Help Text Pattern Observation' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Question Options Pattern Observation' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_OPTIONS_PATTERN_OBSERVATION = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Question Media Pattern' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Question Feedback Pattern Observation' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Text Question Pattern Observation' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEXT_QUESTION_PATTERN_OBSERVATION = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Precondition' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_PRECONDITION = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation CE Code' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation CE Code System' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE_SYSTEM = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation CE Display Name' of 'Multiple Choice Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_DISPLAY_NAME = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Options Pattern Observation Template Id' of 'Question Options Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_OPTIONS_PATTERN_OBSERVATION__QUESTION_OPTIONS_PATTERN_OBSERVATION_TEMPLATE_ID = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Options Pattern Observation Class Code' of 'Question Options Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_OPTIONS_PATTERN_OBSERVATION__QUESTION_OPTIONS_PATTERN_OBSERVATION_CLASS_CODE = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Options Pattern Observation Code P' of 'Question Options Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_OPTIONS_PATTERN_OBSERVATION__QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE_P = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Options Pattern Observation Code' of 'Question Options Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_OPTIONS_PATTERN_OBSERVATION__QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Options Pattern Observation Mood Code' of 'Question Options Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_OPTIONS_PATTERN_OBSERVATION__QUESTION_OPTIONS_PATTERN_OBSERVATION_MOOD_CODE = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Options Pattern Observation Value' of 'Question Options Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_OPTIONS_PATTERN_OBSERVATION__QUESTION_OPTIONS_PATTERN_OBSERVATION_VALUE = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Media Pattern Template Id' of 'Question Media Pattern'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_MEDIA_PATTERN__QUESTION_MEDIA_PATTERN_TEMPLATE_ID = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Feedback Pattern Observation Template Id' of 'Question Feedback Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_FEEDBACK_PATTERN_OBSERVATION__QUESTION_FEEDBACK_PATTERN_OBSERVATION_TEMPLATE_ID = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Feedback Pattern Observation Class Code' of 'Question Feedback Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_FEEDBACK_PATTERN_OBSERVATION__QUESTION_FEEDBACK_PATTERN_OBSERVATION_CLASS_CODE = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Feedback Pattern Observation Code' of 'Question Feedback Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_FEEDBACK_PATTERN_OBSERVATION__QUESTION_FEEDBACK_PATTERN_OBSERVATION_CODE = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Feedback Pattern Observation Language Code' of 'Question Feedback Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_FEEDBACK_PATTERN_OBSERVATION__QUESTION_FEEDBACK_PATTERN_OBSERVATION_LANGUAGE_CODE = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Feedback Pattern Observation Mood Code' of 'Question Feedback Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_FEEDBACK_PATTERN_OBSERVATION__QUESTION_FEEDBACK_PATTERN_OBSERVATION_MOOD_CODE = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Feedback Pattern Observation Value' of 'Question Feedback Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_FEEDBACK_PATTERN_OBSERVATION__QUESTION_FEEDBACK_PATTERN_OBSERVATION_VALUE = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Question Pattern Observation Template Id' of 'Text Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Question Pattern Observation Class Code' of 'Text Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_CLASS_CODE = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Question Pattern Observation Code' of 'Text Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_CODE = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Question Pattern Observation Id' of 'Text Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_ID = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Question Pattern Observation Language Code' of 'Text Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Question Pattern Observation Mood Code' of 'Text Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_MOOD_CODE = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Question Pattern Observation Question Help Text Pattern Observation' of 'Text Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Question Pattern Observation Question Media Pattern' of 'Text Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Question Pattern Observation Precondition' of 'Text Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_PRECONDITION = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Analog Slider Question Pattern Observation Reference Range' of 'Analog Slider Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Analog Slider Question Pattern Observation Reference Range Observation Range Value' of 'Analog Slider Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_VALUE = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Analog Slider Question Pattern Observation Reference Range Type Code' of 'Analog Slider Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_TYPE_CODE = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Question Pattern Observation Template Id' of 'Analog Slider Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Question Pattern Observation Template Id' of 'Discrete Slider Question Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Reference Range Pattern Template Id' of 'Question Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_TEMPLATE_ID = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Reference Range Pattern Type Code' of 'Question Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_TYPE_CODE = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Reference Range Pattern Observation Range' of 'Question Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Reference Range Pattern Observation Range IVLINT High' of 'Question Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Reference Range Pattern Observation Range IVLINT Low' of 'Question Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Reference Range Pattern Observation Range Text' of 'Question Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Question Reference Range Pattern Observation Range Value' of 'Question Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Copy Right Pattern Observation Template Id' of 'Copy Right Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPY_RIGHT_PATTERN_OBSERVATION__COPY_RIGHT_PATTERN_OBSERVATION_TEMPLATE_ID = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Copy Right Pattern Observation Class Code' of 'Copy Right Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPY_RIGHT_PATTERN_OBSERVATION__COPY_RIGHT_PATTERN_OBSERVATION_CLASS_CODE = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Copy Right Pattern Observation Code' of 'Copy Right Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPY_RIGHT_PATTERN_OBSERVATION__COPY_RIGHT_PATTERN_OBSERVATION_CODE = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Copy Right Pattern Observation Mood Code' of 'Copy Right Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPY_RIGHT_PATTERN_OBSERVATION__COPY_RIGHT_PATTERN_OBSERVATION_MOOD_CODE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Copy Right Pattern Observation Value' of 'Copy Right Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPY_RIGHT_PATTERN_OBSERVATION__COPY_RIGHT_PATTERN_OBSERVATION_VALUE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Copy Right Pattern Observation Language Code' of 'Copy Right Pattern Observation'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPY_RIGHT_PATTERN_OBSERVATION__COPY_RIGHT_PATTERN_OBSERVATION_LANGUAGE_CODE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Precondition Pattern Template Id' of 'Precondition Pattern'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRECONDITION_PATTERN__PRECONDITION_PATTERN_TEMPLATE_ID = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Precondition Pattern Type Code' of 'Precondition Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRECONDITION_PATTERN__PRECONDITION_PATTERN_TYPE_CODE = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Precondition Pattern Criterion' of 'Precondition Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRECONDITION_PATTERN__PRECONDITION_PATTERN_CRITERION = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterion Pattern Template Id' of 'Criterion Pattern'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERION_PATTERN__CRITERION_PATTERN_TEMPLATE_ID = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterion Pattern Class Code' of 'Criterion Pattern'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERION_PATTERN__CRITERION_PATTERN_CLASS_CODE = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterion Pattern Code' of 'Criterion Pattern'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERION_PATTERN__CRITERION_PATTERN_CODE = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterion Pattern Mood Code' of 'Criterion Pattern'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERION_PATTERN__CRITERION_PATTERN_MOOD_CODE = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterion Pattern Value' of 'Criterion Pattern'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERION_PATTERN__CRITERION_PATTERN_VALUE = 144;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Form Definition Section Template Id' of 'Questionnaire Form Definition Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEMPLATE_ID = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Form Definition Section Code' of 'Questionnaire Form Definition Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_CODE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Form Definition Section Language Code P' of 'Questionnaire Form Definition Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE_P = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Form Definition Section Language Code' of 'Questionnaire Form Definition Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Form Definition Section Text' of 'Questionnaire Form Definition Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEXT = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Form Definition Section Title' of 'Questionnaire Form Definition Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_TITLE = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Form Definition Section Questions Organizer' of 'Questionnaire Form Definition Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_QUESTIONS_ORGANIZER = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Copy Right Section Template Id' of 'Copy Right Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPY_RIGHT_SECTION__COPY_RIGHT_SECTION_TEMPLATE_ID = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Copy Right Section Language Code' of 'Copy Right Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPY_RIGHT_SECTION__COPY_RIGHT_SECTION_LANGUAGE_CODE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Copy Right Section Text' of 'Copy Right Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPY_RIGHT_SECTION__COPY_RIGHT_SECTION_TEXT = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Copy Right Section Title' of 'Copy Right Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPY_RIGHT_SECTION__COPY_RIGHT_SECTION_TITLE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Copy Right Section Copy Right Pattern Observation' of 'Copy Right Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPY_RIGHT_SECTION__COPY_RIGHT_SECTION_COPY_RIGHT_PATTERN_OBSERVATION = 45;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 144;

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
	public QFDDValidator() {
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
	  return QFDDPackage.eINSTANCE;
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
			case QFDDPackage.QUESTIONAIRE:
				return validateQuestionaire((Questionaire)value, diagnostics, context);
			case QFDDPackage.QUESTIONAIRE_HEADER:
				return validateQuestionaireHeader((QuestionaireHeader)value, diagnostics, context);
			case QFDDPackage.COPY_RIGHT_SECTION:
				return validateCopyRightSection((CopyRightSection)value, diagnostics, context);
			case QFDDPackage.COPY_RIGHT_PATTERN_OBSERVATION:
				return validateCopyRightPatternObservation((CopyRightPatternObservation)value, diagnostics, context);
			case QFDDPackage.QUESTIONNAIRE_FORM_DEFINITION_SECTION:
				return validateQuestionnaireFormDefinitionSection((QuestionnaireFormDefinitionSection)value, diagnostics, context);
			case QFDDPackage.QUESTIONS_ORGANIZER:
				return validateQuestionsOrganizer((QuestionsOrganizer)value, diagnostics, context);
			case QFDDPackage.NUMERIC_QUESTION_PATTERN_OBSERVATION:
				return validateNumericQuestionPatternObservation((NumericQuestionPatternObservation)value, diagnostics, context);
			case QFDDPackage.QUESTION_HELP_TEXT_PATTERN_OBSERVATION:
				return validateQuestionHelpTextPatternObservation((QuestionHelpTextPatternObservation)value, diagnostics, context);
			case QFDDPackage.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION:
				return validateMultipleChoiceQuestionPatternObservation((MultipleChoiceQuestionPatternObservation)value, diagnostics, context);
			case QFDDPackage.QUESTION_OPTIONS_PATTERN_OBSERVATION:
				return validateQuestionOptionsPatternObservation((QuestionOptionsPatternObservation)value, diagnostics, context);
			case QFDDPackage.QUESTION_MEDIA_PATTERN:
				return validateQuestionMediaPattern((QuestionMediaPattern)value, diagnostics, context);
			case QFDDPackage.QUESTION_FEEDBACK_PATTERN_OBSERVATION:
				return validateQuestionFeedbackPatternObservation((QuestionFeedbackPatternObservation)value, diagnostics, context);
			case QFDDPackage.TEXT_QUESTION_PATTERN_OBSERVATION:
				return validateTextQuestionPatternObservation((TextQuestionPatternObservation)value, diagnostics, context);
			case QFDDPackage.ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION:
				return validateAnalogSliderQuestionPatternObservation((AnalogSliderQuestionPatternObservation)value, diagnostics, context);
			case QFDDPackage.DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION:
				return validateDiscreteSliderQuestionPatternObservation((DiscreteSliderQuestionPatternObservation)value, diagnostics, context);
			case QFDDPackage.QUESTION_REFERENCE_RANGE_PATTERN:
				return validateQuestionReferenceRangePattern((QuestionReferenceRangePattern)value, diagnostics, context);
			case QFDDPackage.PRECONDITION_PATTERN:
				return validatePreconditionPattern((PreconditionPattern)value, diagnostics, context);
			case QFDDPackage.CRITERION_PATTERN:
				return validateCriterionPattern((CriterionPattern)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaire(Questionaire questionaire, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionaire, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaire_validateQuestionaireHeaderTemplateId(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCodeP(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCode(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderConfidentialityCodeP(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderConfidentialityCode(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderEffectiveTime(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderLanguageCode(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderLanguageCodeP(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderRealmCode(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderRealmCodeP(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderTitle(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderTypeId(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderId(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthor(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodian(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderRecordTarget(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderTypeIdExtension(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderTypeIdRoot(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorPersonName(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAddr(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorId(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorTelecom(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorTime(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodian(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderRecordTargetPatientRoleId(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderRecordTargetPatientRole(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaire_validateQuestionaireCopyRightSection(questionaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaire_validateQuestionaireQuestionnaireFormDefinitionSection(questionaire, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQuestionaireCopyRightSection constraint of '<em>Questionaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaire_validateQuestionaireCopyRightSection(Questionaire questionaire,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaire.validateQuestionaireCopyRightSection(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireQuestionnaireFormDefinitionSection constraint of '<em>Questionaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaire_validateQuestionaireQuestionnaireFormDefinitionSection(
			Questionaire questionaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaire.validateQuestionaireQuestionnaireFormDefinitionSection(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderTemplateId constraint of '<em>Questionaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaire_validateQuestionaireHeaderTemplateId(Questionaire questionaire,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaire.validateQuestionaireHeaderTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader(QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionaireHeader, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderTemplateId(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCodeP(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCode(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderConfidentialityCodeP(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderConfidentialityCode(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderEffectiveTime(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderLanguageCode(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderLanguageCodeP(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderRealmCode(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderRealmCodeP(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderTitle(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderTypeId(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderId(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthor(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodian(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderRecordTarget(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderTypeIdExtension(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderTypeIdRoot(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorPersonName(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAddr(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorId(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorTelecom(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderAuthorTime(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodian(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderRecordTargetPatientRoleId(questionaireHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionaireHeader_validateQuestionaireHeaderRecordTargetPatientRole(questionaireHeader, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQuestionaireHeaderTemplateId constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderTemplateId(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderCodeP constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderCodeP(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderCode constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderCode(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderConfidentialityCodeP constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderConfidentialityCodeP(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderConfidentialityCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderConfidentialityCode constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderConfidentialityCode(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderConfidentialityCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderEffectiveTime constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderEffectiveTime(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderLanguageCode constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderLanguageCode(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderLanguageCodeP constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderLanguageCodeP(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderLanguageCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderRealmCode constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderRealmCode(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderRealmCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderRealmCodeP constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderRealmCodeP(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderRealmCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderTitle constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderTitle(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderTitle(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderTypeId constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderTypeId(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderTypeId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderId constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderId(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderAuthor constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderAuthor(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderAuthor(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderCustodian constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderCustodian(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderCustodian(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderRecordTarget constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderRecordTarget(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderRecordTarget(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderTypeIdExtension constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderTypeIdExtension(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderTypeIdExtension(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderTypeIdRoot constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderTypeIdRoot(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderTypeIdRoot(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderAuthorAssignedAuthorPersonName constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorPersonName(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderAuthorAssignedAuthorPersonName(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderAuthorAssignedAuthorAddr constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAddr(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderAuthorAssignedAuthorAddr(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderAuthorAssignedAuthorId constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorId(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderAuthorAssignedAuthorId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderAuthorAssignedAuthorTelecom constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorTelecom(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderAuthorAssignedAuthorTelecom(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderAuthorTime constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderAuthorTime(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderAuthorTime(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderCustodianAssignedCustodian constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderCustodianAssignedCustodian(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderCustodianAssignedCustodian(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderRecordTargetPatientRoleId constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderRecordTargetPatientRoleId(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderRecordTargetPatientRoleId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionaireHeaderRecordTargetPatientRole constraint of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeader_validateQuestionaireHeaderRecordTargetPatientRole(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionaireHeader.validateQuestionaireHeaderRecordTargetPatientRole(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizer(QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionsOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionsOrganizer_validateQuestionsOrganizerTemplateId(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionsOrganizer_validateQuestionsOrganizerClassCode(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionsOrganizer_validateQuestionsOrganizerId(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionsOrganizer_validateQuestionsOrganizerMoodCode(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionsOrganizer_validateQuestionsOrganizerStatusCode(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionsOrganizer_validateQuestionsOrganizerPrecondition(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionsOrganizer_validateQuestionsOrganizerNumericQuestionPatternObservation(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionsOrganizer_validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionsOrganizer_validateQuestionsOrganizerTextQuestionPatternObservation(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionsOrganizer_validateQuestionsOrganizerAnalogSliderQuestionPatternObservation(questionsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionsOrganizer_validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation(questionsOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQuestionsOrganizerTemplateId constraint of '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizer_validateQuestionsOrganizerTemplateId(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionsOrganizer.validateQuestionsOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionsOrganizerClassCode constraint of '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizer_validateQuestionsOrganizerClassCode(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionsOrganizer.validateQuestionsOrganizerClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionsOrganizerId constraint of '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizer_validateQuestionsOrganizerId(QuestionsOrganizer questionsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionsOrganizer.validateQuestionsOrganizerId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionsOrganizerMoodCode constraint of '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizer_validateQuestionsOrganizerMoodCode(QuestionsOrganizer questionsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionsOrganizer.validateQuestionsOrganizerMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionsOrganizerStatusCode constraint of '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizer_validateQuestionsOrganizerStatusCode(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionsOrganizer.validateQuestionsOrganizerStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionsOrganizerPrecondition constraint of '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizer_validateQuestionsOrganizerPrecondition(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionsOrganizer.validateQuestionsOrganizerPrecondition(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionsOrganizerNumericQuestionPatternObservation constraint of '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizer_validateQuestionsOrganizerNumericQuestionPatternObservation(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionsOrganizer.validateQuestionsOrganizerNumericQuestionPatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation constraint of '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizer_validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionsOrganizer.validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionsOrganizerTextQuestionPatternObservation constraint of '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizer_validateQuestionsOrganizerTextQuestionPatternObservation(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionsOrganizer.validateQuestionsOrganizerTextQuestionPatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionsOrganizerAnalogSliderQuestionPatternObservation constraint of '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizer_validateQuestionsOrganizerAnalogSliderQuestionPatternObservation(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionsOrganizer.validateQuestionsOrganizerAnalogSliderQuestionPatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation constraint of '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizer_validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionsOrganizer.validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservation(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numericQuestionPatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationTemplateId(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationClassCode(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationCode(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationId(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationMoodCode(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationLanguageCode(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationPrecondition(numericQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationReferenceRange(numericQuestionPatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNumericQuestionPatternObservationTemplateId constraint of '<em>Numeric Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationTemplateId(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericQuestionPatternObservation.validateNumericQuestionPatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateNumericQuestionPatternObservationClassCode constraint of '<em>Numeric Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationClassCode(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericQuestionPatternObservation.validateNumericQuestionPatternObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumericQuestionPatternObservationCode constraint of '<em>Numeric Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationCode(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericQuestionPatternObservation.validateNumericQuestionPatternObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumericQuestionPatternObservationId constraint of '<em>Numeric Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationId(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericQuestionPatternObservation.validateNumericQuestionPatternObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateNumericQuestionPatternObservationMoodCode constraint of '<em>Numeric Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationMoodCode(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericQuestionPatternObservation.validateNumericQuestionPatternObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumericQuestionPatternObservationLanguageCode constraint of '<em>Numeric Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationLanguageCode(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericQuestionPatternObservation.validateNumericQuestionPatternObservationLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation constraint of '<em>Numeric Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericQuestionPatternObservation.validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation constraint of '<em>Numeric Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericQuestionPatternObservation.validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateNumericQuestionPatternObservationPrecondition constraint of '<em>Numeric Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationPrecondition(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericQuestionPatternObservation.validateNumericQuestionPatternObservationPrecondition(diagnostics, context);
	}

	/**
	 * Validates the validateNumericQuestionPatternObservationReferenceRange constraint of '<em>Numeric Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationReferenceRange(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericQuestionPatternObservation.validateNumericQuestionPatternObservationReferenceRange(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservation(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionHelpTextPatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationTemplateId(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationClassCode(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationCodeP(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationCode(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationMoodCode(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationValue(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationLanguageCodeP(questionHelpTextPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationLanguageCode(questionHelpTextPatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQuestionHelpTextPatternObservationTemplateId constraint of '<em>Question Help Text Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationTemplateId(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionHelpTextPatternObservation.validateQuestionHelpTextPatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionHelpTextPatternObservationClassCode constraint of '<em>Question Help Text Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationClassCode(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionHelpTextPatternObservation.validateQuestionHelpTextPatternObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionHelpTextPatternObservationCodeP constraint of '<em>Question Help Text Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationCodeP(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionHelpTextPatternObservation.validateQuestionHelpTextPatternObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionHelpTextPatternObservationCode constraint of '<em>Question Help Text Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationCode(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionHelpTextPatternObservation.validateQuestionHelpTextPatternObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionHelpTextPatternObservationMoodCode constraint of '<em>Question Help Text Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationMoodCode(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionHelpTextPatternObservation.validateQuestionHelpTextPatternObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionHelpTextPatternObservationValue constraint of '<em>Question Help Text Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationValue(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionHelpTextPatternObservation.validateQuestionHelpTextPatternObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionHelpTextPatternObservationLanguageCodeP constraint of '<em>Question Help Text Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationLanguageCodeP(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionHelpTextPatternObservation.validateQuestionHelpTextPatternObservationLanguageCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionHelpTextPatternObservationLanguageCode constraint of '<em>Question Help Text Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservation_validateQuestionHelpTextPatternObservationLanguageCode(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionHelpTextPatternObservation.validateQuestionHelpTextPatternObservationLanguageCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multipleChoiceQuestionPatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationTemplateId(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationClassCode(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationCode(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationId(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationLanguageCode(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationMoodCode(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationPrecondition(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationCECode(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationCECodeSystem(multipleChoiceQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationCEDisplayName(multipleChoiceQuestionPatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationTemplateId constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationTemplateId(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationClassCode constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationClassCode(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationCode constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationCode(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationId constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationId(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationLanguageCode constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationLanguageCode(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationMoodCode constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationMoodCode(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationPrecondition constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationPrecondition(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationPrecondition(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationCECode constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationCECode(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationCECode(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationCECodeSystem constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationCECodeSystem(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationCECodeSystem(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationCEDisplayName constraint of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationCEDisplayName(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationCEDisplayName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservation(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionOptionsPatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionOptionsPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionOptionsPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionOptionsPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionOptionsPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionOptionsPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionOptionsPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionOptionsPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionOptionsPatternObservation_validateQuestionOptionsPatternObservationTemplateId(questionOptionsPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionOptionsPatternObservation_validateQuestionOptionsPatternObservationClassCode(questionOptionsPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionOptionsPatternObservation_validateQuestionOptionsPatternObservationCodeP(questionOptionsPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionOptionsPatternObservation_validateQuestionOptionsPatternObservationCode(questionOptionsPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionOptionsPatternObservation_validateQuestionOptionsPatternObservationMoodCode(questionOptionsPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionOptionsPatternObservation_validateQuestionOptionsPatternObservationValue(questionOptionsPatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQuestionOptionsPatternObservationTemplateId constraint of '<em>Question Options Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservation_validateQuestionOptionsPatternObservationTemplateId(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionOptionsPatternObservation.validateQuestionOptionsPatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionOptionsPatternObservationClassCode constraint of '<em>Question Options Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservation_validateQuestionOptionsPatternObservationClassCode(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionOptionsPatternObservation.validateQuestionOptionsPatternObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionOptionsPatternObservationCodeP constraint of '<em>Question Options Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservation_validateQuestionOptionsPatternObservationCodeP(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionOptionsPatternObservation.validateQuestionOptionsPatternObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionOptionsPatternObservationCode constraint of '<em>Question Options Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservation_validateQuestionOptionsPatternObservationCode(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionOptionsPatternObservation.validateQuestionOptionsPatternObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionOptionsPatternObservationMoodCode constraint of '<em>Question Options Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservation_validateQuestionOptionsPatternObservationMoodCode(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionOptionsPatternObservation.validateQuestionOptionsPatternObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionOptionsPatternObservationValue constraint of '<em>Question Options Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservation_validateQuestionOptionsPatternObservationValue(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionOptionsPatternObservation.validateQuestionOptionsPatternObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionMediaPattern(QuestionMediaPattern questionMediaPattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionMediaPattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionMediaPattern_validateQuestionMediaPatternTemplateId(questionMediaPattern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQuestionMediaPatternTemplateId constraint of '<em>Question Media Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionMediaPattern_validateQuestionMediaPatternTemplateId(
			QuestionMediaPattern questionMediaPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionMediaPattern.validateQuestionMediaPatternTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservation(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionFeedbackPatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionFeedbackPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionFeedbackPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionFeedbackPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionFeedbackPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionFeedbackPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionFeedbackPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionFeedbackPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionFeedbackPatternObservation_validateQuestionFeedbackPatternObservationTemplateId(questionFeedbackPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionFeedbackPatternObservation_validateQuestionFeedbackPatternObservationClassCode(questionFeedbackPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionFeedbackPatternObservation_validateQuestionFeedbackPatternObservationCode(questionFeedbackPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionFeedbackPatternObservation_validateQuestionFeedbackPatternObservationLanguageCode(questionFeedbackPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionFeedbackPatternObservation_validateQuestionFeedbackPatternObservationMoodCode(questionFeedbackPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionFeedbackPatternObservation_validateQuestionFeedbackPatternObservationValue(questionFeedbackPatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQuestionFeedbackPatternObservationTemplateId constraint of '<em>Question Feedback Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservation_validateQuestionFeedbackPatternObservationTemplateId(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionFeedbackPatternObservation.validateQuestionFeedbackPatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionFeedbackPatternObservationClassCode constraint of '<em>Question Feedback Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservation_validateQuestionFeedbackPatternObservationClassCode(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionFeedbackPatternObservation.validateQuestionFeedbackPatternObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionFeedbackPatternObservationCode constraint of '<em>Question Feedback Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservation_validateQuestionFeedbackPatternObservationCode(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionFeedbackPatternObservation.validateQuestionFeedbackPatternObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionFeedbackPatternObservationLanguageCode constraint of '<em>Question Feedback Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservation_validateQuestionFeedbackPatternObservationLanguageCode(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionFeedbackPatternObservation.validateQuestionFeedbackPatternObservationLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionFeedbackPatternObservationMoodCode constraint of '<em>Question Feedback Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservation_validateQuestionFeedbackPatternObservationMoodCode(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionFeedbackPatternObservation.validateQuestionFeedbackPatternObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionFeedbackPatternObservationValue constraint of '<em>Question Feedback Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservation_validateQuestionFeedbackPatternObservationValue(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionFeedbackPatternObservation.validateQuestionFeedbackPatternObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservation(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textQuestionPatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextQuestionPatternObservation_validateTextQuestionPatternObservationTemplateId(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextQuestionPatternObservation_validateTextQuestionPatternObservationClassCode(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextQuestionPatternObservation_validateTextQuestionPatternObservationCode(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextQuestionPatternObservation_validateTextQuestionPatternObservationId(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextQuestionPatternObservation_validateTextQuestionPatternObservationLanguageCode(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextQuestionPatternObservation_validateTextQuestionPatternObservationMoodCode(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextQuestionPatternObservation_validateTextQuestionPatternObservationQuestionHelpTextPatternObservation(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextQuestionPatternObservation_validateTextQuestionPatternObservationQuestionMediaPattern(textQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextQuestionPatternObservation_validateTextQuestionPatternObservationPrecondition(textQuestionPatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTextQuestionPatternObservationTemplateId constraint of '<em>Text Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservation_validateTextQuestionPatternObservationTemplateId(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textQuestionPatternObservation.validateTextQuestionPatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateTextQuestionPatternObservationClassCode constraint of '<em>Text Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservation_validateTextQuestionPatternObservationClassCode(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textQuestionPatternObservation.validateTextQuestionPatternObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateTextQuestionPatternObservationCode constraint of '<em>Text Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservation_validateTextQuestionPatternObservationCode(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textQuestionPatternObservation.validateTextQuestionPatternObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateTextQuestionPatternObservationId constraint of '<em>Text Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservation_validateTextQuestionPatternObservationId(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textQuestionPatternObservation.validateTextQuestionPatternObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateTextQuestionPatternObservationLanguageCode constraint of '<em>Text Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservation_validateTextQuestionPatternObservationLanguageCode(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textQuestionPatternObservation.validateTextQuestionPatternObservationLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateTextQuestionPatternObservationMoodCode constraint of '<em>Text Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservation_validateTextQuestionPatternObservationMoodCode(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textQuestionPatternObservation.validateTextQuestionPatternObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateTextQuestionPatternObservationQuestionHelpTextPatternObservation constraint of '<em>Text Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservation_validateTextQuestionPatternObservationQuestionHelpTextPatternObservation(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textQuestionPatternObservation.validateTextQuestionPatternObservationQuestionHelpTextPatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateTextQuestionPatternObservationQuestionMediaPattern constraint of '<em>Text Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservation_validateTextQuestionPatternObservationQuestionMediaPattern(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textQuestionPatternObservation.validateTextQuestionPatternObservationQuestionMediaPattern(diagnostics, context);
	}

	/**
	 * Validates the validateTextQuestionPatternObservationPrecondition constraint of '<em>Text Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservation_validateTextQuestionPatternObservationPrecondition(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textQuestionPatternObservation.validateTextQuestionPatternObservationPrecondition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogSliderQuestionPatternObservation(
			AnalogSliderQuestionPatternObservation analogSliderQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(analogSliderQuestionPatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalogSliderQuestionPatternObservation_validateNumericQuestionPatternObservationTemplateId(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationClassCode(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationCode(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationId(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationMoodCode(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationLanguageCode(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationPrecondition(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericQuestionPatternObservation_validateNumericQuestionPatternObservationReferenceRange(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalogSliderQuestionPatternObservation_validateAnalogSliderQuestionPatternObservationReferenceRange(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalogSliderQuestionPatternObservation_validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue(analogSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalogSliderQuestionPatternObservation_validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode(analogSliderQuestionPatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAnalogSliderQuestionPatternObservationReferenceRange constraint of '<em>Analog Slider Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogSliderQuestionPatternObservation_validateAnalogSliderQuestionPatternObservationReferenceRange(
			AnalogSliderQuestionPatternObservation analogSliderQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return analogSliderQuestionPatternObservation.validateAnalogSliderQuestionPatternObservationReferenceRange(diagnostics, context);
	}

	/**
	 * Validates the validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue constraint of '<em>Analog Slider Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogSliderQuestionPatternObservation_validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue(
			AnalogSliderQuestionPatternObservation analogSliderQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return analogSliderQuestionPatternObservation.validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue(diagnostics, context);
	}

	/**
	 * Validates the validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode constraint of '<em>Analog Slider Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogSliderQuestionPatternObservation_validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode(
			AnalogSliderQuestionPatternObservation analogSliderQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return analogSliderQuestionPatternObservation.validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumericQuestionPatternObservationTemplateId constraint of '<em>Analog Slider Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogSliderQuestionPatternObservation_validateNumericQuestionPatternObservationTemplateId(
			AnalogSliderQuestionPatternObservation analogSliderQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return analogSliderQuestionPatternObservation.validateNumericQuestionPatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteSliderQuestionPatternObservation(
			DiscreteSliderQuestionPatternObservation discreteSliderQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteSliderQuestionPatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteSliderQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationTemplateId(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationClassCode(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationCode(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationId(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationLanguageCode(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationMoodCode(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationPrecondition(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationCECode(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationCECodeSystem(discreteSliderQuestionPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationCEDisplayName(discreteSliderQuestionPatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMultipleChoiceQuestionPatternObservationTemplateId constraint of '<em>Discrete Slider Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteSliderQuestionPatternObservation_validateMultipleChoiceQuestionPatternObservationTemplateId(
			DiscreteSliderQuestionPatternObservation discreteSliderQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return discreteSliderQuestionPatternObservation.validateMultipleChoiceQuestionPatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePattern(QuestionReferenceRangePattern questionReferenceRangePattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionReferenceRangePattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateReferenceRange_validateTypeCode(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternTemplateId(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternTypeCode(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternObservationRange(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternObservationRangeIVLINTHigh(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternObservationRangeIVLINTLow(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternObservationRangeText(questionReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternObservationRangeValue(questionReferenceRangePattern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQuestionReferenceRangePatternTemplateId constraint of '<em>Question Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternTemplateId(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionReferenceRangePattern.validateQuestionReferenceRangePatternTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionReferenceRangePatternTypeCode constraint of '<em>Question Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternTypeCode(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionReferenceRangePattern.validateQuestionReferenceRangePatternTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionReferenceRangePatternObservationRange constraint of '<em>Question Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternObservationRange(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionReferenceRangePattern.validateQuestionReferenceRangePatternObservationRange(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionReferenceRangePatternObservationRangeIVLINTHigh constraint of '<em>Question Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternObservationRangeIVLINTHigh(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionReferenceRangePattern.validateQuestionReferenceRangePatternObservationRangeIVLINTHigh(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionReferenceRangePatternObservationRangeIVLINTLow constraint of '<em>Question Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternObservationRangeIVLINTLow(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionReferenceRangePattern.validateQuestionReferenceRangePatternObservationRangeIVLINTLow(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionReferenceRangePatternObservationRangeText constraint of '<em>Question Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternObservationRangeText(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionReferenceRangePattern.validateQuestionReferenceRangePatternObservationRangeText(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionReferenceRangePatternObservationRangeValue constraint of '<em>Question Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePattern_validateQuestionReferenceRangePatternObservationRangeValue(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionReferenceRangePattern.validateQuestionReferenceRangePatternObservationRangeValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservation(CopyRightPatternObservation copyRightPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(copyRightPatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(copyRightPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(copyRightPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(copyRightPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(copyRightPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(copyRightPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(copyRightPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(copyRightPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyRightPatternObservation_validateCopyRightPatternObservationTemplateId(copyRightPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyRightPatternObservation_validateCopyRightPatternObservationClassCode(copyRightPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyRightPatternObservation_validateCopyRightPatternObservationCode(copyRightPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyRightPatternObservation_validateCopyRightPatternObservationMoodCode(copyRightPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyRightPatternObservation_validateCopyRightPatternObservationValue(copyRightPatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyRightPatternObservation_validateCopyRightPatternObservationLanguageCode(copyRightPatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCopyRightPatternObservationTemplateId constraint of '<em>Copy Right Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservation_validateCopyRightPatternObservationTemplateId(
			CopyRightPatternObservation copyRightPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return copyRightPatternObservation.validateCopyRightPatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCopyRightPatternObservationClassCode constraint of '<em>Copy Right Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservation_validateCopyRightPatternObservationClassCode(
			CopyRightPatternObservation copyRightPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return copyRightPatternObservation.validateCopyRightPatternObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateCopyRightPatternObservationCode constraint of '<em>Copy Right Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservation_validateCopyRightPatternObservationCode(
			CopyRightPatternObservation copyRightPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return copyRightPatternObservation.validateCopyRightPatternObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateCopyRightPatternObservationMoodCode constraint of '<em>Copy Right Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservation_validateCopyRightPatternObservationMoodCode(
			CopyRightPatternObservation copyRightPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return copyRightPatternObservation.validateCopyRightPatternObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateCopyRightPatternObservationValue constraint of '<em>Copy Right Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservation_validateCopyRightPatternObservationValue(
			CopyRightPatternObservation copyRightPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return copyRightPatternObservation.validateCopyRightPatternObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateCopyRightPatternObservationLanguageCode constraint of '<em>Copy Right Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservation_validateCopyRightPatternObservationLanguageCode(
			CopyRightPatternObservation copyRightPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return copyRightPatternObservation.validateCopyRightPatternObservationLanguageCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionPattern(PreconditionPattern preconditionPattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(preconditionPattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(preconditionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(preconditionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(preconditionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(preconditionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(preconditionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(preconditionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(preconditionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validatePrecondition_validateTypeCode(preconditionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validatePreconditionPattern_validatePreconditionPatternTemplateId(preconditionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validatePreconditionPattern_validatePreconditionPatternTypeCode(preconditionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validatePreconditionPattern_validatePreconditionPatternCriterion(preconditionPattern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePreconditionPatternTemplateId constraint of '<em>Precondition Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionPattern_validatePreconditionPatternTemplateId(
			PreconditionPattern preconditionPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return preconditionPattern.validatePreconditionPatternTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePreconditionPatternTypeCode constraint of '<em>Precondition Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionPattern_validatePreconditionPatternTypeCode(
			PreconditionPattern preconditionPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return preconditionPattern.validatePreconditionPatternTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validatePreconditionPatternCriterion constraint of '<em>Precondition Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionPattern_validatePreconditionPatternCriterion(
			PreconditionPattern preconditionPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return preconditionPattern.validatePreconditionPatternCriterion(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterionPattern(CriterionPattern criterionPattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(criterionPattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(criterionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(criterionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(criterionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(criterionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(criterionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(criterionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(criterionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateCriterion_validateMoodCode(criterionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterionPattern_validateCriterionPatternTemplateId(criterionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterionPattern_validateCriterionPatternClassCode(criterionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterionPattern_validateCriterionPatternCode(criterionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterionPattern_validateCriterionPatternMoodCode(criterionPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterionPattern_validateCriterionPatternValue(criterionPattern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCriterionPatternTemplateId constraint of '<em>Criterion Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterionPattern_validateCriterionPatternTemplateId(CriterionPattern criterionPattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return criterionPattern.validateCriterionPatternTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCriterionPatternClassCode constraint of '<em>Criterion Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterionPattern_validateCriterionPatternClassCode(CriterionPattern criterionPattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return criterionPattern.validateCriterionPatternClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateCriterionPatternCode constraint of '<em>Criterion Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterionPattern_validateCriterionPatternCode(CriterionPattern criterionPattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return criterionPattern.validateCriterionPatternCode(diagnostics, context);
	}

	/**
	 * Validates the validateCriterionPatternMoodCode constraint of '<em>Criterion Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterionPattern_validateCriterionPatternMoodCode(CriterionPattern criterionPattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return criterionPattern.validateCriterionPatternMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateCriterionPatternValue constraint of '<em>Criterion Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterionPattern_validateCriterionPatternValue(CriterionPattern criterionPattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return criterionPattern.validateCriterionPatternValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSection(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionnaireFormDefinitionSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionTemplateId(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionCode(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionLanguageCodeP(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionLanguageCode(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionText(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionTitle(questionnaireFormDefinitionSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionQuestionsOrganizer(questionnaireFormDefinitionSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQuestionnaireFormDefinitionSectionTemplateId constraint of '<em>Questionnaire Form Definition Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionTemplateId(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireFormDefinitionSection.validateQuestionnaireFormDefinitionSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireFormDefinitionSectionCode constraint of '<em>Questionnaire Form Definition Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionCode(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireFormDefinitionSection.validateQuestionnaireFormDefinitionSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireFormDefinitionSectionLanguageCodeP constraint of '<em>Questionnaire Form Definition Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionLanguageCodeP(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireFormDefinitionSection.validateQuestionnaireFormDefinitionSectionLanguageCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireFormDefinitionSectionLanguageCode constraint of '<em>Questionnaire Form Definition Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionLanguageCode(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireFormDefinitionSection.validateQuestionnaireFormDefinitionSectionLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireFormDefinitionSectionText constraint of '<em>Questionnaire Form Definition Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionText(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireFormDefinitionSection.validateQuestionnaireFormDefinitionSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireFormDefinitionSectionTitle constraint of '<em>Questionnaire Form Definition Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionTitle(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireFormDefinitionSection.validateQuestionnaireFormDefinitionSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireFormDefinitionSectionQuestionsOrganizer constraint of '<em>Questionnaire Form Definition Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSection_validateQuestionnaireFormDefinitionSectionQuestionsOrganizer(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireFormDefinitionSection.validateQuestionnaireFormDefinitionSectionQuestionsOrganizer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightSection(CopyRightSection copyRightSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(copyRightSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyRightSection_validateCopyRightSectionTemplateId(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyRightSection_validateCopyRightSectionLanguageCode(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyRightSection_validateCopyRightSectionText(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyRightSection_validateCopyRightSectionTitle(copyRightSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyRightSection_validateCopyRightSectionCopyRightPatternObservation(copyRightSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCopyRightSectionTemplateId constraint of '<em>Copy Right Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightSection_validateCopyRightSectionTemplateId(CopyRightSection copyRightSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return copyRightSection.validateCopyRightSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCopyRightSectionLanguageCode constraint of '<em>Copy Right Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightSection_validateCopyRightSectionLanguageCode(CopyRightSection copyRightSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return copyRightSection.validateCopyRightSectionLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateCopyRightSectionText constraint of '<em>Copy Right Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightSection_validateCopyRightSectionText(CopyRightSection copyRightSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return copyRightSection.validateCopyRightSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateCopyRightSectionTitle constraint of '<em>Copy Right Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightSection_validateCopyRightSectionTitle(CopyRightSection copyRightSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return copyRightSection.validateCopyRightSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateCopyRightSectionCopyRightPatternObservation constraint of '<em>Copy Right Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightSection_validateCopyRightSectionCopyRightPatternObservation(
			CopyRightSection copyRightSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return copyRightSection.validateCopyRightSectionCopyRightPatternObservation(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QFDDPlugin.INSTANCE;
	}

} // QFDDValidator
