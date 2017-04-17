/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.mdht.uml.cda.util.CDAValidator;
import org.openhealthtools.mdht.uml.cda.qrdoc.*;
import org.openhealthtools.mdht.uml.cda.qrdoc.AnalogSliderResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.DiscreteSliderResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.NumericResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPlugin;
import org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocument;
import org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader;
import org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseSection;
import org.openhealthtools.mdht.uml.cda.qrdoc.ResponseMediaPattern;
import org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern;
import org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer;
import org.openhealthtools.mdht.uml.cda.qrdoc.TextResponsePatternObservation;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage
 * @generated
 */
public class QRDOCValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QRDOCValidator INSTANCE = new QRDOCValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.qrdoc";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Template Id' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Confidentiality Code' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CONFIDENTIALITY_CODE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Effective Time' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_EFFECTIVE_TIME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Id' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_ID = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Language Code' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LANGUAGE_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Realm Code' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_REALM_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Title' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TITLE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Type Id' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TYPE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Record Target' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_RECORD_TARGET = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Author' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_AUTHOR = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Data Enterer' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_DATA_ENTERER = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Informant' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMANT = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Custodian' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CUSTODIAN = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Information Recipient' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMATION_RECIPIENT = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Legal Authenticator' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LEGAL_AUTHENTICATOR = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header In Fulfillment Of' of 'Questionnaire Response Document Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_IN_FULFILLMENT_OF = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Questionnaire Response Section' of 'Questionnaire Response Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT__QUESTIONNAIRE_RESPONSE_DOCUMENT_QUESTIONNAIRE_RESPONSE_SECTION = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Document Header Template Id' of 'Questionnaire Response Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_DOCUMENT__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Section Template Id' of 'Questionnaire Response Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_SECTION__QUESTIONNAIRE_RESPONSE_SECTION_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Section Code' of 'Questionnaire Response Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_SECTION__QUESTIONNAIRE_RESPONSE_SECTION_CODE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Section Language Code' of 'Questionnaire Response Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_SECTION__QUESTIONNAIRE_RESPONSE_SECTION_LANGUAGE_CODE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Section Text' of 'Questionnaire Response Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_SECTION__QUESTIONNAIRE_RESPONSE_SECTION_TEXT = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Questionnaire Response Section Title' of 'Questionnaire Response Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE_RESPONSE_SECTION__QUESTIONNAIRE_RESPONSE_SECTION_TITLE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Responses Organizer Template Id' of 'Responses Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_TEMPLATE_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Responses Organizer Code' of 'Responses Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_CODE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Responses Organizer Id' of 'Responses Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_ID = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Responses Organizer Mood Code' of 'Responses Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_MOOD_CODE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Responses Organizer Status Code' of 'Responses Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_STATUS_CODE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Responses Organizer Numeric Response Pattern Observation' of 'Responses Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_NUMERIC_RESPONSE_PATTERN_OBSERVATION = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Responses Organizer Multiple Choice Response Pattern Observation' of 'Responses Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Responses Organizer Text Question Response Observation' of 'Responses Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_TEXT_QUESTION_RESPONSE_OBSERVATION = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Responses Organizer Analog Slider Response Pattern Observation' of 'Responses Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Responses Organizer Discrete Slider Response Pattern Observation' of 'Responses Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation Template Id' of 'Numeric Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation Class Code' of 'Numeric Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_CLASS_CODE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation Code' of 'Numeric Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_CODE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation Id' of 'Numeric Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_ID = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation Mood Code' of 'Numeric Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_MOOD_CODE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation Language Code' of 'Numeric Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation Status Code' of 'Numeric Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation Status Code P' of 'Numeric Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE_P = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation Reference Range' of 'Numeric Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_REFERENCE_RANGE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation CD Code' of 'Numeric Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_CD_CODE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation CD Code System' of 'Numeric Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_CD_CODE_SYSTEM = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation CD Original Text' of 'Numeric Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMERIC_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_CD_ORIGINAL_TEXT = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation Template Id' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation Class Code' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CLASS_CODE = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation Code' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CODE = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation Id' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_ID = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation Language Code P' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE_P = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation Language Code' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation Mood Code' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_MOOD_CODE = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation Status Code' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation Status Code P' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE_P = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation CD Code' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation CD Code System' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE_SYSTEM = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation CD Original Text' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_ORIGINAL_TEXT = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation CE Code' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation CE Code System' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE_SYSTEM = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation CE Display Name' of 'Multiple Choice Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_DISPLAY_NAME = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Response Pattern Observation Template Id' of 'Text Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_RESPONSE_PATTERN_OBSERVATION__TEXT_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Response Pattern Observation Class Code' of 'Text Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_RESPONSE_PATTERN_OBSERVATION__TEXT_RESPONSE_PATTERN_OBSERVATION_CLASS_CODE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Response Pattern Observation Code' of 'Text Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_RESPONSE_PATTERN_OBSERVATION__TEXT_RESPONSE_PATTERN_OBSERVATION_CODE = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Response Pattern Observation Id' of 'Text Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_RESPONSE_PATTERN_OBSERVATION__TEXT_RESPONSE_PATTERN_OBSERVATION_ID = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Response Pattern Observation Language Code P' of 'Text Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_RESPONSE_PATTERN_OBSERVATION__TEXT_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE_P = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Response Pattern Observation Language Code' of 'Text Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_RESPONSE_PATTERN_OBSERVATION__TEXT_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Text Response Pattern Observation Mood Code' of 'Text Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_RESPONSE_PATTERN_OBSERVATION__TEXT_RESPONSE_PATTERN_OBSERVATION_MOOD_CODE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Response Pattern Observation Template Id' of 'Analog Slider Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Multiple Choice Response Pattern Observation Template Id' of 'Discrete Slider Response Pattern Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Response Media Pattern Template Id' of 'Response Media Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSE_MEDIA_PATTERN__RESPONSE_MEDIA_PATTERN_TEMPLATE_ID = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Response Reference Range Pattern Template Id' of 'Response Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_TEMPLATE_ID = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Response Reference Range Pattern Type Code' of 'Response Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_TYPE_CODE = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Response Reference Range Pattern Observation Range' of 'Response Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Response Reference Range Pattern Observation Range IVLINT High' of 'Response Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Response Reference Range Pattern Observation Range IVLINT Low' of 'Response Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Response Reference Range Pattern Observation Range Text' of 'Response Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Response Reference Range Pattern Observation Range Value' of 'Response Reference Range Pattern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE = 77;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 77;

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
	public QRDOCValidator() {
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
	  return QRDOCPackage.eINSTANCE;
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
			case QRDOCPackage.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER:
				return validateQuestionnaireResponseDocumentHeader((QuestionnaireResponseDocumentHeader)value, diagnostics, context);
			case QRDOCPackage.QUESTIONNAIRE_RESPONSE_DOCUMENT:
				return validateQuestionnaireResponseDocument((QuestionnaireResponseDocument)value, diagnostics, context);
			case QRDOCPackage.QUESTIONNAIRE_RESPONSE_SECTION:
				return validateQuestionnaireResponseSection((QuestionnaireResponseSection)value, diagnostics, context);
			case QRDOCPackage.RESPONSES_ORGANIZER:
				return validateResponsesOrganizer((ResponsesOrganizer)value, diagnostics, context);
			case QRDOCPackage.NUMERIC_RESPONSE_PATTERN_OBSERVATION:
				return validateNumericResponsePatternObservation((NumericResponsePatternObservation)value, diagnostics, context);
			case QRDOCPackage.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION:
				return validateMultipleChoiceResponsePatternObservation((MultipleChoiceResponsePatternObservation)value, diagnostics, context);
			case QRDOCPackage.TEXT_RESPONSE_PATTERN_OBSERVATION:
				return validateTextResponsePatternObservation((TextResponsePatternObservation)value, diagnostics, context);
			case QRDOCPackage.ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION:
				return validateAnalogSliderResponsePatternObservation((AnalogSliderResponsePatternObservation)value, diagnostics, context);
			case QRDOCPackage.DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION:
				return validateDiscreteSliderResponsePatternObservation((DiscreteSliderResponsePatternObservation)value, diagnostics, context);
			case QRDOCPackage.RESPONSE_MEDIA_PATTERN:
				return validateResponseMediaPattern((ResponseMediaPattern)value, diagnostics, context);
			case QRDOCPackage.RESPONSE_REFERENCE_RANGE_PATTERN:
				return validateResponseReferenceRangePattern((ResponseReferenceRangePattern)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionnaireResponseDocumentHeader, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderTemplateId(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderConfidentialityCode(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderEffectiveTime(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderId(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderLanguageCode(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderRealmCode(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderTitle(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderTypeId(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderRecordTarget(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderAuthor(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderDataEnterer(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderInformant(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderCustodian(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderInformationRecipient(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(questionnaireResponseDocumentHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(questionnaireResponseDocumentHeader, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderTemplateId constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderTemplateId(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderConfidentialityCode constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderConfidentialityCode(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderConfidentialityCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderEffectiveTime constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderEffectiveTime(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderId constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderId(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderLanguageCode constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderLanguageCode(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderRealmCode constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderRealmCode(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderRealmCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderTitle constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderTitle(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderTitle(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderTypeId constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderTypeId(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderTypeId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderRecordTarget constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderRecordTarget(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderRecordTarget(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderAuthor constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderAuthor(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderAuthor(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderDataEnterer constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderDataEnterer(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderDataEnterer(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderInformant constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderInformant(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderInformant(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderCustodian constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderCustodian(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderCustodian(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderInformationRecipient constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderInformationRecipient(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderInformationRecipient(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderLegalAuthenticator constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderInFulfillmentOf constraint of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocumentHeader.validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocument(QuestionnaireResponseDocument questionnaireResponseDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionnaireResponseDocument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocument_validateQuestionnaireResponseDocumentHeaderTemplateId(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderConfidentialityCode(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderEffectiveTime(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderId(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderLanguageCode(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderRealmCode(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderTitle(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderTypeId(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderRecordTarget(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderAuthor(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderDataEnterer(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderInformant(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderCustodian(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderInformationRecipient(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocumentHeader_validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(questionnaireResponseDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseDocument_validateQuestionnaireResponseDocumentQuestionnaireResponseSection(questionnaireResponseDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentQuestionnaireResponseSection constraint of '<em>Questionnaire Response Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocument_validateQuestionnaireResponseDocumentQuestionnaireResponseSection(
			QuestionnaireResponseDocument questionnaireResponseDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocument.validateQuestionnaireResponseDocumentQuestionnaireResponseSection(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseDocumentHeaderTemplateId constraint of '<em>Questionnaire Response Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocument_validateQuestionnaireResponseDocumentHeaderTemplateId(
			QuestionnaireResponseDocument questionnaireResponseDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseDocument.validateQuestionnaireResponseDocumentHeaderTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseSection(QuestionnaireResponseSection questionnaireResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionnaireResponseSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseSection_validateQuestionnaireResponseSectionTemplateId(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseSection_validateQuestionnaireResponseSectionCode(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseSection_validateQuestionnaireResponseSectionLanguageCode(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseSection_validateQuestionnaireResponseSectionText(questionnaireResponseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionnaireResponseSection_validateQuestionnaireResponseSectionTitle(questionnaireResponseSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQuestionnaireResponseSectionTemplateId constraint of '<em>Questionnaire Response Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseSection_validateQuestionnaireResponseSectionTemplateId(
			QuestionnaireResponseSection questionnaireResponseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseSection.validateQuestionnaireResponseSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseSectionCode constraint of '<em>Questionnaire Response Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseSection_validateQuestionnaireResponseSectionCode(
			QuestionnaireResponseSection questionnaireResponseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseSection.validateQuestionnaireResponseSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseSectionLanguageCode constraint of '<em>Questionnaire Response Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseSection_validateQuestionnaireResponseSectionLanguageCode(
			QuestionnaireResponseSection questionnaireResponseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseSection.validateQuestionnaireResponseSectionLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseSectionText constraint of '<em>Questionnaire Response Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseSection_validateQuestionnaireResponseSectionText(
			QuestionnaireResponseSection questionnaireResponseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseSection.validateQuestionnaireResponseSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateQuestionnaireResponseSectionTitle constraint of '<em>Questionnaire Response Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseSection_validateQuestionnaireResponseSectionTitle(
			QuestionnaireResponseSection questionnaireResponseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaireResponseSection.validateQuestionnaireResponseSectionTitle(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizer(ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(responsesOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsesOrganizer_validateResponsesOrganizerTemplateId(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsesOrganizer_validateResponsesOrganizerCode(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsesOrganizer_validateResponsesOrganizerId(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsesOrganizer_validateResponsesOrganizerMoodCode(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsesOrganizer_validateResponsesOrganizerStatusCode(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsesOrganizer_validateResponsesOrganizerNumericResponsePatternObservation(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsesOrganizer_validateResponsesOrganizerMultipleChoiceResponsePatternObservation(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsesOrganizer_validateResponsesOrganizerTextQuestionResponseObservation(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsesOrganizer_validateResponsesOrganizerAnalogSliderResponsePatternObservation(responsesOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsesOrganizer_validateResponsesOrganizerDiscreteSliderResponsePatternObservation(responsesOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateResponsesOrganizerTemplateId constraint of '<em>Responses Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizer_validateResponsesOrganizerTemplateId(
			ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsesOrganizer.validateResponsesOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResponsesOrganizerCode constraint of '<em>Responses Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizer_validateResponsesOrganizerCode(ResponsesOrganizer responsesOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsesOrganizer.validateResponsesOrganizerCode(diagnostics, context);
	}

	/**
	 * Validates the validateResponsesOrganizerId constraint of '<em>Responses Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizer_validateResponsesOrganizerId(ResponsesOrganizer responsesOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsesOrganizer.validateResponsesOrganizerId(diagnostics, context);
	}

	/**
	 * Validates the validateResponsesOrganizerMoodCode constraint of '<em>Responses Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizer_validateResponsesOrganizerMoodCode(ResponsesOrganizer responsesOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsesOrganizer.validateResponsesOrganizerMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateResponsesOrganizerStatusCode constraint of '<em>Responses Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizer_validateResponsesOrganizerStatusCode(
			ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsesOrganizer.validateResponsesOrganizerStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateResponsesOrganizerNumericResponsePatternObservation constraint of '<em>Responses Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizer_validateResponsesOrganizerNumericResponsePatternObservation(
			ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsesOrganizer.validateResponsesOrganizerNumericResponsePatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResponsesOrganizerMultipleChoiceResponsePatternObservation constraint of '<em>Responses Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizer_validateResponsesOrganizerMultipleChoiceResponsePatternObservation(
			ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsesOrganizer.validateResponsesOrganizerMultipleChoiceResponsePatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResponsesOrganizerTextQuestionResponseObservation constraint of '<em>Responses Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizer_validateResponsesOrganizerTextQuestionResponseObservation(
			ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsesOrganizer.validateResponsesOrganizerTextQuestionResponseObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResponsesOrganizerAnalogSliderResponsePatternObservation constraint of '<em>Responses Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizer_validateResponsesOrganizerAnalogSliderResponsePatternObservation(
			ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsesOrganizer.validateResponsesOrganizerAnalogSliderResponsePatternObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResponsesOrganizerDiscreteSliderResponsePatternObservation constraint of '<em>Responses Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizer_validateResponsesOrganizerDiscreteSliderResponsePatternObservation(
			ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsesOrganizer.validateResponsesOrganizerDiscreteSliderResponsePatternObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numericResponsePatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationTemplateId(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationClassCode(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationCode(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationId(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationMoodCode(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationLanguageCode(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationStatusCode(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationStatusCodeP(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationReferenceRange(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationCDCode(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationCDCodeSystem(numericResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationCDOriginalText(numericResponsePatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNumericResponsePatternObservationTemplateId constraint of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation_validateNumericResponsePatternObservationTemplateId(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericResponsePatternObservation.validateNumericResponsePatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateNumericResponsePatternObservationClassCode constraint of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation_validateNumericResponsePatternObservationClassCode(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericResponsePatternObservation.validateNumericResponsePatternObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumericResponsePatternObservationCode constraint of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation_validateNumericResponsePatternObservationCode(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericResponsePatternObservation.validateNumericResponsePatternObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumericResponsePatternObservationId constraint of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation_validateNumericResponsePatternObservationId(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericResponsePatternObservation.validateNumericResponsePatternObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateNumericResponsePatternObservationMoodCode constraint of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation_validateNumericResponsePatternObservationMoodCode(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericResponsePatternObservation.validateNumericResponsePatternObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumericResponsePatternObservationLanguageCode constraint of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation_validateNumericResponsePatternObservationLanguageCode(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericResponsePatternObservation.validateNumericResponsePatternObservationLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumericResponsePatternObservationStatusCode constraint of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation_validateNumericResponsePatternObservationStatusCode(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericResponsePatternObservation.validateNumericResponsePatternObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumericResponsePatternObservationStatusCodeP constraint of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation_validateNumericResponsePatternObservationStatusCodeP(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericResponsePatternObservation.validateNumericResponsePatternObservationStatusCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateNumericResponsePatternObservationReferenceRange constraint of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation_validateNumericResponsePatternObservationReferenceRange(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericResponsePatternObservation.validateNumericResponsePatternObservationReferenceRange(diagnostics, context);
	}

	/**
	 * Validates the validateNumericResponsePatternObservationCDCode constraint of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation_validateNumericResponsePatternObservationCDCode(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericResponsePatternObservation.validateNumericResponsePatternObservationCDCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumericResponsePatternObservationCDCodeSystem constraint of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation_validateNumericResponsePatternObservationCDCodeSystem(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericResponsePatternObservation.validateNumericResponsePatternObservationCDCodeSystem(diagnostics, context);
	}

	/**
	 * Validates the validateNumericResponsePatternObservationCDOriginalText constraint of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservation_validateNumericResponsePatternObservationCDOriginalText(
			NumericResponsePatternObservation numericResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numericResponsePatternObservation.validateNumericResponsePatternObservationCDOriginalText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multipleChoiceResponsePatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationTemplateId(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationClassCode(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCode(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationId(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationLanguageCodeP(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationLanguageCode(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationMoodCode(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationStatusCode(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationStatusCodeP(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCDCode(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCDCodeSystem(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCDOriginalText(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCECode(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCECodeSystem(multipleChoiceResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCEDisplayName(multipleChoiceResponsePatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationTemplateId constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationTemplateId(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationClassCode constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationClassCode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationCode constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationId constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationId(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationLanguageCodeP constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationLanguageCodeP(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationLanguageCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationLanguageCode constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationLanguageCode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationMoodCode constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationMoodCode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationStatusCode constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationStatusCode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationStatusCodeP constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationStatusCodeP(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationStatusCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationCDCode constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCDCode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationCDCode(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationCDCodeSystem constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCDCodeSystem(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationCDCodeSystem(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationCDOriginalText constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCDOriginalText(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationCDOriginalText(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationCECode constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCECode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationCECode(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationCECodeSystem constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCECodeSystem(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationCECodeSystem(diagnostics, context);
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationCEDisplayName constraint of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCEDisplayName(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceResponsePatternObservation.validateMultipleChoiceResponsePatternObservationCEDisplayName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservation(
			TextResponsePatternObservation textResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textResponsePatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextResponsePatternObservation_validateTextResponsePatternObservationTemplateId(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextResponsePatternObservation_validateTextResponsePatternObservationClassCode(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextResponsePatternObservation_validateTextResponsePatternObservationCode(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextResponsePatternObservation_validateTextResponsePatternObservationId(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextResponsePatternObservation_validateTextResponsePatternObservationLanguageCodeP(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextResponsePatternObservation_validateTextResponsePatternObservationLanguageCode(textResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextResponsePatternObservation_validateTextResponsePatternObservationMoodCode(textResponsePatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTextResponsePatternObservationTemplateId constraint of '<em>Text Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservation_validateTextResponsePatternObservationTemplateId(
			TextResponsePatternObservation textResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textResponsePatternObservation.validateTextResponsePatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateTextResponsePatternObservationClassCode constraint of '<em>Text Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservation_validateTextResponsePatternObservationClassCode(
			TextResponsePatternObservation textResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textResponsePatternObservation.validateTextResponsePatternObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateTextResponsePatternObservationCode constraint of '<em>Text Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservation_validateTextResponsePatternObservationCode(
			TextResponsePatternObservation textResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textResponsePatternObservation.validateTextResponsePatternObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateTextResponsePatternObservationId constraint of '<em>Text Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservation_validateTextResponsePatternObservationId(
			TextResponsePatternObservation textResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textResponsePatternObservation.validateTextResponsePatternObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateTextResponsePatternObservationLanguageCodeP constraint of '<em>Text Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservation_validateTextResponsePatternObservationLanguageCodeP(
			TextResponsePatternObservation textResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textResponsePatternObservation.validateTextResponsePatternObservationLanguageCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateTextResponsePatternObservationLanguageCode constraint of '<em>Text Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservation_validateTextResponsePatternObservationLanguageCode(
			TextResponsePatternObservation textResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textResponsePatternObservation.validateTextResponsePatternObservationLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateTextResponsePatternObservationMoodCode constraint of '<em>Text Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservation_validateTextResponsePatternObservationMoodCode(
			TextResponsePatternObservation textResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return textResponsePatternObservation.validateTextResponsePatternObservationMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogSliderResponsePatternObservation(
			AnalogSliderResponsePatternObservation analogSliderResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(analogSliderResponsePatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalogSliderResponsePatternObservation_validateNumericResponsePatternObservationTemplateId(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationClassCode(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationCode(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationId(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationMoodCode(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationLanguageCode(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationStatusCode(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationStatusCodeP(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationReferenceRange(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationCDCode(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationCDCodeSystem(analogSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumericResponsePatternObservation_validateNumericResponsePatternObservationCDOriginalText(analogSliderResponsePatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNumericResponsePatternObservationTemplateId constraint of '<em>Analog Slider Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogSliderResponsePatternObservation_validateNumericResponsePatternObservationTemplateId(
			AnalogSliderResponsePatternObservation analogSliderResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return analogSliderResponsePatternObservation.validateNumericResponsePatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteSliderResponsePatternObservation(
			DiscreteSliderResponsePatternObservation discreteSliderResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteSliderResponsePatternObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteSliderResponsePatternObservation_validateMultipleChoiceResponsePatternObservationTemplateId(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationClassCode(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCode(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationId(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationLanguageCodeP(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationLanguageCode(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationMoodCode(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationStatusCode(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationStatusCodeP(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCDCode(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCDCodeSystem(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCDOriginalText(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCECode(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCECodeSystem(discreteSliderResponsePatternObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceResponsePatternObservation_validateMultipleChoiceResponsePatternObservationCEDisplayName(discreteSliderResponsePatternObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMultipleChoiceResponsePatternObservationTemplateId constraint of '<em>Discrete Slider Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteSliderResponsePatternObservation_validateMultipleChoiceResponsePatternObservationTemplateId(
			DiscreteSliderResponsePatternObservation discreteSliderResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return discreteSliderResponsePatternObservation.validateMultipleChoiceResponsePatternObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseMediaPattern(ResponseMediaPattern responseMediaPattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(responseMediaPattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(responseMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(responseMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(responseMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(responseMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(responseMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(responseMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(responseMediaPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponseMediaPattern_validateResponseMediaPatternTemplateId(responseMediaPattern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateResponseMediaPatternTemplateId constraint of '<em>Response Media Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseMediaPattern_validateResponseMediaPatternTemplateId(
			ResponseMediaPattern responseMediaPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responseMediaPattern.validateResponseMediaPatternTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePattern(ResponseReferenceRangePattern responseReferenceRangePattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(responseReferenceRangePattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateReferenceRange_validateTypeCode(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponseReferenceRangePattern_validateResponseReferenceRangePatternTemplateId(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponseReferenceRangePattern_validateResponseReferenceRangePatternTypeCode(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponseReferenceRangePattern_validateResponseReferenceRangePatternObservationRange(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponseReferenceRangePattern_validateResponseReferenceRangePatternObservationRangeIVLINTHigh(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponseReferenceRangePattern_validateResponseReferenceRangePatternObservationRangeIVLINTLow(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponseReferenceRangePattern_validateResponseReferenceRangePatternObservationRangeText(responseReferenceRangePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponseReferenceRangePattern_validateResponseReferenceRangePatternObservationRangeValue(responseReferenceRangePattern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateResponseReferenceRangePatternTemplateId constraint of '<em>Response Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePattern_validateResponseReferenceRangePatternTemplateId(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return responseReferenceRangePattern.validateResponseReferenceRangePatternTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResponseReferenceRangePatternTypeCode constraint of '<em>Response Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePattern_validateResponseReferenceRangePatternTypeCode(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return responseReferenceRangePattern.validateResponseReferenceRangePatternTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateResponseReferenceRangePatternObservationRange constraint of '<em>Response Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePattern_validateResponseReferenceRangePatternObservationRange(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return responseReferenceRangePattern.validateResponseReferenceRangePatternObservationRange(diagnostics, context);
	}

	/**
	 * Validates the validateResponseReferenceRangePatternObservationRangeIVLINTHigh constraint of '<em>Response Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePattern_validateResponseReferenceRangePatternObservationRangeIVLINTHigh(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return responseReferenceRangePattern.validateResponseReferenceRangePatternObservationRangeIVLINTHigh(diagnostics, context);
	}

	/**
	 * Validates the validateResponseReferenceRangePatternObservationRangeIVLINTLow constraint of '<em>Response Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePattern_validateResponseReferenceRangePatternObservationRangeIVLINTLow(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return responseReferenceRangePattern.validateResponseReferenceRangePatternObservationRangeIVLINTLow(diagnostics, context);
	}

	/**
	 * Validates the validateResponseReferenceRangePatternObservationRangeText constraint of '<em>Response Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePattern_validateResponseReferenceRangePatternObservationRangeText(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return responseReferenceRangePattern.validateResponseReferenceRangePatternObservationRangeText(diagnostics, context);
	}

	/**
	 * Validates the validateResponseReferenceRangePatternObservationRangeValue constraint of '<em>Response Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePattern_validateResponseReferenceRangePatternObservationRangeValue(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return responseReferenceRangePattern.validateResponseReferenceRangePatternObservationRangeValue(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QRDOCPlugin.INSTANCE;
	}

} // QRDOCValidator
