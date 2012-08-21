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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient Language Communication' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role' of 'General Header Constraints'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Mu2 Encounter Diagnoses Requirements' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Can Have Either Required Or Optional Vital Signs' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS = 8;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Plan Of Care Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Instructions Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Hospital Discharge Instructions Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Problem Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Medications Administered Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Social History Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Results Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_RESULTS_SECTION = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Procedures Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Instructions Section Instructions' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Assessment Section Problem Observation' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Preoperative Diagnosis Section Preoperative Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Medications Administered Section Medication Activity' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Instructions Section Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Hospital Admission Medications Section Entries Optional Admission Medication' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Summary Of Care Recordmu2consol Allergies Section
	 * Entries Optional Allergy Problem Act' of 'Summary Of Care Record'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Recordmu2consol Postprocedure Diagnosis Section Postprocedure Diagnosis' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Plan Of Care Section Care Planning For Plan Of Care' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment And Plan For Care Planning One Of Plan Of Care Entry' of 'Assessment And Plan For Care Planning'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING__ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING_ONE_OF_PLAN_OF_CARE_ENTRY = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment And Plan For Condition Or Concern Problem Observation' of 'Assessment And Plan For Condition Or Concern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN__ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN_PROBLEM_OBSERVATION = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Instructions Section Instructions' of 'Instructions Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTRUCTIONS_SECTION__MU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Instructions Section Template Id' of 'Instructions Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTRUCTIONS_SECTION__INSTRUCTIONS_SECTION_TEMPLATE_ID = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Assessment Section Problem Observation' of 'Assessment Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_SECTION__MU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis' of 'Hospital Discharge Diagnosis Section'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Postoperative Diagnosis Section Problem Observation' of 'Postoperative Diagnosis Section'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POSTOPERATIVE_DIAGNOSIS_SECTION__MU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Postprocedure Diagnosis Section
	 * Postprocedure Diagnosis' of 'Postprocedure Diagnosis Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int POSTPROCEDURE_DIAGNOSIS_SECTION__MU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Preoperative Diagnosis Section
	 * Preoperative Diagnosis' of 'Preoperative Diagnosis Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PREOPERATIVE_DIAGNOSIS_SECTION__MU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Validate Mu2consol Medications Administered Section
	 * Medication Activity' of 'Medications Administered Section'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__MU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Hospital Admission Medications Section Entries Optional Admission Medication' of 'Hospital Admission Medications Section Entries Optional'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__MU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mu2consol Allergies Section Entries Optional Allergy Problem Act' of 'Allergies Section Entries Optional'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_SECTION_ENTRIES_OPTIONAL__MU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT = 39;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 44;

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
			case Mu2consolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL:
				return validateAllergiesSectionEntriesOptional((AllergiesSectionEntriesOptional)value, diagnostics, context);
			case Mu2consolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION:
				return validatePostprocedureDiagnosisSection((PostprocedureDiagnosisSection)value, diagnostics, context);
			case Mu2consolPackage.ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING:
				return validateAssessmentAndPlanForCarePlanning((AssessmentAndPlanForCarePlanning)value, diagnostics, context);
			case Mu2consolPackage.ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN:
				return validateAssessmentAndPlanForConditionOrConcern((AssessmentAndPlanForConditionOrConcern)value, diagnostics, context);
			case Mu2consolPackage.INSTRUCTIONS_SECTION:
				return validateInstructionsSection((InstructionsSection)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(generalHeaderConstraints, diagnostics, context);
		return result;
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
	 * Validates the validateGeneralHeaderConstraintsRecordTarget constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTarget(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateGeneralHeaderConstraintsTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationListConstraint(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeInstructionsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProblemSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSectionTemplateId(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(summaryOfCareRecord, diagnostics, context);
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
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordMedicationListConstraint constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationListConstraint(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMedicationListConstraint(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordHospitalDischargeInstructionsSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeInstructionsSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordHospitalDischargeInstructionsSection(diagnostics, context);
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
	 * Validates the validateSummaryOfCareRecordInstructionsSectionTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSectionTemplateId(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * Validates the validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionText(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionPlanOfCareActivityAct(assessmentAndPlanForCarePlanning, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentAndPlanForCarePlanning_validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntry(assessmentAndPlanForCarePlanning, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntry constraint of '<em>Assessment And Plan For Care Planning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanForCarePlanning_validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntry(AssessmentAndPlanForCarePlanning assessmentAndPlanForCarePlanning, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionTemplateId(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionCode(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionText(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(planOfCareSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionText(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionPlanOfCareActivityAct(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentAndPlanForConditionOrConcern_validateAssessmentAndPlanForConditionOrConcernProblemObservation(assessmentAndPlanForConditionOrConcern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAssessmentAndPlanForConditionOrConcernProblemObservation constraint of '<em>Assessment And Plan For Condition Or Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanForConditionOrConcern_validateAssessmentAndPlanForConditionOrConcernProblemObservation(AssessmentAndPlanForConditionOrConcern assessmentAndPlanForConditionOrConcern, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionText(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionPlanOfCareActivityAct(assessmentAndPlanSection, diagnostics, context);
		return result;
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
	 * Validates the validateInstructionsSectionTemplateId constraint of '<em>Instructions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionsSection_validateInstructionsSectionTemplateId(InstructionsSection instructionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instructionsSection.validateInstructionsSectionTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentSection_validateAssessmentSectionTemplateId(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentSection_validateAssessmentSectionCode(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAssessmentSection_validateAssessmentSectionText(assessmentSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionTemplateId(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionCode(hospitalAdmissionDiagnosisSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionTemplateId(hospitalDischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalDischargeDiagnosisSection_validateHospitalDischargeDiagnosisSectionCode(hospitalDischargeDiagnosisSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validatePostoperativeDiagnosisSection_validatePostoperativeDiagnosisSectionTemplateId(postoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePostoperativeDiagnosisSection_validatePostoperativeDiagnosisSectionCode(postoperativeDiagnosisSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validatePostprocedureDiagnosisSection_validatePostprocedureDiagnosisSectionTemplateId(postprocedureDiagnosisSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionTemplateId(preoperativeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validatePreoperativeDiagnosisSection_validatePreoperativeDiagnosisSectionCode(preoperativeDiagnosisSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionTemplateId(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionCode(medicationsAdministeredSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateHospitalAdmissionMedicationsSectionEntriesOptional_validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(hospitalAdmissionMedicationsSectionEntriesOptional, diagnostics, context);
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
		if (result || diagnostics != null) result &= consolValidator.validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalTemplateId(allergiesSectionEntriesOptional, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateAllergiesSectionEntriesOptional_validateAllergiesSectionEntriesOptionalCode(allergiesSectionEntriesOptional, diagnostics, context);
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
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Mu2consolPlugin.INSTANCE;
	}

} // Mu2consolValidator
