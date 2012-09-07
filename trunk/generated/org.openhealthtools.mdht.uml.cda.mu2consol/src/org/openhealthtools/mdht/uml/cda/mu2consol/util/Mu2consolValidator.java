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
import org.openhealthtools.mdht.uml.cda.mu2consol.*;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Documentation Of Service Event Performer' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Documentation Of Service Event' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Component1 Encompassing Encounter Encounter Participant' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COMPONENT1_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Component1 Encompassing Encounter' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COMPONENT1_ENCOMPASSING_ENCOUNTER = 8;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code P' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient Race Code P' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Mu2 Encounter Diagnoses Requirements' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Care Planning' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CARE_PLANNING = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Reason For Hospitalization'
	 * of 'Summary Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_REASON_FOR_HOSPITALIZATION = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Plan Of Care Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Problem Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Allergies Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_ALLERGIES_SECTION = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Immunizations Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Medications Administered Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Medications Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATIONS_SECTION = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Hospital Discharge Medications Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Social History Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Results Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_RESULTS_SECTION = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Vital Signs Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_VITAL_SIGNS_SECTION = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Procedures Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Functional Status Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_SECTION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Social History Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Social History
	 * Section Smoking Status Observation' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Hospital Admission Medications Section Entries Optional Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Assessment Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_ASSESSMENT_SECTION_TEMPLATE_ID = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Assessment Section Problem Observation' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Hospital Admission Diagnosis Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Hospital Discharge Diagnosis Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Postoperative Diagnosis Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Postoperative
	 * Diagnosis Section Problem Observation' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Postprocedure Diagnosis Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Preoperative Diagnosis Section Preoperative Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Functional Status Section Cognitive Status' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Functional Status Section Functional Status' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Functional Status Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Functional Status Section Cognitive Status Problem Observation' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_PROBLEM_OBSERVATION = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Functional Status Section Cognitive Status Result Observation' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_OBSERVATION = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Functional Status Section Cognitive Status Result Organizer' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_ORGANIZER = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Functional Status Section Functional Status Problem Observation' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Functional Status Section Functional Status Result Observation' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Functional Status Section Functional Status Result Organizer' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Medications Administered Section Medication Activity' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Assessment And Plan Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Hospital Admission Medications Section Entries Optional Admission Medication' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Plan Of Care Section
	 * Care Planning For Plan Of Care' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Plan Of Care Section Mu2consol Plan Of Care Section Plan Of Care Activity Observation' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Plan Of Care Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Medications Administered Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Postprocedure Diagnosis Section Postprocedure Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Preoperative Diagnosis Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PREOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Plan Of Care Section Mu2consol Plan Of Care Section Plan Of Care Activity Observation' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__MU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Template Id' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEMPLATE_ID = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Assessment And Plan For Care Planning One Of Plan Of
	 * Care Entry' of 'Assessment And Plan For Care Planning'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING__ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING_ONE_OF_PLAN_OF_CARE_ENTRY = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Assessment And Plan For Condition Or Concern Problem
	 * Observation' of 'Assessment And Plan For Condition Or Concern'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN__ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN_PROBLEM_OBSERVATION = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Assessment And Plan Section Template Id' of
	 * 'Assessment And Plan Section'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Instructions Section Instructions' of 'Instructions Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTRUCTIONS_SECTION__MU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Instructions Section Template Id' of 'Instructions Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTRUCTIONS_SECTION__INSTRUCTIONS_SECTION_TEMPLATE_ID = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Responsible Party' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Location' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Reason For Office Visit' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Care Planning' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Effective Time' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_EFFECTIVE_TIME = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Plan Of Care Act Or Encounter' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_ACT_OR_ENCOUNTER = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Social History Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Problem Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Medications Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_SECTION = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Allergies Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Results Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Vital Signs Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS_SECTION = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Plan Of Care Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Procedures Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Immunizations Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Medications Administered Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Instructions Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Social History Section Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summarymu2consol Social History Section Smoking Status Observation' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summarymu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summarymu2consol Plan Of Care Section Mu2consol Plan Of Care Section Plan Of Care Activity Observation' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Plan Of Care Section Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Medications Administered Section Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summarymu2consol Medications Administered Section Medication Activity' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Clinical Office Visit Summary Assessment And Plan
	 * Section Template Id' of 'Clinical Office Visit Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Instructions Section Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION_TEMPLATE_ID = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Clinical Office Visit Summarymu2consol Instructions
	 * Section Instructions' of 'Clinical Office Visit Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Responsible Party' of
	 * 'VDT Inpatient Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_RESPONSIBLE_PARTY = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Medication List' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Can Have Either Vital
	 * Signs Requied Or Optional Entry' of 'VDT Inpatient Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Can Have Either Allergy
	 * Required Or Optional Entry' of 'VDT Inpatient Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Social History Section' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Problem Section' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_PROBLEM_SECTION = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Results Section' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_RESULTS_SECTION = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Plan Of Care Section' of
	 * 'VDT Inpatient Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Procedures Section' of
	 * 'VDT Inpatient Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_PROCEDURES_SECTION = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Social History Section Template Id' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Infomu2consol Social History
	 * Section Smoking Status Observation' of 'VDT Inpatient Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Hospital Admission Medications Section Entries Optional Template Id' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Infomu2consol Hospital
	 * Admission Medications Section Entries Optional Admission Medication' of
	 * 'VDT Inpatient Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Infomu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Infomu2consol Plan Of Care Section Mu2consol Plan Of Care Section Plan Of Care Activity Observation' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Plan Of Care Section Template Id' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Medication List' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_MEDICATION_LIST = 144;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Medication Allergy' of
	 * 'VDT Ambulatory Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_MEDICATION_ALLERGY = 145;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Can Have Either Vital
	 * Signs Requied Or Optional Entry' of 'VDT Ambulatory Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY = 146;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Can Have Either Allergy
	 * Required Or Optional Entry' of 'VDT Ambulatory Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY = 147;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Can Have Either Encounters Required Or Optional Entry' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_CAN_HAVE_EITHER_ENCOUNTERS_REQUIRED_OR_OPTIONAL_ENTRY = 148;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Reason For Hospitalization' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_REASON_FOR_HOSPITALIZATION = 149;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Social History Section' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_SOCIAL_HISTORY_SECTION = 150;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Problem Section' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_PROBLEM_SECTION = 151;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Results Section' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_RESULTS_SECTION = 152;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Plan Of Care Section' of
	 * 'VDT Ambulatory Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_PLAN_OF_CARE_SECTION = 153;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Procedures Section' of
	 * 'VDT Ambulatory Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_PROCEDURES_SECTION = 154;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Hospital Discharge
	 * Instructions Section' of 'VDT Ambulatory Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION = 155;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Social History Section Template Id' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 156;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Infomu2consol Social History Section Smoking Status Observation' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 157;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Hospital Admission Medications Section Entries Optional Template Id' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 158;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Infomu2consol Hospital
	 * Admission Medications Section Entries Optional Admission Medication' of
	 * 'VDT Ambulatory Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 159;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Infomu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 160;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Infomu2consol Plan Of Care Section Mu2consol Plan Of Care Section Plan Of Care Activity Observation' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 161;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Plan Of Care Section Template Id' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 162;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Hospital Admission
	 * Diagnosis Section Template Id' of 'VDT Ambulatory Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 163;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Infomu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS = 164;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Transition Of Care Ambulatory Summary Responsible Party' of 'Transition Of Care Ambulatory Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY = 165;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Transition Of Care Ambulatory Summary Reason For
	 * Referral Section' of 'Transition Of Care Ambulatory Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL_SECTION = 166;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Transition Of Care Inpatient Summary Hospital Discharge Instructions Section' of 'Transition Of Care Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_INPATIENT_SUMMARY__TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION = 167;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Medication Allergy' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MEDICATION_ALLERGY = 168;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Care Plan Fields' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLAN_FIELDS = 169;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Allergies Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION = 170;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Medications Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MEDICATIONS_SECTION = 171;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Hospital Discharge Medications Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = 172;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Problem Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION = 173;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Procedures Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION = 174;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Vital Signs Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS_SECTION = 175;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Results Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION = 176;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Plan Of Care Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION = 177;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Social History Section' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION = 178;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Assessment And Plan Section Template Id' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 179;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summarymu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 180;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summarymu2consol Plan Of Care Section Mu2consol Plan Of Care Section Plan Of Care Activity Observation' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 181;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Plan Of Care Section Template Id' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 182;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summary Social History Section Template Id' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 183;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate View Download Transmit Summarymu2consol Social History Section Smoking Status Observation' of 'View Download Transmit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARYMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 184;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Effective Time' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_EFFECTIVE_TIME = 185;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Location' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_LOCATION = 186;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Chief Complaint Or Reason For Visit' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT = 187;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Hospital Discharge Instructions Section' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION = 188;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Hospital Admission Diagnosis Section' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION = 189;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summary Hospital Admission Diagnosis Section Template Id' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 190;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Summarymu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis' of 'VDT Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARYMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS = 191;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Summary Responsible Party' of 'VDT Ambulatory Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_SUMMARY__VDT_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY = 192;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Assessment Section Problem Observation' of 'Assessment Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_SECTION__MU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Section Template Id' of 'Assessment Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_SECTION__ASSESSMENT_SECTION_TEMPLATE_ID = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Admission Diagnosis Section Template Id' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis' of 'Hospital Discharge Diagnosis Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Discharge Diagnosis Section Template Id' of 'Hospital Discharge Diagnosis Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Postoperative Diagnosis Section Problem Observation' of 'Postoperative Diagnosis Section'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POSTOPERATIVE_DIAGNOSIS_SECTION__MU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Postoperative Diagnosis Section Template Id' of 'Postoperative Diagnosis Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int POSTOPERATIVE_DIAGNOSIS_SECTION__POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Postprocedure Diagnosis Section
	 * Postprocedure Diagnosis' of 'Postprocedure Diagnosis Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int POSTPROCEDURE_DIAGNOSIS_SECTION__MU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Postprocedure Diagnosis Section Template Id' of 'Postprocedure Diagnosis Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int POSTPROCEDURE_DIAGNOSIS_SECTION__POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Functional Status Section Cognitive Status' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__MU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Functional Status Section Functional Status' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__MU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Functional Status Section Cognitive Status Problem Observation' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__MU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_PROBLEM_OBSERVATION = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Functional Status Section Cognitive Status Result Observation' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__MU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_OBSERVATION = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Functional Status Section Cognitive Status Result Organizer' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__MU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_ORGANIZER = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Functional Status Section Functional Status Problem Observation' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__MU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Functional Status Section Functional Status Result Observation' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__MU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Functional Status Section Functional Status Result Organizer' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__MU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Template Id' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Preoperative Diagnosis Section
	 * Preoperative Diagnosis' of 'Preoperative Diagnosis Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PREOPERATIVE_DIAGNOSIS_SECTION__MU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Preoperative Diagnosis Section Template Id' of 'Preoperative Diagnosis Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int PREOPERATIVE_DIAGNOSIS_SECTION__PREOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Medications Administered Section
	 * Medication Activity' of 'Medications Administered Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__MU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Administered Section Template Id' of 'Medications Administered Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Hospital Admission Medications Section Entries Optional Admission Medication' of 'Hospital Admission Medications Section Entries Optional'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__MU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Admission Medications Section Entries Optional Template Id' of 'Hospital Admission Medications Section Entries Optional'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Social History Section Smoking Status Observation' of 'Social History Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'Social History Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Allergies Section Entries Optional Allergy Problem Act' of 'Allergies Section Entries Optional'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_SECTION_ENTRIES_OPTIONAL__MU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergies Section Entries Optional Template Id' of 'Allergies Section Entries Optional'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_SECTION_ENTRIES_OPTIONAL__ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 99;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 192;

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
			case Mu2consolPackage.PLAN_OF_CARE_SECTION:
				return validatePlanOfCareSection((PlanOfCareSection)value, diagnostics, context);
			case Mu2consolPackage.ASSESSMENT_AND_PLAN_SECTION:
				return validateAssessmentAndPlanSection((AssessmentAndPlanSection)value, diagnostics, context);
			case Mu2consolPackage.ASSESSMENT_SECTION:
				return validateAssessmentSection((AssessmentSection)value, diagnostics, context);
			case Mu2consolPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION:
				return validateHospitalAdmissionDiagnosisSection((HospitalAdmissionDiagnosisSection)value, diagnostics, context);
			case Mu2consolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION:
				return validateHospitalDischargeDiagnosisSection((HospitalDischargeDiagnosisSection)value, diagnostics, context);
			case Mu2consolPackage.POSTOPERATIVE_DIAGNOSIS_SECTION:
				return validatePostoperativeDiagnosisSection((PostoperativeDiagnosisSection)value, diagnostics, context);
			case Mu2consolPackage.PREOPERATIVE_DIAGNOSIS_SECTION:
				return validatePreoperativeDiagnosisSection((PreoperativeDiagnosisSection)value, diagnostics, context);
			case Mu2consolPackage.MEDICATIONS_ADMINISTERED_SECTION:
				return validateMedicationsAdministeredSection((MedicationsAdministeredSection)value, diagnostics, context);
			case Mu2consolPackage.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL:
				return validateHospitalAdmissionMedicationsSectionEntriesOptional((HospitalAdmissionMedicationsSectionEntriesOptional)value, diagnostics, context);
			case Mu2consolPackage.SOCIAL_HISTORY_SECTION:
				return validateSocialHistorySection((SocialHistorySection)value, diagnostics, context);
			case Mu2consolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION:
				return validatePostprocedureDiagnosisSection((PostprocedureDiagnosisSection)value, diagnostics, context);
			case Mu2consolPackage.FUNCTIONAL_STATUS_SECTION:
				return validateFunctionalStatusSection((FunctionalStatusSection)value, diagnostics, context);
			case Mu2consolPackage.ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING:
				return validateAssessmentAndPlanForCarePlanning((AssessmentAndPlanForCarePlanning)value, diagnostics, context);
			case Mu2consolPackage.ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN:
				return validateAssessmentAndPlanForConditionOrConcern((AssessmentAndPlanForConditionOrConcern)value, diagnostics, context);
			case Mu2consolPackage.INSTRUCTIONS_SECTION:
				return validateInstructionsSection((InstructionsSection)value, diagnostics, context);
			case Mu2consolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL:
				return validateAllergiesSectionEntriesOptional((AllergiesSectionEntriesOptional)value, diagnostics, context);
			case Mu2consolPackage.CLINICAL_OFFICE_VISIT_SUMMARY:
				return validateClinicalOfficeVisitSummary((ClinicalOfficeVisitSummary)value, diagnostics, context);
			case Mu2consolPackage.VDT_INPATIENT_PATIENT_INFO:
				return validateVDTInpatientPatientInfo((VDTInpatientPatientInfo)value, diagnostics, context);
			case Mu2consolPackage.VDT_AMBULATORY_PATIENT_INFO:
				return validateVDTAmbulatoryPatientInfo((VDTAmbulatoryPatientInfo)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHALL(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHOULD(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientNameMixedContent(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(generalHeaderConstraints, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(generalHeaderConstraints, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(generalHeaderConstraints, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(generalHeaderConstraints, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportUseINDRoleclassCodes(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(generalHeaderConstraints, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsComponent1EncompassingEncounter constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsComponent1EncompassingEncounter(diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHALL(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHOULD(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientNameMixedContent(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateGeneralHeaderConstraintsTemplateId(summaryOfCareRecord, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(summaryOfCareRecord, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(summaryOfCareRecord, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(summaryOfCareRecord, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportUseINDRoleclassCodes(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCarePlanning(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordReasonForHospitalization(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAllergiesSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordImmunizationsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeMedicationsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordVitalSignsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordFunctionalStatusSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordFunctionalStatusSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusProblemObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(summaryOfCareRecord, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordReasonForHospitalization constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordReasonForHospitalization(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordReasonForHospitalization(diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordAllergiesSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * Validates the validateSummaryOfCareRecordMedicationsAdministeredSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMedicationsAdministeredSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordMedicationsSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordHospitalDischargeMedicationsSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeMedicationsSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordHospitalDischargeMedicationsSection(diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordVitalSignsSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * Validates the validateSummaryOfCareRecordFunctionalStatusSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordFunctionalStatusSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordFunctionalStatusSection(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordFunctionalStatusSectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordFunctionalStatusSectionTemplateId(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordFunctionalStatusSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusProblemObservation constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusProblemObservation(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservation constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservation(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservation constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservation(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateGeneralHeaderConstraintsTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanForCarePlanning(
			AssessmentAndPlanForCarePlanning assessmentAndPlanForCarePlanning,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessmentAndPlanForCarePlanning, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCodeP(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionText(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionPlanOfCareActivityAct(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentAndPlanForCarePlanning_validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntry(assessmentAndPlanForCarePlanning, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntry constraint of '<em>Assessment And Plan For Care Planning</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanForCarePlanning_validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntry(
			AssessmentAndPlanForCarePlanning assessmentAndPlanForCarePlanning,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentAndPlanForCarePlanning.validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntry(diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(planOfCareSection, diagnostics, context);
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
	 * Validates the validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(diagnostics, context);
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
	public boolean validateAssessmentAndPlanForConditionOrConcern(
			AssessmentAndPlanForConditionOrConcern assessmentAndPlanForConditionOrConcern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessmentAndPlanForConditionOrConcern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCodeP(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionText(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionPlanOfCareActivityAct(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentAndPlanForConditionOrConcern_validateAssessmentAndPlanForConditionOrConcernProblemObservation(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAssessmentAndPlanForConditionOrConcernProblemObservation constraint of '<em>Assessment And Plan For Condition Or Concern</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanForConditionOrConcern_validateAssessmentAndPlanForConditionOrConcernProblemObservation(
			AssessmentAndPlanForConditionOrConcern assessmentAndPlanForConditionOrConcern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentAndPlanForConditionOrConcern.validateAssessmentAndPlanForConditionOrConcernProblemObservation(diagnostics, context);
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
	public boolean validateInstructionsSection(
			InstructionsSection instructionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instructionsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstructionsSection_validateInstructionsSectionTemplateId(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateInstructionsSection_validateInstructionsSectionCode(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateInstructionsSection_validateInstructionsSectionCodeP(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateInstructionsSection_validateInstructionsSectionText(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateInstructionsSection_validateInstructionsSectionTitle(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateInstructionsSection_validateInstructionsSectionInstructions(instructionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstructionsSection_validateMu2consolInstructionsSectionInstructions(instructionsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolInstructionsSectionInstructions constraint of '<em>Instructions Section</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionsSection_validateMu2consolInstructionsSectionInstructions(
			InstructionsSection instructionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instructionsSection.validateMu2consolInstructionsSectionInstructions(diagnostics, context);
	}

	/**
	 * Validates the validateInstructionsSectionTemplateId constraint of '
	 * <em>Instructions Section</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public boolean validateInstructionsSection_validateInstructionsSectionTemplateId(
			InstructionsSection instructionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instructionsSection.validateInstructionsSectionTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHALL(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHOULD(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientNameMixedContent(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateGeneralHeaderConstraintsTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(clinicalOfficeVisitSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(clinicalOfficeVisitSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(clinicalOfficeVisitSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportUseINDRoleclassCodes(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryResponsibleParty(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryReasonForOfficeVisit(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryCarePlanning(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryEffectiveTime(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryLocation(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter(clinicalOfficeVisitSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(clinicalOfficeVisitSummary, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryEffectiveTime(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter(diagnostics, context);
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
	 * Validates the validateClinicalOfficeVisitSummaryMedicationsSection constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationsSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryAllergiesSection constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryAllergiesSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * Validates the validateClinicalOfficeVisitSummaryVitalSignsSection constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryVitalSignsSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * Validates the validateClinicalOfficeVisitSummaryImmunizationsSection constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryImmunizationsSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryMedicationsAdministeredSection constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(diagnostics, context);
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
	 * validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(diagnostics, context);
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
	 * Validates the
	 * validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateGeneralHeaderConstraintsTemplateId(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vdtInpatientPatientInfo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHALL(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHOULD(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientNameMixedContent(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportUseINDRoleclassCodes(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoResponsibleParty(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoMedicationList(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoSocialHistorySection(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoProblemSection(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoResultsSection(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoPlanOfCareSection(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoProceduresSection(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoSocialHistorySectionTemplateId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoPlanOfCareSectionTemplateId(vdtInpatientPatientInfo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoResponsibleParty constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoResponsibleParty(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoResponsibleParty(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoMedicationList constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoMedicationList(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoMedicationList(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoSocialHistorySection constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoSocialHistorySection(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoProblemSection constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoProblemSection(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoProblemSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoResultsSection constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoResultsSection(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoPlanOfCareSection constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoPlanOfCareSection(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoProceduresSection constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoProceduresSection(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoProceduresSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoSocialHistorySectionTemplateId constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoSocialHistorySectionTemplateId(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoPlanOfCareSectionTemplateId constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoPlanOfCareSectionTemplateId(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoPlanOfCareSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vdtAmbulatoryPatientInfo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHALL(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHOULD(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientNameMixedContent(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportUseINDRoleclassCodes(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoMedicationList(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoMedicationAllergy(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCanHaveEitherEncountersRequiredOrOptionalEntry(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoReasonForHospitalization(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoSocialHistorySection(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoProblemSection(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoResultsSection(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoPlanOfCareSection(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoProceduresSection(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoHospitalDischargeInstructionsSection(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoSocialHistorySectionTemplateId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoPlanOfCareSectionTemplateId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(vdtAmbulatoryPatientInfo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoMedicationList constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoMedicationList(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoMedicationList(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoMedicationAllergy constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoMedicationAllergy(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoMedicationAllergy(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoCanHaveEitherEncountersRequiredOrOptionalEntry constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCanHaveEitherEncountersRequiredOrOptionalEntry(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoCanHaveEitherEncountersRequiredOrOptionalEntry(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoReasonForHospitalization constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoReasonForHospitalization(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoReasonForHospitalization(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoSocialHistorySection constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoSocialHistorySection(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoProblemSection constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoProblemSection(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoProblemSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoResultsSection constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoResultsSection(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoPlanOfCareSection constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoPlanOfCareSection(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoProceduresSection constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoProceduresSection(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoProceduresSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoHospitalDischargeInstructionsSection constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoHospitalDischargeInstructionsSection(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoHospitalDischargeInstructionsSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoSocialHistorySectionTemplateId constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoSocialHistorySectionTemplateId(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservation constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoPlanOfCareSectionTemplateId constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoPlanOfCareSectionTemplateId(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoPlanOfCareSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateId constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateId(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHALL(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHOULD(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientNameMixedContent(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateGeneralHeaderConstraintsTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(transitionOfCareAmbulatorySummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(transitionOfCareAmbulatorySummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(transitionOfCareAmbulatorySummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportUseINDRoleclassCodes(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCarePlanning(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordReasonForHospitalization(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAllergiesSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordImmunizationsSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeMedicationsSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordVitalSignsSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordFunctionalStatusSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordFunctionalStatusSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusProblemObservation(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservation(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservation(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareAmbulatorySummary_validateTransitionOfCareAmbulatorySummaryResponsibleParty(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareAmbulatorySummary_validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTransitionOfCareAmbulatorySummaryResponsibleParty constraint of '<em>Transition Of Care Ambulatory Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareAmbulatorySummary_validateTransitionOfCareAmbulatorySummaryResponsibleParty(TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transitionOfCareAmbulatorySummary.validateTransitionOfCareAmbulatorySummaryResponsibleParty(diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummary(TransitionOfCareInpatientSummary transitionOfCareInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHALL(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHOULD(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientNameMixedContent(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateGeneralHeaderConstraintsTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(transitionOfCareInpatientSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(transitionOfCareInpatientSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(transitionOfCareInpatientSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportUseINDRoleclassCodes(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCarePlanning(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordReasonForHospitalization(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAllergiesSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordImmunizationsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeMedicationsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordVitalSignsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordFunctionalStatusSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordFunctionalStatusSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusProblemObservation(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservation(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservation(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(transitionOfCareInpatientSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection constraint of '<em>Transition Of Care Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummary_validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(TransitionOfCareInpatientSummary transitionOfCareInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transitionOfCareInpatientSummary.validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHALL(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHOULD(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientNameMixedContent(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(viewDownloadTransmitSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(viewDownloadTransmitSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(viewDownloadTransmitSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(viewDownloadTransmitSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportUseINDRoleclassCodes(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMedicationAllergy(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryCarePlanFields(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAllergiesSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMedicationsSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryHospitalDischargeMedicationsSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProblemSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProceduresSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryVitalSignsSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryResultsSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySection(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(viewDownloadTransmitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarymu2consolSocialHistorySectionSmokingStatusObservation(viewDownloadTransmitSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryMedicationAllergy constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMedicationAllergy(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryMedicationAllergy(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryCarePlanFields constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryCarePlanFields(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryCarePlanFields(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryAllergiesSection constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAllergiesSection(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryAllergiesSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryMedicationsSection constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMedicationsSection(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryHospitalDischargeMedicationsSection constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryHospitalDischargeMedicationsSection(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryHospitalDischargeMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryProblemSection constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProblemSection(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryProblemSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryProceduresSection constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProceduresSection(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryProceduresSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryVitalSignsSection constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryVitalSignsSection(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryResultsSection constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryResultsSection(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryPlanOfCareSection constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSection(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummarySocialHistorySection constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySection(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummarySocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummarySocialHistorySectionTemplateId constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateViewDownloadTransmitSummarymu2consolSocialHistorySectionSmokingStatusObservation constraint of '<em>View Download Transmit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarymu2consolSocialHistorySectionSmokingStatusObservation(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return viewDownloadTransmitSummary.validateViewDownloadTransmitSummarymu2consolSocialHistorySectionSmokingStatusObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHALL(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHOULD(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientNameMixedContent(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(vdtInpatientSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(vdtInpatientSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(vdtInpatientSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(vdtInpatientSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportUseINDRoleclassCodes(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMedicationAllergy(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryCarePlanFields(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAllergiesSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMedicationsSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryHospitalDischargeMedicationsSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProblemSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProceduresSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryVitalSignsSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryResultsSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarymu2consolSocialHistorySectionSmokingStatusObservation(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryEffectiveTime(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryLocation(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalDischargeInstructionsSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId(vdtInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientSummary_validateVDTInpatientSummarymu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(vdtInpatientSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVDTInpatientSummaryEffectiveTime constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryEffectiveTime(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummaryLocation constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryLocation(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryLocation(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummaryChiefComplaintOrReasonForVisit constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummaryHospitalDischargeInstructionsSection constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalDischargeInstructionsSection(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryHospitalDischargeInstructionsSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientSummarymu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis constraint of '<em>VDT Inpatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientSummary_validateVDTInpatientSummarymu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientSummary.validateVDTInpatientSummarymu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatorySummary(VDTAmbulatorySummary vdtAmbulatorySummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHALL(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddressSHOULD(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientNameMixedContent(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(vdtAmbulatorySummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(vdtAmbulatorySummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(vdtAmbulatorySummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(vdtAmbulatorySummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportUseINDRoleclassCodes(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsRecordTarget(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateMu2consolGeneralHeaderConstraintsDocumentationOf(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponent1EncompassingEncounter(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMedicationAllergy(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryCarePlanFields(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAllergiesSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryMedicationsSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryHospitalDischargeMedicationsSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProblemSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryProceduresSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryVitalSignsSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryResultsSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySection(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewDownloadTransmitSummary_validateViewDownloadTransmitSummarymu2consolSocialHistorySectionSmokingStatusObservation(vdtAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatorySummary_validateVDTAmbulatorySummaryResponsibleParty(vdtAmbulatorySummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVDTAmbulatorySummaryResponsibleParty constraint of '<em>VDT Ambulatory Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatorySummary_validateVDTAmbulatorySummaryResponsibleParty(VDTAmbulatorySummary vdtAmbulatorySummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatorySummary.validateVDTAmbulatorySummaryResponsibleParty(diagnostics, context);
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
	public boolean validateHospitalAdmissionDiagnosisSection(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalAdmissionDiagnosisSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionTemplateId(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionCode(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionCodeP(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionTitle(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionText(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalAdmissionDiagnosisSection_validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(hospitalAdmissionDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis
	 * constraint of '<em>Hospital Admission Diagnosis Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection_validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalAdmissionDiagnosisSection.validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(diagnostics, context);
	}

	/**
	 * Validates the validateHospitalAdmissionDiagnosisSectionTemplateId
	 * constraint of '<em>Hospital Admission Diagnosis Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionTemplateId(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalAdmissionDiagnosisSection.validateHospitalAdmissionDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeDiagnosisSection(
			HospitalDischargeDiagnosisSection hospitalDischargeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalDischargeDiagnosisSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionTemplateId(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionCode(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionCodeP(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionTitle(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionText(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalDischargeDiagnosisSection_validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(hospitalDischargeDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis
	 * constraint of '<em>Hospital Discharge Diagnosis Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalDischargeDiagnosisSection_validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
			HospitalDischargeDiagnosisSection hospitalDischargeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalDischargeDiagnosisSection.validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(diagnostics, context);
	}

	/**
	 * Validates the validateHospitalDischargeDiagnosisSectionTemplateId
	 * constraint of '<em>Hospital Discharge Diagnosis Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionTemplateId(
			HospitalDischargeDiagnosisSection hospitalDischargeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalDischargeDiagnosisSection.validateHospitalDischargeDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostoperativeDiagnosisSection(
			PostoperativeDiagnosisSection postoperativeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(postoperativeDiagnosisSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePostoperativeDiagnosisSection_validatePostoperativeDiagnosisSectionTemplateId(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePostoperativeDiagnosisSection_validatePostoperativeDiagnosisSectionCode(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePostoperativeDiagnosisSection_validatePostoperativeDiagnosisSectionCodeP(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePostoperativeDiagnosisSection_validatePostoperativeDiagnosisSectionText(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePostoperativeDiagnosisSection_validatePostoperativeDiagnosisSectionTitle(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePostoperativeDiagnosisSection_validateMu2consolPostoperativeDiagnosisSectionProblemObservation(postoperativeDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateMu2consolPostoperativeDiagnosisSectionProblemObservation
	 * constraint of '<em>Postoperative Diagnosis Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePostoperativeDiagnosisSection_validateMu2consolPostoperativeDiagnosisSectionProblemObservation(
			PostoperativeDiagnosisSection postoperativeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return postoperativeDiagnosisSection.validateMu2consolPostoperativeDiagnosisSectionProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePostoperativeDiagnosisSectionTemplateId constraint of '<em>Postoperative Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostoperativeDiagnosisSection_validatePostoperativeDiagnosisSectionTemplateId(
			PostoperativeDiagnosisSection postoperativeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return postoperativeDiagnosisSection.validatePostoperativeDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostprocedureDiagnosisSection(
			PostprocedureDiagnosisSection postprocedureDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(postprocedureDiagnosisSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionTemplateId(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionCodeP(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionCode(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionText(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionTitle(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionPostprocedureDiagnosis(postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePostprocedureDiagnosisSection_validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(postprocedureDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis
	 * constraint of '<em>Postprocedure Diagnosis Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePostprocedureDiagnosisSection_validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
			PostprocedureDiagnosisSection postprocedureDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return postprocedureDiagnosisSection.validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(diagnostics, context);
	}

	/**
	 * Validates the validatePostprocedureDiagnosisSectionTemplateId constraint of '<em>Postprocedure Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionTemplateId(
			PostprocedureDiagnosisSection postprocedureDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return postprocedureDiagnosisSection.validatePostprocedureDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionalStatusSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateFunctionalStatusSectionTemplateId(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCode(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionTitle(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionText(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionFunctionalStatusResultOrganizer(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCognitiveStatusResultOrganizer(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionFunctionalStatusResultObservation(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCognitiveStatusResultObservation(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionFunctionalStatusProblemObservation(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCognitiveStatusProblemObservation(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCaregiverCharacteristics(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionAssessmentScaleObservation(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionNonMedicinalSupplyActivity(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionPressureUlcerObservation(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionNumberOfPressureUlcersObservation(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionHighestPressureUlcerStage(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionCognitiveStatus(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionFunctionalStatus(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionCognitiveStatusProblemObservation(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionCognitiveStatusResultObservation(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionFunctionalStatusResultObservation(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(functionalStatusSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolFunctionalStatusSectionCognitiveStatus constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionCognitiveStatus(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateMu2consolFunctionalStatusSectionCognitiveStatus(diagnostics, context);
	}

	/**
	 * Validates the validateMu2consolFunctionalStatusSectionFunctionalStatus constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionFunctionalStatus(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateMu2consolFunctionalStatusSectionFunctionalStatus(diagnostics, context);
	}

	/**
	 * Validates the validateMu2consolFunctionalStatusSectionCognitiveStatusProblemObservation constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionCognitiveStatusProblemObservation(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateMu2consolFunctionalStatusSectionCognitiveStatusProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMu2consolFunctionalStatusSectionCognitiveStatusResultObservation constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionCognitiveStatusResultObservation(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateMu2consolFunctionalStatusSectionCognitiveStatusResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateMu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateMu2consolFunctionalStatusSectionFunctionalStatusProblemObservation constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateMu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMu2consolFunctionalStatusSectionFunctionalStatusResultObservation constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionFunctionalStatusResultObservation(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateMu2consolFunctionalStatusSectionFunctionalStatusResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateMu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateMu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionTemplateId constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionTemplateId(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreoperativeDiagnosisSection(
			PreoperativeDiagnosisSection preoperativeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(preoperativeDiagnosisSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionTemplateId(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionCode(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionCodeP(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionText(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionTitle(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionPreoperativeDiagnosis(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePreoperativeDiagnosisSection_validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(preoperativeDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis
	 * constraint of '<em>Preoperative Diagnosis Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePreoperativeDiagnosisSection_validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
			PreoperativeDiagnosisSection preoperativeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return preoperativeDiagnosisSection.validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(diagnostics, context);
	}

	/**
	 * Validates the validatePreoperativeDiagnosisSectionTemplateId constraint of '<em>Preoperative Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionTemplateId(
			PreoperativeDiagnosisSection preoperativeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return preoperativeDiagnosisSection.validatePreoperativeDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection(
			MedicationsAdministeredSection medicationsAdministeredSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationsAdministeredSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionTemplateId(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionCode(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionCodeP(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionText(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionTitle(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionMedicationActivity(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsAdministeredSection_validateMu2consolMedicationsAdministeredSectionMedicationActivity(medicationsAdministeredSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateMu2consolMedicationsAdministeredSectionMedicationActivity
	 * constraint of '<em>Medications Administered Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection_validateMu2consolMedicationsAdministeredSectionMedicationActivity(
			MedicationsAdministeredSection medicationsAdministeredSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsAdministeredSection.validateMu2consolMedicationsAdministeredSectionMedicationActivity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsAdministeredSectionTemplateId constraint of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionTemplateId(
			MedicationsAdministeredSection medicationsAdministeredSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsAdministeredSection.validateMedicationsAdministeredSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptional(
			HospitalAdmissionMedicationsSectionEntriesOptional hospitalAdmissionMedicationsSectionEntriesOptional,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalText(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalTitle(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalAdmissionMedicationsSectionEntriesOptional_validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication
	 * constraint of '
	 * <em>Hospital Admission Medications Section Entries Optional</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptional_validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			HospitalAdmissionMedicationsSectionEntriesOptional hospitalAdmissionMedicationsSectionEntriesOptional,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalAdmissionMedicationsSectionEntriesOptional.validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId
	 * constraint of '
	 * <em>Hospital Admission Medications Section Entries Optional</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
			HospitalAdmissionMedicationsSectionEntriesOptional hospitalAdmissionMedicationsSectionEntriesOptional,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalAdmissionMedicationsSectionEntriesOptional.validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(diagnostics, context);
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
	public boolean validateAllergiesSectionEntriesOptional(
			AllergiesSectionEntriesOptional allergiesSectionEntriesOptional,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allergiesSectionEntriesOptional, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalTemplateId(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalCode(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalCodeP(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalTitle(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalText(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalAllergyProblemAct(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergiesSectionEntriesOptional_validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(allergiesSectionEntriesOptional, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct
	 * constraint of '<em>Allergies Section Entries Optional</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAllergiesSectionEntriesOptional_validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
			AllergiesSectionEntriesOptional allergiesSectionEntriesOptional,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergiesSectionEntriesOptional.validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(diagnostics, context);
	}

	/**
	 * Validates the validateAllergiesSectionEntriesOptionalTemplateId
	 * constraint of '<em>Allergies Section Entries Optional</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalTemplateId(
			AllergiesSectionEntriesOptional allergiesSectionEntriesOptional,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergiesSectionEntriesOptional.validateAllergiesSectionEntriesOptionalTemplateId(diagnostics, context);
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
