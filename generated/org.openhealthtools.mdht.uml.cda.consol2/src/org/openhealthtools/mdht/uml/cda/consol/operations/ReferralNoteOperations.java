/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReferralNote;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Referral Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiver(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContact(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNotePlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteAdvanceDirectivesSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Advance Directives Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteImmunizationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Immunizations Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteProblemSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Problem Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteProceduresSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Procedures Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteResultsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Results Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteSocialHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteVitalSignsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Vital Signs Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteFunctionalStatusSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNotePhysicalExamSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteAdvanceDirectivesSectionEntriesOptional2b(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Advance Directives Section Entries Optional2b</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteNutritionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteMentalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Mental Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteMedicalEquipmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Medical Equipment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteAllergiesSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Allergies Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteAssessmentAndPlanSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteHistoryOfPastIllnessSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteMedicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteReasonForReferralSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Reason For Referral Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteFamilyHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipientPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipientAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipientTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getAdvanceDirectivesSectionEntriesOptional2() <em>Get Advance Directives Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getImmunizationsSection2() <em>Get Immunizations Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getProblemSection2() <em>Get Problem Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getProceduresSectionEntriesOptional2() <em>Get Procedures Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getResultsSection2() <em>Get Results Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getSocialHistorySection2() <em>Get Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getVitalSignsSection2() <em>Get Vital Signs Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getFunctionalStatusSection2() <em>Get Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getPhysicalExamSection2() <em>Get Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getAdvanceDirectivesSectionEntriesOptional2b() <em>Get Advance Directives Section Entries Optional2b</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getNutritionSection() <em>Get Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getMentalStatusSection() <em>Get Mental Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getMedicalEquipmentSection2() <em>Get Medical Equipment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getAllergiesSection2() <em>Get Allergies Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getAssessmentAndPlanSection2() <em>Get Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getHistoryOfPastIllnessSection2() <em>Get History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getMedicationsSection2() <em>Get Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getReasonForReferralSection2() <em>Get Reason For Referral Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getFamilyHistorySection2() <em>Get Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateUSRealmHeader2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferralNoteOperations extends USRealmHeader2Operations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferralNoteOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			ReferralNote referralNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ReferralNoteReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			ReferralNote referralNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT,
						ConsolPlugin.INSTANCE.getString(
							"ReferralNoteReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteCodeP(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteCodeP(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteCodeP(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteCodeP(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteCodeP(ReferralNote referralNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REFERRAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_REFERRAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_CODE_P,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteCodeP"),
						new Object[] { referralNote }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ReferralNoteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ReferralNoteCodeP", passToken);
				}
				passToken.add(referralNote);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteCode(ReferralNote referralNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ReferralNoteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(referralNote)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_REFERRAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REFERRAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_REFERRAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_CODE,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteCode"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteInformationRecipient(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteInformationRecipient(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->one(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteInformationRecipient(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteInformationRecipient(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteInformationRecipient(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_INFORMATION_RECIPIENT,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteInformationRecipient"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCaregiver(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiver(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->select(typeCode=vocab::ParticipationType::IND)->notEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCaregiver(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiver(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteParticipantCaregiver(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CAREGIVER,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteParticipantCaregiver"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCallbackContact(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContact(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->select(typeCode=vocab::ParticipationType::CALLBCK)->notEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCallbackContact(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContact(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteParticipantCallbackContact(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteParticipantCallbackContact"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNotePlanOfTreatmentSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNotePlanOfTreatmentSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNotePlanOfTreatmentSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNotePlanOfTreatmentSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNotePlanOfTreatmentSection2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PLAN_OF_TREATMENT_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNotePlanOfTreatmentSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteAdvanceDirectivesSectionEntriesOptional2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Advance Directives Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteAdvanceDirectivesSectionEntriesOptional2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteAdvanceDirectivesSectionEntriesOptional2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Advance Directives Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteAdvanceDirectivesSectionEntriesOptional2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteAdvanceDirectivesSectionEntriesOptional2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString(
							"ReferralNoteReferralNoteAdvanceDirectivesSectionEntriesOptional2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteHistoryOfPresentIllnessSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note History Of Present Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteHistoryOfPresentIllnessSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteHistoryOfPresentIllnessSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note History Of Present Illness Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteHistoryOfPresentIllnessSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteHistoryOfPresentIllnessSection(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteHistoryOfPresentIllnessSection"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteImmunizationsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Immunizations Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteImmunizationsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteImmunizationsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Immunizations Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteImmunizationsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteImmunizationsSection2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_IMMUNIZATIONS_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteImmunizationsSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteProblemSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Problem Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteProblemSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteProblemSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Problem Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteProblemSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteProblemSection2(ReferralNote referralNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REFERRAL_NOTE_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PROBLEM_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteProblemSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteProceduresSectionEntriesOptional2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Procedures Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteProceduresSectionEntriesOptional2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteProceduresSectionEntriesOptional2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Procedures Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteProceduresSectionEntriesOptional2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteProceduresSectionEntriesOptional2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteProceduresSectionEntriesOptional2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteResultsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Results Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteResultsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteResultsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Results Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteResultsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteResultsSection2(ReferralNote referralNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REFERRAL_NOTE_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_RESULTS_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteResultsSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteReviewOfSystemsSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteReviewOfSystemsSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteReviewOfSystemsSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteReviewOfSystemsSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteReviewOfSystemsSection(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_REVIEW_OF_SYSTEMS_SECTION,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteReviewOfSystemsSection"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteSocialHistorySection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Social History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteSocialHistorySection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteSocialHistorySection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Social History Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteSocialHistorySection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteSocialHistorySection2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_SOCIAL_HISTORY_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteSocialHistorySection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteVitalSignsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Vital Signs Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteVitalSignsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteVitalSignsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Vital Signs Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteVitalSignsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteVitalSignsSection2(ReferralNote referralNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_VITAL_SIGNS_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteVitalSignsSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteFunctionalStatusSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Functional Status Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteFunctionalStatusSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteFunctionalStatusSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Functional Status Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteFunctionalStatusSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteFunctionalStatusSection2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_FUNCTIONAL_STATUS_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteFunctionalStatusSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNotePhysicalExamSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Physical Exam Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNotePhysicalExamSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNotePhysicalExamSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Physical Exam Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNotePhysicalExamSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNotePhysicalExamSection2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PHYSICAL_EXAM_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNotePhysicalExamSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteAdvanceDirectivesSectionEntriesOptional2b(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Advance Directives Section Entries Optional2b</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteAdvanceDirectivesSectionEntriesOptional2b(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteAdvanceDirectivesSectionEntriesOptional2b(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Advance Directives Section Entries Optional2b</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteAdvanceDirectivesSectionEntriesOptional2b(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteAdvanceDirectivesSectionEntriesOptional2b(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B,
						ConsolPlugin.INSTANCE.getString(
							"ReferralNoteReferralNoteAdvanceDirectivesSectionEntriesOptional2b"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteNutritionSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Nutrition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteNutritionSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteNutritionSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Nutrition Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteNutritionSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteNutritionSection(ReferralNote referralNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REFERRAL_NOTE_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_NUTRITION_SECTION,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteNutritionSection"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteMentalStatusSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Mental Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteMentalStatusSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteMentalStatusSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Mental Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteMentalStatusSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteMentalStatusSection(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_MENTAL_STATUS_SECTION,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteMentalStatusSection"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteMedicalEquipmentSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Medical Equipment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteMedicalEquipmentSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteMedicalEquipmentSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Medical Equipment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteMedicalEquipmentSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteMedicalEquipmentSection2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_MEDICAL_EQUIPMENT_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteMedicalEquipmentSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteAllergiesSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Allergies Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteAllergiesSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteAllergiesSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Allergies Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteAllergiesSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteAllergiesSection2(ReferralNote referralNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REFERRAL_NOTE_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_ALLERGIES_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteAllergiesSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteAssessmentSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteAssessmentSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteAssessmentSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Assessment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteAssessmentSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteAssessmentSection(ReferralNote referralNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REFERRAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_ASSESSMENT_SECTION,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteAssessmentSection"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteAssessmentAndPlanSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Assessment And Plan Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteAssessmentAndPlanSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteAssessmentAndPlanSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Assessment And Plan Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteAssessmentAndPlanSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteAssessmentAndPlanSection2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_ASSESSMENT_AND_PLAN_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteAssessmentAndPlanSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteHistoryOfPastIllnessSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note History Of Past Illness Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteHistoryOfPastIllnessSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteHistoryOfPastIllnessSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note History Of Past Illness Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteHistoryOfPastIllnessSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteHistoryOfPastIllnessSection2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteHistoryOfPastIllnessSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteGeneralStatusSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteGeneralStatusSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteGeneralStatusSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note General Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteGeneralStatusSection(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteGeneralStatusSection(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_GENERAL_STATUS_SECTION,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteGeneralStatusSection"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteMedicationsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Medications Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteMedicationsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteMedicationsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Medications Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteMedicationsSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteMedicationsSection2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_MEDICATIONS_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteMedicationsSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteReasonForReferralSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Reason For Referral Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteReasonForReferralSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteReasonForReferralSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Reason For Referral Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteReasonForReferralSection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteReasonForReferralSection2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_REASON_FOR_REFERRAL_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteReasonForReferralSection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteFamilyHistorySection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Family History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteFamilyHistorySection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteFamilyHistorySection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Family History Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteFamilyHistorySection2(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REFERRAL_NOTE_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferralNoteFamilyHistorySection2(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_REFERRAL_NOTE_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REFERRAL_NOTE_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REFERRAL_NOTE_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_FAMILY_HISTORY_SECTION2,
						ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteFamilyHistorySection2"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteInformationRecipientIntendedRecipientPersonName(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteInformationRecipientIntendedRecipientPersonName(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null).informationRecipient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (( not name->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteInformationRecipientIntendedRecipientPersonName(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteInformationRecipientIntendedRecipientPersonName(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteInformationRecipientIntendedRecipientPersonName(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteInformationRecipientIntendedRecipientPersonName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteInformationRecipientIntendedRecipientAddr(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteInformationRecipientIntendedRecipientAddr(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteInformationRecipientIntendedRecipientAddr(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteInformationRecipientIntendedRecipientAddr(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteInformationRecipientIntendedRecipientAddr(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteInformationRecipientIntendedRecipientAddr"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteInformationRecipientIntendedRecipientTelecom(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteInformationRecipientIntendedRecipientTelecom(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteInformationRecipientIntendedRecipientTelecom(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteInformationRecipientIntendedRecipientTelecom(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteInformationRecipientIntendedRecipientTelecom(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteInformationRecipientIntendedRecipientTelecom"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(
			ReferralNote referralNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteInformationRecipientIntendedRecipientInformationRecipient"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteInformationRecipientIntendedRecipient(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteInformationRecipientIntendedRecipient(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteInformationRecipientIntendedRecipient(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteInformationRecipientIntendedRecipient(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteInformationRecipientIntendedRecipient(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteInformationRecipientIntendedRecipient"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Associated Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (( not name->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Associated Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(
			ReferralNote referralNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Class Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND).associatedEntity->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Class Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCaregiverAssociatedEntityClassCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND).associatedEntity->excluding(null)->reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassAssociative) and " +
			"let value : vocab::RoleClassAssociative = classCode.oclAsType(vocab::RoleClassAssociative) in " +
			"value = vocab::RoleClassAssociative::PRS or value = vocab::RoleClassAssociative::NOK or value = vocab::RoleClassAssociative::CAREGIVER or value = vocab::RoleClassAssociative::AGNT or value = vocab::RoleClassAssociative::GUAR or value = vocab::RoleClassAssociative::ECON)";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCaregiverAssociatedEntityClassCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(
			ReferralNote referralNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCaregiverTypeCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiverTypeCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND)->select(typeCode=vocab::ParticipationType::IND)->reject(typeCode=vocab::ParticipationType::IND)";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCaregiverTypeCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiverTypeCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCaregiverTypeCode(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CAREGIVER_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString("ReferralNoteReferralNoteParticipantCaregiverTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCaregiverAssociatedEntity(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiverAssociatedEntity(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND)->select(typeCode=vocab::ParticipationType::IND)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCaregiverAssociatedEntity(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCaregiverAssociatedEntity(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCaregiverAssociatedEntity(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCaregiverAssociatedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Associated Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (( not name->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Associated Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			ReferralNote referralNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityId(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityId(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (( not id->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityId(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityId(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCallbackContactAssociatedEntityId(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCallbackContactAssociatedEntityId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCallbackContactAssociatedEntityAddr"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (( not telecom->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(
			ReferralNote referralNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCallbackContactAssociatedEntityTelecom"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null)->reject(classCode=vocab::RoleClassAssociative::ASSIGNED)";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(
			ReferralNote referralNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCallbackContactAssociatedEntityClassCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(
			ReferralNote referralNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Scoping Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null)->reject(scopingOrganization->one(scopingOrganization : cda::Organization | not scopingOrganization.oclIsUndefined() and scopingOrganization.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Scoping Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(
			ReferralNote referralNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCallbackContactTypeCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactTypeCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK)->select(typeCode=vocab::ParticipationType::CALLBCK)->reject(typeCode=vocab::ParticipationType::CALLBCK)";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCallbackContactTypeCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactTypeCode(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCallbackContactTypeCode(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCallbackContactTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntity(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntity(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK)->select(typeCode=vocab::ParticipationType::CALLBCK)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralNoteParticipantCallbackContactAssociatedEntity(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralNoteParticipantCallbackContactAssociatedEntity(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateReferralNoteParticipantCallbackContactAssociatedEntity(ReferralNote referralNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			referralNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.REFERRAL_NOTE__REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"ReferralNoteReferralNoteParticipantCallbackContactAssociatedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfTreatmentSection2(ReferralNote) <em>Get Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))->asSequence()->any(true).oclAsType(consol::PlanOfTreatmentSection2)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfTreatmentSection2(ReferralNote) <em>Get Plan Of Treatment Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanOfTreatmentSection2 getPlanOfTreatmentSection2(ReferralNote referralNote) {

		if (GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(394));
			try {
				GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY = helper.createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY);
		return (PlanOfTreatmentSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSectionEntriesOptional2(ReferralNote) <em>Get Advance Directives Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSectionEntriesOptional2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::AdvanceDirectivesSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSectionEntriesOptional2(ReferralNote) <em>Get Advance Directives Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSectionEntriesOptional2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AdvanceDirectivesSectionEntriesOptional2 getAdvanceDirectivesSectionEntriesOptional2(
			ReferralNote referralNote) {

		if (GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(395));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (AdvanceDirectivesSectionEntriesOptional2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllnessSection(ReferralNote) <em>Get History Of Present Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllnessSection(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPresentIllnessSection)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllnessSection(ReferralNote) <em>Get History Of Present Illness Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllnessSection(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection(ReferralNote referralNote) {

		if (GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(396));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(
					GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPresentIllnessSection) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection2(ReferralNote) <em>Get Immunizations Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection2))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection2)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection2(ReferralNote) <em>Get Immunizations Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ImmunizationsSection2 getImmunizationsSection2(ReferralNote referralNote) {

		if (GET_IMMUNIZATIONS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(397));
			try {
				GET_IMMUNIZATIONS_SECTION2__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_IMMUNIZATIONS_SECTION2__EOCL_QRY);
		return (ImmunizationsSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection2(ReferralNote) <em>Get Problem Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2))->asSequence()->any(true).oclAsType(consol::ProblemSection2)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection2(ReferralNote) <em>Get Problem Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProblemSection2 getProblemSection2(ReferralNote referralNote) {

		if (GET_PROBLEM_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(398));
			try {
				GET_PROBLEM_SECTION2__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEM_SECTION2__EOCL_QRY);
		return (ProblemSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSectionEntriesOptional2(ReferralNote) <em>Get Procedures Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::ProceduresSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSectionEntriesOptional2(ReferralNote) <em>Get Procedures Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProceduresSectionEntriesOptional2 getProceduresSectionEntriesOptional2(ReferralNote referralNote) {

		if (GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(399));
			try {
				GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (ProceduresSectionEntriesOptional2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSection2(ReferralNote) <em>Get Results Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2))->asSequence()->any(true).oclAsType(consol::ResultsSection2)";

	/**
	 * The cached OCL query for the '{@link #getResultsSection2(ReferralNote) <em>Get Results Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResultsSection2 getResultsSection2(ReferralNote referralNote) {

		if (GET_RESULTS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(400));
			try {
				GET_RESULTS_SECTION2__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_RESULTS_SECTION2__EOCL_QRY);
		return (ResultsSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(ReferralNote) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(consol::ReviewOfSystemsSection)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(ReferralNote) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReviewOfSystemsSection getReviewOfSystemsSection(ReferralNote referralNote) {

		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(401));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection2(ReferralNote) <em>Get Social History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))->asSequence()->any(true).oclAsType(consol::SocialHistorySection2)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection2(ReferralNote) <em>Get Social History Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SocialHistorySection2 getSocialHistorySection2(ReferralNote referralNote) {

		if (GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(402));
			try {
				GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY);
		return (SocialHistorySection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection2(ReferralNote) <em>Get Vital Signs Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2))->asSequence()->any(true).oclAsType(consol::VitalSignsSection2)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection2(ReferralNote) <em>Get Vital Signs Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static VitalSignsSection2 getVitalSignsSection2(ReferralNote referralNote) {

		if (GET_VITAL_SIGNS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(403));
			try {
				GET_VITAL_SIGNS_SECTION2__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_VITAL_SIGNS_SECTION2__EOCL_QRY);
		return (VitalSignsSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection2(ReferralNote) <em>Get Functional Status Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2))->asSequence()->any(true).oclAsType(consol::FunctionalStatusSection2)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection2(ReferralNote) <em>Get Functional Status Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FunctionalStatusSection2 getFunctionalStatusSection2(ReferralNote referralNote) {

		if (GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(404));
			try {
				GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY);
		return (FunctionalStatusSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExamSection2(ReferralNote) <em>Get Physical Exam Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAM_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2))->asSequence()->any(true).oclAsType(consol::PhysicalExamSection2)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExamSection2(ReferralNote) <em>Get Physical Exam Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PhysicalExamSection2 getPhysicalExamSection2(ReferralNote referralNote) {

		if (GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(405));
			try {
				GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY);
		return (PhysicalExamSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSectionEntriesOptional2b(ReferralNote) <em>Get Advance Directives Section Entries Optional2b</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSectionEntriesOptional2b(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::AdvanceDirectivesSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSectionEntriesOptional2b(ReferralNote) <em>Get Advance Directives Section Entries Optional2b</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSectionEntriesOptional2b(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AdvanceDirectivesSectionEntriesOptional2 getAdvanceDirectivesSectionEntriesOptional2b(
			ReferralNote referralNote) {

		if (GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(406));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__EOCL_QRY = helper.createQuery(
					GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__EOCL_QRY);
		return (AdvanceDirectivesSectionEntriesOptional2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionSection(ReferralNote) <em>Get Nutrition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionSection(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection))->asSequence()->any(true).oclAsType(consol::NutritionSection)";

	/**
	 * The cached OCL query for the '{@link #getNutritionSection(ReferralNote) <em>Get Nutrition Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionSection(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static NutritionSection getNutritionSection(ReferralNote referralNote) {

		if (GET_NUTRITION_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(407));
			try {
				GET_NUTRITION_SECTION__EOCL_QRY = helper.createQuery(GET_NUTRITION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUTRITION_SECTION__EOCL_QRY);
		return (NutritionSection) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMentalStatusSection(ReferralNote) <em>Get Mental Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusSection(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENTAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection))->asSequence()->any(true).oclAsType(consol::MentalStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getMentalStatusSection(ReferralNote) <em>Get Mental Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusSection(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENTAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MentalStatusSection getMentalStatusSection(ReferralNote referralNote) {

		if (GET_MENTAL_STATUS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(408));
			try {
				GET_MENTAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_MENTAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MENTAL_STATUS_SECTION__EOCL_QRY);
		return (MentalStatusSection) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentSection2(ReferralNote) <em>Get Medical Equipment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2))->asSequence()->any(true).oclAsType(consol::MedicalEquipmentSection2)";

	/**
	 * The cached OCL query for the '{@link #getMedicalEquipmentSection2(ReferralNote) <em>Get Medical Equipment Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicalEquipmentSection2 getMedicalEquipmentSection2(ReferralNote referralNote) {

		if (GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(409));
			try {
				GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_QRY);
		return (MedicalEquipmentSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSection2(ReferralNote) <em>Get Allergies Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2))->asSequence()->any(true).oclAsType(consol::AllergiesSection2)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSection2(ReferralNote) <em>Get Allergies Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AllergiesSection2 getAllergiesSection2(ReferralNote referralNote) {

		if (GET_ALLERGIES_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(410));
			try {
				GET_ALLERGIES_SECTION2__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ALLERGIES_SECTION2__EOCL_QRY);
		return (AllergiesSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentSection(ReferralNote) <em>Get Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))->asSequence()->any(true).oclAsType(consol::AssessmentSection)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentSection(ReferralNote) <em>Get Assessment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AssessmentSection getAssessmentSection(ReferralNote referralNote) {

		if (GET_ASSESSMENT_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(411));
			try {
				GET_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ASSESSMENT_SECTION__EOCL_QRY);
		return (AssessmentSection) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection2(ReferralNote) <em>Get Assessment And Plan Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))->asSequence()->any(true).oclAsType(consol::AssessmentAndPlanSection2)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentAndPlanSection2(ReferralNote) <em>Get Assessment And Plan Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AssessmentAndPlanSection2 getAssessmentAndPlanSection2(ReferralNote referralNote) {

		if (GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(412));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY = helper.createQuery(
					GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY);
		return (AssessmentAndPlanSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection2(ReferralNote) <em>Get History Of Past Illness Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))->asSequence()->any(true).oclAsType(consol::HistoryOfPastIllnessSection2)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPastIllnessSection2(ReferralNote) <em>Get History Of Past Illness Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HistoryOfPastIllnessSection2 getHistoryOfPastIllnessSection2(ReferralNote referralNote) {

		if (GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(413));
			try {
				GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY = helper.createQuery(
					GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY);
		return (HistoryOfPastIllnessSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGeneralStatusSection(ReferralNote) <em>Get General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENERAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))->asSequence()->any(true).oclAsType(consol::GeneralStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getGeneralStatusSection(ReferralNote) <em>Get General Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENERAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static GeneralStatusSection getGeneralStatusSection(ReferralNote referralNote) {

		if (GET_GENERAL_STATUS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(414));
			try {
				GET_GENERAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_GENERAL_STATUS_SECTION__EOCL_QRY);
		return (GeneralStatusSection) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection2(ReferralNote) <em>Get Medications Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2))->asSequence()->any(true).oclAsType(consol::MedicationsSection2)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection2(ReferralNote) <em>Get Medications Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationsSection2 getMedicationsSection2(ReferralNote referralNote) {

		if (GET_MEDICATIONS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(415));
			try {
				GET_MEDICATIONS_SECTION2__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICATIONS_SECTION2__EOCL_QRY);
		return (MedicationsSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForReferralSection2(ReferralNote) <em>Get Reason For Referral Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForReferralSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_REFERRAL_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection2))->asSequence()->any(true).oclAsType(consol::ReasonForReferralSection2)";

	/**
	 * The cached OCL query for the '{@link #getReasonForReferralSection2(ReferralNote) <em>Get Reason For Referral Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForReferralSection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_REFERRAL_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReasonForReferralSection2 getReasonForReferralSection2(ReferralNote referralNote) {

		if (GET_REASON_FOR_REFERRAL_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(416));
			try {
				GET_REASON_FOR_REFERRAL_SECTION2__EOCL_QRY = helper.createQuery(
					GET_REASON_FOR_REFERRAL_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_REASON_FOR_REFERRAL_SECTION2__EOCL_QRY);
		return (ReasonForReferralSection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection2(ReferralNote) <em>Get Family History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2))->asSequence()->any(true).oclAsType(consol::FamilyHistorySection2)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection2(ReferralNote) <em>Get Family History Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection2(ReferralNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FamilyHistorySection2 getFamilyHistorySection2(ReferralNote referralNote) {

		if (GET_FAMILY_HISTORY_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REFERRAL_NOTE,
				ConsolPackage.Literals.REFERRAL_NOTE.getEAllOperations().get(417));
			try {
				GET_FAMILY_HISTORY_SECTION2__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FAMILY_HISTORY_SECTION2__EOCL_QRY);
		return (FamilyHistorySection2) query.evaluate(referralNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2TemplateId(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2TemplateId(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.14' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2TemplateId(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2TemplateId(ReferralNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referralNote The receiving '<em><b>Referral Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeader2TemplateId(ReferralNote referralNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_NOTE);
			try {
				VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(referralNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REFERRAL_NOTE__US_REALM_HEADER2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ReferralNoteUSRealmHeader2TemplateId"),
						new Object[] { referralNote }));
			}

			return false;
		}
		return true;
	}

} // ReferralNoteOperations
