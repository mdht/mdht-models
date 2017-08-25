/**
 */
package org.hl7.cbcc.privacy.consentdirective.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.mdht.uml.cda.util.CDAValidator;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPlugin;
import org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsent;
import org.hl7.cbcc.privacy.consentdirective.ConfidentialitySecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.ConsentAction;
import org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry;
import org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition;
import org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition;
import org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem;
import org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProvider;
import org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer;
import org.hl7.cbcc.privacy.consentdirective.ObligationPolicySecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthor;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOf;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOfServiceEvent;
import org.hl7.cbcc.privacy.consentdirective.PurposeOfUseSecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.RefrainPolicySecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent;
import org.hl7.cbcc.privacy.consentdirective.SecurityLabel;
import org.hl7.cbcc.privacy.consentdirective.SecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.SignatureImageEntry;
import org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation;
import org.hl7.cbcc.privacy.consentdirective.SignaturesSection;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage
 * @generated
 */
public class CONSENTDIRECTIVEValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CONSENTDIRECTIVEValidator INSTANCE = new CONSENTDIRECTIVEValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.hl7.cbcc.privacy.consentdirective";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Header Author Template Id' of 'Privacy Consent Header Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_HEADER_AUTHOR__PRIVACY_CONSENT_HEADER_AUTHOR_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Header Author Function Code P' of 'Privacy Consent Header Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_HEADER_AUTHOR__PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE_P = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Header Author Function Code' of 'Privacy Consent Header Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_HEADER_AUTHOR__PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Header Author Time' of 'Privacy Consent Header Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_HEADER_AUTHOR__PRIVACY_CONSENT_HEADER_AUTHOR_TIME = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Header Author Assigned Author' of 'Privacy Consent Header Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_HEADER_AUTHOR__PRIVACY_CONSENT_HEADER_AUTHOR_ASSIGNED_AUTHOR = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Header Documentation Of Service Event Template Id' of 'Privacy Consent Header Documentation Of Service Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT__PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Header Documentation Of Service Event Code' of 'Privacy Consent Header Documentation Of Service Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT__PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_CODE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Header Documentation Of Service Event Effective Time' of 'Privacy Consent Header Documentation Of Service Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT__PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Template Id' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Code P' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE_P = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Code' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Title' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TITLE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Privacy Consent Details Section' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_PRIVACY_CONSENT_DETAILS_SECTION = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Signatures Section' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_SIGNATURES_SECTION = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Authenticator' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHENTICATOR = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Author' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHOR = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Documentation Of' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_DOCUMENTATION_OF = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Information Recipient' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_INFORMATION_RECIPIENT = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Legal Authenticator' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_LEGAL_AUTHENTICATOR = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Custodian' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CUSTODIAN = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Record Target' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RECORD_TARGET = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Directive Document Related Document' of 'Privacy Consent Directive Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RELATED_DOCUMENT = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Details Section Template Id' of 'Privacy Consent Details Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DETAILS_SECTION__PRIVACY_CONSENT_DETAILS_SECTION_TEMPLATE_ID = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Details Section Code P' of 'Privacy Consent Details Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DETAILS_SECTION__PRIVACY_CONSENT_DETAILS_SECTION_CODE_P = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Details Section Code' of 'Privacy Consent Details Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DETAILS_SECTION__PRIVACY_CONSENT_DETAILS_SECTION_CODE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Details Section Title' of 'Privacy Consent Details Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DETAILS_SECTION__PRIVACY_CONSENT_DETAILS_SECTION_TITLE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Details Section Entry' of 'Privacy Consent Details Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_DETAILS_SECTION__PRIVACY_CONSENT_DETAILS_SECTION_ENTRY = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Entry Template Id' of 'Consent Directive Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_ENTRY__CONSENT_DIRECTIVE_ENTRY_TEMPLATE_ID = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Entry Act' of 'Consent Directive Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_ENTRY__CONSENT_DIRECTIVE_ENTRY_ACT = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Entry Observation' of 'Consent Directive Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_ENTRY__CONSENT_DIRECTIVE_ENTRY_OBSERVATION = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Entry Observation Media' of 'Consent Directive Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_ENTRY__CONSENT_DIRECTIVE_ENTRY_OBSERVATION_MEDIA = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signatures Section Template Id' of 'Signatures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIGNATURES_SECTION__SIGNATURES_SECTION_TEMPLATE_ID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signatures Section Code P' of 'Signatures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIGNATURES_SECTION__SIGNATURES_SECTION_CODE_P = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signatures Section Code' of 'Signatures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIGNATURES_SECTION__SIGNATURES_SECTION_CODE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signatures Section Text' of 'Signatures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIGNATURES_SECTION__SIGNATURES_SECTION_TEXT = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signatures Section Title' of 'Signatures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIGNATURES_SECTION__SIGNATURES_SECTION_TITLE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signatures Section Entry' of 'Signatures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIGNATURES_SECTION__SIGNATURES_SECTION_ENTRY = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signature Image Entry Template Id' of 'Signature Image Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIGNATURE_IMAGE_ENTRY__SIGNATURE_IMAGE_ENTRY_TEMPLATE_ID = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signature Image Entry Observation Media' of 'Signature Image Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIGNATURE_IMAGE_ENTRY__SIGNATURE_IMAGE_ENTRY_OBSERVATION_MEDIA = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Structured Definition Template Id' of 'Consent Directive Structured Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_TEMPLATE_ID = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Structured Definition Code P' of 'Consent Directive Structured Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE_P = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Structured Definition Code' of 'Consent Directive Structured Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Structured Definition Mood Code' of 'Consent Directive Structured Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_MOOD_CODE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Structured Definition Informant' of 'Consent Directive Structured Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMANT = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Structured Definition Participant' of 'Consent Directive Structured Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_PARTICIPANT = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Structured Definition Consent Action' of 'Consent Directive Structured Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CONSENT_ACTION = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Structured Definition Information Criteria References Organizer' of 'Consent Directive Structured Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMATION_CRITERIA_REFERENCES_ORGANIZER = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Directive Structured Definition Security Label Criteria' of 'Consent Directive Structured Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_SECURITY_LABEL_CRITERIA = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Action Template Id' of 'Consent Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_ACTION__CONSENT_ACTION_TEMPLATE_ID = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Action Code P' of 'Consent Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_ACTION__CONSENT_ACTION_CODE_P = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Action Code' of 'Consent Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_ACTION__CONSENT_ACTION_CODE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Action Mood Code' of 'Consent Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_ACTION__CONSENT_ACTION_MOOD_CODE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consent Action Negation Ind' of 'Consent Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT_ACTION__CONSENT_ACTION_NEGATION_IND = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Information Criteria References Organizer Template Id' of 'Information Criteria References Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMATION_CRITERIA_REFERENCES_ORGANIZER__INFORMATION_CRITERIA_REFERENCES_ORGANIZER_TEMPLATE_ID = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Information Criteria References Organizer Mood Code' of 'Information Criteria References Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMATION_CRITERIA_REFERENCES_ORGANIZER__INFORMATION_CRITERIA_REFERENCES_ORGANIZER_MOOD_CODE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Information Criteria References Organizer Information Definition' of 'Information Criteria References Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMATION_CRITERIA_REFERENCES_ORGANIZER__INFORMATION_CRITERIA_REFERENCES_ORGANIZER_INFORMATION_DEFINITION = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Information Criteria References Organizer Related Protected Problem' of 'Information Criteria References Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMATION_CRITERIA_REFERENCES_ORGANIZER__INFORMATION_CRITERIA_REFERENCES_ORGANIZER_RELATED_PROTECTED_PROBLEM = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Information Criteria References Organizer Confidentiality Code Label' of 'Information Criteria References Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMATION_CRITERIA_REFERENCES_ORGANIZER__INFORMATION_CRITERIA_REFERENCES_ORGANIZER_CONFIDENTIALITY_CODE_LABEL = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterium Information Definition Template Id' of 'Criterium Information Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterium Information Definition Code P' of 'Criterium Information Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_CODE_P = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterium Information Definition Code' of 'Criterium Information Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_CODE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterium Information Definition Effective Time' of 'Criterium Information Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterium Information Definition Mood Code' of 'Criterium Information Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterium Information Definition Id' of 'Criterium Information Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_ID = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterium Related Protected Problem Template Id' of 'Criterium Related Protected Problem'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERIUM_RELATED_PROTECTED_PROBLEM__CRITERIUM_RELATED_PROTECTED_PROBLEM_TEMPLATE_ID = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterium Related Protected Problem Code P' of 'Criterium Related Protected Problem'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERIUM_RELATED_PROTECTED_PROBLEM__CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE_P = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterium Related Protected Problem Code' of 'Criterium Related Protected Problem'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERIUM_RELATED_PROTECTED_PROBLEM__CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterium Related Protected Problem Value' of 'Criterium Related Protected Problem'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERIUM_RELATED_PROTECTED_PROBLEM__CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Criterium Related Protected Problem Value P' of 'Criterium Related Protected Problem'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERIUM_RELATED_PROTECTED_PROBLEM__CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE_P = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Confidentiality Security Observation Value' of 'Confidentiality Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIDENTIALITY_SECURITY_OBSERVATION__CONFIDENTIALITY_SECURITY_OBSERVATION_VALUE = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Template Id' of 'Confidentiality Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIDENTIALITY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code P' of 'Confidentiality Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIDENTIALITY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE_P = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code' of 'Confidentiality Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIDENTIALITY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Template Id' of 'Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code P' of 'Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE_P = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code' of 'Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Mood Code' of 'Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_OBSERVATION__SECURITY_OBSERVATION_MOOD_CODE = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Value' of 'Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_OBSERVATION__SECURITY_OBSERVATION_VALUE = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Value P' of 'Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_OBSERVATION__SECURITY_OBSERVATION_VALUE_P = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Label Template Id' of 'Security Label'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_LABEL__SECURITY_LABEL_TEMPLATE_ID = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Label Component' of 'Security Label'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_LABEL__SECURITY_LABEL_COMPONENT = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IIHI Receiving Provider Template Id' of 'IIHI Receiving Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IIHI_RECEIVING_PROVIDER__IIHI_RECEIVING_PROVIDER_TEMPLATE_ID = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IIHI Receiving Provider Type Code P' of 'IIHI Receiving Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IIHI_RECEIVING_PROVIDER__IIHI_RECEIVING_PROVIDER_TYPE_CODE_P = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IIHI Receiving Provider Type Code' of 'IIHI Receiving Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IIHI_RECEIVING_PROVIDER__IIHI_RECEIVING_PROVIDER_TYPE_CODE = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IIHI Receiving Provider Participant Role' of 'IIHI Receiving Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IIHI_RECEIVING_PROVIDER__IIHI_RECEIVING_PROVIDER_PARTICIPANT_ROLE = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Template Id' of 'Obligation Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBLIGATION_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code P' of 'Obligation Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBLIGATION_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE_P = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code' of 'Obligation Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBLIGATION_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Value P' of 'Obligation Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBLIGATION_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_VALUE_P = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Value' of 'Obligation Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBLIGATION_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_VALUE = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Computable Policy Consent Template Id' of 'Computable Policy Consent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPUTABLE_POLICY_CONSENT__COMPUTABLE_POLICY_CONSENT_TEMPLATE_ID = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Computable Policy Consent Code P' of 'Computable Policy Consent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPUTABLE_POLICY_CONSENT__COMPUTABLE_POLICY_CONSENT_CODE_P = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Computable Policy Consent Code' of 'Computable Policy Consent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPUTABLE_POLICY_CONSENT__COMPUTABLE_POLICY_CONSENT_CODE = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Computable Policy Consent Mood Code' of 'Computable Policy Consent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPUTABLE_POLICY_CONSENT__COMPUTABLE_POLICY_CONSENT_MOOD_CODE = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Computable Policy Consent Value' of 'Computable Policy Consent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPUTABLE_POLICY_CONSENT__COMPUTABLE_POLICY_CONSENT_VALUE = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Privacy Consent Template Id' of 'Scanned Privacy Consent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_PRIVACY_CONSENT__SCANNED_PRIVACY_CONSENT_TEMPLATE_ID = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Privacy Consent Mood Code P' of 'Scanned Privacy Consent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_PRIVACY_CONSENT__SCANNED_PRIVACY_CONSENT_MOOD_CODE_P = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Privacy Consent Mood Code' of 'Scanned Privacy Consent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_PRIVACY_CONSENT__SCANNED_PRIVACY_CONSENT_MOOD_CODE = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Privacy Consent Value' of 'Scanned Privacy Consent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_PRIVACY_CONSENT__SCANNED_PRIVACY_CONSENT_VALUE = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signature Image Observation Template Id' of 'Signature Image Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIGNATURE_IMAGE_OBSERVATION__SIGNATURE_IMAGE_OBSERVATION_TEMPLATE_ID = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signature Image Observation Mood Code' of 'Signature Image Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIGNATURE_IMAGE_OBSERVATION__SIGNATURE_IMAGE_OBSERVATION_MOOD_CODE = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signature Image Observation Value' of 'Signature Image Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIGNATURE_IMAGE_OBSERVATION__SIGNATURE_IMAGE_OBSERVATION_VALUE = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Header Documentation Of Template Id' of 'Privacy Consent Header Documentation Of'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF__PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_TEMPLATE_ID = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Consent Header Documentation Of Service Event' of 'Privacy Consent Header Documentation Of'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF__PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Of Use Security Observation Value P' of 'Purpose Of Use Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_OF_USE_SECURITY_OBSERVATION__PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE_P = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Of Use Security Observation Value' of 'Purpose Of Use Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_OF_USE_SECURITY_OBSERVATION__PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Template Id' of 'Purpose Of Use Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_OF_USE_SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code P' of 'Purpose Of Use Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_OF_USE_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE_P = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code' of 'Purpose Of Use Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_OF_USE_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Template Id' of 'Refrain Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFRAIN_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code P' of 'Refrain Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFRAIN_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE_P = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code' of 'Refrain Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFRAIN_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Value P' of 'Refrain Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFRAIN_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_VALUE_P = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Value' of 'Refrain Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFRAIN_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_VALUE = 114;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 114;

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
	public CONSENTDIRECTIVEValidator() {
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
		return CONSENTDIRECTIVEPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_HEADER_AUTHOR:
				return validatePrivacyConsentHeaderAuthor((PrivacyConsentHeaderAuthor) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT:
				return validatePrivacyConsentHeaderDocumentationOfServiceEvent(
					(PrivacyConsentHeaderDocumentationOfServiceEvent) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT:
				return validatePrivacyConsentDirectiveDocument(
					(PrivacyConsentDirectiveDocument) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_DETAILS_SECTION:
				return validatePrivacyConsentDetailsSection((PrivacyConsentDetailsSection) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.SIGNATURES_SECTION:
				return validateSignaturesSection((SignaturesSection) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.CONSENT_DIRECTIVE_ENTRY:
				return validateConsentDirectiveEntry((ConsentDirectiveEntry) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION:
				return validateConsentDirectiveStructuredDefinition(
					(ConsentDirectiveStructuredDefinition) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.CONSENT_ACTION:
				return validateConsentAction((ConsentAction) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.INFORMATION_CRITERIA_REFERENCES_ORGANIZER:
				return validateInformationCriteriaReferencesOrganizer(
					(InformationCriteriaReferencesOrganizer) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.CRITERIUM_INFORMATION_DEFINITION:
				return validateCriteriumInformationDefinition(
					(CriteriumInformationDefinition) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.CRITERIUM_RELATED_PROTECTED_PROBLEM:
				return validateCriteriumRelatedProtectedProblem(
					(CriteriumRelatedProtectedProblem) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.CONFIDENTIALITY_SECURITY_OBSERVATION:
				return validateConfidentialitySecurityObservation(
					(ConfidentialitySecurityObservation) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.SECURITY_OBSERVATION:
				return validateSecurityObservation((SecurityObservation) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.SECURITY_LABEL:
				return validateSecurityLabel((SecurityLabel) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.IIHI_RECEIVING_PROVIDER:
				return validateIIHIReceivingProvider((IIHIReceivingProvider) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.OBLIGATION_POLICY_SECURITY_OBSERVATION:
				return validateObligationPolicySecurityObservation(
					(ObligationPolicySecurityObservation) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.COMPUTABLE_POLICY_CONSENT:
				return validateComputablePolicyConsent((ComputablePolicyConsent) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.SCANNED_PRIVACY_CONSENT:
				return validateScannedPrivacyConsent((ScannedPrivacyConsent) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.SIGNATURE_IMAGE_OBSERVATION:
				return validateSignatureImageObservation((SignatureImageObservation) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.SIGNATURE_IMAGE_ENTRY:
				return validateSignatureImageEntry((SignatureImageEntry) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF:
				return validatePrivacyConsentHeaderDocumentationOf(
					(PrivacyConsentHeaderDocumentationOf) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.PURPOSE_OF_USE_SECURITY_OBSERVATION:
				return validatePurposeOfUseSecurityObservation(
					(PurposeOfUseSecurityObservation) value, diagnostics, context);
			case CONSENTDIRECTIVEPackage.REFRAIN_POLICY_SECURITY_OBSERVATION:
				return validateRefrainPolicySecurityObservation(
					(RefrainPolicySecurityObservation) value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderAuthor(PrivacyConsentHeaderAuthor privacyConsentHeaderAuthor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privacyConsentHeaderAuthor, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(privacyConsentHeaderAuthor, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateAuthor_validateTypeCode(privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateAuthor_validateContextControlCode(
				privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentHeaderAuthor_validatePrivacyConsentHeaderAuthorTemplateId(
				privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentHeaderAuthor_validatePrivacyConsentHeaderAuthorFunctionCodeP(
				privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentHeaderAuthor_validatePrivacyConsentHeaderAuthorFunctionCode(
				privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentHeaderAuthor_validatePrivacyConsentHeaderAuthorTime(
				privacyConsentHeaderAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentHeaderAuthor_validatePrivacyConsentHeaderAuthorAssignedAuthor(
				privacyConsentHeaderAuthor, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePrivacyConsentHeaderAuthorTemplateId constraint of '<em>Privacy Consent Header Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderAuthor_validatePrivacyConsentHeaderAuthorTemplateId(
			PrivacyConsentHeaderAuthor privacyConsentHeaderAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentHeaderAuthor.validatePrivacyConsentHeaderAuthorTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentHeaderAuthorFunctionCodeP constraint of '<em>Privacy Consent Header Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderAuthor_validatePrivacyConsentHeaderAuthorFunctionCodeP(
			PrivacyConsentHeaderAuthor privacyConsentHeaderAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentHeaderAuthor.validatePrivacyConsentHeaderAuthorFunctionCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentHeaderAuthorFunctionCode constraint of '<em>Privacy Consent Header Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderAuthor_validatePrivacyConsentHeaderAuthorFunctionCode(
			PrivacyConsentHeaderAuthor privacyConsentHeaderAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentHeaderAuthor.validatePrivacyConsentHeaderAuthorFunctionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentHeaderAuthorTime constraint of '<em>Privacy Consent Header Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderAuthor_validatePrivacyConsentHeaderAuthorTime(
			PrivacyConsentHeaderAuthor privacyConsentHeaderAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentHeaderAuthor.validatePrivacyConsentHeaderAuthorTime(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentHeaderAuthorAssignedAuthor constraint of '<em>Privacy Consent Header Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderAuthor_validatePrivacyConsentHeaderAuthorAssignedAuthor(
			PrivacyConsentHeaderAuthor privacyConsentHeaderAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentHeaderAuthor.validatePrivacyConsentHeaderAuthorAssignedAuthor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderDocumentationOfServiceEvent(
			PrivacyConsentHeaderDocumentationOfServiceEvent privacyConsentHeaderDocumentationOfServiceEvent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(
			privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(
				privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(
				privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(
				privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(
				privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateServiceEvent_validateMoodCode(
				privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentHeaderDocumentationOfServiceEvent_validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId(
				privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentHeaderDocumentationOfServiceEvent_validatePrivacyConsentHeaderDocumentationOfServiceEventCode(
				privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentHeaderDocumentationOfServiceEvent_validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime(
				privacyConsentHeaderDocumentationOfServiceEvent, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId constraint of '<em>Privacy Consent Header Documentation Of Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderDocumentationOfServiceEvent_validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId(
			PrivacyConsentHeaderDocumentationOfServiceEvent privacyConsentHeaderDocumentationOfServiceEvent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyConsentHeaderDocumentationOfServiceEvent.validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentHeaderDocumentationOfServiceEventCode constraint of '<em>Privacy Consent Header Documentation Of Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderDocumentationOfServiceEvent_validatePrivacyConsentHeaderDocumentationOfServiceEventCode(
			PrivacyConsentHeaderDocumentationOfServiceEvent privacyConsentHeaderDocumentationOfServiceEvent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyConsentHeaderDocumentationOfServiceEvent.validatePrivacyConsentHeaderDocumentationOfServiceEventCode(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime constraint of '<em>Privacy Consent Header Documentation Of Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderDocumentationOfServiceEvent_validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime(
			PrivacyConsentHeaderDocumentationOfServiceEvent privacyConsentHeaderDocumentationOfServiceEvent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyConsentHeaderDocumentationOfServiceEvent.validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privacyConsentDirectiveDocument, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(privacyConsentDirectiveDocument, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentTemplateId(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentCodeP(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentCode(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentTitle(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentSignaturesSection(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentAuthenticator(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentAuthor(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentDocumentationOf(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentInformationRecipient(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentLegalAuthenticator(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentCustodian(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentRecordTarget(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentRelatedDocument(
				privacyConsentDirectiveDocument, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentTemplateId constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentTemplateId(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentCodeP constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentCodeP(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentCode constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentCode(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentCode(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentTitle constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentTitle(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentTitle(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentSignaturesSection constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentSignaturesSection(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentSignaturesSection(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentAuthenticator constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentAuthenticator(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentAuthenticator(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentAuthor constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentAuthor(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentAuthor(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentDocumentationOf constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentDocumentationOf(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentDocumentationOf(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentInformationRecipient constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentInformationRecipient(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentInformationRecipient(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentLegalAuthenticator constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentLegalAuthenticator(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentLegalAuthenticator(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentCustodian constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentCustodian(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentCustodian(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentRecordTarget constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentRecordTarget(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentRecordTarget(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDirectiveDocumentRelatedDocument constraint of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDirectiveDocument_validatePrivacyConsentDirectiveDocumentRelatedDocument(
			PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDirectiveDocument.validatePrivacyConsentDirectiveDocumentRelatedDocument(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDetailsSection(PrivacyConsentDetailsSection privacyConsentDetailsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privacyConsentDetailsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(privacyConsentDetailsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(
				privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDetailsSection_validatePrivacyConsentDetailsSectionTemplateId(
				privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDetailsSection_validatePrivacyConsentDetailsSectionCode(
				privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDetailsSection_validatePrivacyConsentDetailsSectionCodeP(
				privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDetailsSection_validatePrivacyConsentDetailsSectionTitle(
				privacyConsentDetailsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentDetailsSection_validatePrivacyConsentDetailsSectionEntry(
				privacyConsentDetailsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePrivacyConsentDetailsSectionTemplateId constraint of '<em>Privacy Consent Details Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDetailsSection_validatePrivacyConsentDetailsSectionTemplateId(
			PrivacyConsentDetailsSection privacyConsentDetailsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDetailsSection.validatePrivacyConsentDetailsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDetailsSectionCodeP constraint of '<em>Privacy Consent Details Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDetailsSection_validatePrivacyConsentDetailsSectionCodeP(
			PrivacyConsentDetailsSection privacyConsentDetailsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDetailsSection.validatePrivacyConsentDetailsSectionCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDetailsSectionCode constraint of '<em>Privacy Consent Details Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDetailsSection_validatePrivacyConsentDetailsSectionCode(
			PrivacyConsentDetailsSection privacyConsentDetailsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDetailsSection.validatePrivacyConsentDetailsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDetailsSectionTitle constraint of '<em>Privacy Consent Details Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDetailsSection_validatePrivacyConsentDetailsSectionTitle(
			PrivacyConsentDetailsSection privacyConsentDetailsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDetailsSection.validatePrivacyConsentDetailsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentDetailsSectionEntry constraint of '<em>Privacy Consent Details Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentDetailsSection_validatePrivacyConsentDetailsSectionEntry(
			PrivacyConsentDetailsSection privacyConsentDetailsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentDetailsSection.validatePrivacyConsentDetailsSectionEntry(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveEntry(ConsentDirectiveEntry consentDirectiveEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(consentDirectiveEntry, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(consentDirectiveEntry, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(consentDirectiveEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(consentDirectiveEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(consentDirectiveEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(consentDirectiveEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(consentDirectiveEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(consentDirectiveEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(consentDirectiveEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateEntry_validateClinicalStatement(consentDirectiveEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateEntry_validateContextConductionInd(
				consentDirectiveEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveEntry_validateConsentDirectiveEntryTemplateId(
				consentDirectiveEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveEntry_validateConsentDirectiveEntryAct(
				consentDirectiveEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveEntry_validateConsentDirectiveEntryObservation(
				consentDirectiveEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveEntry_validateConsentDirectiveEntryObservationMedia(
				consentDirectiveEntry, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateConsentDirectiveEntryTemplateId constraint of '<em>Consent Directive Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveEntry_validateConsentDirectiveEntryTemplateId(
			ConsentDirectiveEntry consentDirectiveEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consentDirectiveEntry.validateConsentDirectiveEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateConsentDirectiveEntryAct constraint of '<em>Consent Directive Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveEntry_validateConsentDirectiveEntryAct(
			ConsentDirectiveEntry consentDirectiveEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consentDirectiveEntry.validateConsentDirectiveEntryAct(diagnostics, context);
	}

	/**
	 * Validates the validateConsentDirectiveEntryObservation constraint of '<em>Consent Directive Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveEntry_validateConsentDirectiveEntryObservation(
			ConsentDirectiveEntry consentDirectiveEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consentDirectiveEntry.validateConsentDirectiveEntryObservation(diagnostics, context);
	}

	/**
	 * Validates the validateConsentDirectiveEntryObservationMedia constraint of '<em>Consent Directive Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveEntry_validateConsentDirectiveEntryObservationMedia(
			ConsentDirectiveEntry consentDirectiveEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consentDirectiveEntry.validateConsentDirectiveEntryObservationMedia(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignaturesSection(SignaturesSection signaturesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signaturesSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(signaturesSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSignaturesSection_validateSignaturesSectionTemplateId(
				signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSignaturesSection_validateSignaturesSectionCode(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSignaturesSection_validateSignaturesSectionCodeP(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSignaturesSection_validateSignaturesSectionText(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSignaturesSection_validateSignaturesSectionTitle(signaturesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSignaturesSection_validateSignaturesSectionEntry(signaturesSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSignaturesSectionTemplateId constraint of '<em>Signatures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignaturesSection_validateSignaturesSectionTemplateId(SignaturesSection signaturesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return signaturesSection.validateSignaturesSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSignaturesSectionCodeP constraint of '<em>Signatures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignaturesSection_validateSignaturesSectionCodeP(SignaturesSection signaturesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return signaturesSection.validateSignaturesSectionCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateSignaturesSectionCode constraint of '<em>Signatures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignaturesSection_validateSignaturesSectionCode(SignaturesSection signaturesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return signaturesSection.validateSignaturesSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateSignaturesSectionText constraint of '<em>Signatures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignaturesSection_validateSignaturesSectionText(SignaturesSection signaturesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return signaturesSection.validateSignaturesSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateSignaturesSectionTitle constraint of '<em>Signatures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignaturesSection_validateSignaturesSectionTitle(SignaturesSection signaturesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return signaturesSection.validateSignaturesSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateSignaturesSectionEntry constraint of '<em>Signatures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignaturesSection_validateSignaturesSectionEntry(SignaturesSection signaturesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return signaturesSection.validateSignaturesSectionEntry(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignatureImageEntry(SignatureImageEntry signatureImageEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signatureImageEntry, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(signatureImageEntry, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(signatureImageEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(signatureImageEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(signatureImageEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(signatureImageEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(signatureImageEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(signatureImageEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(signatureImageEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateEntry_validateClinicalStatement(signatureImageEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateEntry_validateContextConductionInd(
				signatureImageEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSignatureImageEntry_validateSignatureImageEntryTemplateId(
				signatureImageEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSignatureImageEntry_validateSignatureImageEntryObservationMedia(
				signatureImageEntry, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSignatureImageEntryTemplateId constraint of '<em>Signature Image Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignatureImageEntry_validateSignatureImageEntryTemplateId(
			SignatureImageEntry signatureImageEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return signatureImageEntry.validateSignatureImageEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSignatureImageEntryObservationMedia constraint of '<em>Signature Image Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignatureImageEntry_validateSignatureImageEntryObservationMedia(
			SignatureImageEntry signatureImageEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return signatureImageEntry.validateSignatureImageEntryObservationMedia(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveStructuredDefinition(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(consentDirectiveStructuredDefinition, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(consentDirectiveStructuredDefinition, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionTemplateId(
				consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionCodeP(
				consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionCode(
				consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionMoodCode(
				consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionInformant(
				consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionParticipant(
				consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionConsentAction(
				consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(
				consentDirectiveStructuredDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(
				consentDirectiveStructuredDefinition, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateConsentDirectiveStructuredDefinitionTemplateId constraint of '<em>Consent Directive Structured Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionTemplateId(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return consentDirectiveStructuredDefinition.validateConsentDirectiveStructuredDefinitionTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateConsentDirectiveStructuredDefinitionCodeP constraint of '<em>Consent Directive Structured Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionCodeP(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return consentDirectiveStructuredDefinition.validateConsentDirectiveStructuredDefinitionCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateConsentDirectiveStructuredDefinitionCode constraint of '<em>Consent Directive Structured Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionCode(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return consentDirectiveStructuredDefinition.validateConsentDirectiveStructuredDefinitionCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateConsentDirectiveStructuredDefinitionMoodCode constraint of '<em>Consent Directive Structured Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionMoodCode(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return consentDirectiveStructuredDefinition.validateConsentDirectiveStructuredDefinitionMoodCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateConsentDirectiveStructuredDefinitionInformant constraint of '<em>Consent Directive Structured Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionInformant(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return consentDirectiveStructuredDefinition.validateConsentDirectiveStructuredDefinitionInformant(
			diagnostics, context);
	}

	/**
	 * Validates the validateConsentDirectiveStructuredDefinitionParticipant constraint of '<em>Consent Directive Structured Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionParticipant(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return consentDirectiveStructuredDefinition.validateConsentDirectiveStructuredDefinitionParticipant(
			diagnostics, context);
	}

	/**
	 * Validates the validateConsentDirectiveStructuredDefinitionConsentAction constraint of '<em>Consent Directive Structured Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionConsentAction(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return consentDirectiveStructuredDefinition.validateConsentDirectiveStructuredDefinitionConsentAction(
			diagnostics, context);
	}

	/**
	 * Validates the validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer constraint of '<em>Consent Directive Structured Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return consentDirectiveStructuredDefinition.validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(
			diagnostics, context);
	}

	/**
	 * Validates the validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria constraint of '<em>Consent Directive Structured Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDirectiveStructuredDefinition_validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return consentDirectiveStructuredDefinition.validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentAction(ConsentAction consentAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(consentAction, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(consentAction, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(consentAction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(consentAction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(consentAction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(consentAction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(consentAction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(consentAction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(consentAction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentAction_validateConsentActionTemplateId(consentAction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentAction_validateConsentActionCodeP(consentAction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentAction_validateConsentActionCode(consentAction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentAction_validateConsentActionMoodCode(consentAction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsentAction_validateConsentActionNegationInd(consentAction, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateConsentActionTemplateId constraint of '<em>Consent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentAction_validateConsentActionTemplateId(ConsentAction consentAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consentAction.validateConsentActionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateConsentActionCodeP constraint of '<em>Consent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentAction_validateConsentActionCodeP(ConsentAction consentAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consentAction.validateConsentActionCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateConsentActionCode constraint of '<em>Consent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentAction_validateConsentActionCode(ConsentAction consentAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consentAction.validateConsentActionCode(diagnostics, context);
	}

	/**
	 * Validates the validateConsentActionMoodCode constraint of '<em>Consent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentAction_validateConsentActionMoodCode(ConsentAction consentAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consentAction.validateConsentActionMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateConsentActionNegationInd constraint of '<em>Consent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentAction_validateConsentActionNegationInd(ConsentAction consentAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consentAction.validateConsentActionNegationInd(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationCriteriaReferencesOrganizer(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(informationCriteriaReferencesOrganizer, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(
			informationCriteriaReferencesOrganizer, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(informationCriteriaReferencesOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(informationCriteriaReferencesOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				informationCriteriaReferencesOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(informationCriteriaReferencesOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(informationCriteriaReferencesOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(informationCriteriaReferencesOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(informationCriteriaReferencesOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInformationCriteriaReferencesOrganizer_validateInformationCriteriaReferencesOrganizerTemplateId(
				informationCriteriaReferencesOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInformationCriteriaReferencesOrganizer_validateInformationCriteriaReferencesOrganizerMoodCode(
				informationCriteriaReferencesOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInformationCriteriaReferencesOrganizer_validateInformationCriteriaReferencesOrganizerInformationDefinition(
				informationCriteriaReferencesOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInformationCriteriaReferencesOrganizer_validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(
				informationCriteriaReferencesOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInformationCriteriaReferencesOrganizer_validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(
				informationCriteriaReferencesOrganizer, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateInformationCriteriaReferencesOrganizerTemplateId constraint of '<em>Information Criteria References Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationCriteriaReferencesOrganizer_validateInformationCriteriaReferencesOrganizerTemplateId(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return informationCriteriaReferencesOrganizer.validateInformationCriteriaReferencesOrganizerTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateInformationCriteriaReferencesOrganizerMoodCode constraint of '<em>Information Criteria References Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationCriteriaReferencesOrganizer_validateInformationCriteriaReferencesOrganizerMoodCode(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return informationCriteriaReferencesOrganizer.validateInformationCriteriaReferencesOrganizerMoodCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateInformationCriteriaReferencesOrganizerInformationDefinition constraint of '<em>Information Criteria References Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationCriteriaReferencesOrganizer_validateInformationCriteriaReferencesOrganizerInformationDefinition(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return informationCriteriaReferencesOrganizer.validateInformationCriteriaReferencesOrganizerInformationDefinition(
			diagnostics, context);
	}

	/**
	 * Validates the validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem constraint of '<em>Information Criteria References Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationCriteriaReferencesOrganizer_validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return informationCriteriaReferencesOrganizer.validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(
			diagnostics, context);
	}

	/**
	 * Validates the validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel constraint of '<em>Information Criteria References Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationCriteriaReferencesOrganizer_validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(
			InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return informationCriteriaReferencesOrganizer.validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumInformationDefinition(CriteriumInformationDefinition criteriumInformationDefinition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(criteriumInformationDefinition, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(criteriumInformationDefinition, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(criteriumInformationDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(criteriumInformationDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				criteriumInformationDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(criteriumInformationDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(criteriumInformationDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(criteriumInformationDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(criteriumInformationDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCriteriumInformationDefinition_validateCriteriumInformationDefinitionTemplateId(
				criteriumInformationDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCriteriumInformationDefinition_validateCriteriumInformationDefinitionCodeP(
				criteriumInformationDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCriteriumInformationDefinition_validateCriteriumInformationDefinitionCode(
				criteriumInformationDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCriteriumInformationDefinition_validateCriteriumInformationDefinitionEffectiveTime(
				criteriumInformationDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCriteriumInformationDefinition_validateCriteriumInformationDefinitionMoodCode(
				criteriumInformationDefinition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCriteriumInformationDefinition_validateCriteriumInformationDefinitionId(
				criteriumInformationDefinition, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateCriteriumInformationDefinitionTemplateId constraint of '<em>Criterium Information Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumInformationDefinition_validateCriteriumInformationDefinitionTemplateId(
			CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return criteriumInformationDefinition.validateCriteriumInformationDefinitionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCriteriumInformationDefinitionCodeP constraint of '<em>Criterium Information Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumInformationDefinition_validateCriteriumInformationDefinitionCodeP(
			CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return criteriumInformationDefinition.validateCriteriumInformationDefinitionCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateCriteriumInformationDefinitionCode constraint of '<em>Criterium Information Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumInformationDefinition_validateCriteriumInformationDefinitionCode(
			CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return criteriumInformationDefinition.validateCriteriumInformationDefinitionCode(diagnostics, context);
	}

	/**
	 * Validates the validateCriteriumInformationDefinitionEffectiveTime constraint of '<em>Criterium Information Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumInformationDefinition_validateCriteriumInformationDefinitionEffectiveTime(
			CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return criteriumInformationDefinition.validateCriteriumInformationDefinitionEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateCriteriumInformationDefinitionMoodCode constraint of '<em>Criterium Information Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumInformationDefinition_validateCriteriumInformationDefinitionMoodCode(
			CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return criteriumInformationDefinition.validateCriteriumInformationDefinitionMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateCriteriumInformationDefinitionId constraint of '<em>Criterium Information Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumInformationDefinition_validateCriteriumInformationDefinitionId(
			CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return criteriumInformationDefinition.validateCriteriumInformationDefinitionId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumRelatedProtectedProblem(
			CriteriumRelatedProtectedProblem criteriumRelatedProtectedProblem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(criteriumRelatedProtectedProblem, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(criteriumRelatedProtectedProblem, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(criteriumRelatedProtectedProblem, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(criteriumRelatedProtectedProblem, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				criteriumRelatedProtectedProblem, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(criteriumRelatedProtectedProblem, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(criteriumRelatedProtectedProblem, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(criteriumRelatedProtectedProblem, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(criteriumRelatedProtectedProblem, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCriteriumRelatedProtectedProblem_validateCriteriumRelatedProtectedProblemTemplateId(
				criteriumRelatedProtectedProblem, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCriteriumRelatedProtectedProblem_validateCriteriumRelatedProtectedProblemCodeP(
				criteriumRelatedProtectedProblem, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCriteriumRelatedProtectedProblem_validateCriteriumRelatedProtectedProblemCode(
				criteriumRelatedProtectedProblem, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCriteriumRelatedProtectedProblem_validateCriteriumRelatedProtectedProblemValue(
				criteriumRelatedProtectedProblem, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCriteriumRelatedProtectedProblem_validateCriteriumRelatedProtectedProblemValueP(
				criteriumRelatedProtectedProblem, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateCriteriumRelatedProtectedProblemTemplateId constraint of '<em>Criterium Related Protected Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumRelatedProtectedProblem_validateCriteriumRelatedProtectedProblemTemplateId(
			CriteriumRelatedProtectedProblem criteriumRelatedProtectedProblem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return criteriumRelatedProtectedProblem.validateCriteriumRelatedProtectedProblemTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateCriteriumRelatedProtectedProblemCodeP constraint of '<em>Criterium Related Protected Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumRelatedProtectedProblem_validateCriteriumRelatedProtectedProblemCodeP(
			CriteriumRelatedProtectedProblem criteriumRelatedProtectedProblem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return criteriumRelatedProtectedProblem.validateCriteriumRelatedProtectedProblemCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateCriteriumRelatedProtectedProblemCode constraint of '<em>Criterium Related Protected Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumRelatedProtectedProblem_validateCriteriumRelatedProtectedProblemCode(
			CriteriumRelatedProtectedProblem criteriumRelatedProtectedProblem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return criteriumRelatedProtectedProblem.validateCriteriumRelatedProtectedProblemCode(diagnostics, context);
	}

	/**
	 * Validates the validateCriteriumRelatedProtectedProblemValue constraint of '<em>Criterium Related Protected Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumRelatedProtectedProblem_validateCriteriumRelatedProtectedProblemValue(
			CriteriumRelatedProtectedProblem criteriumRelatedProtectedProblem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return criteriumRelatedProtectedProblem.validateCriteriumRelatedProtectedProblemValue(diagnostics, context);
	}

	/**
	 * Validates the validateCriteriumRelatedProtectedProblemValueP constraint of '<em>Criterium Related Protected Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriumRelatedProtectedProblem_validateCriteriumRelatedProtectedProblemValueP(
			CriteriumRelatedProtectedProblem criteriumRelatedProtectedProblem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return criteriumRelatedProtectedProblem.validateCriteriumRelatedProtectedProblemValueP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialitySecurityObservation(
			ConfidentialitySecurityObservation confidentialitySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(confidentialitySecurityObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConfidentialitySecurityObservation_validateSecurityObservationTemplateId(
				confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConfidentialitySecurityObservation_validateSecurityObservationCodeP(
				confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConfidentialitySecurityObservation_validateSecurityObservationCode(
				confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationMoodCode(
				confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationValue(
				confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationValueP(
				confidentialitySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConfidentialitySecurityObservation_validateConfidentialitySecurityObservationValue(
				confidentialitySecurityObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateConfidentialitySecurityObservationValue constraint of '<em>Confidentiality Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialitySecurityObservation_validateConfidentialitySecurityObservationValue(
			ConfidentialitySecurityObservation confidentialitySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return confidentialitySecurityObservation.validateConfidentialitySecurityObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationTemplateId constraint of '<em>Confidentiality Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialitySecurityObservation_validateSecurityObservationTemplateId(
			ConfidentialitySecurityObservation confidentialitySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return confidentialitySecurityObservation.validateSecurityObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCodeP constraint of '<em>Confidentiality Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialitySecurityObservation_validateSecurityObservationCodeP(
			ConfidentialitySecurityObservation confidentialitySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return confidentialitySecurityObservation.validateSecurityObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCode constraint of '<em>Confidentiality Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialitySecurityObservation_validateSecurityObservationCode(
			ConfidentialitySecurityObservation confidentialitySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return confidentialitySecurityObservation.validateSecurityObservationCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation(SecurityObservation securityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(securityObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(securityObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(securityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(securityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(securityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(securityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(securityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(securityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(securityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationTemplateId(
				securityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationCodeP(
				securityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationCode(
				securityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationMoodCode(
				securityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationValue(
				securityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationValueP(
				securityObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSecurityObservationTemplateId constraint of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation_validateSecurityObservationTemplateId(
			SecurityObservation securityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityObservation.validateSecurityObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCodeP constraint of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation_validateSecurityObservationCodeP(SecurityObservation securityObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityObservation.validateSecurityObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCode constraint of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation_validateSecurityObservationCode(SecurityObservation securityObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityObservation.validateSecurityObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationMoodCode constraint of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation_validateSecurityObservationMoodCode(
			SecurityObservation securityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityObservation.validateSecurityObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationValue constraint of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation_validateSecurityObservationValue(SecurityObservation securityObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityObservation.validateSecurityObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationValueP constraint of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation_validateSecurityObservationValueP(
			SecurityObservation securityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityObservation.validateSecurityObservationValueP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityLabel(SecurityLabel securityLabel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(securityLabel, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(securityLabel, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(securityLabel, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(securityLabel, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(securityLabel, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(securityLabel, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(securityLabel, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(securityLabel, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(securityLabel, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityLabel_validateSecurityLabelTemplateId(securityLabel, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityLabel_validateSecurityLabelComponent(securityLabel, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSecurityLabelTemplateId constraint of '<em>Security Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityLabel_validateSecurityLabelTemplateId(SecurityLabel securityLabel,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityLabel.validateSecurityLabelTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityLabelComponent constraint of '<em>Security Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityLabel_validateSecurityLabelComponent(SecurityLabel securityLabel,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityLabel.validateSecurityLabelComponent(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIIHIReceivingProvider(IIHIReceivingProvider iihiReceivingProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(iihiReceivingProvider, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(iihiReceivingProvider, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(iihiReceivingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(iihiReceivingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(iihiReceivingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(iihiReceivingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(iihiReceivingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(iihiReceivingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(iihiReceivingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateParticipant2_validateContextControlCode(
				iihiReceivingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateIIHIReceivingProvider_validateIIHIReceivingProviderTemplateId(
				iihiReceivingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateIIHIReceivingProvider_validateIIHIReceivingProviderTypeCodeP(
				iihiReceivingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateIIHIReceivingProvider_validateIIHIReceivingProviderTypeCode(
				iihiReceivingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateIIHIReceivingProvider_validateIIHIReceivingProviderParticipantRole(
				iihiReceivingProvider, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateIIHIReceivingProviderTemplateId constraint of '<em>IIHI Receiving Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIIHIReceivingProvider_validateIIHIReceivingProviderTemplateId(
			IIHIReceivingProvider iihiReceivingProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return iihiReceivingProvider.validateIIHIReceivingProviderTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateIIHIReceivingProviderTypeCodeP constraint of '<em>IIHI Receiving Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIIHIReceivingProvider_validateIIHIReceivingProviderTypeCodeP(
			IIHIReceivingProvider iihiReceivingProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return iihiReceivingProvider.validateIIHIReceivingProviderTypeCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateIIHIReceivingProviderTypeCode constraint of '<em>IIHI Receiving Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIIHIReceivingProvider_validateIIHIReceivingProviderTypeCode(
			IIHIReceivingProvider iihiReceivingProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return iihiReceivingProvider.validateIIHIReceivingProviderTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateIIHIReceivingProviderParticipantRole constraint of '<em>IIHI Receiving Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIIHIReceivingProvider_validateIIHIReceivingProviderParticipantRole(
			IIHIReceivingProvider iihiReceivingProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return iihiReceivingProvider.validateIIHIReceivingProviderParticipantRole(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationPolicySecurityObservation(
			ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(obligationPolicySecurityObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(obligationPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(obligationPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				obligationPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(obligationPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(obligationPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(obligationPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(obligationPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateObligationPolicySecurityObservation_validateSecurityObservationTemplateId(
				obligationPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateObligationPolicySecurityObservation_validateSecurityObservationCodeP(
				obligationPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateObligationPolicySecurityObservation_validateSecurityObservationCode(
				obligationPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationMoodCode(
				obligationPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateObligationPolicySecurityObservation_validateSecurityObservationValue(
				obligationPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateObligationPolicySecurityObservation_validateSecurityObservationValueP(
				obligationPolicySecurityObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSecurityObservationTemplateId constraint of '<em>Obligation Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationPolicySecurityObservation_validateSecurityObservationTemplateId(
			ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return obligationPolicySecurityObservation.validateSecurityObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCodeP constraint of '<em>Obligation Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationPolicySecurityObservation_validateSecurityObservationCodeP(
			ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return obligationPolicySecurityObservation.validateSecurityObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCode constraint of '<em>Obligation Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationPolicySecurityObservation_validateSecurityObservationCode(
			ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return obligationPolicySecurityObservation.validateSecurityObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationValueP constraint of '<em>Obligation Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationPolicySecurityObservation_validateSecurityObservationValueP(
			ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return obligationPolicySecurityObservation.validateSecurityObservationValueP(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationValue constraint of '<em>Obligation Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationPolicySecurityObservation_validateSecurityObservationValue(
			ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return obligationPolicySecurityObservation.validateSecurityObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputablePolicyConsent(ComputablePolicyConsent computablePolicyConsent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(computablePolicyConsent, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(computablePolicyConsent, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(computablePolicyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(computablePolicyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(computablePolicyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(computablePolicyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(computablePolicyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(computablePolicyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(computablePolicyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComputablePolicyConsent_validateComputablePolicyConsentTemplateId(
				computablePolicyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComputablePolicyConsent_validateComputablePolicyConsentCodeP(
				computablePolicyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComputablePolicyConsent_validateComputablePolicyConsentCode(
				computablePolicyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComputablePolicyConsent_validateComputablePolicyConsentMoodCode(
				computablePolicyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComputablePolicyConsent_validateComputablePolicyConsentValue(
				computablePolicyConsent, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateComputablePolicyConsentTemplateId constraint of '<em>Computable Policy Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputablePolicyConsent_validateComputablePolicyConsentTemplateId(
			ComputablePolicyConsent computablePolicyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return computablePolicyConsent.validateComputablePolicyConsentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateComputablePolicyConsentCodeP constraint of '<em>Computable Policy Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputablePolicyConsent_validateComputablePolicyConsentCodeP(
			ComputablePolicyConsent computablePolicyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return computablePolicyConsent.validateComputablePolicyConsentCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateComputablePolicyConsentCode constraint of '<em>Computable Policy Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputablePolicyConsent_validateComputablePolicyConsentCode(
			ComputablePolicyConsent computablePolicyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return computablePolicyConsent.validateComputablePolicyConsentCode(diagnostics, context);
	}

	/**
	 * Validates the validateComputablePolicyConsentMoodCode constraint of '<em>Computable Policy Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputablePolicyConsent_validateComputablePolicyConsentMoodCode(
			ComputablePolicyConsent computablePolicyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return computablePolicyConsent.validateComputablePolicyConsentMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateComputablePolicyConsentValue constraint of '<em>Computable Policy Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputablePolicyConsent_validateComputablePolicyConsentValue(
			ComputablePolicyConsent computablePolicyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return computablePolicyConsent.validateComputablePolicyConsentValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedPrivacyConsent(ScannedPrivacyConsent scannedPrivacyConsent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scannedPrivacyConsent, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(scannedPrivacyConsent, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(scannedPrivacyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(scannedPrivacyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(scannedPrivacyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(scannedPrivacyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(scannedPrivacyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(scannedPrivacyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(scannedPrivacyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateScannedPrivacyConsent_validateScannedPrivacyConsentTemplateId(
				scannedPrivacyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateScannedPrivacyConsent_validateScannedPrivacyConsentMoodCodeP(
				scannedPrivacyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateScannedPrivacyConsent_validateScannedPrivacyConsentMoodCode(
				scannedPrivacyConsent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateScannedPrivacyConsent_validateScannedPrivacyConsentValue(
				scannedPrivacyConsent, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateScannedPrivacyConsentTemplateId constraint of '<em>Scanned Privacy Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedPrivacyConsent_validateScannedPrivacyConsentTemplateId(
			ScannedPrivacyConsent scannedPrivacyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedPrivacyConsent.validateScannedPrivacyConsentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateScannedPrivacyConsentMoodCodeP constraint of '<em>Scanned Privacy Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedPrivacyConsent_validateScannedPrivacyConsentMoodCodeP(
			ScannedPrivacyConsent scannedPrivacyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedPrivacyConsent.validateScannedPrivacyConsentMoodCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateScannedPrivacyConsentMoodCode constraint of '<em>Scanned Privacy Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedPrivacyConsent_validateScannedPrivacyConsentMoodCode(
			ScannedPrivacyConsent scannedPrivacyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedPrivacyConsent.validateScannedPrivacyConsentMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateScannedPrivacyConsentValue constraint of '<em>Scanned Privacy Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedPrivacyConsent_validateScannedPrivacyConsentValue(
			ScannedPrivacyConsent scannedPrivacyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedPrivacyConsent.validateScannedPrivacyConsentValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignatureImageObservation(SignatureImageObservation signatureImageObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signatureImageObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(signatureImageObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(signatureImageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(signatureImageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(signatureImageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(signatureImageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(signatureImageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(signatureImageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(signatureImageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSignatureImageObservation_validateSignatureImageObservationTemplateId(
				signatureImageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSignatureImageObservation_validateSignatureImageObservationMoodCode(
				signatureImageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSignatureImageObservation_validateSignatureImageObservationValue(
				signatureImageObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSignatureImageObservationTemplateId constraint of '<em>Signature Image Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignatureImageObservation_validateSignatureImageObservationTemplateId(
			SignatureImageObservation signatureImageObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return signatureImageObservation.validateSignatureImageObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSignatureImageObservationMoodCode constraint of '<em>Signature Image Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignatureImageObservation_validateSignatureImageObservationMoodCode(
			SignatureImageObservation signatureImageObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return signatureImageObservation.validateSignatureImageObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateSignatureImageObservationValue constraint of '<em>Signature Image Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignatureImageObservation_validateSignatureImageObservationValue(
			SignatureImageObservation signatureImageObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return signatureImageObservation.validateSignatureImageObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderDocumentationOf(
			PrivacyConsentHeaderDocumentationOf privacyConsentHeaderDocumentationOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privacyConsentHeaderDocumentationOf, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(privacyConsentHeaderDocumentationOf, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(privacyConsentHeaderDocumentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(privacyConsentHeaderDocumentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				privacyConsentHeaderDocumentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(privacyConsentHeaderDocumentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(privacyConsentHeaderDocumentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(privacyConsentHeaderDocumentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(privacyConsentHeaderDocumentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateDocumentationOf_validateTypeCode(
				privacyConsentHeaderDocumentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentHeaderDocumentationOf_validatePrivacyConsentHeaderDocumentationOfTemplateId(
				privacyConsentHeaderDocumentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrivacyConsentHeaderDocumentationOf_validatePrivacyConsentHeaderDocumentationOfServiceEvent(
				privacyConsentHeaderDocumentationOf, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePrivacyConsentHeaderDocumentationOfTemplateId constraint of '<em>Privacy Consent Header Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderDocumentationOf_validatePrivacyConsentHeaderDocumentationOfTemplateId(
			PrivacyConsentHeaderDocumentationOf privacyConsentHeaderDocumentationOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentHeaderDocumentationOf.validatePrivacyConsentHeaderDocumentationOfTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyConsentHeaderDocumentationOfServiceEvent constraint of '<em>Privacy Consent Header Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyConsentHeaderDocumentationOf_validatePrivacyConsentHeaderDocumentationOfServiceEvent(
			PrivacyConsentHeaderDocumentationOf privacyConsentHeaderDocumentationOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyConsentHeaderDocumentationOf.validatePrivacyConsentHeaderDocumentationOfServiceEvent(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeOfUseSecurityObservation(
			PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(purposeOfUseSecurityObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeOfUseSecurityObservation_validateSecurityObservationTemplateId(
				purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeOfUseSecurityObservation_validateSecurityObservationCodeP(
				purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeOfUseSecurityObservation_validateSecurityObservationCode(
				purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationMoodCode(
				purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationValue(
				purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationValueP(
				purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeOfUseSecurityObservation_validatePurposeOfUseSecurityObservationValueP(
				purposeOfUseSecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeOfUseSecurityObservation_validatePurposeOfUseSecurityObservationValue(
				purposeOfUseSecurityObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePurposeOfUseSecurityObservationValueP constraint of '<em>Purpose Of Use Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeOfUseSecurityObservation_validatePurposeOfUseSecurityObservationValueP(
			PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return purposeOfUseSecurityObservation.validatePurposeOfUseSecurityObservationValueP(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeOfUseSecurityObservationValue constraint of '<em>Purpose Of Use Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeOfUseSecurityObservation_validatePurposeOfUseSecurityObservationValue(
			PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return purposeOfUseSecurityObservation.validatePurposeOfUseSecurityObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationTemplateId constraint of '<em>Purpose Of Use Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeOfUseSecurityObservation_validateSecurityObservationTemplateId(
			PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return purposeOfUseSecurityObservation.validateSecurityObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCodeP constraint of '<em>Purpose Of Use Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeOfUseSecurityObservation_validateSecurityObservationCodeP(
			PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return purposeOfUseSecurityObservation.validateSecurityObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCode constraint of '<em>Purpose Of Use Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeOfUseSecurityObservation_validateSecurityObservationCode(
			PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return purposeOfUseSecurityObservation.validateSecurityObservationCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrainPolicySecurityObservation(
			RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refrainPolicySecurityObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(refrainPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(refrainPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				refrainPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(refrainPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(refrainPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(refrainPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(refrainPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRefrainPolicySecurityObservation_validateSecurityObservationTemplateId(
				refrainPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRefrainPolicySecurityObservation_validateSecurityObservationCodeP(
				refrainPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRefrainPolicySecurityObservation_validateSecurityObservationCode(
				refrainPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSecurityObservation_validateSecurityObservationMoodCode(
				refrainPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRefrainPolicySecurityObservation_validateSecurityObservationValue(
				refrainPolicySecurityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRefrainPolicySecurityObservation_validateSecurityObservationValueP(
				refrainPolicySecurityObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSecurityObservationTemplateId constraint of '<em>Refrain Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrainPolicySecurityObservation_validateSecurityObservationTemplateId(
			RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return refrainPolicySecurityObservation.validateSecurityObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCodeP constraint of '<em>Refrain Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrainPolicySecurityObservation_validateSecurityObservationCodeP(
			RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return refrainPolicySecurityObservation.validateSecurityObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCode constraint of '<em>Refrain Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrainPolicySecurityObservation_validateSecurityObservationCode(
			RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return refrainPolicySecurityObservation.validateSecurityObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationValueP constraint of '<em>Refrain Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrainPolicySecurityObservation_validateSecurityObservationValueP(
			RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return refrainPolicySecurityObservation.validateSecurityObservationValueP(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationValue constraint of '<em>Refrain Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrainPolicySecurityObservation_validateSecurityObservationValue(
			RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return refrainPolicySecurityObservation.validateSecurityObservationValue(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CONSENTDIRECTIVEPlugin.INSTANCE;
	}

} // CONSENTDIRECTIVEValidator
