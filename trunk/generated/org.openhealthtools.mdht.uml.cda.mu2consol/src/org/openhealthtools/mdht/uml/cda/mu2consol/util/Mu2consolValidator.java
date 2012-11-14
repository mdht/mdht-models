/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.EncounterActivities;
import org.openhealthtools.mdht.uml.cda.mu2consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage
 * @generated
 */
public class Mu2consolValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final Mu2consolValidator INSTANCE = new Mu2consolValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.mu2consol";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol General Header Constraints Record Target' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__MU2CONSOL_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol General Header Constraints Documentation Of' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__MU2CONSOL_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Assigned Person' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_ASSIGNED_PERSON = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Documentation Of Service
	 * Event Performer1 Assigned Entity' of 'General Header Constraints'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Documentation Of Service Event Performer' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Documentation Of Service Event' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Component1 Encompassing
	 * Encounter Encounter Participant' of 'General Header Constraints'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COMPONENT1_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Component1 Encompassing Encounter' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COMPONENT1_ENCOMPASSING_ENCOUNTER = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code P' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Record Target Patient
	 * Role Patient Ethnic Group Code' of 'General Header Constraints'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Record Target Patient
	 * Role Patient Ethnic Group Code P' of 'General Header Constraints'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Record Target Patient
	 * Role Patient Race Code' of 'General Header Constraints'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Record Target Patient
	 * Role Patient Race Code P' of 'General Header Constraints'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient Language Communication' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Care Planning' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CARE_PLANNING = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Cognitive Status Entries' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_COGNITIVE_STATUS_ENTRIES = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Functional Status Entries' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_ENTRIES = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Plan Of Care Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Problem Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Allergies Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_ALLERGIES_SECTION = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Immunizations Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Medications Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATIONS_SECTION = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Social History Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Results Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_RESULTS_SECTION = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Vital Signs Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_VITAL_SIGNS_SECTION = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Procedures Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Social History Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Mu2consol Social History
	 * Section Smoking Status Observation' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Mu2consol Plan Of Care
	 * Section Care Planning For Plan Of Care' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Mu2consol Plan Of Care Section Plan Of Care Activity Observation' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Assessment Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_ASSESSMENT_SECTION_TEMPLATE_ID = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Mu2consol Assessment Section Problem Observation' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Encounters Section Encounter Activities' of 'Encounters Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__MU2CONSOL_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section Entries Optional Template Id' of 'Encounters Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Encounter Activities Code Value' of 'Encounter Activities'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_ACTIVITIES__MU2CONSOL_ENCOUNTER_ACTIVITIES_CODE_VALUE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Activities Template Id' of 'Encounter Activities'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_ACTIVITIES__ENCOUNTER_ACTIVITIES_TEMPLATE_ID = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Assessment And Plan Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Plan Of Care Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Plan Of Care Section Plan Of Care Activity Observation' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Template Id' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEMPLATE_ID = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Assessment And Plan Section Template Id' of
	 * 'Assessment And Plan Section'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Responsible Party' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Location' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Reason For Office Visit' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Care Planning' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Effective Time' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_EFFECTIVE_TIME = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Plan Of Care Act Or Encounter' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_ACT_OR_ENCOUNTER = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Instructions Entry' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_ENTRY = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Medications Administered Entry' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_ENTRY = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Social History Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Mu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Mu2consol Plan Of Care Section Plan Of Care Activity Observation' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Problem Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Medications Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_SECTION = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Allergies Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Results Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Vital Signs Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS_SECTION = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Plan Of Care Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Procedures Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Immunizations Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Clinical Office Visit Summary Medications
	 * Administered Section' of 'Clinical Office Visit Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Instructions Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Social History Section Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Mu2consol Social History Section Smoking Status Observation' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Plan Of Care Section Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Clinical Office Visit Summary Assessment And Plan
	 * Section Template Id' of 'Clinical Office Visit Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Transition Of Care Ambulatory Summary Responsible Party' of 'Transition Of Care Ambulatory Summary'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Transition Of Care Ambulatory Summary Ambulatory
	 * Encounter Diagnoses' of 'Transition Of Care Ambulatory Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_AMBULATORY_ENCOUNTER_DIAGNOSES = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Transition Of Care Ambulatory Summary Reason For
	 * Referral Section' of 'Transition Of Care Ambulatory Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL_SECTION = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Transition Of Care Inpatient Summary Inpatient
	 * Encounter Diagnoses' of 'Transition Of Care Inpatient Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_INPATIENT_SUMMARY__TRANSITION_OF_CARE_INPATIENT_SUMMARY_INPATIENT_ENCOUNTER_DIAGNOSES = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Transition Of Care Inpatient Summary Hospital Admission Diagnosis Entry' of 'Transition Of Care Inpatient Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_INPATIENT_SUMMARY__TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Transition Of Care Inpatient Summary Hospital Discharge Diagnoses Entry' of 'Transition Of Care Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_INPATIENT_SUMMARY__TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSES_ENTRY = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Transition Of Care Inpatient Summary Postoperative Diagnosis Entry' of 'Transition Of Care Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_INPATIENT_SUMMARY__TRANSITION_OF_CARE_INPATIENT_SUMMARY_POSTOPERATIVE_DIAGNOSIS_ENTRY = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Transition Of Care Inpatient Summary Postprocedure Diagnosis Entry' of 'Transition Of Care Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_INPATIENT_SUMMARY__TRANSITION_OF_CARE_INPATIENT_SUMMARY_POSTPROCEDURE_DIAGNOSIS_ENTRY = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Transition Of Care Inpatient Summary Hospital Discharge Instructions Section' of 'Transition Of Care Inpatient Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_INPATIENT_SUMMARY__TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Transition Of Care Inpatient Summary Hospital Discharge Medications Section' of 'Transition Of Care Inpatient Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_INPATIENT_SUMMARY__TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Care Plan Fields' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLAN_FIELDS = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Allergies Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Medications Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MEDICATIONS_SECTION = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Problem Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Procedures Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Vital Signs Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS_SECTION = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Results Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Plan Of Care Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Social History Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate View Download Transmit Summary Assessment And Plan
	 * Section Template Id' of 'View Download Transmit Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Mu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Mu2consol Plan Of Care Section Plan Of Care Activity Observation' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Plan Of Care Section Template Id' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate View Download Transmit Summary Social History
	 * Section Template Id' of 'View Download Transmit Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Mu2consol Social History Section Smoking Status Observation' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Effective Time' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_EFFECTIVE_TIME = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Location' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_LOCATION = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Chief Complaint Or Reason For Visit' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Hospital Admission Diagnosis Entry' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Preoperative Diagnosis Entry' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_ENTRY = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Hospital Discharge Instructions Section' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Hospital Admission Diagnosis Section' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Hospital Discharge Medications Section' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Summary Responsible Party' of 'VDT Ambulatory Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_SUMMARY__VDT_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Result Observation Result Observation Code
	 * Value' of 'Result Observation'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__MU2CONSOL_RESULT_OBSERVATION_RESULT_OBSERVATION_CODE_VALUE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Result Observation Code' of 'Result Observation'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__MU2CONSOL_RESULT_OBSERVATION_CODE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Procedures Section Procedure Activity Procedure' of 'Procedures Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__MU2CONSOL_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_PROCEDURE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedures Section Entries Optional Template Id' of 'Procedures Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Procedure Activity Procedure Code Value' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE_VALUE = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Procedure Activity Procedure Code' of
	 * 'Procedure Activity Procedure'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Procedure Activity Procedure Template Id' of
	 * 'Procedure Activity Procedure'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Result Organizer Result Observation' of 'Result Organizer'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__MU2CONSOL_RESULT_ORGANIZER_RESULT_OBSERVATION = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Results Section Result Organizer' of 'Results Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__MU2CONSOL_RESULTS_SECTION_RESULT_ORGANIZER = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Entries Optional Template Id' of 'Results Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Assessment Section Problem Observation' of 'Assessment Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_SECTION__MU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Section Template Id' of 'Assessment Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_SECTION__ASSESSMENT_SECTION_TEMPLATE_ID = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Social History Section Smoking Status Observation' of 'Social History Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'Social History Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Smoking Status Observation Value P' of 'Smoking Status Observation'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SMOKING_STATUS_OBSERVATION__SMOKING_STATUS_OBSERVATION_VALUE_P = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Smoking Status Observation Value' of 'Smoking Status Observation'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SMOKING_STATUS_OBSERVATION__SMOKING_STATUS_OBSERVATION_VALUE = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tobacco Use Template Id' of 'Smoking Status Observation'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SMOKING_STATUS_OBSERVATION__TOBACCO_USE_TEMPLATE_ID = 53;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 124;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected CDAValidator cdaValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected ConsolValidator consolValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public Mu2consolValidator() {
		super();
		cdaValidator = CDAValidator.INSTANCE;
		consolValidator = ConsolValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Mu2consolPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Mu2consolPackage.GENERAL_HEADER_CONSTRAINTS:
				return validateGeneralHeaderConstraints((GeneralHeaderConstraints)value, diagnostics, context);
			case Mu2consolPackage.SUMMARY_OF_CARE_RECORD:
				return validateSummaryOfCareRecord((SummaryOfCareRecord)value, diagnostics, context);
			case Mu2consolPackage.ENCOUNTERS_SECTION:
				return validateEncountersSection((EncountersSection)value, diagnostics, context);
			case Mu2consolPackage.ENCOUNTER_ACTIVITIES:
				return validateEncounterActivities((EncounterActivities)value, diagnostics, context);
			case Mu2consolPackage.PLAN_OF_CARE_SECTION:
				return validatePlanOfCareSection((PlanOfCareSection)value, diagnostics, context);
			case Mu2consolPackage.ASSESSMENT_AND_PLAN_SECTION:
				return validateAssessmentAndPlanSection((AssessmentAndPlanSection)value, diagnostics, context);
			case Mu2consolPackage.ASSESSMENT_SECTION:
				return validateAssessmentSection((AssessmentSection)value, diagnostics, context);
			case Mu2consolPackage.SOCIAL_HISTORY_SECTION:
				return validateSocialHistorySection((SocialHistorySection)value, diagnostics, context);
			case Mu2consolPackage.SMOKING_STATUS_OBSERVATION:
				return validateSmokingStatusObservation((SmokingStatusObservation)value, diagnostics, context);
			case Mu2consolPackage.RESULTS_SECTION:
				return validateResultsSection((ResultsSection)value, diagnostics, context);
			case Mu2consolPackage.RESULT_ORGANIZER:
				return validateResultOrganizer((ResultOrganizer)value, diagnostics, context);
			case Mu2consolPackage.RESULT_OBSERVATION:
				return validateResultObservation((ResultObservation)value, diagnostics, context);
			case Mu2consolPackage.PROCEDURES_SECTION:
				return validateProceduresSection((ProceduresSection)value, diagnostics, context);
			case Mu2consolPackage.PROCEDURE_ACTIVITY_PROCEDURE:
				return validateProcedureActivityProcedure((ProcedureActivityProcedure)value, diagnostics, context);
			case Mu2consolPackage.CLINICAL_OFFICE_VISIT_SUMMARY:
				return validateClinicalOfficeVisitSummary((ClinicalOfficeVisitSummary)value, diagnostics, context);
			case Mu2consolPackage.TRANSITION_OF_CARE_AMBULATORY_SUMMARY:
				return validateTransitionOfCareAmbulatorySummary((TransitionOfCareAmbulatorySummary)value, diagnostics, context);
			case Mu2consolPackage.TRANSITION_OF_CARE_INPATIENT_SUMMARY:
				return validateTransitionOfCareInpatientSummary((TransitionOfCareInpatientSummary)value, diagnostics, context);
			case Mu2consolPackage.VIEW_DOWNLOAD_TRANSMIT_SUMMARY:
				return validateViewDownloadTransmitSummary((ViewDownloadTransmitSummary)value, diagnostics, context);
			case Mu2consolPackage.VDT_INPATIENT_SUMMARY:
				return validateVDTInpatientSummary((VDTInpatientSummary)value, diagnostics, context);
			case Mu2consolPackage.VDT_AMBULATORY_SUMMARY:
				return validateVDTAmbulatorySummary((VDTAmbulatorySummary)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalHeaderConstraints, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(generalHeaderConstraints, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolGeneralHeaderConstraintsRecordTarget constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateMu2consolGeneralHeaderConstraintsRecordTarget(diagnostics, context);
	}

	/**
	 * Validates the validateMu2consolGeneralHeaderConstraintsDocumentationOf constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateMu2consolGeneralHeaderConstraintsDocumentationOf(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsDocumentationOfServiceEvent constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsDocumentationOfServiceEvent(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsComponent1EncompassingEncounter constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsComponent1EncompassingEncounter(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRolePatient constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRole constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTargetPatientRole(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(summaryOfCareRecord, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCarePlanning(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCognitiveStatusEntries(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordFunctionalStatusEntries(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAllergiesSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordImmunizationsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordVitalSignsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation(summaryOfCareRecord, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSummaryOfCareRecordCarePlanning constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordCarePlanning(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordCarePlanning(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordCognitiveStatusEntries constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordCognitiveStatusEntries(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordCognitiveStatusEntries(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordFunctionalStatusEntries constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordFunctionalStatusEntries(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordFunctionalStatusEntries(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordPlanOfCareSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordProblemSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordProblemSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordAllergiesSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordAllergiesSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordAllergiesSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordImmunizationsSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordImmunizationsSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordMedicationsSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordSocialHistorySection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordResultsSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordVitalSignsSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordVitalSignsSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordProceduresSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordProceduresSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordSocialHistorySectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySectionTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordAssessmentSectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentSectionTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordAssessmentSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection(
			EncountersSection encountersSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encountersSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_validateEncountersSectionEntriesOptionalTemplateId(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalCode(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalCodeP(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalTitle(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalText(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalEncounterActivities(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncountersSection_validateEncountersSectionCodeP(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncountersSection_validateEncountersSectionCode(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncountersSection_validateEncountersSectionText(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncountersSection_validateEncountersSectionTitle(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncountersSection_validateEncountersSectionEncounterActivities(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_validateMu2consolEncountersSectionEncounterActivities(encountersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolEncountersSectionEncounterActivities constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateMu2consolEncountersSectionEncounterActivities(
			EncountersSection encountersSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return encountersSection.validateMu2consolEncountersSectionEncounterActivities(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersSectionEntriesOptionalTemplateId constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateEncountersSectionEntriesOptionalTemplateId(
			EncountersSection encountersSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return encountersSection.validateEncountersSectionEntriesOptionalTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivities(
			EncounterActivities encounterActivities,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encounterActivities, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesCodeOriginalText(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesCodeOriginalTextReference(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesReferenceValue(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesCodeOriginalTextReferenceValue(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesServiceDeliveryTypeCode(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncounterActivities_validateEncounterActivitiesTemplateId(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesClassCode(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesMoodCode(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesId(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesCode(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesEffectiveTime(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesServiceDeliveryLocation(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesIndication(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesEncounterPerformer(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesEncounterDiagnosis(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateEncounterActivities_validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(encounterActivities, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncounterActivities_validateMu2consolEncounterActivitiesCodeValue(encounterActivities, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolEncounterActivitiesCodeValue constraint of '<em>Encounter Activities</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivities_validateMu2consolEncounterActivitiesCodeValue(
			EncounterActivities encounterActivities,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterActivities.validateMu2consolEncounterActivitiesCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterActivitiesTemplateId constraint of '
	 * <em>Encounter Activities</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public boolean validateEncounterActivities_validateEncounterActivitiesTemplateId(
			EncounterActivities encounterActivities,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterActivities.validateEncounterActivitiesTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordPlanOfCareSectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSectionTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordPlanOfCareSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validatePlanOfCareSectionTemplateId(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionCode(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionCodeP(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionTitle(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionText(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionInstructions(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation(planOfCareSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareSection.validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(diagnostics, context);
	}

	/**
	 * Validates the validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareSection.validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionTemplateId constraint of '
	 * <em>Plan Of Care Section</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionTemplateId(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection(
			AssessmentAndPlanSection assessmentAndPlanSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessmentAndPlanSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCodeP(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionText(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionPlanOfCareActivityAct(assessmentAndPlanSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAssessmentAndPlanSectionTemplateId constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(
			AssessmentAndPlanSection assessmentAndPlanSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentAndPlanSection.validateAssessmentAndPlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clinicalOfficeVisitSummary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryResponsibleParty(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryReasonForOfficeVisit(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryCarePlanning(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryEffectiveTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryLocation(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryInstructionsEntry(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationsAdministeredEntry(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryProblemSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationsSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryAllergiesSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryResultsSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryVitalSignsSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryPlanOfCareSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryProceduresSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryImmunizationsSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryInstructionsSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarySocialHistorySection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(clinicalOfficeVisitSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryResponsibleParty
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryResponsibleParty(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryResponsibleParty(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryLocation constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryLocation(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryLocation(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryReasonForOfficeVisit
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryReasonForOfficeVisit(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryReasonForOfficeVisit(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryCarePlanning constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryCarePlanning(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryCarePlanning(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryEffectiveTime constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryEffectiveTime(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryInstructionsEntry constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryInstructionsEntry(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryInstructionsEntry(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryMedicationsAdministeredEntry constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationsAdministeredEntry(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryMedicationsAdministeredEntry(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummarySocialHistorySection
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarySocialHistorySection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummarySocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryProblemSection constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryProblemSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryProblemSection(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryMedicationsSection
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryAllergiesSection
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryAllergiesSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryAllergiesSection(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryResultsSection constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryResultsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryVitalSignsSection
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryVitalSignsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryPlanOfCareSection
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryPlanOfCareSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryProceduresSection
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryProceduresSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryProceduresSection(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryImmunizationsSection
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryImmunizationsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummaryMedicationsAdministeredSection
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryInstructionsSection
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryInstructionsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryInstructionsSection(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareAmbulatorySummary(
			TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transitionOfCareAmbulatorySummary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCarePlanning(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCognitiveStatusEntries(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordFunctionalStatusEntries(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAllergiesSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordImmunizationsSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordVitalSignsSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareAmbulatorySummary_validateTransitionOfCareAmbulatorySummaryResponsibleParty(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareAmbulatorySummary_validateTransitionOfCareAmbulatorySummaryAmbulatoryEncounterDiagnoses(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareAmbulatorySummary_validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTransitionOfCareAmbulatorySummaryResponsibleParty
	 * constraint of '<em>Transition Of Care Ambulatory Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTransitionOfCareAmbulatorySummary_validateTransitionOfCareAmbulatorySummaryResponsibleParty(
			TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transitionOfCareAmbulatorySummary.validateTransitionOfCareAmbulatorySummaryResponsibleParty(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateTransitionOfCareAmbulatorySummaryAmbulatoryEncounterDiagnoses
	 * constraint of '<em>Transition Of Care Ambulatory Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTransitionOfCareAmbulatorySummary_validateTransitionOfCareAmbulatorySummaryAmbulatoryEncounterDiagnoses(
			TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transitionOfCareAmbulatorySummary.validateTransitionOfCareAmbulatorySummaryAmbulatoryEncounterDiagnoses(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateTransitionOfCareAmbulatorySummaryReasonForReferralSection
	 * constraint of '<em>Transition Of Care Ambulatory Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTransitionOfCareAmbulatorySummary_validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(
			TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transitionOfCareAmbulatorySummary.validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummary(
			TransitionOfCareInpatientSummary transitionOfCareInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transitionOfCareInpatientSummary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCarePlanning(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCognitiveStatusEntries(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordFunctionalStatusEntries(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAllergiesSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordImmunizationsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordVitalSignsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection(transitionOfCareInpatientSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses
	 * constraint of '<em>Transition Of Care Inpatient Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses(
			TransitionOfCareInpatientSummary transitionOfCareInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transitionOfCareInpatientSummary.validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry
	 * constraint of '<em>Transition Of Care Inpatient Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry(
			TransitionOfCareInpatientSummary transitionOfCareInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transitionOfCareInpatientSummary.validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry(diagnostics, context);
	}

	/**
	 * Validates the validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry constraint of '<em>Transition Of Care Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry(TransitionOfCareInpatientSummary transitionOfCareInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transitionOfCareInpatientSummary.validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry(diagnostics, context);
	}

	/**
	 * Validates the validateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry constraint of '<em>Transition Of Care Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry(TransitionOfCareInpatientSummary transitionOfCareInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transitionOfCareInpatientSummary.validateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry(diagnostics, context);
	}

	/**
	 * Validates the validateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry constraint of '<em>Transition Of Care Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry(TransitionOfCareInpatientSummary transitionOfCareInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transitionOfCareInpatientSummary.validateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection
	 * constraint of '<em>Transition Of Care Inpatient Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(
			TransitionOfCareInpatientSummary transitionOfCareInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transitionOfCareInpatientSummary.validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection
	 * constraint of '<em>Transition Of Care Inpatient Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection(
			TransitionOfCareInpatientSummary transitionOfCareInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transitionOfCareInpatientSummary.validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(viewDownloadTransmitSummary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryCarePlanFields(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAllergiesSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMedicationsSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProblemSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProceduresSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryVitalSignsSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryResultsSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(viewDownloadTransmitSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryCarePlanFields
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryCarePlanFields(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryCarePlanFields(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryAllergiesSection
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAllergiesSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryAllergiesSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryMedicationsSection
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMedicationsSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryProblemSection
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProblemSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryProblemSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryProceduresSection
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProceduresSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryProceduresSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryVitalSignsSection
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryVitalSignsSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryResultsSection
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryResultsSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryPlanOfCareSection
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummarySocialHistorySection
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummarySocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateViewDownloadTransmitSummarySocialHistorySectionTemplateId
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation
	 * constraint of '<em>View Download Transmit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vdtInpatientSummary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryCarePlanFields(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAllergiesSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMedicationsSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProblemSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProceduresSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryVitalSignsSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryResultsSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryEffectiveTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryLocation(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryPreoperativeDiagnosisEntry(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalDischargeInstructionsSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalDischargeMedicationsSection(vdtInpatientSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVDTInpatientSummaryEffectiveTime constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryEffectiveTime(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummaryLocation constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryLocation(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryLocation(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummaryChiefComplaintOrReasonForVisit constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummaryPreoperativeDiagnosisEntry constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryPreoperativeDiagnosisEntry(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryPreoperativeDiagnosisEntry(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummaryHospitalDischargeInstructionsSection constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalDischargeInstructionsSection(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryHospitalDischargeInstructionsSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummaryHospitalDischargeMedicationsSection constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalDischargeMedicationsSection(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryHospitalDischargeMedicationsSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatorySummary(
			VDTAmbulatorySummary vdtAmbulatorySummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vdtAmbulatorySummary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryCarePlanFields(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAllergiesSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMedicationsSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProblemSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProceduresSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryVitalSignsSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryResultsSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatorySummary_validateVDTAmbulatorySummaryResponsibleParty(vdtAmbulatorySummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVDTAmbulatorySummaryResponsibleParty constraint of '<em>VDT Ambulatory Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatorySummary_validateVDTAmbulatorySummaryResponsibleParty(
			VDTAmbulatorySummary vdtAmbulatorySummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatorySummary.validateVDTAmbulatorySummaryResponsibleParty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation(
			ResultObservation resultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationTextReference(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationReferenceValue(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationTextReferenceValue(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationCodeValue(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationAuthorMultiplicity(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationTemplateId(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationClassCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationMoodCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationId(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationText(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationStatusCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationStatusCodeP(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationEffectiveTime(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationValue(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationInterpretationCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationMethodCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultObservation_validateResultObservationTargetSiteCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateMu2consolResultObservationResultObservationCodeValue(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateMu2consolResultObservationCode(resultObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolResultObservationResultObservationCodeValue constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateMu2consolResultObservationResultObservationCodeValue(
			ResultObservation resultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return resultObservation.validateMu2consolResultObservationResultObservationCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validateMu2consolResultObservationCode constraint of '
	 * <em>Result Observation</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public boolean validateResultObservation_validateMu2consolResultObservationCode(
			ResultObservation resultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return resultObservation.validateMu2consolResultObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '
	 * <em>Result Observation</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationTemplateId(
			ResultObservation resultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return resultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection(
			ProceduresSection proceduresSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(proceduresSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceduresSection_validateProceduresSectionEntriesOptionalTemplateId(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalCode(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalCodeP(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalTitle(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalText(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalProcedureActivityProcedure(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalProcedureAcivityObservation(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalProcedureActivityAct(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSection_validateProceduresSectionHasProcedureActivity(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSection_validateProceduresSectionTitle(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSection_validateProceduresSectionCodeP(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSection_validateProceduresSectionCode(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSection_validateProceduresSectionText(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSection_validateProceduresSectionProcedureActivityProcedure(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSection_validateProceduresSectionProcedureActivityObservation(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProceduresSection_validateProceduresSectionProcedureActivityAct(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceduresSection_validateMu2consolProceduresSectionProcedureActivityProcedure(proceduresSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolProceduresSectionProcedureActivityProcedure constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_validateMu2consolProceduresSectionProcedureActivityProcedure(
			ProceduresSection proceduresSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return proceduresSection.validateMu2consolProceduresSectionProcedureActivityProcedure(diagnostics, context);
	}

	/**
	 * Validates the validateProceduresSectionEntriesOptionalTemplateId constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_validateProceduresSectionEntriesOptionalTemplateId(
			ProceduresSection proceduresSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return proceduresSection.validateProceduresSectionEntriesOptionalTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure(
			ProcedureActivityProcedure procedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procedureActivityProcedure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureCodeCodeSystems(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureCodeOriginalText(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureOriginalTextReference(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureOriginalTextReferenceValue(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureReferenceValue(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEncounterInversion(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProductInstanceTypeCode(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureServiceDeliveryLocationTypeCode(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureInstructionsInversion(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureClassCode(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureMoodCode(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureId(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureCode(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureStatusCode(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEffectiveTime(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedurePriorityCodeP(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedurePriorityCode(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureMethodCode(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureTargetSiteCodeP(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureTargetSiteCode(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureIndication(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureSpecimen(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureServiceDeliveryLocation(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedurePerformer(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureMedicationActivity(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedurePatientInstruction(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProductInstance(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationship(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureSpecimenSpecimenRole(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureSpecimenSpecimentRoleId(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntity(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntityId(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntityAddr(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntityTelecom(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntityRepOrg(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntityRepOrgId(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntityRepOrgName(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntityRepOrgAddr(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntityRepOrgTelecom(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterClassCode(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterMoodCode(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterId(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationshipInversionInd(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationshipTypeCode(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounter(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityProcedure_validateMu2consolProcedureActivityProcedureCodeValue(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityProcedure_validateMu2consolProcedureActivityProcedureCode(procedureActivityProcedure, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolProcedureActivityProcedureCodeValue
	 * constraint of '<em>Procedure Activity Procedure</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateMu2consolProcedureActivityProcedureCodeValue(
			ProcedureActivityProcedure procedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityProcedure.validateMu2consolProcedureActivityProcedureCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validateMu2consolProcedureActivityProcedureCode constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateMu2consolProcedureActivityProcedureCode(
			ProcedureActivityProcedure procedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityProcedure.validateMu2consolProcedureActivityProcedureCode(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureTemplateId constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(
			ProcedureActivityProcedure procedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultOrganizer_validateResultOrganizerCodeValue(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultOrganizer_validateResultOrganizerClassCodeValue(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerTemplateId(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultOrganizer_validateResultOrganizerClassCode(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultOrganizer_validateResultOrganizerMoodCode(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultOrganizer_validateResultOrganizerId(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultOrganizer_validateResultOrganizerStatusCodeP(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultOrganizer_validateResultOrganizerStatusCode(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultOrganizer_validateResultOrganizerCode(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultOrganizer_validateResultOrganizerResultObservation(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateMu2consolResultOrganizerResultObservation(resultOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolResultOrganizerResultObservation constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateMu2consolResultOrganizerResultObservation(
			ResultOrganizer resultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return resultOrganizer.validateMu2consolResultOrganizerResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerTemplateId(
			ResultOrganizer resultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection(ResultsSection resultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultsSection_validateResultsSectionEntriesOptionalTemplateId(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultsSectionEntriesOptional_validateResultsSectionEntriesOptionalCode(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultsSectionEntriesOptional_validateResultsSectionEntriesOptionalCodeP(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultsSectionEntriesOptional_validateResultsSectionEntriesOptionalTitle(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultsSectionEntriesOptional_validateResultsSectionEntriesOptionalText(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultsSectionEntriesOptional_validateResultsSectionEntriesOptionalResultOrganizer(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultsSection_validateResultsSectionCodeP(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultsSection_validateResultsSectionCode(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultsSection_validateResultsSectionTitle(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultsSection_validateResultsSectionText(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateResultsSection_validateResultsSectionResultOrganizer(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultsSection_validateMu2consolResultsSectionResultOrganizer(resultsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolResultsSectionResultOrganizer constraint
	 * of '<em>Results Section</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public boolean validateResultsSection_validateMu2consolResultsSectionResultOrganizer(
			ResultsSection resultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return resultsSection.validateMu2consolResultsSectionResultOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionEntriesOptionalTemplateId constraint
	 * of '<em>Results Section</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public boolean validateResultsSection_validateResultsSectionEntriesOptionalTemplateId(
			ResultsSection resultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return resultsSection.validateResultsSectionEntriesOptionalTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentSection(
			AssessmentSection assessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessmentSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentSection_validateAssessmentSectionTemplateId(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentSection_validateAssessmentSectionCode(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentSection_validateAssessmentSectionCodeP(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentSection_validateAssessmentSectionText(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentSection_validateAssessmentSectionTitle(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentSection_validateMu2consolAssessmentSectionProblemObservation(assessmentSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolAssessmentSectionProblemObservation constraint of '<em>Assessment Section</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentSection_validateMu2consolAssessmentSectionProblemObservation(
			AssessmentSection assessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return assessmentSection.validateMu2consolAssessmentSectionProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentSectionTemplateId constraint of '
	 * <em>Assessment Section</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public boolean validateAssessmentSection_validateAssessmentSectionTemplateId(
			AssessmentSection assessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return assessmentSection.validateAssessmentSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection(
			SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(socialHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistorySection_validateSocialHistorySectionTemplateId(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateSocialHistorySection_validateSocialHistorySectionCode(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateSocialHistorySection_validateSocialHistorySectionCodeP(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateSocialHistorySection_validateSocialHistorySectionText(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateSocialHistorySection_validateSocialHistorySectionPregnancyObservation(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateSocialHistorySection_validateSocialHistorySectionSmokingStatusObservation(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateSocialHistorySection_validateSocialHistorySectionTobaccoUse(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistorySection_validateMu2consolSocialHistorySectionSmokingStatusObservation(socialHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolSocialHistorySectionSmokingStatusObservation constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateMu2consolSocialHistorySectionSmokingStatusObservation(
			SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateMu2consolSocialHistorySectionSmokingStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionTemplateId constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionTemplateId(
			SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservation(
			SmokingStatusObservation smokingStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(smokingStatusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateTobaccoUse_validateTobaccoUseEffectiveTimeLow(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSmokingStatusObservation_validateTobaccoUseTemplateId(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateTobaccoUse_validateTobaccoUseClassCode(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateTobaccoUse_validateTobaccoUseMoodCode(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateTobaccoUse_validateTobaccoUseCodeP(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateTobaccoUse_validateTobaccoUseCode(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateTobaccoUse_validateTobaccoUseEffectiveTime(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateTobaccoUse_validateTobaccoUseStatusCode(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateTobaccoUse_validateTobaccoUseStatusCodeP(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateTobaccoUse_validateTobaccoUseValue(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateTobaccoUse_validateTobaccoUseValueP(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSmokingStatusObservation_validateSmokingStatusObservationValueP(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSmokingStatusObservation_validateSmokingStatusObservationValue(smokingStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSmokingStatusObservationValueP constraint of '<em>Smoking Status Observation</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservation_validateSmokingStatusObservationValueP(
			SmokingStatusObservation smokingStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return smokingStatusObservation.validateSmokingStatusObservationValueP(diagnostics, context);
	}

	/**
	 * Validates the validateSmokingStatusObservationValue constraint of '<em>Smoking Status Observation</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservation_validateSmokingStatusObservationValue(
			SmokingStatusObservation smokingStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return smokingStatusObservation.validateSmokingStatusObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateTobaccoUseTemplateId constraint of '<em>Smoking Status Observation</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservation_validateTobaccoUseTemplateId(
			SmokingStatusObservation smokingStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return smokingStatusObservation.validateTobaccoUseTemplateId(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Mu2consolPlugin.INSTANCE;
	}

} // Mu2consolValidator
