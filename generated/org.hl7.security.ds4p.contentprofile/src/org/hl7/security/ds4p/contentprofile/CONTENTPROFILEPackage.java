/**
 */
package org.hl7.security.ds4p.contentprofile;

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
     * The number of structural features of the '<em>Privacy Segmented Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_SEGMENTED_SECTION_FEATURE_COUNT = 0;

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
     * The number of structural features of the '<em>Privacy Markings Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_SECTION_FEATURE_COUNT = 0;

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
     * The number of structural features of the '<em>Security Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_OBSERVATION_FEATURE_COUNT = 0;

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
     * The number of structural features of the '<em>Mandatory Document Provenance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_PROVENANCE_FEATURE_COUNT = 0;

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
     * The number of structural features of the '<em>Mandatory Document Assigned Author</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_FEATURE_COUNT = 0;

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
     * The number of structural features of the '<em>Privacy Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_FEATURE_COUNT = 0;

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
     * The number of structural features of the '<em>Mandatory Entry Provenance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_PROVENANCE_FEATURE_COUNT = 0;

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
     * The number of structural features of the '<em>Mandatory Entry Assigned Author</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_ENTRY_ASSIGNED_AUTHOR_FEATURE_COUNT = 0;

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
     * The number of structural features of the '<em>Privacy Annotation Entry Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_FEATURE_COUNT = 0;

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
     * The number of structural features of the '<em>Privacy Markings Entry</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_MARKINGS_ENTRY_FEATURE_COUNT = 0;


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
