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

import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Clinical Office Visit Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Cannot Have Chief Complaint And
 * Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Mu2 Encounter Diagnoses
 * Requirements</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Can Have Either Required Or
 * Optional Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationListConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Medication List Constraint</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ClinicalOfficeVisitSummaryOperations extends
		GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClinicalOfficeVisitSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or "
			+ " self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor "
			+ " self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("ClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection"),
								new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Mu2 Encounter Diagnoses Requirements</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentAndPlanSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionDiagnosisSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeDiagnosisSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PostoperativeDiagnosisSection)) or  "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PostprocedureDiagnosisSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::ProblemSection)) )";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Mu2 Encounter Diagnoses Requirements</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS,
								Mu2consolPlugin.INSTANCE
										.getString("ClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements"),
								new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Can Have Either Required Or Optional Vital Signs Section</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSection)) or  "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Can Have Either Required Or Optional Vital Signs Section</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::VitalSignsSection)) or self.getAllSections()->one(s
	 * : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("ClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection"),
								new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateClinicalOfficeVisitSummaryMedicationListConstraint(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Medication List Constraint</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateClinicalOfficeVisitSummaryMedicationListConstraint(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::MedicationsSection)) or  "
			+ " self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional)) or "
			+ " self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateClinicalOfficeVisitSummaryMedicationListConstraint(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Medication List Constraint</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateClinicalOfficeVisitSummaryMedicationListConstraint(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::MedicationsSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional)
	 * ) or self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined()
	 * and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryMedicationListConstraint(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST_CONSTRAINT,
								Mu2consolPlugin.INSTANCE
										.getString("ClinicalOfficeVisitSummaryMedicationListConstraint"),
								new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsTemplateId(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsTemplateId(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.11.11.11.1.5')";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsTemplateId(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Template Id</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsTemplateId(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.11.11.11.1.5')
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
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
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
								org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
										.getString(
												"_UI_GenericInvariant_diagnostic",
												new Object[] {
														"GeneralHeaderConstraintsTemplateId",
														org.eclipse.emf.ecore.util.EObjectValidator
																.getObjectLabel(
																		clinicalOfficeVisitSummary,
																		context) }),
								new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

} // ClinicalOfficeVisitSummaryOperations