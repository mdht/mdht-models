/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory
 * @model kind="package"
 *        annotation="http://www.openhealthtools.org/mdht/uml initializers='org.openhealthtools.mdht.uml.cda.emspcr'"
 * @generated
 */
public interface EmspcrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emspcr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/emspcr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emspcr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmspcrPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.PatientCareReportImpl <em>Patient Care Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.PatientCareReportImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getPatientCareReport()
	 * @generated
	 */
	int PATIENT_CARE_REPORT = 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__REALM_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__TYPE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__TEMPLATE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__TITLE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__EFFECTIVE_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__CONFIDENTIALITY_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__LANGUAGE_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__SET_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__VERSION_NUMBER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__COPY_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__RECORD_TARGET = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__AUTHOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__DATA_ENTERER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__INFORMANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__CUSTODIAN = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__INFORMATION_RECIPIENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__LEGAL_AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__PARTICIPANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__IN_FULFILLMENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__DOCUMENTATION_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__RELATED_DOCUMENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__AUTHORIZATION = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__COMPONENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__COMPONENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__NULL_FLAVOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__CLASS_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT__MOOD_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Patient Care Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CARE_REPORT_FEATURE_COUNT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSBillingSectionImpl <em>EMS Billing Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSBillingSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSBillingSection()
	 * @generated
	 */
	int EMS_BILLING_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>EMS Billing Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_BILLING_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSInjuryIncidentDescriptionSectionImpl <em>EMS Injury Incident Description Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSInjuryIncidentDescriptionSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSInjuryIncidentDescriptionSection()
	 * @generated
	 */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCurrentMedicationSectionImpl <em>EMS Current Medication Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCurrentMedicationSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSCurrentMedicationSection()
	 * @generated
	 */
	int EMS_CURRENT_MEDICATION_SECTION = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCardiacArrestEventSectionImpl <em>EMS Cardiac Arrest Event Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCardiacArrestEventSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSCardiacArrestEventSection()
	 * @generated
	 */
	int EMS_CARDIAC_ARREST_EVENT_SECTION = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAdvanceDirectivesSectionImpl <em>EMS Advance Directives Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAdvanceDirectivesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSAdvanceDirectivesSection()
	 * @generated
	 */
	int EMS_ADVANCE_DIRECTIVES_SECTION = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAllergiesAndAdverseReactionsSectionImpl <em>EMS Allergies And Adverse Reactions Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAllergiesAndAdverseReactionsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSAllergiesAndAdverseReactionsSection()
	 * @generated
	 */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPastMedicalHistorySectionImpl <em>EMS Past Medical History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPastMedicalHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSPastMedicalHistorySection()
	 * @generated
	 */
	int EMS_PAST_MEDICAL_HISTORY_SECTION = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSSocialHistorySectionImpl <em>EMS Social History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSSocialHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSSocialHistorySection()
	 * @generated
	 */
	int EMS_SOCIAL_HISTORY_SECTION = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPhysicalAssessmentSectionImpl <em>EMS Physical Assessment Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPhysicalAssessmentSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSPhysicalAssessmentSection()
	 * @generated
	 */
	int EMS_PHYSICAL_ASSESSMENT_SECTION = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSMedicationsAdministeredSectionImpl <em>EMS Medications Administered Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSMedicationsAdministeredSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSMedicationsAdministeredSection()
	 * @generated
	 */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSProceduresPerformedSectionImpl <em>EMS Procedures Performed Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSProceduresPerformedSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSProceduresPerformedSection()
	 * @generated
	 */
	int EMS_PROCEDURES_PERFORMED_SECTION = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPatientCareNarrativeSectionImpl <em>EMS Patient Care Narrative Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPatientCareNarrativeSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSPatientCareNarrativeSection()
	 * @generated
	 */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION = 12;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSSceneSectionImpl <em>EMS Scene Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSSceneSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSSceneSection()
	 * @generated
	 */
	int EMS_SCENE_SECTION = 13;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSDispatchSectionImpl <em>EMS Dispatch Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSDispatchSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSDispatchSection()
	 * @generated
	 */
	int EMS_DISPATCH_SECTION = 14;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSDispositionSectionImpl <em>EMS Disposition Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSDispositionSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSDispositionSection()
	 * @generated
	 */
	int EMS_DISPOSITION_SECTION = 15;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPersonnelAdverseEventSectionImpl <em>EMS Personnel Adverse Event Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPersonnelAdverseEventSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSPersonnelAdverseEventSection()
	 * @generated
	 */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION = 16;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSProtocolSectionImpl <em>EMS Protocol Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSProtocolSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSProtocolSection()
	 * @generated
	 */
	int EMS_PROTOCOL_SECTION = 17;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSResponseSectionImpl <em>EMS Response Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSResponseSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSResponseSection()
	 * @generated
	 */
	int EMS_RESPONSE_SECTION = 18;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSSituationSectionImpl <em>EMS Situation Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSSituationSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSSituationSection()
	 * @generated
	 */
	int EMS_SITUATION_SECTION = 19;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSTimesSectionImpl <em>EMS Times Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSTimesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSTimesSection()
	 * @generated
	 */
	int EMS_TIMES_SECTION = 20;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSVitalSignsSectionImpl <em>EMS Vital Signs Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSVitalSignsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSVitalSignsSection()
	 * @generated
	 */
	int EMS_VITAL_SIGNS_SECTION = 21;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.DerivedEntryImpl <em>Derived Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.DerivedEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getDerivedEntry()
	 * @generated
	 */
	int DERIVED_ENTRY = 22;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Injury Incident Description Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Current Medication Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CURRENT_MEDICATION_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Cardiac Arrest Event Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_CARDIAC_ARREST_EVENT_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Advance Directives Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ADVANCE_DIRECTIVES_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Allergies And Adverse Reactions Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Past Medical History Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PAST_MEDICAL_HISTORY_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Social History Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SOCIAL_HISTORY_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Physical Assessment Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PHYSICAL_ASSESSMENT_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Medications Administered Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_MEDICATIONS_ADMINISTERED_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Procedures Performed Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROCEDURES_PERFORMED_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Patient Care Narrative Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PATIENT_CARE_NARRATIVE_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Scene Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SCENE_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Dispatch Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPATCH_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Disposition Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_DISPOSITION_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Personnel Adverse Event Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PERSONNEL_ADVERSE_EVENT_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Protocol Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_PROTOCOL_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Response Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_RESPONSE_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Situation Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_SITUATION_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Times Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_TIMES_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	   * The feature id for the '<em><b>Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	   * The feature id for the '<em><b>Title</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	   * The feature id for the '<em><b>Text</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	   * The feature id for the '<em><b>Subject</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	   * The feature id for the '<em><b>Author</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	   * The feature id for the '<em><b>Component</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	   * The feature id for the '<em><b>Section Id</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Class Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	   * The number of structural features of the '<em>EMS Vital Signs Section</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int EMS_VITAL_SIGNS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__REALM_CODE = CDAPackage.ENTRY__REALM_CODE;

	/**
	   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__TYPE_ID = CDAPackage.ENTRY__TYPE_ID;

	/**
	   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__TEMPLATE_ID = CDAPackage.ENTRY__TEMPLATE_ID;

	/**
	   * The feature id for the '<em><b>Act</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__ACT = CDAPackage.ENTRY__ACT;

	/**
	   * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__ENCOUNTER = CDAPackage.ENTRY__ENCOUNTER;

	/**
	   * The feature id for the '<em><b>Observation</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__OBSERVATION = CDAPackage.ENTRY__OBSERVATION;

	/**
	   * The feature id for the '<em><b>Observation Media</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__OBSERVATION_MEDIA = CDAPackage.ENTRY__OBSERVATION_MEDIA;

	/**
	   * The feature id for the '<em><b>Organizer</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__ORGANIZER = CDAPackage.ENTRY__ORGANIZER;

	/**
	   * The feature id for the '<em><b>Procedure</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__PROCEDURE = CDAPackage.ENTRY__PROCEDURE;

	/**
	   * The feature id for the '<em><b>Region Of Interest</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__REGION_OF_INTEREST = CDAPackage.ENTRY__REGION_OF_INTEREST;

	/**
	   * The feature id for the '<em><b>Substance Administration</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__SUBSTANCE_ADMINISTRATION = CDAPackage.ENTRY__SUBSTANCE_ADMINISTRATION;

	/**
	   * The feature id for the '<em><b>Supply</b></em>' containment reference.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__SUPPLY = CDAPackage.ENTRY__SUPPLY;

	/**
	   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__NULL_FLAVOR = CDAPackage.ENTRY__NULL_FLAVOR;

	/**
	   * The feature id for the '<em><b>Type Code</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__TYPE_CODE = CDAPackage.ENTRY__TYPE_CODE;

	/**
	   * The feature id for the '<em><b>Context Conduction Ind</b></em>' attribute.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY__CONTEXT_CONDUCTION_IND = CDAPackage.ENTRY__CONTEXT_CONDUCTION_IND;

	/**
	   * The number of structural features of the '<em>Derived Entry</em>' class.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @generated
	   * @ordered
	   */
	int DERIVED_ENTRY_FEATURE_COUNT = CDAPackage.ENTRY_FEATURE_COUNT + 0;

	/**
	   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport <em>Patient Care Report</em>}'.
	   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   * @return the meta object for class '<em>Patient Care Report</em>'.
	   * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport
	   * @generated
	   */
	EClass getPatientCareReport();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection <em>EMS Billing Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Billing Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection
	 * @generated
	 */
	EClass getEMSBillingSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection <em>EMS Injury Incident Description Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Injury Incident Description Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection
	 * @generated
	 */
	EClass getEMSInjuryIncidentDescriptionSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection <em>EMS Current Medication Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Current Medication Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection
	 * @generated
	 */
	EClass getEMSCurrentMedicationSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection <em>EMS Cardiac Arrest Event Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Cardiac Arrest Event Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection
	 * @generated
	 */
	EClass getEMSCardiacArrestEventSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection <em>EMS Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Advance Directives Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection
	 * @generated
	 */
	EClass getEMSAdvanceDirectivesSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection <em>EMS Allergies And Adverse Reactions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Allergies And Adverse Reactions Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection
	 * @generated
	 */
	EClass getEMSAllergiesAndAdverseReactionsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection <em>EMS Past Medical History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Past Medical History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection
	 * @generated
	 */
	EClass getEMSPastMedicalHistorySection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection <em>EMS Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Social History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection
	 * @generated
	 */
	EClass getEMSSocialHistorySection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection <em>EMS Physical Assessment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Physical Assessment Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection
	 * @generated
	 */
	EClass getEMSPhysicalAssessmentSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection <em>EMS Medications Administered Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Medications Administered Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection
	 * @generated
	 */
	EClass getEMSMedicationsAdministeredSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection <em>EMS Procedures Performed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Procedures Performed Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection
	 * @generated
	 */
	EClass getEMSProceduresPerformedSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection <em>EMS Patient Care Narrative Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Patient Care Narrative Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection
	 * @generated
	 */
	EClass getEMSPatientCareNarrativeSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection <em>EMS Scene Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Scene Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection
	 * @generated
	 */
	EClass getEMSSceneSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection <em>EMS Dispatch Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Dispatch Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection
	 * @generated
	 */
	EClass getEMSDispatchSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection <em>EMS Disposition Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Disposition Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection
	 * @generated
	 */
	EClass getEMSDispositionSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection <em>EMS Personnel Adverse Event Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Personnel Adverse Event Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection
	 * @generated
	 */
	EClass getEMSPersonnelAdverseEventSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection <em>EMS Protocol Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Protocol Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection
	 * @generated
	 */
	EClass getEMSProtocolSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection <em>EMS Response Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Response Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection
	 * @generated
	 */
	EClass getEMSResponseSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection <em>EMS Situation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Situation Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection
	 * @generated
	 */
	EClass getEMSSituationSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection <em>EMS Times Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Times Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection
	 * @generated
	 */
	EClass getEMSTimesSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection <em>EMS Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMS Vital Signs Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection
	 * @generated
	 */
	EClass getEMSVitalSignsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry <em>Derived Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry
	 * @generated
	 */
	EClass getDerivedEntry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmspcrFactory getEmspcrFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.PatientCareReportImpl <em>Patient Care Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.PatientCareReportImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getPatientCareReport()
		 * @generated
		 */
		EClass PATIENT_CARE_REPORT = eINSTANCE.getPatientCareReport();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSBillingSectionImpl <em>EMS Billing Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSBillingSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSBillingSection()
		 * @generated
		 */
		EClass EMS_BILLING_SECTION = eINSTANCE.getEMSBillingSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSInjuryIncidentDescriptionSectionImpl <em>EMS Injury Incident Description Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSInjuryIncidentDescriptionSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSInjuryIncidentDescriptionSection()
		 * @generated
		 */
		EClass EMS_INJURY_INCIDENT_DESCRIPTION_SECTION = eINSTANCE.getEMSInjuryIncidentDescriptionSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCurrentMedicationSectionImpl <em>EMS Current Medication Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCurrentMedicationSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSCurrentMedicationSection()
		 * @generated
		 */
		EClass EMS_CURRENT_MEDICATION_SECTION = eINSTANCE.getEMSCurrentMedicationSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCardiacArrestEventSectionImpl <em>EMS Cardiac Arrest Event Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCardiacArrestEventSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSCardiacArrestEventSection()
		 * @generated
		 */
		EClass EMS_CARDIAC_ARREST_EVENT_SECTION = eINSTANCE.getEMSCardiacArrestEventSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAdvanceDirectivesSectionImpl <em>EMS Advance Directives Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAdvanceDirectivesSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSAdvanceDirectivesSection()
		 * @generated
		 */
		EClass EMS_ADVANCE_DIRECTIVES_SECTION = eINSTANCE.getEMSAdvanceDirectivesSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAllergiesAndAdverseReactionsSectionImpl <em>EMS Allergies And Adverse Reactions Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAllergiesAndAdverseReactionsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSAllergiesAndAdverseReactionsSection()
		 * @generated
		 */
		EClass EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION = eINSTANCE.getEMSAllergiesAndAdverseReactionsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPastMedicalHistorySectionImpl <em>EMS Past Medical History Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPastMedicalHistorySectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSPastMedicalHistorySection()
		 * @generated
		 */
		EClass EMS_PAST_MEDICAL_HISTORY_SECTION = eINSTANCE.getEMSPastMedicalHistorySection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSSocialHistorySectionImpl <em>EMS Social History Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSSocialHistorySectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSSocialHistorySection()
		 * @generated
		 */
		EClass EMS_SOCIAL_HISTORY_SECTION = eINSTANCE.getEMSSocialHistorySection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPhysicalAssessmentSectionImpl <em>EMS Physical Assessment Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPhysicalAssessmentSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSPhysicalAssessmentSection()
		 * @generated
		 */
		EClass EMS_PHYSICAL_ASSESSMENT_SECTION = eINSTANCE.getEMSPhysicalAssessmentSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSMedicationsAdministeredSectionImpl <em>EMS Medications Administered Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSMedicationsAdministeredSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSMedicationsAdministeredSection()
		 * @generated
		 */
		EClass EMS_MEDICATIONS_ADMINISTERED_SECTION = eINSTANCE.getEMSMedicationsAdministeredSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSProceduresPerformedSectionImpl <em>EMS Procedures Performed Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSProceduresPerformedSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSProceduresPerformedSection()
		 * @generated
		 */
		EClass EMS_PROCEDURES_PERFORMED_SECTION = eINSTANCE.getEMSProceduresPerformedSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPatientCareNarrativeSectionImpl <em>EMS Patient Care Narrative Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPatientCareNarrativeSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSPatientCareNarrativeSection()
		 * @generated
		 */
		EClass EMS_PATIENT_CARE_NARRATIVE_SECTION = eINSTANCE.getEMSPatientCareNarrativeSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSSceneSectionImpl <em>EMS Scene Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSSceneSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSSceneSection()
		 * @generated
		 */
		EClass EMS_SCENE_SECTION = eINSTANCE.getEMSSceneSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSDispatchSectionImpl <em>EMS Dispatch Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSDispatchSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSDispatchSection()
		 * @generated
		 */
		EClass EMS_DISPATCH_SECTION = eINSTANCE.getEMSDispatchSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSDispositionSectionImpl <em>EMS Disposition Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSDispositionSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSDispositionSection()
		 * @generated
		 */
		EClass EMS_DISPOSITION_SECTION = eINSTANCE.getEMSDispositionSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPersonnelAdverseEventSectionImpl <em>EMS Personnel Adverse Event Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSPersonnelAdverseEventSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSPersonnelAdverseEventSection()
		 * @generated
		 */
		EClass EMS_PERSONNEL_ADVERSE_EVENT_SECTION = eINSTANCE.getEMSPersonnelAdverseEventSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSProtocolSectionImpl <em>EMS Protocol Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSProtocolSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSProtocolSection()
		 * @generated
		 */
		EClass EMS_PROTOCOL_SECTION = eINSTANCE.getEMSProtocolSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSResponseSectionImpl <em>EMS Response Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSResponseSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSResponseSection()
		 * @generated
		 */
		EClass EMS_RESPONSE_SECTION = eINSTANCE.getEMSResponseSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSSituationSectionImpl <em>EMS Situation Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSSituationSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSSituationSection()
		 * @generated
		 */
		EClass EMS_SITUATION_SECTION = eINSTANCE.getEMSSituationSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSTimesSectionImpl <em>EMS Times Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSTimesSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSTimesSection()
		 * @generated
		 */
		EClass EMS_TIMES_SECTION = eINSTANCE.getEMSTimesSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSVitalSignsSectionImpl <em>EMS Vital Signs Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSVitalSignsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSVitalSignsSection()
		 * @generated
		 */
		EClass EMS_VITAL_SIGNS_SECTION = eINSTANCE.getEMSVitalSignsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.DerivedEntryImpl <em>Derived Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.DerivedEntryImpl
		 * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getDerivedEntry()
		 * @generated
		 */
		EClass DERIVED_ENTRY = eINSTANCE.getDerivedEntry();

	}

} // EmspcrPackage
