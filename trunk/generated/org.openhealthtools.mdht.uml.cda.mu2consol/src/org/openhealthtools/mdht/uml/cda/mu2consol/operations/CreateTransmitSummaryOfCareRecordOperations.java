/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Create Transmit Summary Of Care Record</b></em>' model
 * objects. <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord#validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Create Transmit Summary Of Care Record Cannot Have Chief
 * Complaint And Reason For Visit With Chief Complaint Section Or Reason Section
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord#validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Create Transmit Summary Of Care Record Mu2 Encounter Diagnoses
 * Requirements</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord#validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Create Transmit Summary Of Care Record Can Have Either Required
 * Or Optional Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord#validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Create Transmit Summary Of Care Record Medication List
 * Constraint</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CreateTransmitSummaryOfCareRecordOperations extends
		GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CreateTransmitSummaryOfCareRecordOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(CreateTransmitSummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Create Transmit Summary Of Care Record Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(CreateTransmitSummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or "
			+ " self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor "
			+ " self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(CreateTransmitSummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Create Transmit Summary Of Care Record Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(CreateTransmitSummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintSection)) or
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ReasonForVisitSection))) xor
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))
	 * 
	 * @param createTransmitSummaryOfCareRecord
	 *            The receiving '
	 *            <em><b>Create Transmit Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(createTransmitSummaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("CreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection"),
								new Object[] { createTransmitSummaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(CreateTransmitSummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Create Transmit Summary Of Care Record Mu2 Encounter Diagnoses Requirements</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(CreateTransmitSummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentAndPlanSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionDiagnosisSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeDiagnosisSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PostoperativeDiagnosisSection)) or  "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PostprocedureDiagnosisSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::ProblemSection)) )";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(CreateTransmitSummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Create Transmit Summary Of Care Record Mu2 Encounter Diagnoses Requirements</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(CreateTransmitSummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::AssessmentSection)) or self.getAllSections()->one(s
	 * : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::AssessmentAndPlanSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::HospitalAdmissionDiagnosisSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::HospitalDischargeDiagnosisSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::PostoperativeDiagnosisSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::PostprocedureDiagnosisSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::EncountersSection)) or self.getAllSections()->one(s
	 * : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::ProblemSection)) )
	 * 
	 * @param createTransmitSummaryOfCareRecord
	 *            The receiving '
	 *            <em><b>Create Transmit Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
			CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(createTransmitSummaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS,
								Mu2consolPlugin.INSTANCE
										.getString("CreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements"),
								new Object[] { createTransmitSummaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(CreateTransmitSummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Create Transmit Summary Of Care Record Can Have Either Required Or Optional Vital Signs Section</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(CreateTransmitSummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSection)) or  "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(CreateTransmitSummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Create Transmit Summary Of Care Record Can Have Either Required Or Optional Vital Signs Section</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(CreateTransmitSummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::VitalSignsSection)) or self.getAllSections()->one(s
	 * : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))
	 * 
	 * @param createTransmitSummaryOfCareRecord
	 *            The receiving '
	 *            <em><b>Create Transmit Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(
			CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(createTransmitSummaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("CreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection"),
								new Object[] { createTransmitSummaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(CreateTransmitSummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Create Transmit Summary Of Care Record Medication List Constraint</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(CreateTransmitSummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::MedicationsSection)) or  "
			+ " self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional)) or "
			+ " self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(CreateTransmitSummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Create Transmit Summary Of Care Record Medication List Constraint</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(CreateTransmitSummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::MedicationsSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional)
	 * ) or self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined()
	 * and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))
	 * 
	 * @param createTransmitSummaryOfCareRecord
	 *            The receiving '
	 *            <em><b>Create Transmit Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(
			CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(createTransmitSummaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT,
								Mu2consolPlugin.INSTANCE
										.getString("CreateTransmitSummaryOfCareRecordMedicationListConstraint"),
								new Object[] { createTransmitSummaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsTemplateId(CreateTransmitSummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsTemplateId(CreateTransmitSummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.11.11.11.1.2')";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsTemplateId(CreateTransmitSummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Template Id</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsTemplateId(CreateTransmitSummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.11.11.11.1.2')
	 * 
	 * @param createTransmitSummaryOfCareRecord
	 *            The receiving '
	 *            <em><b>Create Transmit Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(
			CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(createTransmitSummaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
								org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
										.getString(
												"_UI_GenericInvariant_diagnostic",
												new Object[] {
														"GeneralHeaderConstraintsTemplateId",
														org.eclipse.emf.ecore.util.EObjectValidator
																.getObjectLabel(
																		createTransmitSummaryOfCareRecord,
																		context) }),
								new Object[] { createTransmitSummaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

} // CreateTransmitSummaryOfCareRecordOperations