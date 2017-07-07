/**
 */
package org.hl7.security.ds4p.contentprofile;

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
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/mdht/uml initializers='org.hl7.security.ds4p.contentprofile'"
 * @generated
 */
public interface CONTENTPROFILEPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "contentprofile";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.hl7.org/security/ds4p/contentprofile";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "contentprofile";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CONTENTPROFILEPackage eINSTANCE = org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl.init();

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.PrivacySegmentedDocumentImpl <em>Privacy Segmented Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.PrivacySegmentedDocumentImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPrivacySegmentedDocument()
     * @generated
     */
    int PRIVACY_SEGMENTED_DOCUMENT = 0;

    /**
     * The number of structural features of the '<em>Privacy Segmented Document</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_DOCUMENT_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.PrivacySegmentedSectionImpl <em>Privacy Segmented Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.PrivacySegmentedSectionImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPrivacySegmentedSection()
     * @generated
     */
    int PRIVACY_SEGMENTED_SECTION = 1;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__ID = CDAPackage.SECTION__ID;

				/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__CODE = CDAPackage.SECTION__CODE;

				/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__TITLE = CDAPackage.SECTION__TITLE;

				/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__TEXT = CDAPackage.SECTION__TEXT;

				/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

				/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

				/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

				/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

				/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

				/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

				/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

				/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

				/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

				/**
     * The number of structural features of the '<em>Privacy Segmented Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.PrivacyMarkingsSectionImpl <em>Privacy Markings Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.PrivacyMarkingsSectionImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPrivacyMarkingsSection()
     * @generated
     */
    int PRIVACY_MARKINGS_SECTION = 2;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__ID = CDAPackage.SECTION__ID;

				/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__CODE = CDAPackage.SECTION__CODE;

				/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

				/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

				/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

				/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

				/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

				/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

				/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

				/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

				/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

				/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

				/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

				/**
     * The number of structural features of the '<em>Privacy Markings Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.SecurityObservationImpl <em>Security Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.SecurityObservationImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getSecurityObservation()
     * @generated
     */
    int SECURITY_OBSERVATION = 4;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

				/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

				/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

				/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

				/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

				/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

				/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

				/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

				/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

				/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

				/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

				/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

				/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

				/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

				/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

				/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

				/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

				/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

				/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

				/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

				/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

				/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

				/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

				/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

				/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

				/**
     * The number of structural features of the '<em>Security Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.ObligationPolicySecurityObservationImpl <em>Obligation Policy Security Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.ObligationPolicySecurityObservationImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getObligationPolicySecurityObservation()
     * @generated
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION = 3;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__REALM_CODE = SECURITY_OBSERVATION__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__TYPE_ID = SECURITY_OBSERVATION__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__TEMPLATE_ID = SECURITY_OBSERVATION__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__ID = SECURITY_OBSERVATION__ID;

				/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__CODE = SECURITY_OBSERVATION__CODE;

				/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__DERIVATION_EXPR = SECURITY_OBSERVATION__DERIVATION_EXPR;

				/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__TEXT = SECURITY_OBSERVATION__TEXT;

				/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__STATUS_CODE = SECURITY_OBSERVATION__STATUS_CODE;

				/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__EFFECTIVE_TIME = SECURITY_OBSERVATION__EFFECTIVE_TIME;

				/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__PRIORITY_CODE = SECURITY_OBSERVATION__PRIORITY_CODE;

				/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__REPEAT_NUMBER = SECURITY_OBSERVATION__REPEAT_NUMBER;

				/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__LANGUAGE_CODE = SECURITY_OBSERVATION__LANGUAGE_CODE;

				/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__VALUE = SECURITY_OBSERVATION__VALUE;

				/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__INTERPRETATION_CODE = SECURITY_OBSERVATION__INTERPRETATION_CODE;

				/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__METHOD_CODE = SECURITY_OBSERVATION__METHOD_CODE;

				/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__TARGET_SITE_CODE = SECURITY_OBSERVATION__TARGET_SITE_CODE;

				/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__SUBJECT = SECURITY_OBSERVATION__SUBJECT;

				/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__SPECIMEN = SECURITY_OBSERVATION__SPECIMEN;

				/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__PERFORMER = SECURITY_OBSERVATION__PERFORMER;

				/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__AUTHOR = SECURITY_OBSERVATION__AUTHOR;

				/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__INFORMANT = SECURITY_OBSERVATION__INFORMANT;

				/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__PARTICIPANT = SECURITY_OBSERVATION__PARTICIPANT;

				/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__ENTRY_RELATIONSHIP = SECURITY_OBSERVATION__ENTRY_RELATIONSHIP;

				/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__REFERENCE = SECURITY_OBSERVATION__REFERENCE;

				/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__PRECONDITION = SECURITY_OBSERVATION__PRECONDITION;

				/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__REFERENCE_RANGE = SECURITY_OBSERVATION__REFERENCE_RANGE;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__NULL_FLAVOR = SECURITY_OBSERVATION__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__CLASS_CODE = SECURITY_OBSERVATION__CLASS_CODE;

				/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__MOOD_CODE = SECURITY_OBSERVATION__MOOD_CODE;

				/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION__NEGATION_IND = SECURITY_OBSERVATION__NEGATION_IND;

				/**
     * The number of structural features of the '<em>Obligation Policy Security Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBLIGATION_POLICY_SECURITY_OBSERVATION_FEATURE_COUNT = SECURITY_OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.MandatoryDocumentProvenanceImpl <em>Mandatory Document Provenance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.MandatoryDocumentProvenanceImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getMandatoryDocumentProvenance()
     * @generated
     */
    int MANDATORY_DOCUMENT_PROVENANCE = 5;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_PROVENANCE__REALM_CODE = CDAPackage.AUTHOR__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_PROVENANCE__TYPE_ID = CDAPackage.AUTHOR__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_PROVENANCE__TEMPLATE_ID = CDAPackage.AUTHOR__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Function Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_PROVENANCE__FUNCTION_CODE = CDAPackage.AUTHOR__FUNCTION_CODE;

				/**
     * The feature id for the '<em><b>Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_PROVENANCE__TIME = CDAPackage.AUTHOR__TIME;

				/**
     * The feature id for the '<em><b>Assigned Author</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_PROVENANCE__ASSIGNED_AUTHOR = CDAPackage.AUTHOR__ASSIGNED_AUTHOR;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_PROVENANCE__NULL_FLAVOR = CDAPackage.AUTHOR__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Type Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_PROVENANCE__TYPE_CODE = CDAPackage.AUTHOR__TYPE_CODE;

				/**
     * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_PROVENANCE__CONTEXT_CONTROL_CODE = CDAPackage.AUTHOR__CONTEXT_CONTROL_CODE;

				/**
     * The number of structural features of the '<em>Mandatory Document Provenance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_PROVENANCE_FEATURE_COUNT = CDAPackage.AUTHOR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.MandatoryDocumentAssignedAuthorImpl <em>Mandatory Document Assigned Author</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.MandatoryDocumentAssignedAuthorImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getMandatoryDocumentAssignedAuthor()
     * @generated
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR = 6;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__REALM_CODE = CDAPackage.ASSIGNED_AUTHOR__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__TYPE_ID = CDAPackage.ASSIGNED_AUTHOR__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__TEMPLATE_ID = CDAPackage.ASSIGNED_AUTHOR__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__ID = CDAPackage.ASSIGNED_AUTHOR__ID;

				/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__CODE = CDAPackage.ASSIGNED_AUTHOR__CODE;

				/**
     * The feature id for the '<em><b>Addr</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__ADDR = CDAPackage.ASSIGNED_AUTHOR__ADDR;

				/**
     * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__TELECOM = CDAPackage.ASSIGNED_AUTHOR__TELECOM;

				/**
     * The feature id for the '<em><b>Assigned Person</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__ASSIGNED_PERSON = CDAPackage.ASSIGNED_AUTHOR__ASSIGNED_PERSON;

				/**
     * The feature id for the '<em><b>Assigned Authoring Device</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__ASSIGNED_AUTHORING_DEVICE = CDAPackage.ASSIGNED_AUTHOR__ASSIGNED_AUTHORING_DEVICE;

				/**
     * The feature id for the '<em><b>Represented Organization</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__REPRESENTED_ORGANIZATION = CDAPackage.ASSIGNED_AUTHOR__REPRESENTED_ORGANIZATION;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__NULL_FLAVOR = CDAPackage.ASSIGNED_AUTHOR__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__CLASS_CODE = CDAPackage.ASSIGNED_AUTHOR__CLASS_CODE;

				/**
     * The number of structural features of the '<em>Mandatory Document Assigned Author</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_FEATURE_COUNT = CDAPackage.ASSIGNED_AUTHOR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.PrivacyAnnotationImpl <em>Privacy Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.PrivacyAnnotationImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPrivacyAnnotation()
     * @generated
     */
    int PRIVACY_ANNOTATION = 7;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__REALM_CODE = CDAPackage.ORGANIZER__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__TYPE_ID = CDAPackage.ORGANIZER__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__TEMPLATE_ID = CDAPackage.ORGANIZER__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__ID = CDAPackage.ORGANIZER__ID;

				/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__CODE = CDAPackage.ORGANIZER__CODE;

				/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__STATUS_CODE = CDAPackage.ORGANIZER__STATUS_CODE;

				/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__EFFECTIVE_TIME = CDAPackage.ORGANIZER__EFFECTIVE_TIME;

				/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__SUBJECT = CDAPackage.ORGANIZER__SUBJECT;

				/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__SPECIMEN = CDAPackage.ORGANIZER__SPECIMEN;

				/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__PERFORMER = CDAPackage.ORGANIZER__PERFORMER;

				/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__AUTHOR = CDAPackage.ORGANIZER__AUTHOR;

				/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__INFORMANT = CDAPackage.ORGANIZER__INFORMANT;

				/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__PARTICIPANT = CDAPackage.ORGANIZER__PARTICIPANT;

				/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__REFERENCE = CDAPackage.ORGANIZER__REFERENCE;

				/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__PRECONDITION = CDAPackage.ORGANIZER__PRECONDITION;

				/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__COMPONENT = CDAPackage.ORGANIZER__COMPONENT;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__NULL_FLAVOR = CDAPackage.ORGANIZER__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__CLASS_CODE = CDAPackage.ORGANIZER__CLASS_CODE;

				/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION__MOOD_CODE = CDAPackage.ORGANIZER__MOOD_CODE;

				/**
     * The number of structural features of the '<em>Privacy Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_FEATURE_COUNT = CDAPackage.ORGANIZER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.RefrainPolicySecurityObservationImpl <em>Refrain Policy Security Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.RefrainPolicySecurityObservationImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getRefrainPolicySecurityObservation()
     * @generated
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION = 8;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__REALM_CODE = SECURITY_OBSERVATION__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__TYPE_ID = SECURITY_OBSERVATION__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__TEMPLATE_ID = SECURITY_OBSERVATION__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__ID = SECURITY_OBSERVATION__ID;

				/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__CODE = SECURITY_OBSERVATION__CODE;

				/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__DERIVATION_EXPR = SECURITY_OBSERVATION__DERIVATION_EXPR;

				/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__TEXT = SECURITY_OBSERVATION__TEXT;

				/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__STATUS_CODE = SECURITY_OBSERVATION__STATUS_CODE;

				/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__EFFECTIVE_TIME = SECURITY_OBSERVATION__EFFECTIVE_TIME;

				/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__PRIORITY_CODE = SECURITY_OBSERVATION__PRIORITY_CODE;

				/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__REPEAT_NUMBER = SECURITY_OBSERVATION__REPEAT_NUMBER;

				/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__LANGUAGE_CODE = SECURITY_OBSERVATION__LANGUAGE_CODE;

				/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__VALUE = SECURITY_OBSERVATION__VALUE;

				/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__INTERPRETATION_CODE = SECURITY_OBSERVATION__INTERPRETATION_CODE;

				/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__METHOD_CODE = SECURITY_OBSERVATION__METHOD_CODE;

				/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__TARGET_SITE_CODE = SECURITY_OBSERVATION__TARGET_SITE_CODE;

				/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__SUBJECT = SECURITY_OBSERVATION__SUBJECT;

				/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__SPECIMEN = SECURITY_OBSERVATION__SPECIMEN;

				/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__PERFORMER = SECURITY_OBSERVATION__PERFORMER;

				/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__AUTHOR = SECURITY_OBSERVATION__AUTHOR;

				/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__INFORMANT = SECURITY_OBSERVATION__INFORMANT;

				/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__PARTICIPANT = SECURITY_OBSERVATION__PARTICIPANT;

				/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__ENTRY_RELATIONSHIP = SECURITY_OBSERVATION__ENTRY_RELATIONSHIP;

				/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__REFERENCE = SECURITY_OBSERVATION__REFERENCE;

				/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__PRECONDITION = SECURITY_OBSERVATION__PRECONDITION;

				/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__REFERENCE_RANGE = SECURITY_OBSERVATION__REFERENCE_RANGE;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__NULL_FLAVOR = SECURITY_OBSERVATION__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__CLASS_CODE = SECURITY_OBSERVATION__CLASS_CODE;

				/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__MOOD_CODE = SECURITY_OBSERVATION__MOOD_CODE;

				/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION__NEGATION_IND = SECURITY_OBSERVATION__NEGATION_IND;

				/**
     * The number of structural features of the '<em>Refrain Policy Security Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFRAIN_POLICY_SECURITY_OBSERVATION_FEATURE_COUNT = SECURITY_OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.PurposeOfUseSecurityObservationImpl <em>Purpose Of Use Security Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.PurposeOfUseSecurityObservationImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPurposeOfUseSecurityObservation()
     * @generated
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION = 9;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__REALM_CODE = SECURITY_OBSERVATION__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__TYPE_ID = SECURITY_OBSERVATION__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__TEMPLATE_ID = SECURITY_OBSERVATION__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__ID = SECURITY_OBSERVATION__ID;

				/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__CODE = SECURITY_OBSERVATION__CODE;

				/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__DERIVATION_EXPR = SECURITY_OBSERVATION__DERIVATION_EXPR;

				/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__TEXT = SECURITY_OBSERVATION__TEXT;

				/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__STATUS_CODE = SECURITY_OBSERVATION__STATUS_CODE;

				/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__EFFECTIVE_TIME = SECURITY_OBSERVATION__EFFECTIVE_TIME;

				/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__PRIORITY_CODE = SECURITY_OBSERVATION__PRIORITY_CODE;

				/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__REPEAT_NUMBER = SECURITY_OBSERVATION__REPEAT_NUMBER;

				/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__LANGUAGE_CODE = SECURITY_OBSERVATION__LANGUAGE_CODE;

				/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__VALUE = SECURITY_OBSERVATION__VALUE;

				/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__INTERPRETATION_CODE = SECURITY_OBSERVATION__INTERPRETATION_CODE;

				/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__METHOD_CODE = SECURITY_OBSERVATION__METHOD_CODE;

				/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__TARGET_SITE_CODE = SECURITY_OBSERVATION__TARGET_SITE_CODE;

				/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__SUBJECT = SECURITY_OBSERVATION__SUBJECT;

				/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__SPECIMEN = SECURITY_OBSERVATION__SPECIMEN;

				/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__PERFORMER = SECURITY_OBSERVATION__PERFORMER;

				/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__AUTHOR = SECURITY_OBSERVATION__AUTHOR;

				/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__INFORMANT = SECURITY_OBSERVATION__INFORMANT;

				/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__PARTICIPANT = SECURITY_OBSERVATION__PARTICIPANT;

				/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__ENTRY_RELATIONSHIP = SECURITY_OBSERVATION__ENTRY_RELATIONSHIP;

				/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__REFERENCE = SECURITY_OBSERVATION__REFERENCE;

				/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__PRECONDITION = SECURITY_OBSERVATION__PRECONDITION;

				/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__REFERENCE_RANGE = SECURITY_OBSERVATION__REFERENCE_RANGE;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__NULL_FLAVOR = SECURITY_OBSERVATION__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__CLASS_CODE = SECURITY_OBSERVATION__CLASS_CODE;

				/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__MOOD_CODE = SECURITY_OBSERVATION__MOOD_CODE;

				/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION__NEGATION_IND = SECURITY_OBSERVATION__NEGATION_IND;

				/**
     * The number of structural features of the '<em>Purpose Of Use Security Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PURPOSE_OF_USE_SECURITY_OBSERVATION_FEATURE_COUNT = SECURITY_OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.ConfidentialitySecurityObservationImpl <em>Confidentiality Security Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.ConfidentialitySecurityObservationImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getConfidentialitySecurityObservation()
     * @generated
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION = 10;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__REALM_CODE = SECURITY_OBSERVATION__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__TYPE_ID = SECURITY_OBSERVATION__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__TEMPLATE_ID = SECURITY_OBSERVATION__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__ID = SECURITY_OBSERVATION__ID;

				/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__CODE = SECURITY_OBSERVATION__CODE;

				/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__DERIVATION_EXPR = SECURITY_OBSERVATION__DERIVATION_EXPR;

				/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__TEXT = SECURITY_OBSERVATION__TEXT;

				/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__STATUS_CODE = SECURITY_OBSERVATION__STATUS_CODE;

				/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__EFFECTIVE_TIME = SECURITY_OBSERVATION__EFFECTIVE_TIME;

				/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__PRIORITY_CODE = SECURITY_OBSERVATION__PRIORITY_CODE;

				/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__REPEAT_NUMBER = SECURITY_OBSERVATION__REPEAT_NUMBER;

				/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__LANGUAGE_CODE = SECURITY_OBSERVATION__LANGUAGE_CODE;

				/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__VALUE = SECURITY_OBSERVATION__VALUE;

				/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__INTERPRETATION_CODE = SECURITY_OBSERVATION__INTERPRETATION_CODE;

				/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__METHOD_CODE = SECURITY_OBSERVATION__METHOD_CODE;

				/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__TARGET_SITE_CODE = SECURITY_OBSERVATION__TARGET_SITE_CODE;

				/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__SUBJECT = SECURITY_OBSERVATION__SUBJECT;

				/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__SPECIMEN = SECURITY_OBSERVATION__SPECIMEN;

				/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__PERFORMER = SECURITY_OBSERVATION__PERFORMER;

				/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__AUTHOR = SECURITY_OBSERVATION__AUTHOR;

				/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__INFORMANT = SECURITY_OBSERVATION__INFORMANT;

				/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__PARTICIPANT = SECURITY_OBSERVATION__PARTICIPANT;

				/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__ENTRY_RELATIONSHIP = SECURITY_OBSERVATION__ENTRY_RELATIONSHIP;

				/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__REFERENCE = SECURITY_OBSERVATION__REFERENCE;

				/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__PRECONDITION = SECURITY_OBSERVATION__PRECONDITION;

				/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__REFERENCE_RANGE = SECURITY_OBSERVATION__REFERENCE_RANGE;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__NULL_FLAVOR = SECURITY_OBSERVATION__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__CLASS_CODE = SECURITY_OBSERVATION__CLASS_CODE;

				/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__MOOD_CODE = SECURITY_OBSERVATION__MOOD_CODE;

				/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION__NEGATION_IND = SECURITY_OBSERVATION__NEGATION_IND;

				/**
     * The number of structural features of the '<em>Confidentiality Security Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIALITY_SECURITY_OBSERVATION_FEATURE_COUNT = SECURITY_OBSERVATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.ProtectedProblemImpl <em>Protected Problem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.ProtectedProblemImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getProtectedProblem()
     * @generated
     */
    int PROTECTED_PROBLEM = 11;

    /**
     * The number of structural features of the '<em>Protected Problem</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTECTED_PROBLEM_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.MandatoryEntryProvenanceImpl <em>Mandatory Entry Provenance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.MandatoryEntryProvenanceImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getMandatoryEntryProvenance()
     * @generated
     */
    int MANDATORY_ENTRY_PROVENANCE = 12;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_PROVENANCE__REALM_CODE = CDAPackage.AUTHOR__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_PROVENANCE__TYPE_ID = CDAPackage.AUTHOR__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_PROVENANCE__TEMPLATE_ID = CDAPackage.AUTHOR__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Function Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_PROVENANCE__FUNCTION_CODE = CDAPackage.AUTHOR__FUNCTION_CODE;

				/**
     * The feature id for the '<em><b>Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_PROVENANCE__TIME = CDAPackage.AUTHOR__TIME;

				/**
     * The feature id for the '<em><b>Assigned Author</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_PROVENANCE__ASSIGNED_AUTHOR = CDAPackage.AUTHOR__ASSIGNED_AUTHOR;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_PROVENANCE__NULL_FLAVOR = CDAPackage.AUTHOR__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Type Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_PROVENANCE__TYPE_CODE = CDAPackage.AUTHOR__TYPE_CODE;

				/**
     * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_PROVENANCE__CONTEXT_CONTROL_CODE = CDAPackage.AUTHOR__CONTEXT_CONTROL_CODE;

				/**
     * The number of structural features of the '<em>Mandatory Entry Provenance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_PROVENANCE_FEATURE_COUNT = CDAPackage.AUTHOR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.MandatoryEntryAssignedAuthorImpl <em>Mandatory Entry Assigned Author</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.MandatoryEntryAssignedAuthorImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getMandatoryEntryAssignedAuthor()
     * @generated
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR = 13;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR__REALM_CODE = CDAPackage.ASSIGNED_AUTHOR__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR__TYPE_ID = CDAPackage.ASSIGNED_AUTHOR__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR__TEMPLATE_ID = CDAPackage.ASSIGNED_AUTHOR__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR__ID = CDAPackage.ASSIGNED_AUTHOR__ID;

				/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR__CODE = CDAPackage.ASSIGNED_AUTHOR__CODE;

				/**
     * The feature id for the '<em><b>Addr</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR__ADDR = CDAPackage.ASSIGNED_AUTHOR__ADDR;

				/**
     * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR__TELECOM = CDAPackage.ASSIGNED_AUTHOR__TELECOM;

				/**
     * The feature id for the '<em><b>Assigned Person</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR__ASSIGNED_PERSON = CDAPackage.ASSIGNED_AUTHOR__ASSIGNED_PERSON;

				/**
     * The feature id for the '<em><b>Assigned Authoring Device</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR__ASSIGNED_AUTHORING_DEVICE = CDAPackage.ASSIGNED_AUTHOR__ASSIGNED_AUTHORING_DEVICE;

				/**
     * The feature id for the '<em><b>Represented Organization</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR__REPRESENTED_ORGANIZATION = CDAPackage.ASSIGNED_AUTHOR__REPRESENTED_ORGANIZATION;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR__NULL_FLAVOR = CDAPackage.ASSIGNED_AUTHOR__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR__CLASS_CODE = CDAPackage.ASSIGNED_AUTHOR__CLASS_CODE;

				/**
     * The number of structural features of the '<em>Mandatory Entry Assigned Author</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR_FEATURE_COUNT = CDAPackage.ASSIGNED_AUTHOR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.PrivacyAnnotationEntryRelationshipImpl <em>Privacy Annotation Entry Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.PrivacyAnnotationEntryRelationshipImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPrivacyAnnotationEntryRelationship()
     * @generated
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP = 14;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__REALM_CODE = CDAPackage.ENTRY_RELATIONSHIP__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__TYPE_ID = CDAPackage.ENTRY_RELATIONSHIP__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__TEMPLATE_ID = CDAPackage.ENTRY_RELATIONSHIP__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Sequence Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__SEQUENCE_NUMBER = CDAPackage.ENTRY_RELATIONSHIP__SEQUENCE_NUMBER;

				/**
     * The feature id for the '<em><b>Seperatable Ind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__SEPERATABLE_IND = CDAPackage.ENTRY_RELATIONSHIP__SEPERATABLE_IND;

				/**
     * The feature id for the '<em><b>Act</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__ACT = CDAPackage.ENTRY_RELATIONSHIP__ACT;

				/**
     * The feature id for the '<em><b>Encounter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__ENCOUNTER = CDAPackage.ENTRY_RELATIONSHIP__ENCOUNTER;

				/**
     * The feature id for the '<em><b>Observation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__OBSERVATION = CDAPackage.ENTRY_RELATIONSHIP__OBSERVATION;

				/**
     * The feature id for the '<em><b>Observation Media</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__OBSERVATION_MEDIA = CDAPackage.ENTRY_RELATIONSHIP__OBSERVATION_MEDIA;

				/**
     * The feature id for the '<em><b>Organizer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__ORGANIZER = CDAPackage.ENTRY_RELATIONSHIP__ORGANIZER;

				/**
     * The feature id for the '<em><b>Procedure</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__PROCEDURE = CDAPackage.ENTRY_RELATIONSHIP__PROCEDURE;

				/**
     * The feature id for the '<em><b>Region Of Interest</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__REGION_OF_INTEREST = CDAPackage.ENTRY_RELATIONSHIP__REGION_OF_INTEREST;

				/**
     * The feature id for the '<em><b>Substance Administration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__SUBSTANCE_ADMINISTRATION = CDAPackage.ENTRY_RELATIONSHIP__SUBSTANCE_ADMINISTRATION;

				/**
     * The feature id for the '<em><b>Supply</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__SUPPLY = CDAPackage.ENTRY_RELATIONSHIP__SUPPLY;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__NULL_FLAVOR = CDAPackage.ENTRY_RELATIONSHIP__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Type Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__TYPE_CODE = CDAPackage.ENTRY_RELATIONSHIP__TYPE_CODE;

				/**
     * The feature id for the '<em><b>Inversion Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__INVERSION_IND = CDAPackage.ENTRY_RELATIONSHIP__INVERSION_IND;

				/**
     * The feature id for the '<em><b>Context Conduction Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__CONTEXT_CONDUCTION_IND = CDAPackage.ENTRY_RELATIONSHIP__CONTEXT_CONDUCTION_IND;

				/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__NEGATION_IND = CDAPackage.ENTRY_RELATIONSHIP__NEGATION_IND;

				/**
     * The number of structural features of the '<em>Privacy Annotation Entry Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_FEATURE_COUNT = CDAPackage.ENTRY_RELATIONSHIP_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.hl7.security.ds4p.contentprofile.impl.PrivacyMarkingsEntryImpl <em>Privacy Markings Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hl7.security.ds4p.contentprofile.impl.PrivacyMarkingsEntryImpl
     * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPrivacyMarkingsEntry()
     * @generated
     */
    int PRIVACY_MARKINGS_ENTRY = 15;

    /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__REALM_CODE = CDAPackage.ENTRY__REALM_CODE;

				/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__TYPE_ID = CDAPackage.ENTRY__TYPE_ID;

				/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__TEMPLATE_ID = CDAPackage.ENTRY__TEMPLATE_ID;

				/**
     * The feature id for the '<em><b>Act</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__ACT = CDAPackage.ENTRY__ACT;

				/**
     * The feature id for the '<em><b>Encounter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__ENCOUNTER = CDAPackage.ENTRY__ENCOUNTER;

				/**
     * The feature id for the '<em><b>Observation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__OBSERVATION = CDAPackage.ENTRY__OBSERVATION;

				/**
     * The feature id for the '<em><b>Observation Media</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__OBSERVATION_MEDIA = CDAPackage.ENTRY__OBSERVATION_MEDIA;

				/**
     * The feature id for the '<em><b>Organizer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__ORGANIZER = CDAPackage.ENTRY__ORGANIZER;

				/**
     * The feature id for the '<em><b>Procedure</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__PROCEDURE = CDAPackage.ENTRY__PROCEDURE;

				/**
     * The feature id for the '<em><b>Region Of Interest</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__REGION_OF_INTEREST = CDAPackage.ENTRY__REGION_OF_INTEREST;

				/**
     * The feature id for the '<em><b>Substance Administration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__SUBSTANCE_ADMINISTRATION = CDAPackage.ENTRY__SUBSTANCE_ADMINISTRATION;

				/**
     * The feature id for the '<em><b>Supply</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__SUPPLY = CDAPackage.ENTRY__SUPPLY;

				/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__NULL_FLAVOR = CDAPackage.ENTRY__NULL_FLAVOR;

				/**
     * The feature id for the '<em><b>Type Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__TYPE_CODE = CDAPackage.ENTRY__TYPE_CODE;

				/**
     * The feature id for the '<em><b>Context Conduction Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY__CONTEXT_CONDUCTION_IND = CDAPackage.ENTRY__CONTEXT_CONDUCTION_IND;

				/**
     * The number of structural features of the '<em>Privacy Markings Entry</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY_FEATURE_COUNT = CDAPackage.ENTRY_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument <em>Privacy Segmented Document</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Privacy Segmented Document</em>'.
     * @see org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument
     * @generated
     */
    EClass getPrivacySegmentedDocument();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection <em>Privacy Segmented Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Privacy Segmented Section</em>'.
     * @see org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection
     * @generated
     */
    EClass getPrivacySegmentedSection();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection <em>Privacy Markings Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Privacy Markings Section</em>'.
     * @see org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection
     * @generated
     */
    EClass getPrivacyMarkingsSection();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation <em>Obligation Policy Security Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Obligation Policy Security Observation</em>'.
     * @see org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation
     * @generated
     */
    EClass getObligationPolicySecurityObservation();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.SecurityObservation <em>Security Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Security Observation</em>'.
     * @see org.hl7.security.ds4p.contentprofile.SecurityObservation
     * @generated
     */
    EClass getSecurityObservation();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance <em>Mandatory Document Provenance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mandatory Document Provenance</em>'.
     * @see org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance
     * @generated
     */
    EClass getMandatoryDocumentProvenance();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor <em>Mandatory Document Assigned Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mandatory Document Assigned Author</em>'.
     * @see org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor
     * @generated
     */
    EClass getMandatoryDocumentAssignedAuthor();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation <em>Privacy Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Privacy Annotation</em>'.
     * @see org.hl7.security.ds4p.contentprofile.PrivacyAnnotation
     * @generated
     */
    EClass getPrivacyAnnotation();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation <em>Refrain Policy Security Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Refrain Policy Security Observation</em>'.
     * @see org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation
     * @generated
     */
    EClass getRefrainPolicySecurityObservation();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation <em>Purpose Of Use Security Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Purpose Of Use Security Observation</em>'.
     * @see org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation
     * @generated
     */
    EClass getPurposeOfUseSecurityObservation();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation <em>Confidentiality Security Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Confidentiality Security Observation</em>'.
     * @see org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation
     * @generated
     */
    EClass getConfidentialitySecurityObservation();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.ProtectedProblem <em>Protected Problem</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Protected Problem</em>'.
     * @see org.hl7.security.ds4p.contentprofile.ProtectedProblem
     * @generated
     */
    EClass getProtectedProblem();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance <em>Mandatory Entry Provenance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mandatory Entry Provenance</em>'.
     * @see org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance
     * @generated
     */
    EClass getMandatoryEntryProvenance();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor <em>Mandatory Entry Assigned Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mandatory Entry Assigned Author</em>'.
     * @see org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor
     * @generated
     */
    EClass getMandatoryEntryAssignedAuthor();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotationEntryRelationship <em>Privacy Annotation Entry Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Privacy Annotation Entry Relationship</em>'.
     * @see org.hl7.security.ds4p.contentprofile.PrivacyAnnotationEntryRelationship
     * @generated
     */
    EClass getPrivacyAnnotationEntryRelationship();

    /**
     * Returns the meta object for class '{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsEntry <em>Privacy Markings Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Privacy Markings Entry</em>'.
     * @see org.hl7.security.ds4p.contentprofile.PrivacyMarkingsEntry
     * @generated
     */
    EClass getPrivacyMarkingsEntry();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CONTENTPROFILEFactory getCONTENTPROFILEFactory();

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
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.PrivacySegmentedDocumentImpl <em>Privacy Segmented Document</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.PrivacySegmentedDocumentImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPrivacySegmentedDocument()
         * @generated
         */
        EClass PRIVACY_SEGMENTED_DOCUMENT = eINSTANCE.getPrivacySegmentedDocument();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.PrivacySegmentedSectionImpl <em>Privacy Segmented Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.PrivacySegmentedSectionImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPrivacySegmentedSection()
         * @generated
         */
        EClass PRIVACY_SEGMENTED_SECTION = eINSTANCE.getPrivacySegmentedSection();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.PrivacyMarkingsSectionImpl <em>Privacy Markings Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.PrivacyMarkingsSectionImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPrivacyMarkingsSection()
         * @generated
         */
        EClass PRIVACY_MARKINGS_SECTION = eINSTANCE.getPrivacyMarkingsSection();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.ObligationPolicySecurityObservationImpl <em>Obligation Policy Security Observation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.ObligationPolicySecurityObservationImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getObligationPolicySecurityObservation()
         * @generated
         */
        EClass OBLIGATION_POLICY_SECURITY_OBSERVATION = eINSTANCE.getObligationPolicySecurityObservation();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.SecurityObservationImpl <em>Security Observation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.SecurityObservationImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getSecurityObservation()
         * @generated
         */
        EClass SECURITY_OBSERVATION = eINSTANCE.getSecurityObservation();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.MandatoryDocumentProvenanceImpl <em>Mandatory Document Provenance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.MandatoryDocumentProvenanceImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getMandatoryDocumentProvenance()
         * @generated
         */
        EClass MANDATORY_DOCUMENT_PROVENANCE = eINSTANCE.getMandatoryDocumentProvenance();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.MandatoryDocumentAssignedAuthorImpl <em>Mandatory Document Assigned Author</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.MandatoryDocumentAssignedAuthorImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getMandatoryDocumentAssignedAuthor()
         * @generated
         */
        EClass MANDATORY_DOCUMENT_ASSIGNED_AUTHOR = eINSTANCE.getMandatoryDocumentAssignedAuthor();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.PrivacyAnnotationImpl <em>Privacy Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.PrivacyAnnotationImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPrivacyAnnotation()
         * @generated
         */
        EClass PRIVACY_ANNOTATION = eINSTANCE.getPrivacyAnnotation();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.RefrainPolicySecurityObservationImpl <em>Refrain Policy Security Observation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.RefrainPolicySecurityObservationImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getRefrainPolicySecurityObservation()
         * @generated
         */
        EClass REFRAIN_POLICY_SECURITY_OBSERVATION = eINSTANCE.getRefrainPolicySecurityObservation();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.PurposeOfUseSecurityObservationImpl <em>Purpose Of Use Security Observation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.PurposeOfUseSecurityObservationImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPurposeOfUseSecurityObservation()
         * @generated
         */
        EClass PURPOSE_OF_USE_SECURITY_OBSERVATION = eINSTANCE.getPurposeOfUseSecurityObservation();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.ConfidentialitySecurityObservationImpl <em>Confidentiality Security Observation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.ConfidentialitySecurityObservationImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getConfidentialitySecurityObservation()
         * @generated
         */
        EClass CONFIDENTIALITY_SECURITY_OBSERVATION = eINSTANCE.getConfidentialitySecurityObservation();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.ProtectedProblemImpl <em>Protected Problem</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.ProtectedProblemImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getProtectedProblem()
         * @generated
         */
        EClass PROTECTED_PROBLEM = eINSTANCE.getProtectedProblem();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.MandatoryEntryProvenanceImpl <em>Mandatory Entry Provenance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.MandatoryEntryProvenanceImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getMandatoryEntryProvenance()
         * @generated
         */
        EClass MANDATORY_ENTRY_PROVENANCE = eINSTANCE.getMandatoryEntryProvenance();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.MandatoryEntryAssignedAuthorImpl <em>Mandatory Entry Assigned Author</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.MandatoryEntryAssignedAuthorImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getMandatoryEntryAssignedAuthor()
         * @generated
         */
        EClass MANDATORY_ENTRY_ASSIGNED_AUTHOR = eINSTANCE.getMandatoryEntryAssignedAuthor();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.PrivacyAnnotationEntryRelationshipImpl <em>Privacy Annotation Entry Relationship</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.PrivacyAnnotationEntryRelationshipImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPrivacyAnnotationEntryRelationship()
         * @generated
         */
        EClass PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP = eINSTANCE.getPrivacyAnnotationEntryRelationship();

        /**
         * The meta object literal for the '{@link org.hl7.security.ds4p.contentprofile.impl.PrivacyMarkingsEntryImpl <em>Privacy Markings Entry</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hl7.security.ds4p.contentprofile.impl.PrivacyMarkingsEntryImpl
         * @see org.hl7.security.ds4p.contentprofile.impl.CONTENTPROFILEPackageImpl#getPrivacyMarkingsEntry()
         * @generated
         */
        EClass PRIVACY_MARKINGS_ENTRY = eINSTANCE.getPrivacyMarkingsEntry();

    }

} //CONTENTPROFILEPackage
