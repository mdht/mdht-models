/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasReasonForReferralOrReasonForVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Reason For Referral Or Reason For Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNotePlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNotePhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteReasonForReferralSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteResultsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party Assigned Entity Has Person Organization Or Both</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant Assigned Entity Has Person Organization Or Both</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteInFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getReasonForReferralSection() <em>Get Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getMedicationsSectionEntriesOptional() <em>Get Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getResultsSectionEntriesOptional() <em>Get Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsultationNoteOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsultationNoteOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasReasonForReferralOrReasonForVisit(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Reason For Referral Or Reason For Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasReasonForReferralOrReasonForVisit(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_REASON_FOR_REFERRAL_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection)) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasReasonForReferralOrReasonForVisit(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Reason For Referral Or Reason For Visit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasReasonForReferralOrReasonForVisit(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_REASON_FOR_REFERRAL_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteHasReasonForReferralOrReasonForVisit(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_HAS_REASON_FOR_REFERRAL_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_REASON_FOR_REFERRAL_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_REASON_FOR_REFERRAL_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_HAS_REASON_FOR_REFERRAL_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_REASON_FOR_REFERRAL_OR_REASON_FOR_VISIT,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasReasonForReferralOrReasonForVisit"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteTemplateId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTemplateId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteTemplateId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTemplateId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteTemplateId(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteTemplateId"), new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCodeP(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCodeP(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCodeP(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCodeP(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsCodeP(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__GENERAL_HEADER_CONSTRAINTS_CODE_P,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCodeP"), new Object[] { consultationNote }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP", passToken);
				}
				passToken.add(consultationNote);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOf(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOf(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOf(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOf(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteComponentOf(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOf"), new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteAssessmentSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteAssessmentSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteAssessmentSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Assessment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteAssessmentSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteAssessmentSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_ASSESSMENT_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteAssessmentSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteAssessmentAndPlanSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Assessment And Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteAssessmentAndPlanSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteAssessmentAndPlanSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Assessment And Plan Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteAssessmentAndPlanSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteAssessmentAndPlanSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_ASSESSMENT_AND_PLAN_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteAssessmentAndPlanSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNotePlanOfCareSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePlanOfCareSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNotePlanOfCareSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePlanOfCareSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNotePlanOfCareSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PLAN_OF_CARE_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNotePlanOfCareSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHistoryOfPresentIllness(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHistoryOfPresentIllness(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHistoryOfPresentIllness(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Present Illness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHistoryOfPresentIllness(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteHistoryOfPresentIllness(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHistoryOfPresentIllness"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNotePhysicalExamSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Physical Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePhysicalExamSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNotePhysicalExamSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Physical Exam Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePhysicalExamSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNotePhysicalExamSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PHYSICAL_EXAM_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNotePhysicalExamSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteReasonForReferralSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Reason For Referral Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReasonForReferralSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteReasonForReferralSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Reason For Referral Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReasonForReferralSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteReasonForReferralSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_REASON_FOR_REFERRAL_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteReasonForReferralSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteReasonForVisitSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReasonForVisitSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteReasonForVisitSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Reason For Visit Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReasonForVisitSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteReasonForVisitSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_REASON_FOR_VISIT_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteReasonForVisitSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteAllergiesSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Allergies Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteAllergiesSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteAllergiesSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Allergies Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteAllergiesSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteAllergiesSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_ALLERGIES_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteAllergiesSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteChiefComplaintSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteChiefComplaintSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteChiefComplaintSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Chief Complaint Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteChiefComplaintSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteChiefComplaintSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_CHIEF_COMPLAINT_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteChiefComplaintSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteChiefComplaintAndReasonForVisitSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Chief Complaint And Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteChiefComplaintAndReasonForVisitSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteChiefComplaintAndReasonForVisitSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Chief Complaint And Reason For Visit Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteChiefComplaintAndReasonForVisitSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteChiefComplaintAndReasonForVisitSection(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteChiefComplaintAndReasonForVisitSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteFamilyHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteFamilyHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteFamilyHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteFamilyHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteFamilyHistorySection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_FAMILY_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteFamilyHistorySection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteGeneralStatusSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteGeneralStatusSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteGeneralStatusSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note General Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteGeneralStatusSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteGeneralStatusSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_GENERAL_STATUS_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteGeneralStatusSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHistoryOfPastIllnessSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Past Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHistoryOfPastIllnessSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHistoryOfPastIllnessSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Past Illness Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHistoryOfPastIllnessSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteHistoryOfPastIllnessSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHistoryOfPastIllnessSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteImmunizationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteImmunizationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteImmunizationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteImmunizationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteImmunizationsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_IMMUNIZATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteImmunizationsSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteMedicationsSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteMedicationsSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteMedicationsSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Medications Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteMedicationsSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteMedicationsSectionEntriesOptional(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteMedicationsSectionEntriesOptional"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteProblemSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Problem Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteProblemSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteProblemSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Problem Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteProblemSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteProblemSectionEntriesOptional(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteProblemSectionEntriesOptional"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteProceduresSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Procedures Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteProceduresSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteProceduresSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Procedures Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteProceduresSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteProceduresSectionEntriesOptional(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteProceduresSectionEntriesOptional"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteResultsSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Results Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteResultsSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteResultsSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Results Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteResultsSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteResultsSectionEntriesOptional(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteResultsSectionEntriesOptional"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteReviewOfSystemsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReviewOfSystemsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteReviewOfSystemsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReviewOfSystemsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteReviewOfSystemsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteReviewOfSystemsSection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteSocialHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteSocialHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteSocialHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteSocialHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteSocialHistorySection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteSocialHistorySection"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteVitalSignsSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Vital Signs Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteVitalSignsSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteVitalSignsSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Vital Signs Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteVitalSignsSectionEntriesOptional(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteVitalSignsSectionEntriesOptional(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteVitalSignsSectionEntriesOptional"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteInFulfillmentOf(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteInFulfillmentOf(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteInFulfillmentOf(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteInFulfillmentOf(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteInFulfillmentOf(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_IN_FULFILLMENT_OF,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteInFulfillmentOf"),
					new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party Assigned Entity Has Person Organization Or Both</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party Assigned Entity Has Person Organization Or Both</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant Assigned Entity Has Person Organization Or Both</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant Assigned Entity Has Person Organization Or Both</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 8)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_DAY,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Minute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 12)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Minute</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_MINUTE,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 14)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_SECOND,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 If More Precise Than Day Include Time Zone Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() and effectiveTime.value.size() > 8 implies effectiveTime.value.size() >= 15)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 If More Precise Than Day Include Time Zone Offset</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter2EffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2Id(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2Id(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2Id(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2Id(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter2Id(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ID,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter2Id"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->exists(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteComponentOfEncompassingEncounter(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteComponentOfEncompassingEncounter(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteComponentOfEncompassingEncounter(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteComponentOfEncompassingEncounter"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteInFulfillmentOfOrderId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of Order Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteInFulfillmentOfOrderId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->excluding(null).order->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteInFulfillmentOfOrderId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of Order Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteInFulfillmentOfOrderId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteInFulfillmentOfOrderId(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER_ID,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteInFulfillmentOfOrderId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteInFulfillmentOfOrder(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteInFulfillmentOfOrder(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->excluding(null)->reject(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteInFulfillmentOfOrder(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteInFulfillmentOfOrder(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNoteInFulfillmentOfOrder(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER,
						ConsolPlugin.INSTANCE.getString("ConsultationNoteInFulfillmentOfOrder"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentSection(ConsultationNote) <em>Get Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))->asSequence()->any(true).oclAsType(consol::AssessmentSection)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentSection(ConsultationNote) <em>Get Assessment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AssessmentSection getAssessmentSection(ConsultationNote consultationNote) {
		if (GET_ASSESSMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(336));
			try {
				GET_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SECTION__EOCL_QRY);
		return (AssessmentSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(ConsultationNote) <em>Get Assessment And Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))->asSequence()->any(true).oclAsType(consol::AssessmentAndPlanSection)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentAndPlanSection(ConsultationNote) <em>Get Assessment And Plan Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AssessmentAndPlanSection getAssessmentAndPlanSection(ConsultationNote consultationNote) {
		if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(337));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
		return (AssessmentAndPlanSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(ConsultationNote) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(consol::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(ConsultationNote) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanOfCareSection getPlanOfCareSection(ConsultationNote consultationNote) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(338));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllness(ConsultationNote) <em>Get History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPresentIllnessSection)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllness(ConsultationNote) <em>Get History Of Present Illness</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HistoryOfPresentIllnessSection getHistoryOfPresentIllness(ConsultationNote consultationNote) {
		if (GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(339));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY);
		return (HistoryOfPresentIllnessSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExamSection(ConsultationNote) <em>Get Physical Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->any(true).oclAsType(consol::PhysicalExamSection)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExamSection(ConsultationNote) <em>Get Physical Exam Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PhysicalExamSection getPhysicalExamSection(ConsultationNote consultationNote) {
		if (GET_PHYSICAL_EXAM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(340));
			try {
				GET_PHYSICAL_EXAM_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_QRY);
		return (PhysicalExamSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForReferralSection(ConsultationNote) <em>Get Reason For Referral Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForReferralSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_REFERRAL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection))->asSequence()->any(true).oclAsType(consol::ReasonForReferralSection)";

	/**
	 * The cached OCL query for the '{@link #getReasonForReferralSection(ConsultationNote) <em>Get Reason For Referral Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForReferralSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReasonForReferralSection getReasonForReferralSection(ConsultationNote consultationNote) {
		if (GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(341));
			try {
				GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_REFERRAL_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY);
		return (ReasonForReferralSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForVisitSection(ConsultationNote) <em>Get Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForVisitSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)";

	/**
	 * The cached OCL query for the '{@link #getReasonForVisitSection(ConsultationNote) <em>Get Reason For Visit Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForVisitSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReasonForVisitSection getReasonForVisitSection(ConsultationNote consultationNote) {
		if (GET_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(342));
			try {
				GET_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ReasonForVisitSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSection(ConsultationNote) <em>Get Allergies Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::AllergiesSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSection(ConsultationNote) <em>Get Allergies Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AllergiesSectionEntriesOptional getAllergiesSection(ConsultationNote consultationNote) {
		if (GET_ALLERGIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(343));
			try {
				GET_ALLERGIES_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION__EOCL_QRY);
		return (AllergiesSectionEntriesOptional) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintSection(ConsultationNote) <em>Get Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintSection(ConsultationNote) <em>Get Chief Complaint Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ChiefComplaintSection getChiefComplaintSection(ConsultationNote consultationNote) {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(344));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintAndReasonForVisitSection(ConsultationNote) <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintAndReasonForVisitSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintAndReasonForVisitSection(ConsultationNote) <em>Get Chief Complaint And Reason For Visit Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintAndReasonForVisitSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection(
			ConsultationNote consultationNote) {
		if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(345));
			try {
				GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ChiefComplaintAndReasonForVisitSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(ConsultationNote) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->any(true).oclAsType(consol::FamilyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(ConsultationNote) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FamilyHistorySection getFamilyHistorySection(ConsultationNote consultationNote) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(346));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGeneralStatusSection(ConsultationNote) <em>Get General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENERAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))->asSequence()->any(true).oclAsType(consol::GeneralStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getGeneralStatusSection(ConsultationNote) <em>Get General Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENERAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static GeneralStatusSection getGeneralStatusSection(ConsultationNote consultationNote) {
		if (GET_GENERAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(347));
			try {
				GET_GENERAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_QRY);
		return (GeneralStatusSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection(ConsultationNote) <em>Get History Of Past Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPastIllnessSection)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPastIllnessSection(ConsultationNote) <em>Get History Of Past Illness Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HistoryOfPastIllnessSection getHistoryOfPastIllnessSection(ConsultationNote consultationNote) {
		if (GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(348));
			try {
				GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPastIllnessSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection(ConsultationNote) <em>Get Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection(ConsultationNote) <em>Get Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ImmunizationsSection getImmunizationsSection(ConsultationNote consultationNote) {
		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(349));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSectionEntriesOptional(ConsultationNote) <em>Get Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSectionEntriesOptional(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::MedicationsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSectionEntriesOptional(ConsultationNote) <em>Get Medications Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSectionEntriesOptional(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional(
			ConsultationNote consultationNote) {
		if (GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(350));
			try {
				GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (MedicationsSectionEntriesOptional) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSectionEntriesOptional(ConsultationNote) <em>Get Problem Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ProblemSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getProblemSectionEntriesOptional(ConsultationNote) <em>Get Problem Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProblemSectionEntriesOptional getProblemSectionEntriesOptional(ConsultationNote consultationNote) {
		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(351));
			try {
				GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProblemSectionEntriesOptional) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSectionEntriesOptional(ConsultationNote) <em>Get Procedures Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ProceduresSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSectionEntriesOptional(ConsultationNote) <em>Get Procedures Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional(ConsultationNote consultationNote) {
		if (GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(352));
			try {
				GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProceduresSectionEntriesOptional) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSectionEntriesOptional(ConsultationNote) <em>Get Results Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSectionEntriesOptional(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ResultsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getResultsSectionEntriesOptional(ConsultationNote) <em>Get Results Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSectionEntriesOptional(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResultsSectionEntriesOptional getResultsSectionEntriesOptional(ConsultationNote consultationNote) {
		if (GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(353));
			try {
				GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ResultsSectionEntriesOptional) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(ConsultationNote) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(consol::ReviewOfSystemsSection)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(ConsultationNote) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReviewOfSystemsSection getReviewOfSystemsSection(ConsultationNote consultationNote) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(354));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(ConsultationNote) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->any(true).oclAsType(consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(ConsultationNote) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SocialHistorySection getSocialHistorySection(ConsultationNote consultationNote) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(355));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional(ConsultationNote) <em>Get Vital Signs Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional(ConsultationNote) <em>Get Vital Signs Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(ConsultationNote consultationNote) {
		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(356));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '11488-4' or value.code = '34100-8' or value.code = '34104-0' or value.code = '51845-6' or value.code = '51853-0' or value.code = '51846-4' or value.code = '34101-6' or value.code = '34749-2' or value.code = '34102-4' or value.code = '34099-2' or value.code = '34756-7' or value.code = '34758-3' or value.code = '34760-9' or value.code = '34879-7' or value.code = '34761-7' or value.code = '34764-1' or value.code = '34771-6' or value.code = '34776-5' or value.code = '34777-3' or value.code = '34779-9' or value.code = '34781-5' or value.code = '34783-1' or value.code = '34785-6' or value.code = '34795-5' or value.code = '34797-1' or value.code = '34798-9' or value.code = '34800-3' or value.code = '34803-7' or value.code = '34855-7' or value.code = '34805-2' or value.code = '34807-8' or value.code = '34810-2' or value.code = '34812-8' or value.code = '34814-4' or value.code = '34816-9' or value.code = '34820-1' or value.code = '34822-7' or value.code = '34824-3' or value.code = '34826-8' or value.code = '34828-4' or value.code = '34788-0' or value.code = '34791-4' or value.code = '34103-2' or value.code = '34831-8' or value.code = '34833-4' or value.code = '34835-9' or value.code = '34837-5' or value.code = '34839-1' or value.code = '34841-7' or value.code = '34845-8' or value.code = '34847-4' or value.code = '34849-0' or value.code = '34851-6' or value.code = '34853-2'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsCode(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(consultationNote)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__GENERAL_HEADER_CONSTRAINTS_CODE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"), new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

} // ConsultationNoteOperations
