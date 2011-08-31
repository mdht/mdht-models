/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest;
import org.openhealthtools.mdht.uml.cda.toc.ToCPackage;
import org.openhealthtools.mdht.uml.cda.toc.ToCPlugin;
import org.openhealthtools.mdht.uml.cda.toc.util.ToCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Request</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestProblemListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestSurgeriesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestDiagnosticResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestPhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestReasonForReferralSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getAllergiesReactionsSection() <em>Get Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getProblemListSection() <em>Get Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getSurgeriesSection() <em>Get Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getDiagnosticResultsSection() <em>Get Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getReasonForReferralSection() <em>Get Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getEncountersSection() <em>Get Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsultationRequestOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsultationRequestOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestAllergiesReactionsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestAllergiesReactionsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestAllergiesReactionsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Allergies Reactions Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestAllergiesReactionsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestAllergiesReactionsSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_REQUEST_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_ALLERGIES_REACTIONS_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestAllergiesReactionsSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestMedicationsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestMedicationsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestMedicationsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestMedicationsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicationsSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestMedicationsSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_MEDICATIONS_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestMedicationsSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestProblemListSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Problem List Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestProblemListSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestProblemListSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Problem List Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestProblemListSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestProblemListSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_PROBLEM_LIST_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestProblemListSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestSurgeriesSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestSurgeriesSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::SurgeriesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestSurgeriesSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Surgeries Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestSurgeriesSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::SurgeriesSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestSurgeriesSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_SURGERIES_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestSurgeriesSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestDiagnosticResultsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Diagnostic Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestDiagnosticResultsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::DiagnosticResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestDiagnosticResultsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Diagnostic Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestDiagnosticResultsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::DiagnosticResultsSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestDiagnosticResultsSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_REQUEST_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_DIAGNOSTIC_RESULTS_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestDiagnosticResultsSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestAdvanceDirectivesSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestAdvanceDirectivesSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestAdvanceDirectivesSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Advance Directives Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestAdvanceDirectivesSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestAdvanceDirectivesSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_REQUEST_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_ADVANCE_DIRECTIVES_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestAdvanceDirectivesSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestAssessmentAndPlanSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Assessment And Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestAssessmentAndPlanSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AssessmentAndPlanSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestAssessmentAndPlanSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Assessment And Plan Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestAssessmentAndPlanSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AssessmentAndPlanSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestAssessmentAndPlanSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_REQUEST_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_ASSESSMENT_AND_PLAN_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestAssessmentAndPlanSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestHistoryOfPresentIllness(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestHistoryOfPresentIllness(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::HistoryOfPresentIllness))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestHistoryOfPresentIllness(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request History Of Present Illness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestHistoryOfPresentIllness(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::HistoryOfPresentIllness))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestHistoryOfPresentIllness(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_HISTORY_OF_PRESENT_ILLNESS,
					ToCPlugin.INSTANCE.getString("ConsultationRequestHistoryOfPresentIllness"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestPhysicalExamSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Physical Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestPhysicalExamSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PhysicalExamSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestPhysicalExamSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Physical Exam Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestPhysicalExamSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PhysicalExamSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestPhysicalExamSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_PHYSICAL_EXAM_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestPhysicalExamSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestReasonForReferralSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Reason For Referral Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestReasonForReferralSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ReasonForReferralSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestReasonForReferralSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Reason For Referral Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestReasonForReferralSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ReasonForReferralSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestReasonForReferralSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_REQUEST_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_REASON_FOR_REFERRAL_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestReasonForReferralSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestEncountersSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestEncountersSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::EncountersSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestEncountersSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Encounters Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestEncountersSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::EncountersSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestEncountersSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_ENCOUNTERS_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestEncountersSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestFamilyHistorySection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestFamilyHistorySection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::FamilyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestFamilyHistorySection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestFamilyHistorySection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::FamilyHistorySection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestFamilyHistorySection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_FAMILY_HISTORY_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestFamilyHistorySection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestFunctionalStatusSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestFunctionalStatusSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::FunctionalStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestFunctionalStatusSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Functional Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestFunctionalStatusSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::FunctionalStatusSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestFunctionalStatusSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_REQUEST_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_FUNCTIONAL_STATUS_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestFunctionalStatusSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestImmunizationsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestImmunizationsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestImmunizationsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestImmunizationsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestImmunizationsSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_IMMUNIZATIONS_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestImmunizationsSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestMedicalEquipmentSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestMedicalEquipmentSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicalEquipmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestMedicalEquipmentSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Medical Equipment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestMedicalEquipmentSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicalEquipmentSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestMedicalEquipmentSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_REQUEST_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_MEDICAL_EQUIPMENT_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestMedicalEquipmentSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestPlanOfCareSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestPlanOfCareSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PlanOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestPlanOfCareSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestPlanOfCareSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PlanOfCareSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestPlanOfCareSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_PLAN_OF_CARE_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestPlanOfCareSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestSocialHistorySection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestSocialHistorySection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestSocialHistorySection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestSocialHistorySection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::SocialHistorySection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestSocialHistorySection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_SOCIAL_HISTORY_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestSocialHistorySection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestVitalSignsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestVitalSignsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::VitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestVitalSignsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestVitalSignsSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::VitalSignsSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestVitalSignsSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_VITAL_SIGNS_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestVitalSignsSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestChiefComplaintSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestChiefComplaintSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ChiefComplaintSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestChiefComplaintSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Chief Complaint Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestChiefComplaintSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ChiefComplaintSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestChiefComplaintSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_CHIEF_COMPLAINT_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestChiefComplaintSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestGeneralStatusSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestGeneralStatusSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::GeneralStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestGeneralStatusSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request General Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestGeneralStatusSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::GeneralStatusSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestGeneralStatusSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_GENERAL_STATUS_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestGeneralStatusSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestHistoryOfPastIllnessSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request History Of Past Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestHistoryOfPastIllnessSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::HistoryOfPastIllnessSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestHistoryOfPastIllnessSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request History Of Past Illness Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestHistoryOfPastIllnessSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::HistoryOfPastIllnessSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestHistoryOfPastIllnessSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_HISTORY_OF_PAST_ILLNESS_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestHistoryOfPastIllnessSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationRequestPayersSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestPayersSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_REQUEST_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PayersSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationRequestPayersSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Payers Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationRequestPayersSection(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_REQUEST_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PayersSection))
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationRequestPayersSection(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_REQUEST_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_CONSULTATION_REQUEST_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_REQUEST_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_REQUEST_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__CONSULTATION_REQUEST_PAYERS_SECTION,
					ToCPlugin.INSTANCE.getString("ConsultationRequestPayersSection"),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesReactionsSection(ConsultationRequest) <em>Get Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))->asSequence()->first().oclAsType(hitsp::AllergiesReactionsSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesReactionsSection(ConsultationRequest) <em>Get Allergies Reactions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))->asSequence()->first().oclAsType(hitsp::AllergiesReactionsSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergiesReactionsSection getAllergiesReactionsSection(ConsultationRequest consultationRequest) {
		if (GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(88));
			try {
				GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY);
		return (AllergiesReactionsSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(ConsultationRequest) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicationsSection))->asSequence()->first().oclAsType(hitsp::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(ConsultationRequest) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicationsSection))->asSequence()->first().oclAsType(hitsp::MedicationsSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationsSection getMedicationsSection(ConsultationRequest consultationRequest) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(89));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemListSection(ConsultationRequest) <em>Get Problem List Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemListSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_LIST_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))->asSequence()->first().oclAsType(hitsp::ProblemListSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemListSection(ConsultationRequest) <em>Get Problem List Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemListSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_LIST_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))->asSequence()->first().oclAsType(hitsp::ProblemListSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemListSection getProblemListSection(ConsultationRequest consultationRequest) {
		if (GET_PROBLEM_LIST_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(90));
			try {
				GET_PROBLEM_LIST_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_LIST_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_LIST_SECTION__EOCL_QRY);
		return (ProblemListSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSurgeriesSection(ConsultationRequest) <em>Get Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeriesSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SURGERIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::SurgeriesSection))->asSequence()->first().oclAsType(hitsp::SurgeriesSection)";

	/**
	 * The cached OCL query for the '{@link #getSurgeriesSection(ConsultationRequest) <em>Get Surgeries Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeriesSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SURGERIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::SurgeriesSection))->asSequence()->first().oclAsType(hitsp::SurgeriesSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SurgeriesSection getSurgeriesSection(ConsultationRequest consultationRequest) {
		if (GET_SURGERIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(91));
			try {
				GET_SURGERIES_SECTION__EOCL_QRY = helper.createQuery(GET_SURGERIES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SURGERIES_SECTION__EOCL_QRY);
		return (SurgeriesSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiagnosticResultsSection(ConsultationRequest) <em>Get Diagnostic Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticResultsSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::DiagnosticResultsSection))->asSequence()->first().oclAsType(hitsp::DiagnosticResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getDiagnosticResultsSection(ConsultationRequest) <em>Get Diagnostic Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticResultsSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::DiagnosticResultsSection))->asSequence()->first().oclAsType(hitsp::DiagnosticResultsSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static DiagnosticResultsSection getDiagnosticResultsSection(ConsultationRequest consultationRequest) {
		if (GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(92));
			try {
				GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY);
		return (DiagnosticResultsSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSection(ConsultationRequest) <em>Get Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))->asSequence()->first().oclAsType(hitsp::AdvanceDirectivesSection)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSection(ConsultationRequest) <em>Get Advance Directives Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))->asSequence()->first().oclAsType(hitsp::AdvanceDirectivesSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AdvanceDirectivesSection getAdvanceDirectivesSection(ConsultationRequest consultationRequest) {
		if (GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(93));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY);
		return (AdvanceDirectivesSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(ConsultationRequest) <em>Get Assessment And Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AssessmentAndPlanSection))->asSequence()->first().oclAsType(hitsp::AssessmentAndPlanSection)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentAndPlanSection(ConsultationRequest) <em>Get Assessment And Plan Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AssessmentAndPlanSection))->asSequence()->first().oclAsType(hitsp::AssessmentAndPlanSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AssessmentAndPlanSection getAssessmentAndPlanSection(ConsultationRequest consultationRequest) {
		if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(94));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
		return (AssessmentAndPlanSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllness(ConsultationRequest) <em>Get History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::HistoryOfPresentIllness))->asSequence()->first().oclAsType(hitsp::HistoryOfPresentIllness)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllness(ConsultationRequest) <em>Get History Of Present Illness</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::HistoryOfPresentIllness))->asSequence()->first().oclAsType(hitsp::HistoryOfPresentIllness)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static HistoryOfPresentIllness getHistoryOfPresentIllness(ConsultationRequest consultationRequest) {
		if (GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(95));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY);
		return (HistoryOfPresentIllness) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExamSection(ConsultationRequest) <em>Get Physical Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PhysicalExamSection))->asSequence()->first().oclAsType(hitsp::PhysicalExamSection)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExamSection(ConsultationRequest) <em>Get Physical Exam Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PhysicalExamSection))->asSequence()->first().oclAsType(hitsp::PhysicalExamSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PhysicalExamSection getPhysicalExamSection(ConsultationRequest consultationRequest) {
		if (GET_PHYSICAL_EXAM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(96));
			try {
				GET_PHYSICAL_EXAM_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_QRY);
		return (PhysicalExamSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForReferralSection(ConsultationRequest) <em>Get Reason For Referral Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForReferralSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_REFERRAL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ReasonForReferralSection))->asSequence()->first().oclAsType(hitsp::ReasonForReferralSection)";

	/**
	 * The cached OCL query for the '{@link #getReasonForReferralSection(ConsultationRequest) <em>Get Reason For Referral Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForReferralSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ReasonForReferralSection))->asSequence()->first().oclAsType(hitsp::ReasonForReferralSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ReasonForReferralSection getReasonForReferralSection(ConsultationRequest consultationRequest) {
		if (GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(97));
			try {
				GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_REFERRAL_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY);
		return (ReasonForReferralSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncountersSection(ConsultationRequest) <em>Get Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::EncountersSection))->asSequence()->first().oclAsType(hitsp::EncountersSection)";

	/**
	 * The cached OCL query for the '{@link #getEncountersSection(ConsultationRequest) <em>Get Encounters Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::EncountersSection))->asSequence()->first().oclAsType(hitsp::EncountersSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EncountersSection getEncountersSection(ConsultationRequest consultationRequest) {
		if (GET_ENCOUNTERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(98));
			try {
				GET_ENCOUNTERS_SECTION__EOCL_QRY = helper.createQuery(GET_ENCOUNTERS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTERS_SECTION__EOCL_QRY);
		return (EncountersSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(ConsultationRequest) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::FamilyHistorySection))->asSequence()->first().oclAsType(hitsp::FamilyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(ConsultationRequest) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::FamilyHistorySection))->asSequence()->first().oclAsType(hitsp::FamilyHistorySection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static FamilyHistorySection getFamilyHistorySection(ConsultationRequest consultationRequest) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(99));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection(ConsultationRequest) <em>Get Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::FunctionalStatusSection))->asSequence()->first().oclAsType(hitsp::FunctionalStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection(ConsultationRequest) <em>Get Functional Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::FunctionalStatusSection))->asSequence()->first().oclAsType(hitsp::FunctionalStatusSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static FunctionalStatusSection getFunctionalStatusSection(ConsultationRequest consultationRequest) {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(100));
			try {
				GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection(ConsultationRequest) <em>Get Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))->asSequence()->first().oclAsType(hitsp::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection(ConsultationRequest) <em>Get Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))->asSequence()->first().oclAsType(hitsp::ImmunizationsSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ImmunizationsSection getImmunizationsSection(ConsultationRequest consultationRequest) {
		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(101));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentSection(ConsultationRequest) <em>Get Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicalEquipmentSection))->asSequence()->first().oclAsType(hitsp::MedicalEquipmentSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicalEquipmentSection(ConsultationRequest) <em>Get Medical Equipment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicalEquipmentSection))->asSequence()->first().oclAsType(hitsp::MedicalEquipmentSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicalEquipmentSection getMedicalEquipmentSection(ConsultationRequest consultationRequest) {
		if (GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(102));
			try {
				GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY);
		return (MedicalEquipmentSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(ConsultationRequest) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PlanOfCareSection))->asSequence()->first().oclAsType(hitsp::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(ConsultationRequest) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PlanOfCareSection))->asSequence()->first().oclAsType(hitsp::PlanOfCareSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PlanOfCareSection getPlanOfCareSection(ConsultationRequest consultationRequest) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(103));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(ConsultationRequest) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::SocialHistorySection))->asSequence()->first().oclAsType(hitsp::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(ConsultationRequest) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::SocialHistorySection))->asSequence()->first().oclAsType(hitsp::SocialHistorySection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SocialHistorySection getSocialHistorySection(ConsultationRequest consultationRequest) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(104));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(ConsultationRequest) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::VitalSignsSection))->asSequence()->first().oclAsType(hitsp::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(ConsultationRequest) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::VitalSignsSection))->asSequence()->first().oclAsType(hitsp::VitalSignsSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static VitalSignsSection getVitalSignsSection(ConsultationRequest consultationRequest) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(105));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintSection(ConsultationRequest) <em>Get Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ChiefComplaintSection))->asSequence()->first().oclAsType(hitsp::ChiefComplaintSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintSection(ConsultationRequest) <em>Get Chief Complaint Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ChiefComplaintSection))->asSequence()->first().oclAsType(hitsp::ChiefComplaintSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ChiefComplaintSection getChiefComplaintSection(ConsultationRequest consultationRequest) {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(106));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGeneralStatusSection(ConsultationRequest) <em>Get General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENERAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::GeneralStatusSection))->asSequence()->first().oclAsType(cdt::GeneralStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getGeneralStatusSection(ConsultationRequest) <em>Get General Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENERAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::GeneralStatusSection))->asSequence()->first().oclAsType(cdt::GeneralStatusSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static GeneralStatusSection getGeneralStatusSection(ConsultationRequest consultationRequest) {
		if (GET_GENERAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(107));
			try {
				GET_GENERAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_QRY);
		return (GeneralStatusSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection(ConsultationRequest) <em>Get History Of Past Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::HistoryOfPastIllnessSection))->asSequence()->first().oclAsType(hitsp::HistoryOfPastIllnessSection)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPastIllnessSection(ConsultationRequest) <em>Get History Of Past Illness Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::HistoryOfPastIllnessSection))->asSequence()->first().oclAsType(hitsp::HistoryOfPastIllnessSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static HistoryOfPastIllnessSection getHistoryOfPastIllnessSection(ConsultationRequest consultationRequest) {
		if (GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(108));
			try {
				GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPastIllnessSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPayersSection(ConsultationRequest) <em>Get Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAYERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PayersSection))->asSequence()->first().oclAsType(hitsp::PayersSection)";

	/**
	 * The cached OCL query for the '{@link #getPayersSection(ConsultationRequest) <em>Get Payers Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection(ConsultationRequest)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAYERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PayersSection))->asSequence()->first().oclAsType(hitsp::PayersSection)
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PayersSection getPayersSection(ConsultationRequest consultationRequest) {
		if (GET_PAYERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.CONSULTATION_REQUEST,
				ToCPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(109));
			try {
				GET_PAYERS_SECTION__EOCL_QRY = helper.createQuery(GET_PAYERS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAYERS_SECTION__EOCL_QRY);
		return (PayersSection) query.evaluate(consultationRequest);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.2.3.4.5.103')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.2.3.4.5.103')
	 * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralHeaderConstraintsTemplateId(ConsultationRequest consultationRequest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.CONSULTATION_REQUEST);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationRequest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.CONSULTATION_REQUEST__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"GeneralHeaderConstraintsTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consultationRequest, context) }),
					new Object[] { consultationRequest }));
			}
			return false;
		}
		return true;
	}

} // ConsultationRequestOperations
