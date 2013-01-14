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
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History And Physical Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has Chief Complaint And Reason For Visit Chief Complaint Or Reason For Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNotePlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNotePhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteResultsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getMedicationsSectionEntriesOptional() <em>Get Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getResultsSectionEntriesOptional() <em>Get Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getInstructionsSection() <em>Get Instructions Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryAndPhysicalNoteOperations extends GeneralHeaderConstraintsOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected HistoryAndPhysicalNoteOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has Chief Complaint And Reason For Visit Chief Complaint Or Reason For Visit</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has Chief Complaint And Reason For Visit Chief Complaint Or Reason For Visit</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteTemplateId(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteTemplateId(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.3')";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteTemplateId(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteTemplateId(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteTemplateId(HistoryAndPhysicalNote historyAndPhysicalNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteTemplateId"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteCodeP(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteCodeP(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteCodeP(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteCodeP(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateHistoryAndPhysicalNoteCodeP(HistoryAndPhysicalNote historyAndPhysicalNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_CODE_P,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteCodeP"),
					new Object[] { historyAndPhysicalNote }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNoteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNoteCodeP", passToken);
				}
				passToken.add(historyAndPhysicalNote);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteCode(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Code</em>}' operation.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteCode(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '34117-2' or value.code = '11492-6' or value.code = '28626-0' or value.code = '34774-0' or value.code = '34115-6' or value.code = '34116-4' or value.code = '34095-0' or value.code = '34096-8' or value.code = '51849-8' or value.code = '47039-3' or value.code = '34763-3' or value.code = '34094-3' or value.code = '34138-8'))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteCode(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteCode(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateHistoryAndPhysicalNoteCode(HistoryAndPhysicalNote historyAndPhysicalNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNoteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(historyAndPhysicalNote)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_CODE,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteCode"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteInFulfillmentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note In Fulfillment Of</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteInFulfillmentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(rim::ActRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteInFulfillmentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note In Fulfillment Of</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteInFulfillmentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteInFulfillmentOf(HistoryAndPhysicalNote historyAndPhysicalNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteInFulfillmentOf"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteComponentOf(HistoryAndPhysicalNote historyAndPhysicalNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteComponentOf"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Allergies Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Allergies Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteAllergiesSectionEntriesOptional"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteAssessmentSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Assessment Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteAssessmentSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteAssessmentSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Assessment Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteAssessmentSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteAssessmentSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteAssessmentSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNotePlanOfCareSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Plan Of Care Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNotePlanOfCareSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNotePlanOfCareSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Plan Of Care Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNotePlanOfCareSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNotePlanOfCareSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_PLAN_OF_CARE_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNotePlanOfCareSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteAssessmentAndPlanSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Assessment And Plan Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteAssessmentAndPlanSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteAssessmentAndPlanSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Assessment And Plan Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteAssessmentAndPlanSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteAssessmentAndPlanSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_AND_PLAN_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteAssessmentAndPlanSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteChiefComplaintSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Chief Complaint Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteChiefComplaintSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteChiefComplaintSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Chief Complaint Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteChiefComplaintSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteChiefComplaintSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteChiefComplaintSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Chief Complaint And Reason For Visit Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Chief Complaint And Reason For Visit Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteFamilyHistorySection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Family History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteFamilyHistorySection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteFamilyHistorySection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Family History Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteFamilyHistorySection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteFamilyHistorySection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_FAMILY_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteFamilyHistorySection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteGeneralStatusSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note General Status Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteGeneralStatusSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteGeneralStatusSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note General Status Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteGeneralStatusSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteGeneralStatusSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_GENERAL_STATUS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteGeneralStatusSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteHistoryOfPastIllnessSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note History Of Past Illness Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteHistoryOfPastIllnessSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteHistoryOfPastIllnessSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note History Of Past Illness Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteHistoryOfPastIllnessSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteHistoryOfPastIllnessSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryOfPastIllnessSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Medications Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Medications Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteMedicationsSectionEntriesOptional"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNotePhysicalExamSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Physical Exam Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNotePhysicalExamSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNotePhysicalExamSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Physical Exam Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNotePhysicalExamSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNotePhysicalExamSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_PHYSICAL_EXAM_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNotePhysicalExamSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteReasonForVisitSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Reason For Visit Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteReasonForVisitSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteReasonForVisitSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Reason For Visit Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteReasonForVisitSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteReasonForVisitSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_REASON_FOR_VISIT_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteReasonForVisitSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteResultsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Results Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteResultsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteResultsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Results Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteResultsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteResultsSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteResultsSectionEntriesOptional"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteReviewOfSystemsSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Review Of Systems Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteReviewOfSystemsSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteReviewOfSystemsSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Review Of Systems Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteReviewOfSystemsSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteReviewOfSystemsSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_REVIEW_OF_SYSTEMS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteReviewOfSystemsSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteSocialHistorySection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Social History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteSocialHistorySection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteSocialHistorySection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Social History Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteSocialHistorySection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteSocialHistorySection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_SOCIAL_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteSocialHistorySection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note History Of Present Illness Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note History Of Present Illness Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryOfPresentIllnessSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Immunizations Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Immunizations Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteImmunizationsSectionEntriesOptional"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteProblemSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Problem Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteProblemSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteProblemSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Problem Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteProblemSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteProblemSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteProblemSectionEntriesOptional"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteProceduresSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Procedures Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteProceduresSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteProceduresSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Procedures Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteProceduresSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteProceduresSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteProceduresSectionEntriesOptional"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Vital Signs Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Vital Signs Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptional(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteVitalSignsSectionEntriesOptional"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteInstructionsSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Instructions Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteInstructionsSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteInstructionsSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Instructions Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteInstructionsSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateHistoryAndPhysicalNoteInstructionsSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_INSTRUCTIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteInstructionsSection"),
					new Object[] { historyAndPhysicalNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity Has Person Or Organization</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity Has Person Or Organization</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity Has Person Or Organization</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity Has Person Or Organization</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Location</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(location->one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(rim::Participation)))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Location</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	* The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteComponentOfEncompassingEncounter"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Allergies Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAllergiesSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::AllergiesSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Allergies Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAllergiesSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(330));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (AllergiesSectionEntriesOptional) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getAssessmentSection(HistoryAndPhysicalNote) <em>Get Assessment Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAssessmentSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))->asSequence()->any(true).oclAsType(consol::AssessmentSection)";

	/**
	* The cached OCL query for the '{@link #getAssessmentSection(HistoryAndPhysicalNote) <em>Get Assessment Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAssessmentSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static AssessmentSection getAssessmentSection(HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_ASSESSMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(331));
			try {
				GET_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SECTION__EOCL_QRY);
		return (AssessmentSection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getPlanOfCareSection(HistoryAndPhysicalNote) <em>Get Plan Of Care Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(consol::PlanOfCareSection)";

	/**
	* The cached OCL query for the '{@link #getPlanOfCareSection(HistoryAndPhysicalNote) <em>Get Plan Of Care Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static PlanOfCareSection getPlanOfCareSection(HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(332));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(HistoryAndPhysicalNote) <em>Get Assessment And Plan Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAssessmentAndPlanSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))->asSequence()->any(true).oclAsType(consol::AssessmentAndPlanSection)";

	/**
	* The cached OCL query for the '{@link #getAssessmentAndPlanSection(HistoryAndPhysicalNote) <em>Get Assessment And Plan Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAssessmentAndPlanSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static AssessmentAndPlanSection getAssessmentAndPlanSection(HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(333));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
		return (AssessmentAndPlanSection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getChiefComplaintSection(HistoryAndPhysicalNote) <em>Get Chief Complaint Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getChiefComplaintSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)";

	/**
	* The cached OCL query for the '{@link #getChiefComplaintSection(HistoryAndPhysicalNote) <em>Get Chief Complaint Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getChiefComplaintSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ChiefComplaintSection getChiefComplaintSection(HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(334));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote) <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)";

	/**
	* The cached OCL query for the '{@link #getChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote) <em>Get Chief Complaint And Reason For Visit Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote)
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
			HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(335));
			try {
				GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ChiefComplaintAndReasonForVisitSection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getFamilyHistorySection(HistoryAndPhysicalNote) <em>Get Family History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFamilyHistorySection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->any(true).oclAsType(consol::FamilyHistorySection)";

	/**
	* The cached OCL query for the '{@link #getFamilyHistorySection(HistoryAndPhysicalNote) <em>Get Family History Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFamilyHistorySection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static FamilyHistorySection getFamilyHistorySection(HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(336));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getGeneralStatusSection(HistoryAndPhysicalNote) <em>Get General Status Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getGeneralStatusSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_GENERAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))->asSequence()->any(true).oclAsType(consol::GeneralStatusSection)";

	/**
	* The cached OCL query for the '{@link #getGeneralStatusSection(HistoryAndPhysicalNote) <em>Get General Status Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getGeneralStatusSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_GENERAL_STATUS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static GeneralStatusSection getGeneralStatusSection(HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_GENERAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(337));
			try {
				GET_GENERAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_QRY);
		return (GeneralStatusSection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection(HistoryAndPhysicalNote) <em>Get History Of Past Illness Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHistoryOfPastIllnessSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPastIllnessSection)";

	/**
	* The cached OCL query for the '{@link #getHistoryOfPastIllnessSection(HistoryAndPhysicalNote) <em>Get History Of Past Illness Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHistoryOfPastIllnessSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static HistoryOfPastIllnessSection getHistoryOfPastIllnessSection(
			HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(338));
			try {
				GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPastIllnessSection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getMedicationsSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Medications Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationsSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::MedicationsSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getMedicationsSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Medications Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationsSectionEntriesOptional(HistoryAndPhysicalNote)
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
			HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(339));
			try {
				GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (MedicationsSectionEntriesOptional) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getPhysicalExamSection(HistoryAndPhysicalNote) <em>Get Physical Exam Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPhysicalExamSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PHYSICAL_EXAM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->any(true).oclAsType(consol::PhysicalExamSection)";

	/**
	* The cached OCL query for the '{@link #getPhysicalExamSection(HistoryAndPhysicalNote) <em>Get Physical Exam Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPhysicalExamSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAM_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static PhysicalExamSection getPhysicalExamSection(HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_PHYSICAL_EXAM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(340));
			try {
				GET_PHYSICAL_EXAM_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_QRY);
		return (PhysicalExamSection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getReasonForVisitSection(HistoryAndPhysicalNote) <em>Get Reason For Visit Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getReasonForVisitSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)";

	/**
	* The cached OCL query for the '{@link #getReasonForVisitSection(HistoryAndPhysicalNote) <em>Get Reason For Visit Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getReasonForVisitSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ReasonForVisitSection getReasonForVisitSection(HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(341));
			try {
				GET_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ReasonForVisitSection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getResultsSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Results Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getResultsSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ResultsSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getResultsSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Results Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getResultsSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ResultsSectionEntriesOptional getResultsSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(342));
			try {
				GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ResultsSectionEntriesOptional) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getReviewOfSystemsSection(HistoryAndPhysicalNote) <em>Get Review Of Systems Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getReviewOfSystemsSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(consol::ReviewOfSystemsSection)";

	/**
	* The cached OCL query for the '{@link #getReviewOfSystemsSection(HistoryAndPhysicalNote) <em>Get Review Of Systems Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getReviewOfSystemsSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ReviewOfSystemsSection getReviewOfSystemsSection(HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(343));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getSocialHistorySection(HistoryAndPhysicalNote) <em>Get Social History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getSocialHistorySection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->any(true).oclAsType(consol::SocialHistorySection)";

	/**
	* The cached OCL query for the '{@link #getSocialHistorySection(HistoryAndPhysicalNote) <em>Get Social History Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getSocialHistorySection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static SocialHistorySection getSocialHistorySection(HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(344));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getHistoryOfPresentIllnessSection(HistoryAndPhysicalNote) <em>Get History Of Present Illness Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHistoryOfPresentIllnessSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPresentIllnessSection)";

	/**
	* The cached OCL query for the '{@link #getHistoryOfPresentIllnessSection(HistoryAndPhysicalNote) <em>Get History Of Present Illness Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHistoryOfPresentIllnessSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection(
			HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(345));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPresentIllnessSection) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getImmunizationsSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Immunizations Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getImmunizationsSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ImmunizationsSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getImmunizationsSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Immunizations Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getImmunizationsSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(346));
			try {
				GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ImmunizationsSectionEntriesOptional) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getProblemSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Problem Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProblemSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ProblemSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getProblemSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Problem Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProblemSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProblemSectionEntriesOptional getProblemSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(347));
			try {
				GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProblemSectionEntriesOptional) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getProceduresSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Procedures Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProceduresSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ProceduresSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getProceduresSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Procedures Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProceduresSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(348));
			try {
				GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProceduresSectionEntriesOptional) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Vital Signs Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getVitalSignsSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional(HistoryAndPhysicalNote) <em>Get Vital Signs Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getVitalSignsSectionEntriesOptional(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(
			HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(349));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional) query.evaluate(historyAndPhysicalNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getInstructionsSection(HistoryAndPhysicalNote) <em>Get Instructions Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getInstructionsSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))->asSequence()->any(true).oclAsType(consol::InstructionsSection)";

	/**
	* The cached OCL query for the '{@link #getInstructionsSection(HistoryAndPhysicalNote) <em>Get Instructions Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getInstructionsSection(HistoryAndPhysicalNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static InstructionsSection getInstructionsSection(HistoryAndPhysicalNote historyAndPhysicalNote) {
		if (GET_INSTRUCTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE.getEAllOperations().get(350));
			try {
				GET_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTIONS_SECTION__EOCL_QRY);
		return (InstructionsSection) query.evaluate(historyAndPhysicalNote);
	}

} // HistoryAndPhysicalNoteOperations
