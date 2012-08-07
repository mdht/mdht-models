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

import org.openhealthtools.mdht.uml.cda.mu2consol.*;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage
 * @generated
 */
public class Mu2consolValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Mu2consolValidator INSTANCE = new Mu2consolValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.mu2consol";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Record Target Patient Role Patient Language Communication' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Mu2 Encounter Diagnoses Requirements' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Can Have Either Required Or Optional Vital Signs Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Medication List Constraint' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Plan Of Care Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Instructions Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Hospital Discharge Instructions Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Medications Administered Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Social History Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Results Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_RESULTS_SECTION = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Summary Of Care Record Procedures Section' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUMMARY_OF_CARE_RECORD__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Mu2 Encounter Diagnoses Requirements' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Can Have Either Required Or Optional Vital Signs Section' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Ambulatory Patient Info Medication List Constraint' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__VDT_AMBULATORY_PATIENT_INFO_MEDICATION_LIST_CONSTRAINT = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'VDT Ambulatory Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_AMBULATORY_PATIENT_INFO__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Mu2 Encounter Diagnoses Requirements' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Can Have Either Required Or Optional Vital Signs Section' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Office Visit Summary Medication List Constraint' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST_CONSTRAINT = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Clinical Office Visit Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_OFFICE_VISIT_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Mu2 Encounter Diagnoses Requirements' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Can Have Either Required Or Optional Vital Signs Section' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate VDT Inpatient Patient Info Medication List Constraint' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST_CONSTRAINT = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'VDT Inpatient Patient Info'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VDT_INPATIENT_PATIENT_INFO__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Create Transmit Summary Of Care Record Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section' of 'Create Transmit Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Create Transmit Summary Of Care Record Mu2 Encounter Diagnoses Requirements' of 'Create Transmit Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Create Transmit Summary Of Care Record Can Have Either Required Or Optional Vital Signs Section' of 'Create Transmit Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Create Transmit Summary Of Care Record Medication List Constraint' of 'Create Transmit Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Create Transmit Summary Of Care Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 27;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 37;

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
	public Mu2consolValidator() {
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
	  return Mu2consolPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Mu2consolPackage.GENERAL_HEADER_CONSTRAINTS:
				return validateGeneralHeaderConstraints((GeneralHeaderConstraints)value, diagnostics, context);
			case Mu2consolPackage.SUMMARY_OF_CARE_RECORD:
				return validateSummaryOfCareRecord((SummaryOfCareRecord)value, diagnostics, context);
			case Mu2consolPackage.VDT_AMBULATORY_PATIENT_INFO:
				return validateVDTAmbulatoryPatientInfo((VDTAmbulatoryPatientInfo)value, diagnostics, context);
			case Mu2consolPackage.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD:
				return validateCreateTransmitSummaryOfCareRecord((CreateTransmitSummaryOfCareRecord)value, diagnostics, context);
			case Mu2consolPackage.VDT_INPATIENT_PATIENT_INFO:
				return validateVDTInpatientPatientInfo((VDTInpatientPatientInfo)value, diagnostics, context);
			case Mu2consolPackage.CLINICAL_OFFICE_VISIT_SUMMARY:
				return validateClinicalOfficeVisitSummary((ClinicalOfficeVisitSummary)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTarget constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTarget(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRolePatient constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRecordTargetPatientRole constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRecordTargetPatientRole(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationListConstraint(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeInstructionsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(summaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(summaryOfCareRecord, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordMedicationListConstraint constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationListConstraint(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMedicationListConstraint(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordPlanOfCareSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordPlanOfCareSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordInstructionsSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordInstructionsSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordInstructionsSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordHospitalDischargeInstructionsSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordHospitalDischargeInstructionsSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordHospitalDischargeInstructionsSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordMedicationsAdministeredSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordMedicationsAdministeredSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordMedicationsAdministeredSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordSocialHistorySection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordSocialHistorySection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordResultsSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordResultsSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateSummaryOfCareRecordProceduresSection constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateSummaryOfCareRecordProceduresSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateSummaryOfCareRecordProceduresSection(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecord_validateGeneralHeaderConstraintsTemplateId(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return summaryOfCareRecord.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo(VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateGeneralHeaderConstraintsTemplateId(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(vdtAmbulatoryPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoMedicationListConstraint(vdtAmbulatoryPatientInfo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements(VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTAmbulatoryPatientInfoMedicationListConstraint constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateVDTAmbulatoryPatientInfoMedicationListConstraint(VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateVDTAmbulatoryPatientInfoMedicationListConstraint(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfo_validateGeneralHeaderConstraintsTemplateId(VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtAmbulatoryPatientInfo.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateGeneralHeaderConstraintsTemplateId(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(clinicalOfficeVisitSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationListConstraint(clinicalOfficeVisitSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOfficeVisitSummaryMedicationListConstraint constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateClinicalOfficeVisitSummaryMedicationListConstraint(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateClinicalOfficeVisitSummaryMedicationListConstraint(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummary_validateGeneralHeaderConstraintsTemplateId(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOfficeVisitSummary.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateGeneralHeaderConstraintsTemplateId(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(vdtInpatientPatientInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoMedicationListConstraint(vdtInpatientPatientInfo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateVDTInpatientPatientInfoMedicationListConstraint constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateVDTInpatientPatientInfoMedicationListConstraint(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateVDTInpatientPatientInfoMedicationListConstraint(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfo_validateGeneralHeaderConstraintsTemplateId(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vdtInpatientPatientInfo.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecord(CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createTransmitSummaryOfCareRecord, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateTransmitSummaryOfCareRecord_validateGeneralHeaderConstraintsTemplateId(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(createTransmitSummaryOfCareRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(createTransmitSummaryOfCareRecord, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection constraint of '<em>Create Transmit Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createTransmitSummaryOfCareRecord.validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(diagnostics, context);
	}

	/**
	 * Validates the validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements constraint of '<em>Create Transmit Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createTransmitSummaryOfCareRecord.validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(diagnostics, context);
	}

	/**
	 * Validates the validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection constraint of '<em>Create Transmit Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createTransmitSummaryOfCareRecord.validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateCreateTransmitSummaryOfCareRecordMedicationListConstraint constraint of '<em>Create Transmit Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecord_validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createTransmitSummaryOfCareRecord.validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Create Transmit Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecord_validateGeneralHeaderConstraintsTemplateId(CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createTransmitSummaryOfCareRecord.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Mu2consolPlugin.INSTANCE;
	}

} //Mu2consolValidator
