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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Documentation Of Service
	 * Event Performer1 Assigned Entity' of 'General Header Constraints'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Documentation Of Service Event Performer' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Documentation Of Service Event' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Record Target Patient
	 * Role Patient Ethnic Group Code' of 'General Header Constraints'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code P' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Record Target Patient
	 * Role Patient Race Code' of 'General Header Constraints'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient Race Code P' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient Language Communication' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Mu2 Encounter Diagnoses Requirements' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Can Have Either Required Or Optional Vital Signs' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Care Planning' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CARE_PLANNING = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Medication Allergy' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATION_ALLERGY = 17;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Medication List' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATION_LIST = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Can Have Either Allergy
	 * Required Or Optional Entry' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Plan Of Care Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Instructions Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Problem Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Immunizations Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Medications Administered Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION = 25;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Procedures Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Social History Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Social History
	 * Section Smoking Status Observation' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Hospital Admission Medications Section Entries Optional Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Instructions Section Instructions' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Assessment Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_ASSESSMENT_SECTION_TEMPLATE_ID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Assessment Section Problem Observation' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Hospital Admission Diagnosis Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Hospital Discharge Diagnosis Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Postoperative Diagnosis Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Postoperative
	 * Diagnosis Section Problem Observation' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Postprocedure Diagnosis Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Preoperative Diagnosis Section Preoperative Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Medications Administered Section Medication Activity' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Assessment And Plan Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Instructions Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION_TEMPLATE_ID = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Hospital Admission Medications Section Entries Optional Admission Medication' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Plan Of Care Section
	 * Care Planning For Plan Of Care' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Plan Of Care Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Medications Administered Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Postprocedure Diagnosis Section Postprocedure Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Preoperative Diagnosis Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PREOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Template Id' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEMPLATE_ID = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Assessment And Plan For Care Planning One Of Plan Of
	 * Care Entry' of 'Assessment And Plan For Care Planning'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING__ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING_ONE_OF_PLAN_OF_CARE_ENTRY = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Assessment And Plan For Condition Or Concern Problem
	 * Observation' of 'Assessment And Plan For Condition Or Concern'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN__ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN_PROBLEM_OBSERVATION = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Assessment And Plan Section Template Id' of
	 * 'Assessment And Plan Section'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Instructions Section Instructions' of 'Instructions Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTRUCTIONS_SECTION__MU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Instructions Section Template Id' of 'Instructions Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTRUCTIONS_SECTION__INSTRUCTIONS_SECTION_TEMPLATE_ID = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Responsible Party' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Location' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Medication List' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Medication Allergy' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_ALLERGY = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Vital Signs' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Reason For Office Visit' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Care Planning' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Social History Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Problem Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Results Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Plan Of Care Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Procedures Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Assessment And Plan Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Instructions Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Social History Section Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summarymu2consol Social History Section Smoking Status Observation' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Hospital Admission Medications Section Entries Optional Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summarymu2consol Hospital Admission Medications Section Entries Optional Admission Medication' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summarymu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Plan Of Care Section Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Medications Administered Section Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summarymu2consol Medications Administered Section Medication Activity' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Clinical Office Visit Summary Assessment And Plan
	 * Section Template Id' of 'Clinical Office Visit Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Instructions Section Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION_TEMPLATE_ID = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Clinical Office Visit Summarymu2consol Instructions
	 * Section Instructions' of 'Clinical Office Visit Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Responsible Party' of
	 * 'VDT Inpatient Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_RESPONSIBLE_PARTY = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Medication List' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Can Have Either Vital
	 * Signs Requied Or Optional Entry' of 'VDT Inpatient Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Can Have Either Allergy
	 * Required Or Optional Entry' of 'VDT Inpatient Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Social History Section' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Problem Section' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_PROBLEM_SECTION = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Results Section' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_RESULTS_SECTION = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Plan Of Care Section' of
	 * 'VDT Inpatient Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Procedures Section' of
	 * 'VDT Inpatient Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_PROCEDURES_SECTION = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Social History Section Template Id' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Infomu2consol Social History
	 * Section Smoking Status Observation' of 'VDT Inpatient Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Hospital Admission Medications Section Entries Optional Template Id' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Infomu2consol Hospital
	 * Admission Medications Section Entries Optional Admission Medication' of
	 * 'VDT Inpatient Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Infomu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Plan Of Care Section Template Id' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Medication List' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_MEDICATION_LIST = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Medication Allergy' of
	 * 'VDT Ambulatory Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_MEDICATION_ALLERGY = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Can Have Either Vital
	 * Signs Requied Or Optional Entry' of 'VDT Ambulatory Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Can Have Either Allergy
	 * Required Or Optional Entry' of 'VDT Ambulatory Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Can Have Either Encounters Required Or Optional Entry' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_CAN_HAVE_EITHER_ENCOUNTERS_REQUIRED_OR_OPTIONAL_ENTRY = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Reason For Hospitalization' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_REASON_FOR_HOSPITALIZATION = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Social History Section' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_SOCIAL_HISTORY_SECTION = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Problem Section' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_PROBLEM_SECTION = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Results Section' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_RESULTS_SECTION = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Plan Of Care Section' of
	 * 'VDT Ambulatory Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_PLAN_OF_CARE_SECTION = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Procedures Section' of
	 * 'VDT Ambulatory Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_PROCEDURES_SECTION = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Hospital Discharge
	 * Instructions Section' of 'VDT Ambulatory Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Social History Section Template Id' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Infomu2consol Social History Section Smoking Status Observation' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Hospital Admission Medications Section Entries Optional Template Id' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Infomu2consol Hospital
	 * Admission Medications Section Entries Optional Admission Medication' of
	 * 'VDT Ambulatory Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Infomu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Plan Of Care Section Template Id' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Hospital Admission
	 * Diagnosis Section Template Id' of 'VDT Ambulatory Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Infomu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Transition Of Care Ambulatory Summary Responsible Party' of 'Transition Of Care Ambulatory Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Transition Of Care Ambulatory Summary Reason For
	 * Referral Section' of 'Transition Of Care Ambulatory Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL_SECTION = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Transition Of Care Inpatient Summary Hospital Discharge Instructions Section' of 'Transition Of Care Inpatient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION_OF_CARE_INPATIENT_SUMMARY__TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Assessment Section Problem Observation' of 'Assessment Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_SECTION__MU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Section Template Id' of 'Assessment Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_SECTION__ASSESSMENT_SECTION_TEMPLATE_ID = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Admission Diagnosis Section Template Id' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis' of 'Hospital Discharge Diagnosis Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Discharge Diagnosis Section Template Id' of 'Hospital Discharge Diagnosis Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Postoperative Diagnosis Section Problem Observation' of 'Postoperative Diagnosis Section'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POSTOPERATIVE_DIAGNOSIS_SECTION__MU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Postoperative Diagnosis Section Template Id' of 'Postoperative Diagnosis Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int POSTOPERATIVE_DIAGNOSIS_SECTION__POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Postprocedure Diagnosis Section
	 * Postprocedure Diagnosis' of 'Postprocedure Diagnosis Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int POSTPROCEDURE_DIAGNOSIS_SECTION__MU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Postprocedure Diagnosis Section Template Id' of 'Postprocedure Diagnosis Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int POSTPROCEDURE_DIAGNOSIS_SECTION__POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Preoperative Diagnosis Section
	 * Preoperative Diagnosis' of 'Preoperative Diagnosis Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PREOPERATIVE_DIAGNOSIS_SECTION__MU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Preoperative Diagnosis Section Template Id' of 'Preoperative Diagnosis Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int PREOPERATIVE_DIAGNOSIS_SECTION__PREOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Medications Administered Section
	 * Medication Activity' of 'Medications Administered Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__MU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Administered Section Template Id' of 'Medications Administered Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Hospital Admission Medications Section Entries Optional Admission Medication' of 'Hospital Admission Medications Section Entries Optional'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__MU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Admission Medications Section Entries Optional Template Id' of 'Hospital Admission Medications Section Entries Optional'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Social History Section Smoking Status Observation' of 'Social History Section'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'Social History Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Allergies Section Entries Optional Allergy Problem Act' of 'Allergies Section Entries Optional'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_SECTION_ENTRIES_OPTIONAL__MU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergies Section Entries Optional Template Id' of 'Allergies Section Entries Optional'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_SECTION_ENTRIES_OPTIONAL__ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 75;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 143;

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
			case Mu2consolPackage.INSTRUCTIONS_SECTION:
				return validateInstructionsSection((InstructionsSection)value, diagnostics, context);
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
			case Mu2consolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL:
				return validateAllergiesSectionEntriesOptional((AllergiesSectionEntriesOptional)value, diagnostics, context);
			case Mu2consolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION:
				return validatePostprocedureDiagnosisSection((PostprocedureDiagnosisSection)value, diagnostics, context);
			case Mu2consolPackage.ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING:
				return validateAssessmentAndPlanForCarePlanning((AssessmentAndPlanForCarePlanning)value, diagnostics, context);
			case Mu2consolPackage.ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN:
				return validateAssessmentAndPlanForConditionOrConcern((AssessmentAndPlanForConditionOrConcern)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(generalHeaderConstraints, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCarePlanning(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationAllergy(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordReasonForHospitalization(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationList(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherAllergyRequiredOrOptionalEntry(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordImmunizationsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(summaryOfCareRecord, diagnostics, context);
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
		return result;
	}

	/**
	 * Validates the validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordMedicationAllergy constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationAllergy(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMedicationAllergy(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordMedicationList constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationList(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMedicationList(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordCanHaveEitherAllergyRequiredOrOptionalEntry constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherAllergyRequiredOrOptionalEntry(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordCanHaveEitherAllergyRequiredOrOptionalEntry(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordInstructionsSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordInstructionsSection(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordInstructionsSectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSectionTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordInstructionsSectionTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryResponsibleParty(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryLocation(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationList(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationAllergy(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryVitalSigns(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryReasonForOfficeVisit(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryCarePlanning(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarySocialHistorySection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryProblemSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryResultsSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryPlanOfCareSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryProceduresSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryInstructionsSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(clinicalOfficeVisitSummary, diagnostics, context);
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
	 * Validates the validateClinicalOfficeVisitSummaryMedicationList constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationList(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryMedicationList(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryMedicationAllergy
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationAllergy(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryMedicationAllergy(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryVitalSigns constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryVitalSigns(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryVitalSigns(diagnostics, context);
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
	 * Validates the validateClinicalOfficeVisitSummaryAssessmentAndPlanSection
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(diagnostics, context);
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
	 * validateClinicalOfficeVisitSummaryHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(diagnostics, context);
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(vdtInpatientPatientInfo, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(vdtAmbulatoryPatientInfo, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCarePlanning(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationAllergy(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordReasonForHospitalization(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationList(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherAllergyRequiredOrOptionalEntry(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordImmunizationsSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSectionTemplateId(transitionOfCareAmbulatorySummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(transitionOfCareAmbulatorySummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCarePlanning(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationAllergy(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordReasonForHospitalization(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationList(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherAllergyRequiredOrOptionalEntry(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordImmunizationsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSectionTemplateId(transitionOfCareInpatientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(transitionOfCareInpatientSummary, diagnostics, context);
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
