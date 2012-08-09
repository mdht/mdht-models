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
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final Mu2consolValidator INSTANCE = new Mu2consolValidator();

	/**
	 * A constant for the
	 * {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
	 * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes}
	 * from this package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.mu2consol";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Template Id' of 'General
	 * Header Constraints'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Record Target' of
	 * 'General Header Constraints'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Record Target Patient
	 * Role Patient Language Communication' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Record Target Patient
	 * Role Patient' of 'General Header Constraints'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Record Target Patient
	 * Role' of 'General Header Constraints'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Cannot Have Chief Complaint
	 * And Reason For Visit With Chief Complaint Section Or Reason Section' of
	 * 'Summary Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Mu2 Encounter Diagnoses
	 * Requirements' of 'Summary Of Care Record'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Can Have Either Required Or
	 * Optional Vital Signs Section' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Medication List Constraint'
	 * of 'Summary Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Plan Of Care Section' of
	 * 'Summary Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Instructions Section' of
	 * 'Summary Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Hospital Discharge
	 * Instructions Section' of 'Summary Of Care Record'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Problem Section' of 'Summary
	 * Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Medications Administered
	 * Section' of 'Summary Of Care Record'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Social History Section' of
	 * 'Summary Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Results Section' of 'Summary
	 * Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_RESULTS_SECTION = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Record Procedures Section' of
	 * 'Summary Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Encounters Section
	 * Encounter Activities' of 'Summary Of Care Record'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Plan Of Care Section
	 * Care Planning For Plan Of Care Section' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE_SECTION = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Plan Of Care Section
	 * Mu2consol Plan Of Care Section Plan Of Care Activity Act' of 'Summary Of
	 * Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Plan Of Care Section
	 * Mu2consol Plan Of Care Section Plan Of Care Activity Encounter' of
	 * 'Summary Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Plan Of Care Section
	 * Mu2consol Plan Of Care Section Plan Of Care Activity Observation' of
	 * 'Summary Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Instructions Section
	 * Instructions' of 'Summary Of Care Record'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Assessment Section
	 * Problem Observation' of 'Summary Of Care Record'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Hospital Admission
	 * Diagnosis Section Hospital Admission Diagnosis' of 'Summary Of Care
	 * Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Hospital Discharge
	 * Diagnosis Section Hospital Discharge Diagnosis' of 'Summary Of Care
	 * Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Postoperative
	 * Diagnosis Section Problem Observation' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Preoperative
	 * Diagnosis Section Preoperative Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Medications
	 * Administered Section Medication Activity' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Hospital Admission
	 * Medications Section Entries Optional Admission Medication' of 'Summary Of
	 * Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Hospital Admission
	 * Medications Section Entries Optional Medication Activity' of 'Summary Of
	 * Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_MEDICATION_ACTIVITY = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Hospital Discharge
	 * Medications Section Discharge Medication' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_DISCHARGE_MEDICATION = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Hospital Discharge
	 * Medications Section Medication Activity' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION_ACTIVITY = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Allergies Section
	 * Entries Optional Allergy Problem Act' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Postprocedure
	 * Diagnosis Section Postprocedure Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Template Id' of 'Summary
	 * Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Cannot Have Chief
	 * Complaint And Reason For Visit With Chief Complaint Section Or Reason
	 * Section' of 'VDT Ambulatory Patient Info'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Mu2 Encounter Diagnoses
	 * Requirements' of 'VDT Ambulatory Patient Info'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Can Have Either Required
	 * Or Optional Vital Signs Section' of 'VDT Ambulatory Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Ambulatory Patient Info Medication List
	 * Constraint' of 'VDT Ambulatory Patient Info'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_MEDICATION_LIST_CONSTRAINT = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Template Id' of 'VDT
	 * Ambulatory Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Clinical Office Visit Summary Cannot Have Chief
	 * Complaint And Reason For Visit With Chief Complaint Section Or Reason
	 * Section' of 'Clinical Office Visit Summary'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Clinical Office Visit Summary Mu2 Encounter
	 * Diagnoses Requirements' of 'Clinical Office Visit Summary'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Clinical Office Visit Summary Can Have Either
	 * Required Or Optional Vital Signs Section' of 'Clinical Office Visit
	 * Summary'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Clinical Office Visit Summary Medication List
	 * Constraint' of 'Clinical Office Visit Summary'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST_CONSTRAINT = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Template Id' of 'Clinical
	 * Office Visit Summary'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Plan Of Care Section Mu2consol Plan Of
	 * Care Section Plan Of Care Activity Act' of 'Plan Of Care Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__MU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Plan Of Care Section Mu2consol Plan Of
	 * Care Section Plan Of Care Activity Encounter' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__MU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Plan Of Care Section Mu2consol Plan Of
	 * Care Section Plan Of Care Activity Observation' of 'Plan Of Care
	 * Section'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__MU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Instructions Section Instructions' of
	 * 'Instructions Section'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int INSTRUCTIONS_SECTION__MU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Assessment Section Problem Observation' of
	 * 'Assessment Section'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSESSMENT_SECTION__MU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Hospital Admission Diagnosis Section
	 * Hospital Admission Diagnosis' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Hospital Discharge Diagnosis Section
	 * Hospital Discharge Diagnosis' of 'Hospital Discharge Diagnosis Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Postoperative Diagnosis Section Problem
	 * Observation' of 'Postoperative Diagnosis Section'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int POSTOPERATIVE_DIAGNOSIS_SECTION__MU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Postprocedure Diagnosis Section
	 * Postprocedure Diagnosis' of 'Postprocedure Diagnosis Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int POSTPROCEDURE_DIAGNOSIS_SECTION__MU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Encounters Section Encounter Activities'
	 * of 'Encounters Section'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__MU2CONSOL_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Plan Of Care Section Care Planning For
	 * Plan Of Care Section' of 'Plan Of Care Section'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE_SECTION = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Preoperative Diagnosis Section
	 * Preoperative Diagnosis' of 'Preoperative Diagnosis Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PREOPERATIVE_DIAGNOSIS_SECTION__MU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Medications Administered Section
	 * Medication Activity' of 'Medications Administered Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__MU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Hospital Admission Medications Section
	 * Entries Optional Admission Medication' of 'Hospital Admission Medications
	 * Section Entries Optional'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__MU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Hospital Admission Medications Section
	 * Entries Optional Medication Activity' of 'Hospital Admission Medications
	 * Section Entries Optional'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__MU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_MEDICATION_ACTIVITY = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Hospital Discharge Medications Section
	 * Discharge Medication' of 'Hospital Discharge Medications Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_DISCHARGE_MEDICATION = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Hospital Discharge Medications Section
	 * Medication Activity' of 'Hospital Discharge Medications Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION_ACTIVITY = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Allergies Section Entries Optional Allergy
	 * Problem Act' of 'Allergies Section Entries Optional'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ALLERGIES_SECTION_ENTRIES_OPTIONAL__MU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Cannot Have Chief
	 * Complaint And Reason For Visit With Chief Complaint Section Or Reason
	 * Section' of 'VDT Inpatient Patient Info'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Mu2 Encounter Diagnoses
	 * Requirements' of 'VDT Inpatient Patient Info'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Can Have Either Required
	 * Or Optional Vital Signs Section' of 'VDT Inpatient Patient Info'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate VDT Inpatient Patient Info Medication List
	 * Constraint' of 'VDT Inpatient Patient Info'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST_CONSTRAINT = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Template Id' of 'VDT
	 * Inpatient Patient Info'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Create Transmit Summary Of Care Record Cannot Have
	 * Chief Complaint And Reason For Visit With Chief Complaint Section Or
	 * Reason Section' of 'Create Transmit Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Create Transmit Summary Of Care Record Mu2 Encounter
	 * Diagnoses Requirements' of 'Create Transmit Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Create Transmit Summary Of Care Record Can Have
	 * Either Required Or Optional Vital Signs Section' of 'Create Transmit
	 * Summary Of Care Record'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Create Transmit Summary Of Care Record Medication
	 * List Constraint' of 'Create Transmit Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate General Header Constraints Template Id' of 'Create
	 * Transmit Summary Of Care Record'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 64;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 74;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants in a derived class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected CDAValidator cdaValidator;

	/**
	 * The cached base package validator. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConsolValidator consolValidator;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Mu2consolValidator() {
		super();
		cdaValidator = CDAValidator.INSTANCE;
		consolValidator = ConsolValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Mu2consolPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the
	 * model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
		case Mu2consolPackage.GENERAL_HEADER_CONSTRAINTS:
			return validateGeneralHeaderConstraints(
					(GeneralHeaderConstraints) value, diagnostics, context);
		case Mu2consolPackage.SUMMARY_OF_CARE_RECORD:
			return validateSummaryOfCareRecord((SummaryOfCareRecord) value,
					diagnostics, context);
		case Mu2consolPackage.ENCOUNTERS_SECTION:
			return validateEncountersSection((EncountersSection) value,
					diagnostics, context);
		case Mu2consolPackage.PLAN_OF_CARE_SECTION:
			return validatePlanOfCareSection((PlanOfCareSection) value,
					diagnostics, context);
		case Mu2consolPackage.ASSESSMENT_AND_PLAN_SECTION:
			return validateAssessmentAndPlanSection(
					(AssessmentAndPlanSection) value, diagnostics, context);
		case Mu2consolPackage.INSTRUCTIONS_SECTION:
			return validateInstructionsSection((InstructionsSection) value,
					diagnostics, context);
		case Mu2consolPackage.ASSESSMENT_SECTION:
			return validateAssessmentSection((AssessmentSection) value,
					diagnostics, context);
		case Mu2consolPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION:
			return validateHospitalAdmissionDiagnosisSection(
					(HospitalAdmissionDiagnosisSection) value, diagnostics,
					context);
		case Mu2consolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION:
			return validateHospitalDischargeDiagnosisSection(
					(HospitalDischargeDiagnosisSection) value, diagnostics,
					context);
		case Mu2consolPackage.POSTOPERATIVE_DIAGNOSIS_SECTION:
			return validatePostoperativeDiagnosisSection(
					(PostoperativeDiagnosisSection) value, diagnostics, context);
		case Mu2consolPackage.PREOPERATIVE_DIAGNOSIS_SECTION:
			return validatePreoperativeDiagnosisSection(
					(PreoperativeDiagnosisSection) value, diagnostics, context);
		case Mu2consolPackage.MEDICATIONS_ADMINISTERED_SECTION:
			return validateMedicationsAdministeredSection(
					(MedicationsAdministeredSection) value, diagnostics,
					context);
		case Mu2consolPackage.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL:
			return validateHospitalAdmissionMedicationsSectionEntriesOptional(
					(HospitalAdmissionMedicationsSectionEntriesOptional) value,
					diagnostics, context);
		case Mu2consolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION:
			return validateHospitalDischargeMedicationsSection(
					(HospitalDischargeMedicationsSection) value, diagnostics,
					context);
		case Mu2consolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL:
			return validateAllergiesSectionEntriesOptional(
					(AllergiesSectionEntriesOptional) value, diagnostics,
					context);
		case Mu2consolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION:
			return validatePostprocedureDiagnosisSection(
					(PostprocedureDiagnosisSection) value, diagnostics, context);
		case Mu2consolPackage.VDT_AMBULATORY_PATIENT_INFO:
			return validateVDTAmbulatoryPatientInfo(
					(VDTAmbulatoryPatientInfo) value, diagnostics, context);
		case Mu2consolPackage.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD:
			return validateCreateTransmitSummaryOfCareRecord(
					(CreateTransmitSummaryOfCareRecord) value, diagnostics,
					context);
		case Mu2consolPackage.VDT_INPATIENT_PATIENT_INFO:
			return validateVDTInpatientPatientInfo(
					(VDTInpatientPatientInfo) value, diagnostics, context);
		case Mu2consolPackage.CLINICAL_OFFICE_VISIT_SUMMARY:
			return validateClinicalOfficeVisitSummary(
					(ClinicalOfficeVisitSummary) value, diagnostics, context);
		case Mu2consolPackage.ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING:
			return validateAssessmentAndPlanForCarePlanning(
					(AssessmentAndPlanForCarePlanning) value, diagnostics,
					context);
		case Mu2consolPackage.ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN:
			return validateAssessmentAndPlanForConditionOrConcern(
					(AssessmentAndPlanForConditionOrConcern) value,
					diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalHeaderConstraints,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(generalHeaderConstraints,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(generalHeaderConstraints,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(generalHeaderConstraints, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(generalHeaderConstraints,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(generalHeaderConstraints,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
					generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
					generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
					generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(
					generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
					generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
					generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(
					generalHeaderConstraints, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '
	 * <em>General Header Constraints</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints
				.validateGeneralHeaderConstraintsTemplateId(diagnostics,
						context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTarget constraint of
	 * '<em>General Header Constraints</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints
				.validateGeneralHeaderConstraintsRecordTarget(diagnostics,
						context);
	}

	/**
	 * Validates the
	 * validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
	 * constraint of '<em>General Header Constraints</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints
				.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateGeneralHeaderConstraintsRecordTargetPatientRolePatient constraint
	 * of '<em>General Header Constraints</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints
				.validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
						diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRole
	 * constraint of '<em>General Header Constraints</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints
				.validateGeneralHeaderConstraintsRecordTargetPatientRole(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(summaryOfCareRecord, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(summaryOfCareRecord,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(summaryOfCareRecord,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(summaryOfCareRecord,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(summaryOfCareRecord, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(summaryOfCareRecord, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(summaryOfCareRecord,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateGeneralHeaderConstraintsTemplateId(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationListConstraint(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSection(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeInstructionsSection(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSection(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolEncountersSectionEncounterActivities(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionDischargeMedication(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionMedicationActivity(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
					summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
					summaryOfCareRecord, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements constraint
	 * of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(
						diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordMedicationListConstraint
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationListConstraint(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordMedicationListConstraint(
						diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordPlanOfCareSection constraint of
	 * '<em>Summary Of Care Record</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordPlanOfCareSection(diagnostics,
						context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordInstructionsSection constraint
	 * of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordInstructionsSection(diagnostics,
						context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordHospitalDischargeInstructionsSection
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeInstructionsSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordHospitalDischargeInstructionsSection(
						diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordProblemSection constraint of '
	 * <em>Summary Of Care Record</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordProblemSection(
				diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordMedicationsAdministeredSection
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordMedicationsAdministeredSection(
						diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordSocialHistorySection constraint
	 * of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordSocialHistorySection(diagnostics,
						context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordResultsSection constraint of '
	 * <em>Summary Of Care Record</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordResultsSection(
				diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordProceduresSection constraint of
	 * '<em>Summary Of Care Record</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordProceduresSection(diagnostics,
						context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolEncountersSectionEncounterActivities
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolEncountersSectionEncounterActivities(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolEncountersSectionEncounterActivities(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionDischargeMedication
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionDischargeMedication(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionDischargeMedication(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionMedicationActivity
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionMedicationActivity(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionMedicationActivity(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis
	 * constraint of '<em>Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord
				.validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
						diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '
	 * <em>Summary Of Care Record</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateGeneralHeaderConstraintsTemplateId(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateGeneralHeaderConstraintsTemplateId(
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vdtAmbulatoryPatientInfo,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(vdtAmbulatoryPatientInfo,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(vdtAmbulatoryPatientInfo,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(vdtAmbulatoryPatientInfo, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(vdtAmbulatoryPatientInfo,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(vdtAmbulatoryPatientInfo,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
					vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
					vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVDTAmbulatoryPatientInfo_validateGeneralHeaderConstraintsTemplateId(
					vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(
					vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
					vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
					vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(
					vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements(
					vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(
					vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoMedicationListConstraint(
					vdtAmbulatoryPatientInfo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection
	 * constraint of '<em>VDT Ambulatory Patient Info</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo
				.validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements
	 * constraint of '<em>VDT Ambulatory Patient Info</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo
				.validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection
	 * constraint of '<em>VDT Ambulatory Patient Info</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo
				.validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(
						diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoMedicationListConstraint
	 * constraint of '<em>VDT Ambulatory Patient Info</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoMedicationListConstraint(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo
				.validateVDTAmbulatoryPatientInfoMedicationListConstraint(
						diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '
	 * <em>VDT Ambulatory Patient Info</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateGeneralHeaderConstraintsTemplateId(
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo
				.validateGeneralHeaderConstraintsTemplateId(diagnostics,
						context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clinicalOfficeVisitSummary,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(clinicalOfficeVisitSummary,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(clinicalOfficeVisitSummary,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(clinicalOfficeVisitSummary,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(clinicalOfficeVisitSummary,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
					clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
					clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateClinicalOfficeVisitSummary_validateGeneralHeaderConstraintsTemplateId(
					clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(
					clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
					clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
					clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(
					clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(
					clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(
					clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationListConstraint(
					clinicalOfficeVisitSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary
				.validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary
				.validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary
				.validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(
						diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryMedicationListConstraint
	 * constraint of '<em>Clinical Office Visit Summary</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationListConstraint(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary
				.validateClinicalOfficeVisitSummaryMedicationListConstraint(
						diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '
	 * <em>Clinical Office Visit Summary</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateGeneralHeaderConstraintsTemplateId(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary
				.validateGeneralHeaderConstraintsTemplateId(diagnostics,
						context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssessmentAndPlanForCarePlanning(
			AssessmentAndPlanForCarePlanning assessmentAndPlanForCarePlanning,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessmentAndPlanForCarePlanning,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(
					assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(assessmentAndPlanForCarePlanning,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(assessmentAndPlanForCarePlanning,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(
					assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(
							assessmentAndPlanForCarePlanning, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(
							assessmentAndPlanForCarePlanning, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionText(
							assessmentAndPlanForCarePlanning, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionPlanOfCareActivityAct(
							assessmentAndPlanForCarePlanning, diagnostics,
							context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePlanOfCareSection(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareSection, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(planOfCareSection,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(planOfCareSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(planOfCareSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(planOfCareSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(planOfCareSection, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(planOfCareSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePlanOfCareSection_validatePlanOfCareSectionTemplateId(
							planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePlanOfCareSection_validatePlanOfCareSectionCode(
							planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePlanOfCareSection_validatePlanOfCareSectionText(
							planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(
							planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(
							planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(
							planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(
							planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
							planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(
							planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePlanOfCareSection_validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(
					planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePlanOfCareSection_validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct(
					planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePlanOfCareSection_validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter(
					planOfCareSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePlanOfCareSection_validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
					planOfCareSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection
	 * constraint of '<em>Plan Of Care Section</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareSection
				.validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct
	 * constraint of '<em>Plan Of Care Section</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareSection
				.validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter
	 * constraint of '<em>Plan Of Care Section</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareSection
				.validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation
	 * constraint of '<em>Plan Of Care Section</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareSection
				.validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssessmentAndPlanForConditionOrConcern(
			AssessmentAndPlanForConditionOrConcern assessmentAndPlanForConditionOrConcern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(
				assessmentAndPlanForConditionOrConcern, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					assessmentAndPlanForConditionOrConcern, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					assessmentAndPlanForConditionOrConcern, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(
					assessmentAndPlanForConditionOrConcern, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(assessmentAndPlanForConditionOrConcern,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(
					assessmentAndPlanForConditionOrConcern, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(
					assessmentAndPlanForConditionOrConcern, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					assessmentAndPlanForConditionOrConcern, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					assessmentAndPlanForConditionOrConcern, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(
							assessmentAndPlanForConditionOrConcern,
							diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(
							assessmentAndPlanForConditionOrConcern,
							diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionText(
							assessmentAndPlanForConditionOrConcern,
							diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionPlanOfCareActivityAct(
							assessmentAndPlanForConditionOrConcern,
							diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection(
			AssessmentAndPlanSection assessmentAndPlanSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessmentAndPlanSection,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(assessmentAndPlanSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(assessmentAndPlanSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(assessmentAndPlanSection, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(assessmentAndPlanSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(assessmentAndPlanSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(
							assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(
							assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionText(
							assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionPlanOfCareActivityAct(
							assessmentAndPlanSection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInstructionsSection(
			InstructionsSection instructionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instructionsSection, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				instructionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(instructionsSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(instructionsSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(instructionsSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(instructionsSection, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(instructionsSection, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(instructionsSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					instructionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					instructionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateInstructionsSection_validateInstructionsSectionTemplateId(
							instructionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateInstructionsSection_validateInstructionsSectionCode(
							instructionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateInstructionsSection_validateInstructionsSectionText(
							instructionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateInstructionsSection_validateInstructionsSectionTitle(
							instructionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateInstructionsSection_validateInstructionsSectionInstructions(
							instructionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInstructionsSection_validateMu2consolInstructionsSectionInstructions(
					instructionsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolInstructionsSectionInstructions constraint
	 * of '<em>Instructions Section</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInstructionsSection_validateMu2consolInstructionsSectionInstructions(
			InstructionsSection instructionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instructionsSection
				.validateMu2consolInstructionsSectionInstructions(diagnostics,
						context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssessmentSection(
			AssessmentSection assessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessmentSection, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(assessmentSection,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(assessmentSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(assessmentSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(assessmentSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(assessmentSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(assessmentSection, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(assessmentSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					assessmentSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					assessmentSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentSection_validateAssessmentSectionTemplateId(
							assessmentSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentSection_validateAssessmentSectionCode(
							assessmentSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAssessmentSection_validateAssessmentSectionText(
							assessmentSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAssessmentSection_validateMu2consolAssessmentSectionProblemObservation(
					assessmentSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolAssessmentSectionProblemObservation
	 * constraint of '<em>Assessment Section</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssessmentSection_validateMu2consolAssessmentSectionProblemObservation(
			AssessmentSection assessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return assessmentSection
				.validateMu2consolAssessmentSectionProblemObservation(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalAdmissionDiagnosisSection,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(
					hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(hospitalAdmissionDiagnosisSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(
					hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(
					hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionTemplateId(
							hospitalAdmissionDiagnosisSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionCode(
							hospitalAdmissionDiagnosisSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionTitle(
							hospitalAdmissionDiagnosisSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionText(
							hospitalAdmissionDiagnosisSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
							hospitalAdmissionDiagnosisSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= validateHospitalAdmissionDiagnosisSection_validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
					hospitalAdmissionDiagnosisSection, diagnostics, context);
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
		return hospitalAdmissionDiagnosisSection
				.validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalDischargeDiagnosisSection(
			HospitalDischargeDiagnosisSection hospitalDischargeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalDischargeDiagnosisSection,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(
					hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(hospitalDischargeDiagnosisSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(
					hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(
					hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionTemplateId(
							hospitalDischargeDiagnosisSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionCode(
							hospitalDischargeDiagnosisSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionTitle(
							hospitalDischargeDiagnosisSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionText(
							hospitalDischargeDiagnosisSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
							hospitalDischargeDiagnosisSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= validateHospitalDischargeDiagnosisSection_validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
					hospitalDischargeDiagnosisSection, diagnostics, context);
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
		return hospitalDischargeDiagnosisSection
				.validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePostoperativeDiagnosisSection(
			PostoperativeDiagnosisSection postoperativeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(postoperativeDiagnosisSection,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(
					postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(postoperativeDiagnosisSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(postoperativeDiagnosisSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(
					postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePostoperativeDiagnosisSection_validatePostoperativeDiagnosisSectionTemplateId(
							postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePostoperativeDiagnosisSection_validatePostoperativeDiagnosisSectionCode(
							postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePostoperativeDiagnosisSection_validatePostoperativeDiagnosisSectionText(
							postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePostoperativeDiagnosisSection_validatePostoperativeDiagnosisSectionTitle(
							postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePostoperativeDiagnosisSection_validateMu2consolPostoperativeDiagnosisSectionProblemObservation(
					postoperativeDiagnosisSection, diagnostics, context);
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
		return postoperativeDiagnosisSection
				.validateMu2consolPostoperativeDiagnosisSectionProblemObservation(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePostprocedureDiagnosisSection(
			PostprocedureDiagnosisSection postprocedureDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(postprocedureDiagnosisSection,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(
					postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(postprocedureDiagnosisSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(postprocedureDiagnosisSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(
					postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionTemplateId(
							postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionCode(
							postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionText(
							postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionTitle(
							postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionPostprocedureDiagnosis(
							postprocedureDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePostprocedureDiagnosisSection_validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
					postprocedureDiagnosisSection, diagnostics, context);
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
		return postprocedureDiagnosisSection
				.validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEncountersSection(
			EncountersSection encountersSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encountersSection, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(encountersSection,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(encountersSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(encountersSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(encountersSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(encountersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(encountersSection, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(encountersSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					encountersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					encountersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateEncountersSection_validateEncountersSectionEntriesOptionalTemplateId(
							encountersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateEncountersSection_validateEncountersSectionEntriesOptionalCode(
							encountersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalTitle(
							encountersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalText(
							encountersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalEncounterActivities(
							encountersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateEncountersSection_validateEncountersSectionText(
							encountersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateEncountersSection_validateEncountersSectionTitle(
							encountersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateEncountersSection_validateEncountersSectionEncounterActivities(
							encountersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncountersSection_validateMu2consolEncountersSectionEncounterActivities(
					encountersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolEncountersSectionEncounterActivities
	 * constraint of '<em>Encounters Section</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEncountersSection_validateMu2consolEncountersSectionEncounterActivities(
			EncountersSection encountersSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return encountersSection
				.validateMu2consolEncountersSectionEncounterActivities(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePreoperativeDiagnosisSection(
			PreoperativeDiagnosisSection preoperativeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(preoperativeDiagnosisSection,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(preoperativeDiagnosisSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(preoperativeDiagnosisSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(preoperativeDiagnosisSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(
					preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionTemplateId(
							preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionCode(
							preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionText(
							preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionTitle(
							preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionPreoperativeDiagnosis(
							preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePreoperativeDiagnosisSection_validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
					preoperativeDiagnosisSection, diagnostics, context);
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
		return preoperativeDiagnosisSection
				.validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection(
			MedicationsAdministeredSection medicationsAdministeredSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationsAdministeredSection,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(
					medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(medicationsAdministeredSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(medicationsAdministeredSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(
					medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionTemplateId(
							medicationsAdministeredSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionCode(
							medicationsAdministeredSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionText(
							medicationsAdministeredSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionTitle(
							medicationsAdministeredSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionMedicationActivity(
							medicationsAdministeredSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= validateMedicationsAdministeredSection_validateMu2consolMedicationsAdministeredSectionMedicationActivity(
					medicationsAdministeredSection, diagnostics, context);
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
		return medicationsAdministeredSection
				.validateMu2consolMedicationsAdministeredSectionMedicationActivity(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptional(
			HospitalAdmissionMedicationsSectionEntriesOptional hospitalAdmissionMedicationsSectionEntriesOptional,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(
				hospitalAdmissionMedicationsSectionEntriesOptional,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				hospitalAdmissionMedicationsSectionEntriesOptional,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					hospitalAdmissionMedicationsSectionEntriesOptional,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					hospitalAdmissionMedicationsSectionEntriesOptional,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(
					hospitalAdmissionMedicationsSectionEntriesOptional,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(
					hospitalAdmissionMedicationsSectionEntriesOptional,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(
					hospitalAdmissionMedicationsSectionEntriesOptional,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(
					hospitalAdmissionMedicationsSectionEntriesOptional,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					hospitalAdmissionMedicationsSectionEntriesOptional,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					hospitalAdmissionMedicationsSectionEntriesOptional,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
							hospitalAdmissionMedicationsSectionEntriesOptional,
							diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(
							hospitalAdmissionMedicationsSectionEntriesOptional,
							diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalText(
							hospitalAdmissionMedicationsSectionEntriesOptional,
							diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalTitle(
							hospitalAdmissionMedicationsSectionEntriesOptional,
							diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
							hospitalAdmissionMedicationsSectionEntriesOptional,
							diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHospitalAdmissionMedicationsSectionEntriesOptional_validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
					hospitalAdmissionMedicationsSectionEntriesOptional,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHospitalAdmissionMedicationsSectionEntriesOptional_validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity(
					hospitalAdmissionMedicationsSectionEntriesOptional,
					diagnostics, context);
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
		return hospitalAdmissionMedicationsSectionEntriesOptional
				.validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity
	 * constraint of '
	 * <em>Hospital Admission Medications Section Entries Optional</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptional_validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity(
			HospitalAdmissionMedicationsSectionEntriesOptional hospitalAdmissionMedicationsSectionEntriesOptional,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalAdmissionMedicationsSectionEntriesOptional
				.validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(
				hospitalDischargeMedicationsSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(
					hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(hospitalDischargeMedicationsSection,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(
					hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(
					hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(
							hospitalDischargeMedicationsSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionEntriesOptionalCode(
							hospitalDischargeMedicationsSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeMedicationsSectionEntriesOptional_validateHospitalDischargeMedicationsSectionEntriesOptionalTitle(
							hospitalDischargeMedicationsSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeMedicationsSectionEntriesOptional_validateHospitalDischargeMedicationsSectionEntriesOptionalText(
							hospitalDischargeMedicationsSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeMedicationsSectionEntriesOptional_validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication(
							hospitalDischargeMedicationsSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionText(
							hospitalDischargeMedicationsSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionTitle(
							hospitalDischargeMedicationsSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionDischargeMedication(
							hospitalDischargeMedicationsSection, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= validateHospitalDischargeMedicationsSection_validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(
					hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHospitalDischargeMedicationsSection_validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(
					hospitalDischargeMedicationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication
	 * constraint of '<em>Hospital Discharge Medications Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection_validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalDischargeMedicationsSection
				.validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity
	 * constraint of '<em>Hospital Discharge Medications Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection_validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalDischargeMedicationsSection
				.validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAllergiesSectionEntriesOptional(
			AllergiesSectionEntriesOptional allergiesSectionEntriesOptional,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allergiesSectionEntriesOptional,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(
					allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(allergiesSectionEntriesOptional,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(allergiesSectionEntriesOptional,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(
					allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
					allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
					allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalTemplateId(
							allergiesSectionEntriesOptional, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalCode(
							allergiesSectionEntriesOptional, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalTitle(
							allergiesSectionEntriesOptional, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalText(
							allergiesSectionEntriesOptional, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= consolValidator
					.validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalAllergyProblemAct(
							allergiesSectionEntriesOptional, diagnostics,
							context);
		if (result || diagnostics != null)
			result &= validateAllergiesSectionEntriesOptional_validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
					allergiesSectionEntriesOptional, diagnostics, context);
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
		return allergiesSectionEntriesOptional
				.validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vdtInpatientPatientInfo,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(vdtInpatientPatientInfo,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(vdtInpatientPatientInfo,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(vdtInpatientPatientInfo, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(vdtInpatientPatientInfo,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(vdtInpatientPatientInfo,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
					vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
					vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVDTInpatientPatientInfo_validateGeneralHeaderConstraintsTemplateId(
					vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(
					vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
					vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
					vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(
					vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements(
					vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(
					vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoMedicationListConstraint(
					vdtInpatientPatientInfo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection
	 * constraint of '<em>VDT Inpatient Patient Info</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo
				.validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements
	 * constraint of '<em>VDT Inpatient Patient Info</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo
				.validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection
	 * constraint of '<em>VDT Inpatient Patient Info</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo
				.validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(
						diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoMedicationListConstraint
	 * constraint of '<em>VDT Inpatient Patient Info</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoMedicationListConstraint(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo
				.validateVDTInpatientPatientInfoMedicationListConstraint(
						diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '
	 * <em>VDT Inpatient Patient Info</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateGeneralHeaderConstraintsTemplateId(
			VDTInpatientPatientInfo vdtInpatientPatientInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo
				.validateGeneralHeaderConstraintsTemplateId(diagnostics,
						context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecord(
			CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createTransmitSummaryOfCareRecord,
				diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
				createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(createTransmitSummaryOfCareRecord,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCreateTransmitSummaryOfCareRecord_validateGeneralHeaderConstraintsTemplateId(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(
					createTransmitSummaryOfCareRecord, diagnostics, context);
		return result;
	}

	/**
	 * Validates the
	 * validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection
	 * constraint of '<em>Create Transmit Summary Of Care Record</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createTransmitSummaryOfCareRecord
				.validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements
	 * constraint of '<em>Create Transmit Summary Of Care Record</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
			CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createTransmitSummaryOfCareRecord
				.validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection
	 * constraint of '<em>Create Transmit Summary Of Care Record</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(
			CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createTransmitSummaryOfCareRecord
				.validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(
						diagnostics, context);
	}

	/**
	 * Validates the
	 * validateCreateTransmitSummaryOfCareRecordMedicationListConstraint
	 * constraint of '<em>Create Transmit Summary Of Care Record</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(
			CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createTransmitSummaryOfCareRecord
				.validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(
						diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '
	 * <em>Create Transmit Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecord_validateGeneralHeaderConstraintsTemplateId(
			CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createTransmitSummaryOfCareRecord
				.validateGeneralHeaderConstraintsTemplateId(diagnostics,
						context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this
	 * validator's diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Mu2consolPlugin.INSTANCE;
	}

} // Mu2consolValidator
