/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc;

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
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCFactory
 * @model kind="package"
 *        annotation="http://www.openhealthtools.org/mdht/uml initializers='org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc'"
 * @generated
 */
public interface HPOCPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "hpoc";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/ihe/qrph/hpoc";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "hpoc";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    HPOCPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl.init();

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareDocumentImpl <em>Hearing Plan Of Care Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareDocumentImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareDocument()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_DOCUMENT = 0;

    /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareHeaderImpl <em>Hearing Plan Of Care Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareHeaderImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareHeader()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_HEADER = 1;

				/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareSectionImpl <em>Hearing Plan Of Care Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareSection()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_SECTION = 2;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityActImpl <em>Hearing Plan Of Care Activity Act</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityActImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareActivityAct()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_ACTIVITY_ACT = 7;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityEncounterImpl <em>Hearing Plan Of Care Activity Encounter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityEncounterImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareActivityEncounter()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER = 8;

								/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityObservationImpl <em>Hearing Plan Of Care Activity Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareActivityObservation()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 9;

								/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningSectionImpl <em>Hearing Screening Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingScreeningSection()
     * @generated
     */
    int HEARING_SCREENING_SECTION = 3;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.RiskIndicatorsForHearingLossSectionImpl <em>Risk Indicators For Hearing Loss Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.RiskIndicatorsForHearingLossSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getRiskIndicatorsForHearingLossSection()
     * @generated
     */
    int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION = 4;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProblemsSectionImpl <em>Problems Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProblemsSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getProblemsSection()
     * @generated
     */
    int PROBLEMS_SECTION = 5;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProblemConcernImpl <em>Problem Concern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProblemConcernImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getProblemConcern()
     * @generated
     */
    int PROBLEM_CONCERN = 21;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProcedureSectionImpl <em>Procedure Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProcedureSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getProcedureSection()
     * @generated
     */
    int PROCEDURE_SECTION = 6;

        /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__REALM_CODE = CDAPackage.CLINICAL_DOCUMENT__REALM_CODE;

        /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__TYPE_ID = CDAPackage.CLINICAL_DOCUMENT__TYPE_ID;

        /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__TEMPLATE_ID = CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID;

        /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__ID = CDAPackage.CLINICAL_DOCUMENT__ID;

        /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__CODE = CDAPackage.CLINICAL_DOCUMENT__CODE;

        /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__TITLE = CDAPackage.CLINICAL_DOCUMENT__TITLE;

        /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__EFFECTIVE_TIME = CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME;

        /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__CONFIDENTIALITY_CODE = CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE;

        /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__LANGUAGE_CODE = CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE;

        /**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__SET_ID = CDAPackage.CLINICAL_DOCUMENT__SET_ID;

        /**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__VERSION_NUMBER = CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER;

        /**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__COPY_TIME = CDAPackage.CLINICAL_DOCUMENT__COPY_TIME;

        /**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__RECORD_TARGET = CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET;

        /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__AUTHOR = CDAPackage.CLINICAL_DOCUMENT__AUTHOR;

        /**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__DATA_ENTERER = CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER;

        /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__INFORMANT = CDAPackage.CLINICAL_DOCUMENT__INFORMANT;

        /**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__CUSTODIAN = CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN;

        /**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__INFORMATION_RECIPIENT = CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT;

        /**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__LEGAL_AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

        /**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR;

        /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__PARTICIPANT = CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT;

        /**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__IN_FULFILLMENT_OF = CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF;

        /**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__DOCUMENTATION_OF = CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF;

        /**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__RELATED_DOCUMENT = CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT;

        /**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__AUTHORIZATION = CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION;

        /**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__COMPONENT_OF = CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF;

        /**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__COMPONENT = CDAPackage.CLINICAL_DOCUMENT__COMPONENT;

        /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__NULL_FLAVOR = CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR;

        /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__CLASS_CODE = CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE;

        /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER__MOOD_CODE = CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE;

        /**
     * The number of structural features of the '<em>Hearing Plan Of Care Header</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_HEADER_FEATURE_COUNT = CDAPackage.CLINICAL_DOCUMENT_FEATURE_COUNT + 0;

        /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__REALM_CODE = HEARING_PLAN_OF_CARE_HEADER__REALM_CODE;

        /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__TYPE_ID = HEARING_PLAN_OF_CARE_HEADER__TYPE_ID;

        /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__TEMPLATE_ID = HEARING_PLAN_OF_CARE_HEADER__TEMPLATE_ID;

        /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__ID = HEARING_PLAN_OF_CARE_HEADER__ID;

        /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__CODE = HEARING_PLAN_OF_CARE_HEADER__CODE;

        /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__TITLE = HEARING_PLAN_OF_CARE_HEADER__TITLE;

        /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__EFFECTIVE_TIME = HEARING_PLAN_OF_CARE_HEADER__EFFECTIVE_TIME;

        /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__CONFIDENTIALITY_CODE = HEARING_PLAN_OF_CARE_HEADER__CONFIDENTIALITY_CODE;

        /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__LANGUAGE_CODE = HEARING_PLAN_OF_CARE_HEADER__LANGUAGE_CODE;

        /**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__SET_ID = HEARING_PLAN_OF_CARE_HEADER__SET_ID;

        /**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__VERSION_NUMBER = HEARING_PLAN_OF_CARE_HEADER__VERSION_NUMBER;

        /**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__COPY_TIME = HEARING_PLAN_OF_CARE_HEADER__COPY_TIME;

        /**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__RECORD_TARGET = HEARING_PLAN_OF_CARE_HEADER__RECORD_TARGET;

        /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__AUTHOR = HEARING_PLAN_OF_CARE_HEADER__AUTHOR;

        /**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__DATA_ENTERER = HEARING_PLAN_OF_CARE_HEADER__DATA_ENTERER;

        /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__INFORMANT = HEARING_PLAN_OF_CARE_HEADER__INFORMANT;

        /**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__CUSTODIAN = HEARING_PLAN_OF_CARE_HEADER__CUSTODIAN;

        /**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__INFORMATION_RECIPIENT = HEARING_PLAN_OF_CARE_HEADER__INFORMATION_RECIPIENT;

        /**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__LEGAL_AUTHENTICATOR = HEARING_PLAN_OF_CARE_HEADER__LEGAL_AUTHENTICATOR;

        /**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__AUTHENTICATOR = HEARING_PLAN_OF_CARE_HEADER__AUTHENTICATOR;

        /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__PARTICIPANT = HEARING_PLAN_OF_CARE_HEADER__PARTICIPANT;

        /**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__IN_FULFILLMENT_OF = HEARING_PLAN_OF_CARE_HEADER__IN_FULFILLMENT_OF;

        /**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__DOCUMENTATION_OF = HEARING_PLAN_OF_CARE_HEADER__DOCUMENTATION_OF;

        /**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__RELATED_DOCUMENT = HEARING_PLAN_OF_CARE_HEADER__RELATED_DOCUMENT;

        /**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__AUTHORIZATION = HEARING_PLAN_OF_CARE_HEADER__AUTHORIZATION;

        /**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__COMPONENT_OF = HEARING_PLAN_OF_CARE_HEADER__COMPONENT_OF;

        /**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__COMPONENT = HEARING_PLAN_OF_CARE_HEADER__COMPONENT;

        /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__NULL_FLAVOR = HEARING_PLAN_OF_CARE_HEADER__NULL_FLAVOR;

        /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__CLASS_CODE = HEARING_PLAN_OF_CARE_HEADER__CLASS_CODE;

        /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT__MOOD_CODE = HEARING_PLAN_OF_CARE_HEADER__MOOD_CODE;

        /**
     * The number of structural features of the '<em>Hearing Plan Of Care Document</em>' class.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
        int HEARING_PLAN_OF_CARE_DOCUMENT_FEATURE_COUNT = HEARING_PLAN_OF_CARE_HEADER_FEATURE_COUNT + 0;

        /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

        /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

        /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

        /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__ID = CDAPackage.SECTION__ID;

        /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__CODE = CDAPackage.SECTION__CODE;

        /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__TITLE = CDAPackage.SECTION__TITLE;

        /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__TEXT = CDAPackage.SECTION__TEXT;

        /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

        /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

        /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

        /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

        /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

        /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

        /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

        /**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

        /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

        /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

        /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

        /**
     * The number of structural features of the '<em>Hearing Plan Of Care Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

        /**
     * The number of structural features of the '<em>Hearing Screening Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_SECTION_FEATURE_COUNT = 0;

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
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

        /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

        /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

        /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__ID = CDAPackage.SECTION__ID;

        /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__CODE = CDAPackage.SECTION__CODE;

        /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

        /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

        /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

        /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

        /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

        /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

        /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

        /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

        /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

        /**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

        /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

        /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

        /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

        /**
     * The number of structural features of the '<em>Problems Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBLEMS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

        /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

        /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

        /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

        /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__ID = CDAPackage.SECTION__ID;

        /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__CODE = CDAPackage.SECTION__CODE;

        /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__TITLE = CDAPackage.SECTION__TITLE;

        /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__TEXT = CDAPackage.SECTION__TEXT;

        /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

        /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

        /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

        /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

        /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

        /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

        /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

        /**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

        /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

        /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

        /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

        /**
     * The number of structural features of the '<em>Procedure Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

								/**
     * The number of structural features of the '<em>Hearing Plan Of Care Activity Act</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_ACTIVITY_ACT_FEATURE_COUNT = 0;

								/**
     * The number of structural features of the '<em>Hearing Plan Of Care Activity Encounter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_FEATURE_COUNT = 0;

								/**
     * The number of structural features of the '<em>Hearing Plan Of Care Activity Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION_FEATURE_COUNT = 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityProcedureImpl <em>Hearing Plan Of Care Activity Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityProcedureImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareActivityProcedure()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE = 10;

                /**
     * The number of structural features of the '<em>Hearing Plan Of Care Activity Procedure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE_FEATURE_COUNT = 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivitySubstanceAdministrationImpl <em>Hearing Plan Of Care Activity Substance Administration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivitySubstanceAdministrationImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareActivitySubstanceAdministration()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION = 11;

                /**
     * The number of structural features of the '<em>Hearing Plan Of Care Activity Substance Administration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityNonMedicinalSupplyImpl <em>Hearing Plan Of Care Activity Non Medicinal Supply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityNonMedicinalSupplyImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareActivityNonMedicinalSupply()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY = 13;

                /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareInstructionsImpl <em>Hearing Plan Of Care Instructions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareInstructionsImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareInstructions()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_INSTRUCTIONS = 12;

                /**
     * The number of structural features of the '<em>Hearing Plan Of Care Instructions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_INSTRUCTIONS_FEATURE_COUNT = 0;

                /**
     * The number of structural features of the '<em>Hearing Plan Of Care Activity Non Medicinal Supply</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_FEATURE_COUNT = 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningOrganizerImpl <em>Hearing Screening Organizer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningOrganizerImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingScreeningOrganizer()
     * @generated
     */
    int HEARING_SCREENING_ORGANIZER = 14;

                /**
     * The number of structural features of the '<em>Hearing Screening Organizer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_ORGANIZER_FEATURE_COUNT = 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningOutcomeObservationLeftImpl <em>Hearing Screening Outcome Observation Left</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningOutcomeObservationLeftImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingScreeningOutcomeObservationLeft()
     * @generated
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT = 15;

                /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

                /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

                /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

                /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__ID = CDAPackage.OBSERVATION__ID;

                /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__CODE = CDAPackage.OBSERVATION__CODE;

                /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

                /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__TEXT = CDAPackage.OBSERVATION__TEXT;

                /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

                /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

                /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

                /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

                /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

                /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__VALUE = CDAPackage.OBSERVATION__VALUE;

                /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

                /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

                /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

                /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

                /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

                /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

                /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

                /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

                /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

                /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

                /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

                /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

                /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

                /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

                /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

                /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

                /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

                /**
     * The number of structural features of the '<em>Hearing Screening Outcome Observation Left</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ReasonNotScreenedImpl <em>Reason Not Screened</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ReasonNotScreenedImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getReasonNotScreened()
     * @generated
     */
    int REASON_NOT_SCREENED = 16;

                /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__REALM_CODE = CDAPackage.ACT__REALM_CODE;

                /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__TYPE_ID = CDAPackage.ACT__TYPE_ID;

                /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

                /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__ID = CDAPackage.ACT__ID;

                /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__CODE = CDAPackage.ACT__CODE;

                /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__TEXT = CDAPackage.ACT__TEXT;

                /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

                /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

                /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

                /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

                /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__SUBJECT = CDAPackage.ACT__SUBJECT;

                /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__SPECIMEN = CDAPackage.ACT__SPECIMEN;

                /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__PERFORMER = CDAPackage.ACT__PERFORMER;

                /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__AUTHOR = CDAPackage.ACT__AUTHOR;

                /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__INFORMANT = CDAPackage.ACT__INFORMANT;

                /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

                /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

                /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__REFERENCE = CDAPackage.ACT__REFERENCE;

                /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__PRECONDITION = CDAPackage.ACT__PRECONDITION;

                /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

                /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

                /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

                /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

                /**
     * The number of structural features of the '<em>Reason Not Screened</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REASON_NOT_SCREENED_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningOutcomeObservationRightImpl <em>Hearing Screening Outcome Observation Right</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningOutcomeObservationRightImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingScreeningOutcomeObservationRight()
     * @generated
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT = 17;

                /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

                /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

                /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

                /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__ID = CDAPackage.OBSERVATION__ID;

                /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__CODE = CDAPackage.OBSERVATION__CODE;

                /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

                /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__TEXT = CDAPackage.OBSERVATION__TEXT;

                /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

                /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

                /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

                /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

                /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

                /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__VALUE = CDAPackage.OBSERVATION__VALUE;

                /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

                /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

                /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

                /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

                /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

                /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

                /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

                /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

                /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

                /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

                /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

                /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

                /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

                /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

                /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

                /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

                /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

                /**
     * The number of structural features of the '<em>Hearing Screening Outcome Observation Right</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningResultsOrganizerImpl <em>Hearing Screening Results Organizer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningResultsOrganizerImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingScreeningResultsOrganizer()
     * @generated
     */
    int HEARING_SCREENING_RESULTS_ORGANIZER = 18;

                /**
     * The number of structural features of the '<em>Hearing Screening Results Organizer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_RESULTS_ORGANIZER_FEATURE_COUNT = 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningResultObservationImpl <em>Hearing Screening Result Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningResultObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingScreeningResultObservation()
     * @generated
     */
    int HEARING_SCREENING_RESULT_OBSERVATION = 19;

                /**
     * The number of structural features of the '<em>Hearing Screening Result Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_SCREENING_RESULT_OBSERVATION_FEATURE_COUNT = 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.RiskIndicatorForHearingLossObservationImpl <em>Risk Indicator For Hearing Loss Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.RiskIndicatorForHearingLossObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getRiskIndicatorForHearingLossObservation()
     * @generated
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION = 20;

                /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

                /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

                /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

                /**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

                /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

                /**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

                /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

                /**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

                /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

                /**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

                /**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

                /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

                /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

                /**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

                /**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

                /**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

                /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

                /**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

                /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

                /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

                /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

                /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

                /**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

                /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

                /**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

                /**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

                /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

                /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

                /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

                /**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

                /**
     * The number of structural features of the '<em>Risk Indicator For Hearing Loss Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

                /**
     * The number of structural features of the '<em>Problem Concern</em>' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PROBLEM_CONCERN_FEATURE_COUNT = 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProblemConcernImpl <em>Hearing Plan Of Care Problem Concern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProblemConcernImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareProblemConcern()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_PROBLEM_CONCERN = 22;

                /**
     * The number of structural features of the '<em>Hearing Plan Of Care Problem Concern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEM_CONCERN_FEATURE_COUNT = 0;

                /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProblemsSubSectionImpl <em>Hearing Plan Of Care Problems Sub Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProblemsSubSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareProblemsSubSection()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION = 23;

                /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

                /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

                /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

                /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__ID = CDAPackage.SECTION__ID;

                /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__CODE = CDAPackage.SECTION__CODE;

                /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__TITLE = CDAPackage.SECTION__TITLE;

                /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__TEXT = CDAPackage.SECTION__TEXT;

                /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

                /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

                /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

                /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

                /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

                /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

                /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

                /**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

                /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

                /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

                /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

                /**
     * The number of structural features of the '<em>Hearing Plan Of Care Problems Sub Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProcedureActivityProcedureImpl <em>Procedure Activity Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProcedureActivityProcedureImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getProcedureActivityProcedure()
     * @generated
     */
    int PROCEDURE_ACTIVITY_PROCEDURE = 24;

                /**
     * The number of structural features of the '<em>Procedure Activity Procedure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_ACTIVITY_PROCEDURE_FEATURE_COUNT = 0;

                /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProcedureActivityActImpl <em>Procedure Activity Act</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProcedureActivityActImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getProcedureActivityAct()
     * @generated
     */
    int PROCEDURE_ACTIVITY_ACT = 25;

                /**
     * The number of structural features of the '<em>Procedure Activity Act</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_ACTIVITY_ACT_FEATURE_COUNT = 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareRelevantProceduresSubSectionImpl <em>Hearing Plan Of Care Relevant Procedures Sub Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareRelevantProceduresSubSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareRelevantProceduresSubSection()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION = 26;

                /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

                /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

                /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

                /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__ID = CDAPackage.SECTION__ID;

                /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__CODE = CDAPackage.SECTION__CODE;

                /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__TITLE = CDAPackage.SECTION__TITLE;

                /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__TEXT = CDAPackage.SECTION__TEXT;

                /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

                /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

                /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

                /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

                /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

                /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

                /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

                /**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

                /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

                /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

                /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

                /**
     * The number of structural features of the '<em>Hearing Plan Of Care Relevant Procedures Sub Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

                /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProcedureActivityProcedureImpl <em>Hearing Plan Of Care Procedure Activity Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProcedureActivityProcedureImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareProcedureActivityProcedure()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE = 27;

                /**
     * The number of structural features of the '<em>Hearing Plan Of Care Procedure Activity Procedure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_FEATURE_COUNT = 0;

        /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProcedureActivityActImpl <em>Hearing Plan Of Care Procedure Activity Act</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProcedureActivityActImpl
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareProcedureActivityAct()
     * @generated
     */
    int HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT = 28;

                /**
     * The number of structural features of the '<em>Hearing Plan Of Care Procedure Activity Act</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT_FEATURE_COUNT = 0;

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument <em>Hearing Plan Of Care Document</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Document</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument
     * @generated
     */
    EClass getHearingPlanOfCareDocument();

    /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader <em>Hearing Plan Of Care Header</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Header</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader
     * @generated
     */
    EClass getHearingPlanOfCareHeader();

				/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection <em>Risk Indicators For Hearing Loss Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Risk Indicators For Hearing Loss Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection
     * @generated
     */
    EClass getRiskIndicatorsForHearingLossSection();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection <em>Problems Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Problems Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection
     * @generated
     */
    EClass getProblemsSection();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemConcern <em>Problem Concern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Problem Concern</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemConcern
     * @generated
     */
    EClass getProblemConcern();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemConcern <em>Hearing Plan Of Care Problem Concern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Problem Concern</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemConcern
     * @generated
     */
    EClass getHearingPlanOfCareProblemConcern();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemsSubSection <em>Hearing Plan Of Care Problems Sub Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Problems Sub Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemsSubSection
     * @generated
     */
    EClass getHearingPlanOfCareProblemsSubSection();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityProcedure <em>Procedure Activity Procedure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Procedure Activity Procedure</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityProcedure
     * @generated
     */
    EClass getProcedureActivityProcedure();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct <em>Procedure Activity Act</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Procedure Activity Act</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct
     * @generated
     */
    EClass getProcedureActivityAct();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection <em>Hearing Plan Of Care Relevant Procedures Sub Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Relevant Procedures Sub Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection
     * @generated
     */
    EClass getHearingPlanOfCareRelevantProceduresSubSection();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityProcedure <em>Hearing Plan Of Care Procedure Activity Procedure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Procedure Activity Procedure</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityProcedure
     * @generated
     */
    EClass getHearingPlanOfCareProcedureActivityProcedure();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityAct <em>Hearing Plan Of Care Procedure Activity Act</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Procedure Activity Act</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityAct
     * @generated
     */
    EClass getHearingPlanOfCareProcedureActivityAct();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureSection <em>Procedure Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Procedure Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureSection
     * @generated
     */
    EClass getProcedureSection();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection <em>Hearing Plan Of Care Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection
     * @generated
     */
    EClass getHearingPlanOfCareSection();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityAct <em>Hearing Plan Of Care Activity Act</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Activity Act</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityAct
     * @generated
     */
    EClass getHearingPlanOfCareActivityAct();

        /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityEncounter <em>Hearing Plan Of Care Activity Encounter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Activity Encounter</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityEncounter
     * @generated
     */
    EClass getHearingPlanOfCareActivityEncounter();

								/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityObservation <em>Hearing Plan Of Care Activity Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Activity Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityObservation
     * @generated
     */
    EClass getHearingPlanOfCareActivityObservation();

								/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityProcedure <em>Hearing Plan Of Care Activity Procedure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Activity Procedure</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityProcedure
     * @generated
     */
    EClass getHearingPlanOfCareActivityProcedure();

                /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration <em>Hearing Plan Of Care Activity Substance Administration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration
     * @generated
     */
    EClass getHearingPlanOfCareActivitySubstanceAdministration();

                /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply <em>Hearing Plan Of Care Activity Non Medicinal Supply</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Activity Non Medicinal Supply</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply
     * @generated
     */
    EClass getHearingPlanOfCareActivityNonMedicinalSupply();

                /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer <em>Hearing Screening Organizer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Screening Organizer</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer
     * @generated
     */
    EClass getHearingScreeningOrganizer();

                /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft <em>Hearing Screening Outcome Observation Left</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Screening Outcome Observation Left</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft
     * @generated
     */
    EClass getHearingScreeningOutcomeObservationLeft();

                /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened <em>Reason Not Screened</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reason Not Screened</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened
     * @generated
     */
    EClass getReasonNotScreened();

                /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight <em>Hearing Screening Outcome Observation Right</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Screening Outcome Observation Right</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight
     * @generated
     */
    EClass getHearingScreeningOutcomeObservationRight();

                /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultsOrganizer <em>Hearing Screening Results Organizer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Screening Results Organizer</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultsOrganizer
     * @generated
     */
    EClass getHearingScreeningResultsOrganizer();

                /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation <em>Hearing Screening Result Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Screening Result Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation
     * @generated
     */
    EClass getHearingScreeningResultObservation();

                /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation <em>Risk Indicator For Hearing Loss Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Risk Indicator For Hearing Loss Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation
     * @generated
     */
    EClass getRiskIndicatorForHearingLossObservation();

                /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareInstructions <em>Hearing Plan Of Care Instructions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Plan Of Care Instructions</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareInstructions
     * @generated
     */
    EClass getHearingPlanOfCareInstructions();

                /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningSection <em>Hearing Screening Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hearing Screening Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningSection
     * @generated
     */
    EClass getHearingScreeningSection();

        /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    HPOCFactory getHPOCFactory();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareDocumentImpl <em>Hearing Plan Of Care Document</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareDocumentImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareDocument()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_DOCUMENT = eINSTANCE.getHearingPlanOfCareDocument();
								/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareHeaderImpl <em>Hearing Plan Of Care Header</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareHeaderImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareHeader()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_HEADER = eINSTANCE.getHearingPlanOfCareHeader();
								/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.RiskIndicatorsForHearingLossSectionImpl <em>Risk Indicators For Hearing Loss Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.RiskIndicatorsForHearingLossSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getRiskIndicatorsForHearingLossSection()
         * @generated
         */
        EClass RISK_INDICATORS_FOR_HEARING_LOSS_SECTION = eINSTANCE.getRiskIndicatorsForHearingLossSection();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProblemsSectionImpl <em>Problems Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProblemsSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getProblemsSection()
         * @generated
         */
        EClass PROBLEMS_SECTION = eINSTANCE.getProblemsSection();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProblemConcernImpl <em>Problem Concern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProblemConcernImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getProblemConcern()
         * @generated
         */
        EClass PROBLEM_CONCERN = eINSTANCE.getProblemConcern();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProblemConcernImpl <em>Hearing Plan Of Care Problem Concern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProblemConcernImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareProblemConcern()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_PROBLEM_CONCERN = eINSTANCE.getHearingPlanOfCareProblemConcern();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProblemsSubSectionImpl <em>Hearing Plan Of Care Problems Sub Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProblemsSubSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareProblemsSubSection()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION = eINSTANCE.getHearingPlanOfCareProblemsSubSection();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProcedureActivityProcedureImpl <em>Procedure Activity Procedure</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProcedureActivityProcedureImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getProcedureActivityProcedure()
         * @generated
         */
        EClass PROCEDURE_ACTIVITY_PROCEDURE = eINSTANCE.getProcedureActivityProcedure();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProcedureActivityActImpl <em>Procedure Activity Act</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProcedureActivityActImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getProcedureActivityAct()
         * @generated
         */
        EClass PROCEDURE_ACTIVITY_ACT = eINSTANCE.getProcedureActivityAct();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareRelevantProceduresSubSectionImpl <em>Hearing Plan Of Care Relevant Procedures Sub Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareRelevantProceduresSubSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareRelevantProceduresSubSection()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION = eINSTANCE.getHearingPlanOfCareRelevantProceduresSubSection();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProcedureActivityProcedureImpl <em>Hearing Plan Of Care Procedure Activity Procedure</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProcedureActivityProcedureImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareProcedureActivityProcedure()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE = eINSTANCE.getHearingPlanOfCareProcedureActivityProcedure();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProcedureActivityActImpl <em>Hearing Plan Of Care Procedure Activity Act</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareProcedureActivityActImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareProcedureActivityAct()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT = eINSTANCE.getHearingPlanOfCareProcedureActivityAct();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProcedureSectionImpl <em>Procedure Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ProcedureSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getProcedureSection()
         * @generated
         */
        EClass PROCEDURE_SECTION = eINSTANCE.getProcedureSection();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareSectionImpl <em>Hearing Plan Of Care Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareSection()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_SECTION = eINSTANCE.getHearingPlanOfCareSection();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityActImpl <em>Hearing Plan Of Care Activity Act</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityActImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareActivityAct()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_ACTIVITY_ACT = eINSTANCE.getHearingPlanOfCareActivityAct();
                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityEncounterImpl <em>Hearing Plan Of Care Activity Encounter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityEncounterImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareActivityEncounter()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER = eINSTANCE.getHearingPlanOfCareActivityEncounter();
																/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityObservationImpl <em>Hearing Plan Of Care Activity Observation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareActivityObservation()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION = eINSTANCE.getHearingPlanOfCareActivityObservation();
																/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityProcedureImpl <em>Hearing Plan Of Care Activity Procedure</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityProcedureImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareActivityProcedure()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE = eINSTANCE.getHearingPlanOfCareActivityProcedure();
                                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivitySubstanceAdministrationImpl <em>Hearing Plan Of Care Activity Substance Administration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivitySubstanceAdministrationImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareActivitySubstanceAdministration()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION = eINSTANCE.getHearingPlanOfCareActivitySubstanceAdministration();
                                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityNonMedicinalSupplyImpl <em>Hearing Plan Of Care Activity Non Medicinal Supply</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareActivityNonMedicinalSupplyImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareActivityNonMedicinalSupply()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY = eINSTANCE.getHearingPlanOfCareActivityNonMedicinalSupply();
                                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningOrganizerImpl <em>Hearing Screening Organizer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningOrganizerImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingScreeningOrganizer()
         * @generated
         */
        EClass HEARING_SCREENING_ORGANIZER = eINSTANCE.getHearingScreeningOrganizer();
                                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningOutcomeObservationLeftImpl <em>Hearing Screening Outcome Observation Left</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningOutcomeObservationLeftImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingScreeningOutcomeObservationLeft()
         * @generated
         */
        EClass HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT = eINSTANCE.getHearingScreeningOutcomeObservationLeft();
                                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ReasonNotScreenedImpl <em>Reason Not Screened</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.ReasonNotScreenedImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getReasonNotScreened()
         * @generated
         */
        EClass REASON_NOT_SCREENED = eINSTANCE.getReasonNotScreened();
                                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningOutcomeObservationRightImpl <em>Hearing Screening Outcome Observation Right</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningOutcomeObservationRightImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingScreeningOutcomeObservationRight()
         * @generated
         */
        EClass HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT = eINSTANCE.getHearingScreeningOutcomeObservationRight();
                                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningResultsOrganizerImpl <em>Hearing Screening Results Organizer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningResultsOrganizerImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingScreeningResultsOrganizer()
         * @generated
         */
        EClass HEARING_SCREENING_RESULTS_ORGANIZER = eINSTANCE.getHearingScreeningResultsOrganizer();
                                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningResultObservationImpl <em>Hearing Screening Result Observation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningResultObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingScreeningResultObservation()
         * @generated
         */
        EClass HEARING_SCREENING_RESULT_OBSERVATION = eINSTANCE.getHearingScreeningResultObservation();
                                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.RiskIndicatorForHearingLossObservationImpl <em>Risk Indicator For Hearing Loss Observation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.RiskIndicatorForHearingLossObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getRiskIndicatorForHearingLossObservation()
         * @generated
         */
        EClass RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION = eINSTANCE.getRiskIndicatorForHearingLossObservation();
                                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareInstructionsImpl <em>Hearing Plan Of Care Instructions</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingPlanOfCareInstructionsImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingPlanOfCareInstructions()
         * @generated
         */
        EClass HEARING_PLAN_OF_CARE_INSTRUCTIONS = eINSTANCE.getHearingPlanOfCareInstructions();
                                /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningSectionImpl <em>Hearing Screening Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HearingScreeningSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl.HPOCPackageImpl#getHearingScreeningSection()
         * @generated
         */
        EClass HEARING_SCREENING_SECTION = eINSTANCE.getHearingScreeningSection();

    }

} //HPOCPackage
