package org.openhealthtools.mdht.uml.cda.mu2consol.operations;


import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Summary Of Care Record</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Mu2 Encounter Diagnoses Requirements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Can Have Either Required Or Optional Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMedicationListConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Medication List Constraint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Allergies Section Entries Optional Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Plan Of Care Section Care Planning For Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Medications Administered Section Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Instructions Section Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Assessment Section Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Postoperative Diagnosis Section Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Postprocedure Diagnosis Section Postprocedure Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Preoperative Diagnosis Section Preoperative Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getEncountersSection() <em>Get Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getInterventionsSection() <em>Get Interventions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getInstructionsSection() <em>Get Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalDischargeInstructionsSection() <em>Get Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalAdmissionDiagnosisSection() <em>Get Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalDischargeDiagnosisSection() <em>Get Hospital Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPostoperativeDiagnosisSection() <em>Get Postoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPreoperativeDiagnosisSection() <em>Get Preoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalAdmissionMedicationsSectionEntriesOptional() <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalDischargeMedicationsSection() <em>Get Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPostprocedureDiagnosisSection() <em>Get Postprocedure Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getReasonForReferralSection() <em>Get Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SummaryOfCareRecordOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SummaryOfCareRecordOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or "+
" self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor "+
" self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Cannot Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or 
	 *  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor 
	 *  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection"),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Mu2 Encounter Diagnoses Requirements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentAndPlanSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionDiagnosisSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeDiagnosisSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PostoperativeDiagnosisSection)) or  "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PostprocedureDiagnosisSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::ProblemSection)) )";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Mu2 Encounter Diagnoses Requirements</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentAndPlanSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionDiagnosisSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeDiagnosisSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PostoperativeDiagnosisSection)) or  
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PostprocedureDiagnosisSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::ProblemSection)) )
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SummaryOfCareRecordMu2EncounterDiagnosesRequirements", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(summaryOfCareRecord, context) }),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Can Have Either Required Or Optional Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSection)) or  "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Can Have Either Required Or Optional Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSection)) or  
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection"),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordMedicationListConstraint(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Medication List Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordMedicationListConstraint(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::MedicationsSection)) or  "+
" self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional)) or "+
" self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordMedicationListConstraint(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Medication List Constraint</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordMedicationListConstraint(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::MedicationsSection)) or  
	 *  self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional)) or 
	 *  self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSummaryOfCareRecordMedicationListConstraint(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordMedicationListConstraint"),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordPlanOfCareSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordPlanOfCareSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordPlanOfCareSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordPlanOfCareSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSummaryOfCareRecordPlanOfCareSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordPlanOfCareSection"),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordInstructionsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Instructions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordInstructionsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::InstructionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordInstructionsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Instructions Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordInstructionsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::InstructionsSection))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSummaryOfCareRecordInstructionsSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordInstructionsSection"),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordHospitalDischargeInstructionsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Hospital Discharge Instructions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordHospitalDischargeInstructionsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordHospitalDischargeInstructionsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Hospital Discharge Instructions Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordHospitalDischargeInstructionsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSummaryOfCareRecordHospitalDischargeInstructionsSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordHospitalDischargeInstructionsSection"),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordProblemSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordProblemSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordProblemSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Problem Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordProblemSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSummaryOfCareRecordProblemSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordProblemSection"),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordMedicationsAdministeredSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Medications Administered Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordMedicationsAdministeredSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::MedicationsAdministeredSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordMedicationsAdministeredSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Medications Administered Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordMedicationsAdministeredSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::MedicationsAdministeredSection))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSummaryOfCareRecordMedicationsAdministeredSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordMedicationsAdministeredSection"),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordSocialHistorySection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordSocialHistorySection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordSocialHistorySection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordSocialHistorySection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSummaryOfCareRecordSocialHistorySection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordSocialHistorySection"),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordResultsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordResultsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordResultsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordResultsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSummaryOfCareRecordResultsSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_RESULTS_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordResultsSection"),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordProceduresSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordProceduresSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordProceduresSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Procedures Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordProceduresSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSummaryOfCareRecordProceduresSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordProceduresSection"),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getHospitalAdmissionMedicationsSectionEntriesOptional()->reject(entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AdmissionMedication)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.->reject(entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AdmissionMedication)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(summaryOfCareRecord);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Allergies Section Entries Optional Allergy Problem Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllergiesSectionEntriesOptional()->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AllergyProblemAct)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Allergies Section Entries Optional Allergy Problem Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AllergyProblemAct)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(summaryOfCareRecord);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Plan Of Care Section Care Planning For Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getPlanOfCareSection()->reject(getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::PlanOfCareActivityAct)) or getObservations()->exists(o : cda::Observation | o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or getEncounters()->exists(e : cda::Encounter | e.oclIsKindOf(consol::PlanOfCareActivityEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Plan Of Care Section Care Planning For Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.->reject(getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::PlanOfCareActivityAct)) or getObservations()->exists(o : cda::Observation | o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or getEncounters()->exists(e : cda::Encounter | e.oclIsKindOf(consol::PlanOfCareActivityEncounter)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(summaryOfCareRecord);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Medications Administered Section Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getMedicationsAdministeredSection()->reject(entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Medications Administered Section Medication Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.->reject(entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(summaryOfCareRecord);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Instructions Section Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getInstructionsSection()->reject(entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::Instructions)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Instructions Section Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.->reject(entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::Instructions)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(summaryOfCareRecord);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordmu2consolInstructionsSectionInstructions"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Assessment Section Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAssessmentSection()->reject(entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ProblemObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Assessment Section Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ProblemObservation)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(summaryOfCareRecord);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordmu2consolAssessmentSectionProblemObservation"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getHospitalAdmissionDiagnosisSection()->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(summaryOfCareRecord);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getHospitalDischargeDiagnosisSection()->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalDischargeDiagnosis)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalDischargeDiagnosis)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(summaryOfCareRecord);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Postoperative Diagnosis Section Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getPostoperativeDiagnosisSection()->reject(entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ProblemObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Postoperative Diagnosis Section Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ProblemObservation)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(summaryOfCareRecord);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Postprocedure Diagnosis Section Postprocedure Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getPostprocedureDiagnosisSection()->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PostprocedureDiagnosis)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Postprocedure Diagnosis Section Postprocedure Diagnosis</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PostprocedureDiagnosis)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(summaryOfCareRecord);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Preoperative Diagnosis Section Preoperative Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getPreoperativeDiagnosisSection()->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PreoperativeDiagnosis)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Recordmu2consol Preoperative Diagnosis Section Preoperative Diagnosis</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PreoperativeDiagnosis)))
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(summaryOfCareRecord);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORDMU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS,
						 Mu2consolPlugin.INSTANCE.getString("SummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncountersSection(SummaryOfCareRecord) <em>Get Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))->asSequence()->any(true).oclAsType(consol::EncountersSection)";

	/**
	 * The cached OCL query for the '{@link #getEncountersSection(SummaryOfCareRecord) <em>Get Encounters Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))->asSequence()->any(true).oclAsType(consol::EncountersSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EncountersSection getEncountersSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_ENCOUNTERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(57));
			try {
				GET_ENCOUNTERS_SECTION__EOCL_QRY = helper.createQuery(GET_ENCOUNTERS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTERS_SECTION__EOCL_QRY);
		return (EncountersSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(SummaryOfCareRecord) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(SummaryOfCareRecord) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  PlanOfCareSection getPlanOfCareSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(58));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(SummaryOfCareRecord) <em>Get Assessment And Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AssessmentAndPlanSection))->asSequence()->any(true).oclAsType(mu2consol::AssessmentAndPlanSection)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentAndPlanSection(SummaryOfCareRecord) <em>Get Assessment And Plan Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AssessmentAndPlanSection))->asSequence()->any(true).oclAsType(mu2consol::AssessmentAndPlanSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AssessmentAndPlanSection getAssessmentAndPlanSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(59));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
		return (AssessmentAndPlanSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInterventionsSection(SummaryOfCareRecord) <em>Get Interventions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERVENTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection))->asSequence()->any(true).oclAsType(consol::InterventionsSection)";

	/**
	 * The cached OCL query for the '{@link #getInterventionsSection(SummaryOfCareRecord) <em>Get Interventions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERVENTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection))->asSequence()->any(true).oclAsType(consol::InterventionsSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  InterventionsSection getInterventionsSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_INTERVENTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(60));
			try {
				GET_INTERVENTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_INTERVENTIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERVENTIONS_SECTION__EOCL_QRY);
		return (InterventionsSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstructionsSection(SummaryOfCareRecord) <em>Get Instructions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::InstructionsSection))->asSequence()->any(true).oclAsType(mu2consol::InstructionsSection)";

	/**
	 * The cached OCL query for the '{@link #getInstructionsSection(SummaryOfCareRecord) <em>Get Instructions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::InstructionsSection))->asSequence()->any(true).oclAsType(mu2consol::InstructionsSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  InstructionsSection getInstructionsSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_INSTRUCTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(61));
			try {
				GET_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTIONS_SECTION__EOCL_QRY);
		return (InstructionsSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeInstructionsSection(SummaryOfCareRecord) <em>Get Hospital Discharge Instructions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeInstructionsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalDischargeInstructionsSection(SummaryOfCareRecord) <em>Get Hospital Discharge Instructions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeInstructionsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(62));
			try {
				GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY);
		return (HospitalDischargeInstructionsSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentSection(SummaryOfCareRecord) <em>Get Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AssessmentSection))->asSequence()->any(true).oclAsType(mu2consol::AssessmentSection)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentSection(SummaryOfCareRecord) <em>Get Assessment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AssessmentSection))->asSequence()->any(true).oclAsType(mu2consol::AssessmentSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AssessmentSection getAssessmentSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_ASSESSMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(63));
			try {
				GET_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SECTION__EOCL_QRY);
		return (AssessmentSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalAdmissionDiagnosisSection(SummaryOfCareRecord) <em>Get Hospital Admission Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalAdmissionDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalAdmissionDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::HospitalAdmissionDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalAdmissionDiagnosisSection(SummaryOfCareRecord) <em>Get Hospital Admission Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalAdmissionDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalAdmissionDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::HospitalAdmissionDiagnosisSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(64));
			try {
				GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY);
		return (HospitalAdmissionDiagnosisSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeDiagnosisSection(SummaryOfCareRecord) <em>Get Hospital Discharge Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalDischargeDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::HospitalDischargeDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalDischargeDiagnosisSection(SummaryOfCareRecord) <em>Get Hospital Discharge Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalDischargeDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::HospitalDischargeDiagnosisSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HospitalDischargeDiagnosisSection getHospitalDischargeDiagnosisSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(65));
			try {
				GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (HospitalDischargeDiagnosisSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPostoperativeDiagnosisSection(SummaryOfCareRecord) <em>Get Postoperative Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostoperativeDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PostoperativeDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::PostoperativeDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getPostoperativeDiagnosisSection(SummaryOfCareRecord) <em>Get Postoperative Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostoperativeDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PostoperativeDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::PostoperativeDiagnosisSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  PostoperativeDiagnosisSection getPostoperativeDiagnosisSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(66));
			try {
				GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (PostoperativeDiagnosisSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection(SummaryOfCareRecord) <em>Get Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->any(true).oclAsType(consol::ProblemSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection(SummaryOfCareRecord) <em>Get Problem Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->any(true).oclAsType(consol::ProblemSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ProblemSection getProblemSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(67));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSection(SummaryOfCareRecord) <em>Get Allergies Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->any(true).oclAsType(consol::AllergiesSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSection(SummaryOfCareRecord) <em>Get Allergies Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->any(true).oclAsType(consol::AllergiesSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AllergiesSection getAllergiesSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_ALLERGIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(68));
			try {
				GET_ALLERGIES_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION__EOCL_QRY);
		return (AllergiesSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection(SummaryOfCareRecord) <em>Get History Of Past Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPastIllnessSection)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPastIllnessSection(SummaryOfCareRecord) <em>Get History Of Past Illness Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPastIllnessSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HistoryOfPastIllnessSection getHistoryOfPastIllnessSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(69));
			try {
				GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPastIllnessSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForVisitSection(SummaryOfCareRecord) <em>Get Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForVisitSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)";

	/**
	 * The cached OCL query for the '{@link #getReasonForVisitSection(SummaryOfCareRecord) <em>Get Reason For Visit Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForVisitSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ReasonForVisitSection getReasonForVisitSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(70));
			try {
				GET_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ReasonForVisitSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintSection(SummaryOfCareRecord) <em>Get Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintSection(SummaryOfCareRecord) <em>Get Chief Complaint Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ChiefComplaintSection getChiefComplaintSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(71));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintAndReasonForVisitSection(SummaryOfCareRecord) <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintAndReasonForVisitSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintAndReasonForVisitSection(SummaryOfCareRecord) <em>Get Chief Complaint And Reason For Visit Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintAndReasonForVisitSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(72));
			try {
				GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ChiefComplaintAndReasonForVisitSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPreoperativeDiagnosisSection(SummaryOfCareRecord) <em>Get Preoperative Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreoperativeDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PreoperativeDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::PreoperativeDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getPreoperativeDiagnosisSection(SummaryOfCareRecord) <em>Get Preoperative Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreoperativeDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PreoperativeDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::PreoperativeDiagnosisSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  PreoperativeDiagnosisSection getPreoperativeDiagnosisSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(73));
			try {
				GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (PreoperativeDiagnosisSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection(SummaryOfCareRecord) <em>Get Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection(SummaryOfCareRecord) <em>Get Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ImmunizationsSection getImmunizationsSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(74));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsAdministeredSection(SummaryOfCareRecord) <em>Get Medications Administered Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsAdministeredSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::MedicationsAdministeredSection))->asSequence()->any(true).oclAsType(mu2consol::MedicationsAdministeredSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsAdministeredSection(SummaryOfCareRecord) <em>Get Medications Administered Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsAdministeredSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::MedicationsAdministeredSection))->asSequence()->any(true).oclAsType(mu2consol::MedicationsAdministeredSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  MedicationsAdministeredSection getMedicationsAdministeredSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(75));
			try {
				GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY);
		return (MedicationsAdministeredSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(SummaryOfCareRecord) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(SummaryOfCareRecord) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  MedicationsSection getMedicationsSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(76));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalAdmissionMedicationsSectionEntriesOptional(SummaryOfCareRecord) <em>Get Hospital Admission Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalAdmissionMedicationsSectionEntriesOptional(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getHospitalAdmissionMedicationsSectionEntriesOptional(SummaryOfCareRecord) <em>Get Hospital Admission Medications Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalAdmissionMedicationsSectionEntriesOptional(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HospitalAdmissionMedicationsSectionEntriesOptional getHospitalAdmissionMedicationsSectionEntriesOptional(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(77));
			try {
				GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (HospitalAdmissionMedicationsSectionEntriesOptional) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeMedicationsSection(SummaryOfCareRecord) <em>Get Hospital Discharge Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeMedicationsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeMedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalDischargeMedicationsSection(SummaryOfCareRecord) <em>Get Hospital Discharge Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeMedicationsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeMedicationsSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(78));
			try {
				GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY);
		return (HospitalDischargeMedicationsSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(SummaryOfCareRecord) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->any(true).oclAsType(consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(SummaryOfCareRecord) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->any(true).oclAsType(consol::SocialHistorySection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  SocialHistorySection getSocialHistorySection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(79));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSection(SummaryOfCareRecord) <em>Get Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->any(true).oclAsType(consol::ResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getResultsSection(SummaryOfCareRecord) <em>Get Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->any(true).oclAsType(consol::ResultsSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ResultsSection getResultsSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(80));
			try {
				GET_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION__EOCL_QRY);
		return (ResultsSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(SummaryOfCareRecord) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->any(true).oclAsType(consol::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(SummaryOfCareRecord) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->any(true).oclAsType(consol::VitalSignsSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  VitalSignsSection getVitalSignsSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(81));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional(SummaryOfCareRecord) <em>Get Vital Signs Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional(SummaryOfCareRecord) <em>Get Vital Signs Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(82));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSection(SummaryOfCareRecord) <em>Get Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))->asSequence()->any(true).oclAsType(consol::ProceduresSection)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSection(SummaryOfCareRecord) <em>Get Procedures Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))->asSequence()->any(true).oclAsType(consol::ProceduresSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ProceduresSection getProceduresSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_PROCEDURES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(83));
			try {
				GET_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
		return (ProceduresSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(SummaryOfCareRecord) <em>Get Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(mu2consol::AllergiesSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(SummaryOfCareRecord) <em>Get Allergies Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(mu2consol::AllergiesSectionEntriesOptional)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(84));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (AllergiesSectionEntriesOptional) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPostprocedureDiagnosisSection(SummaryOfCareRecord) <em>Get Postprocedure Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostprocedureDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PostprocedureDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::PostprocedureDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getPostprocedureDiagnosisSection(SummaryOfCareRecord) <em>Get Postprocedure Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostprocedureDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PostprocedureDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::PostprocedureDiagnosisSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  PostprocedureDiagnosisSection getPostprocedureDiagnosisSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(85));
			try {
				GET_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (PostprocedureDiagnosisSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForReferralSection(SummaryOfCareRecord) <em>Get Reason For Referral Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForReferralSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_REFERRAL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection))->asSequence()->any(true).oclAsType(consol::ReasonForReferralSection)";

	/**
	 * The cached OCL query for the '{@link #getReasonForReferralSection(SummaryOfCareRecord) <em>Get Reason For Referral Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForReferralSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection))->asSequence()->any(true).oclAsType(consol::ReasonForReferralSection)
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ReasonForReferralSection getReasonForReferralSection(SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD, Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD.getEAllOperations().get(86));
			try {
				GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_REFERRAL_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY);
		return (ReasonForReferralSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.11.11.11.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.11.11.11.1.1')
	 * @param summaryOfCareRecord The receiving '<em><b>Summary Of Care Record</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralHeaderConstraintsTemplateId(SummaryOfCareRecord summaryOfCareRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SUMMARY_OF_CARE_RECORD__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(summaryOfCareRecord, context) }),
						 new Object [] { summaryOfCareRecord }));
			}
			 
			return false;
		}
		return true;
	}

} // SummaryOfCareRecordOperations